package com.uidemo.truecaller.api;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import com.uidemo.truecaller.model.MpesaMsg;

/**
 * Deterministic simulated M-PESA SMS generator. Produces one realistic message per 6-hour slot
 * (received / sent / paybill / buy-goods to random Kenyan contacts) so the MPESA inbox looks like
 * a real phone even when there are no invest254 withdrawals. Messages are byte-accurate to real
 * Safaricom SMS: transaction code, EAT date/time, grouped "KshX.XX", transaction cost + daily
 * limit on sends, and the "Download My OneApp on https://saf.cx/..." tail.
 *
 * Each slot's content is a pure function of the slot index (now/6h), so the same slot always
 * renders identically; generation is idempotent and survives process death (persisted in prefs).
 * A running simulated balance evolves message-to-message for realism.
 */
public class MpesaSim {
    private static final long SIX_HOURS_MS = 6L * 60 * 60 * 1000;
    private static final int SEED_SLOTS = 6;     // pre-populate ~1.5 days on first run
    private static final int MAX_STORED = 120;
    private static final String PREFS = "invest254";
    private static final String LINK_RECEIVE = "https://saf.cx/lPKcC";
    private static final String LINK_SEND = "https://saf.cx/kWQpy";
    private static final long DAILY_LIMIT_CENTS = 50_000_000L; // KES 500,000/day

    private static final String[] NAMES = {
        "PETER MUCHENDU","FAITH MWANGI","BRIAN OTIENO","MERCY WANJIKU","KEVIN KAMAU","GRACE ACHIENG",
        "DENNIS KIPROP","CYNTHIA NJERI","VICTOR OMONDI","ESTHER WAFULA","COLLINS BARASA","JOY CHEBET",
        "SAMUEL MUTUA","AMINA HASSAN","JAMES NJOROGE","HALIMA YUSUF","DAVID MWAURA","ZAWADI BARAKA",
        "SALIM ABDI","FATUMA RASHID","WILLIAM ARNING","BRENDA NYAKIO RUKENYA","GLADYS WANJIKU HUTHU MBOTE",
        "JULIUS KIMANI","SILVER ODUOR","MARBLES SQUARE"
    };
    private static final String[] PAYBILLS = {
        "KPLC PREPAID","NAIROBI WATER","DSTV KENYA","ZUKU FIBER","KRA","NHIF","JUMIA KE","GOTV"
    };
    private static final String[] TILLS = {
        "NAIVAS SUPERMARKET","QUICKMART","CARREFOUR","JAVA HOUSE","TOTAL ENERGIES","CHANDARANA"
    };

    private final SharedPreferences prefs;
    public MpesaSim(Context ctx) { prefs = ctx.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE); }

    private static long slotOf(long ms) { return ms / SIX_HOURS_MS; }

    /**
     * Advance simulation to the current time (idempotent), persist, and return every simulated
     * message newest-first. Safe to call from the foreground poll, the background worker, and the
     * conversation screen.
     */
    public synchronized List<MpesaMsg> syncAndGetAll() {
        long nowSlot = slotOf(System.currentTimeMillis());
        long lastSlot = prefs.getLong("simLastSlotV2", 0L);
        long balance = prefs.getLong("simBalanceCentsV2", 2_000_00L); // start KES 2,000.00
        long daySpent = prefs.getLong("simDaySpentCents", 0L);      // cumulative daily spend (resets daily)
        long dayKey = prefs.getLong("simDayKey", 0L);
        JSONArray arr = load();

        if (lastSlot == 0L) {                    // first run: seed recent history so it isn't empty
            lastSlot = nowSlot - SEED_SLOTS;
        }
        for (long slot = lastSlot + 1; slot <= nowSlot; slot++) {
            long slotDay = slot * SIX_HOURS_MS / (24L * 60 * 60 * 1000);
            if (slotDay != dayKey) { daySpent = 0L; dayKey = slotDay; }   // new day: reset daily limit usage
            JSONObject o = generate(slot, balance, daySpent);
            balance = o.optLong("_bal", balance);
            if (!o.optBoolean("credit")) daySpent += o.optLong("_amt", 0L);
            arr.put(o);
        }
        // cap
        while (arr.length() > MAX_STORED) arr.remove(0);
        save(arr);
        prefs.edit().putLong("simLastSlotV2", nowSlot).putLong("simBalanceCentsV2", balance)
                .putLong("simDaySpentCents", daySpent).putLong("simDayKey", dayKey).apply();

        List<MpesaMsg> out = new ArrayList<>();
        for (int i = arr.length() - 1; i >= 0; i--) out.add(fromJson(arr.optJSONObject(i))); // newest first
        return out;
    }

    private JSONArray load() {
        try { return new JSONArray(prefs.getString("simMsgsV2", "[]")); }
        catch (Exception e) { return new JSONArray(); }
    }
    private void save(JSONArray a) { prefs.edit().putString("simMsgsV2", a.toString()).apply(); }

    /** Build one message for a slot; embeds "_bal" (running balance after) and "_amt" (cents moved). */
    private JSONObject generate(long slot, long balanceCents, long daySpentCents) {
        Random rng = new Random(slot * 0x9E3779B97F4A7C15L);
        long ts = slot * SIX_HOURS_MS + (long) (rng.nextDouble() * SIX_HOURS_MS); // random moment in the slot
        int roll = rng.nextInt(100);
        String code = code(ts, rng);
        JSONObject o = new JSONObject();
        try {
            if (roll < 45) {                 // received from a person
                long amt = amount(rng, 5_000, 500_000);
                long bal = balanceCents + amt;
                String name = NAMES[rng.nextInt(NAMES.length)];
                String phone = maskedPhone(rng);
                String party = name + " " + phone;
                String body = code + " Confirmed.You have received " + ksh(amt) + " from " + party +
                    " on " + date(ts) + " at " + time(ts) + "  New M-PESA balance is " + ksh(bal) +
                    ". Download My OneApp on " + LINK_RECEIVE;
                put(o, ts, true, ksh(amt), party, code, body, bal);
            } else if (roll < 75) {          // sent to a person
                long amt = amount(rng, 5_000, 300_000);
                long cost = p2pCost(amt);
                long bal = Math.max(0, balanceCents - amt - cost);
                String name = NAMES[rng.nextInt(NAMES.length)];
                String phone = fullPhone(rng);
                String party = name + " " + phone;
                String body = code + " Confirmed. " + ksh(amt) + " sent to " + party +
                    " on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
                    ". Transaction cost, " + ksh(cost) +
                    ". Amount you can transact within the day is " + amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) +
                    ". Download My OneApp on " + LINK_SEND;
                put(o, ts, false, ksh(amt), party, code, body, bal);
            } else if (roll < 90) {          // paybill (C2B)
                long amt = amount(rng, 20_000, 800_000);
                long cost = paybillCost(amt);
                long bal = Math.max(0, balanceCents - amt - cost);
                String pb = PAYBILLS[rng.nextInt(PAYBILLS.length)];
                String acct = String.valueOf(100000 + rng.nextInt(900000));
                String body = code + " Confirmed. " + ksh(amt) + " paid to " + pb + " for account " + acct +
                    ". on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
                    ". Transaction cost, " + ksh(cost) + ". Amount you can transact within the day is " +
                    amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) + ". Download My OneApp on " + LINK_SEND;
                put(o, ts, false, ksh(amt), pb, code, body, bal);
            } else {                         // buy goods (till)
                long amt = amount(rng, 10_000, 400_000);
                long cost = paybillCost(amt);
                long bal = Math.max(0, balanceCents - amt - cost);
                String till = TILLS[rng.nextInt(TILLS.length)];
                String body = code + " Confirmed. Ksh" + amountPlain(amt) + " paid to " + till +
                    ". on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
                    ". Transaction cost, " + ksh(cost) + ". Amount you can transact within the day is " +
                    amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) + ". Download My OneApp on " + LINK_SEND;
                put(o, ts, false, ksh(amt), till, code, body, bal);
            }
        } catch (Exception ignored) {}
        return o;
    }

    private void put(JSONObject o, long ts, boolean credit, String amountText, String party, String code, String body, long bal) throws Exception {
        o.put("ts", ts); o.put("credit", credit); o.put("amountText", amountText);
        o.put("party", party); o.put("code", code); o.put("body", body); o.put("_bal", bal);
        o.put("_amt", centsOf(amountText));
    }

    /** Parse "Ksh1,550.00" back to cents for daily-spend tracking. */
    private static long centsOf(String kshText) {
        try {
            String s = kshText.replace("Ksh", "").replace(",", "").trim();
            return Math.round(Double.parseDouble(s) * 100);
        } catch (Exception e) { return 0L; }
    }

    private static MpesaMsg fromJson(JSONObject o) {
        return new MpesaMsg(o.optLong("ts"), o.optBoolean("credit"), o.optString("amountText"),
            o.optString("party"), o.optString("code"), o.optString("body"), true);
    }

    // ── formatting helpers (mirror the backend mpesa.ts byte-for-byte) ──────────────────────
    private static long amount(Random r, int loCents, int hiCents) {
        // round to whole shillings, like real cash-outs
        long shillings = loCents / 100 + (long) (r.nextDouble() * ((hiCents - loCents) / 100.0));
        return shillings * 100;
    }
    static String ksh(long cents) { return "Ksh" + amountPlain(cents); }
    static String amountPlain(long cents) {
        long v = Math.abs(cents);
        String s = String.format(Locale.US, "%d.%02d", v / 100, v % 100);
        String[] parts = s.split("\\.");
        StringBuilder ip = new StringBuilder(parts[0]);
        for (int i = ip.length() - 3; i > 0; i -= 3) ip.insert(i, ",");
        return ip + "." + parts[1];
    }
    private static final String DAY_CODE = "123456789ABCDEFGHIJKLMNOPQRSTUV";
    private static final String ALNUM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static Calendar eat(long ms) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Africa/Nairobi"));
        c.setTimeInMillis(ms); return c;
    }
    static String date(long ms) {
        Calendar c = eat(ms);
        return c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + (c.get(Calendar.YEAR) % 100);
    }
    static String time(long ms) {
        Calendar c = eat(ms);
        int h = c.get(Calendar.HOUR); if (h == 0) h = 12;
        String ap = c.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        return h + ":" + String.format(Locale.US, "%02d", c.get(Calendar.MINUTE)) + " " + ap;
    }
    private static String code(long ms, Random r) {
        Calendar c = eat(ms);
        char yearChar = (char) ('S' + (c.get(Calendar.YEAR) - 2024));       // 2024=S,2025=T,2026=U
        char monthChar = (char) ('A' + c.get(Calendar.MONTH));              // Jan=A .. Aug=H
        char dayChar = DAY_CODE.charAt(Math.min(Math.max(c.get(Calendar.DAY_OF_MONTH), 1), 31) - 1);
        StringBuilder sb = new StringBuilder().append(yearChar).append(monthChar).append(dayChar);
        for (int i = 0; i < 7; i++) sb.append(ALNUM.charAt(r.nextInt(ALNUM.length())));
        return sb.toString();
    }
    private static String maskedPhone(Random r) {
        String[] pre = {"0722","0723","0724","0790","0791","0713","0714","0715","0798","0700","0701","0768","0759"};
        String p = pre[r.nextInt(pre.length)];
        int last3 = r.nextInt(1000);
        return p + "***" + String.format(Locale.US, "%03d", last3);
    }

    /** Full 10-digit Kenyan MSISDN, as shown in real "sent to" M-PESA SMS. */
    private static String fullPhone(Random r) {
        String[] pre = {"0722","0723","0724","0725","0726","0727","0728","0729","0790","0791","0792",
                "0713","0714","0715","0716","0717","0718","0719","0798","0700","0701","0702","0703",
                "0704","0705","0706","0768","0769","0759","0740","0741","0742","0743","0745","0746","0748"};
        String p = pre[r.nextInt(pre.length)];
        return p + String.format(Locale.US, "%06d", r.nextInt(1_000_000));
    }
    // Safaricom P2P tariff (cents)
    static long p2pCost(long amt) {
        long k = amt;
        if (k <= 10000) return 0;
        if (k <= 50000) return 700;
        if (k <= 100000) return 1300;
        if (k <= 150000) return 2300;
        if (k <= 250000) return 3300;
        if (k <= 350000) return 5100;
        if (k <= 500000) return 5700;
        return 7800;
    }
    static long paybillCost(long amt) {
        long k = amt;
        if (k <= 10000) return 0;
        if (k <= 50000) return 700;
        if (k <= 100000) return 1300;
        if (k <= 150000) return 2300;
        if (k <= 250000) return 3300;
        if (k <= 350000) return 5100;
        if (k <= 500000) return 5700;
        if (k <= 750000) return 4200;   // KES 6,044 -> Ksh42.00 (per real C2B SMS)
        return 5500;
    }
}
