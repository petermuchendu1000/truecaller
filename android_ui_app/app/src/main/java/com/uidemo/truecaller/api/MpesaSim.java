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
 * Deterministic simulated M-PESA SMS generator. Produces realistic message traffic every
 * 30-60 minutes with a natural day/night rhythm: quiet overnight, busy mornings, lunch and
 * evening peaks (pubs, restaurants, tills). Messages are byte-accurate to real Safaricom SMS:
 * transaction code, EAT date/time, grouped "KshX.XX", full recipient phone numbers on sends,
 * transaction cost + cumulative daily limit, and the "Download My OneApp on https://saf.cx/..."
 * tail. A running simulated balance evolves message-to-message for realism.
 *
 * Each event's content is a pure function of its event index, so generation is idempotent and
 * survives process death (persisted in prefs).
 */
public class MpesaSim {
    private static final long MIN_GAP_MS = 30L * 60 * 1000;   // 30 minutes
    private static final long MAX_GAP_MS = 60L * 60 * 1000;   // 1 hour
    private static final int SEED_EVENTS = 60;                // pre-populate ~2 days on first run
    private static final int MAX_STORED = 400;
    private static final String PREFS = "invest254";
    private static final String LINK_RECEIVE = "https://saf.cx/lPKcC";
    private static final String LINK_SEND = "https://saf.cx/kWQpy";
    private static final long DAILY_LIMIT_CENTS = 50_000_000L; // KES 500,000/day

    // ---- People (P2P) ----
    private static final String[] NAMES = {
        "PETER MUCHENDU","FAITH MWANGI","BRIAN OTIENO","MERCY WANJIKU","KEVIN KAMAU","GRACE ACHIENG",
        "DENNIS KIPROP","CYNTHIA NJERI","VICTOR OMONDI","ESTHER WAFULA","COLLINS BARASA","JOY CHEBET",
        "SAMUEL MUTUA","AMINA HASSAN","JAMES NJOROGE","HALIMA YUSUF","DAVID MWAURA","ZAWADI BARAKA",
        "SALIM ABDI","FATUMA RASHID","WILLIAM ARNING","BRENDA NYAKIO RUKENYA","GLADYS WANJIKU HUTHU MBOTE",
        "JULIUS KIMANI","SILVER ODUOR","MARBLES SQUARE","LUCY WAIRIMU","MOSES KIPTOO","ANN NYAMBURA",
        "GEORGE OCHIENG","BEATRICE MORAA","DANIEL KARIUKI","ROSE ATIENO","PATRICK MWENDA","IRENE CHEPKEMOI",
        "STEPHEN NDUNG'U","CAROLINE WAMBUI","ANTONY MUSYOKA","PAULINE JEPKORIR","FRANCIS OUMA","NANCY GATHONI",
        "ELIJAH ROTICH","MARGARET NJOKI","JOSEPH KILONZO","SUSAN ADHIAMBO","MICHAEL THUO","AGNES CHERONO",
        "CHARLES MAINA","WINNIE AKINYI","RICHARD SIFUNA","JANET MWIKALI","PETER KIPLAGAT","ELIZABETH WANJA",
        "THOMAS ODHIAMBO","MILLICENT NYAWIRA","BENARD ONYANGO","CATHERINE MUTHONI","ISAAC LEMAYAN","RUTH JELIMO"
    };

    // ---- Paybills (utilities, TV, government, betting) ----
    private static final String[] PAYBILLS = {
        "KPLC PREPAID","NAIROBI WATER","DSTV KENYA","ZUKU FIBER","KRA","NHIF","GOTV","SAFARICOM HOME",
        "STARTIMES","SHOWMAX","BETIKA","SPORTPESA","JAMBOPAY","KENYA POWER POSTPAID","AZAM TV"
    };

    // ---- Supermarkets & retail ----
    private static final String[] TILLS_RETAIL = {
        "NAIVAS SUPERMARKET","QUICKMART","CARREFOUR","CHANDARANA FOODPLUS","CLEANSHELF SUPERMARKET",
        "KHETIAS SUPERMARKET","EASTMATT SUPERMARKET","JUMIA KE","KILIMALL","SOCIETY STORES",
        "SKYMART SUPERMARKET","MATTRESS & MORE EA","TEXT BOOK CENTRE","NAIROBI PHARMACY","GOODLIFE PHARMACY"
    };

    // ---- Petrol stations ----
    private static final String[] TILLS_FUEL = {
        "TOTAL ENERGIES","RUBIS KENYA","SHELL KENYA","OLA ENERGY","ASTROL PETROL","GULF ENERGY"
    };

    // ---- Restaurants, coffee, fast food ----
    private static final String[] TILLS_FOOD = {
        "JAVA HOUSE","ARTCAFFE","BIG SQUARE","CJ'S RESTAURANT","KILIMANJARO JAMIA","KENYATTA HOSPITAL CANTEEN",
        "MAMA OLIEPH KITCHEN","RANALO FOODS","K'OSEWE RANALO","ABOUT THYME","TALISMAN RESTAURANT",
        "MEDITERRANEO RESTAURANT","FURUSATO JAPANESE","SHAURMA EXPRESS","PIZZA INN KENYA","CHICKEN INN",
        "GALITO'S KENYA","KFC KENYA","DOMINO'S PIZZA KE","SUBWAY KENYA","BURGER KING KENYA"
    };

    // ---- Pubs, bars, clubs ----
    private static final String[] TILLS_PUBS = {
        "K1 KLUB HOUSE","BREW BISTRO","1824 WHISKEY BAR","QUIVER LOUNGE","BOMAS OF KENYA","THE ALCHEMIST BAR",
        "SAILORS LOUNGE","MOJOS BAR & GRILL","CARNIVORE SIMBA SALOON","HAVANA BAR","ZODIAK LOUNGE",
        "CLUB SILK","B-CLUB NAIROBI","SPACE LOUNGE","MIST NAIROBI","FIFTEEN ROOFTOP","MERCADO MEXICAN KITCHEN",
        "BLVD LOUNGE","ONYX LOUNGE","EPIC CLUB","TAMASHA ELDORET","CLUB TIMBA KISUMU"
    };

    // ---- 2-3 star hotels & guesthouses ----
    private static final String[] TILLS_HOTELS = {
        "SENTRIM BOULEVARD HOTEL","HERON PORTICO HOTEL","HOTEL SAPPHIRE","PRIDEINN PARADISE MOMBASA",
        "BOMA INN NAIROBI","AFTER 40 HOTEL","EKA HOTEL NAIROBI","HOTEL BOULEVARD","COMFORT INN SUITES",
        "GUESTHOUSE MERU","SUNSET GUESTHOUSE NAKURU","HIGHLANDS INN ELDORET","LAKESIDE HOTEL KISUMU",
        "MOUNTAIN VIEW LODGE NYERI","PALM GARDEN HOTEL MALINDI","KOROMA GUESTHOUSE","GREEN HILLS HOTEL",
        "CITY LODGE NAIROBI","TRAVELODGE MOMBASA","OASIS GUESTHOUSE THIKA"
    };

    // ---- Transport ----
    private static final String[] TILLS_TRANSPORT = {
        "SUPER METRO SACCO","KENYA BUS SERVICE","NAIROBI MATATU SACCO","KENYA AIRWAYS","SGR MADARAKA EXPRESS",
        "JAMBOJET","UBER KENYA","BOLT KENYA","MODERN COAST","EASY COACH","GUARDIAN ANGEL SHUTTLE"
    };

    private final SharedPreferences prefs;
    public MpesaSim(Context ctx) { prefs = ctx.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE); }

    /**
     * Advance simulation to the current time (idempotent), persist, and return every simulated
     * message newest-first. Safe to call from the foreground poll, the background worker, and the
     * conversation screen.
     */
    public synchronized List<MpesaMsg> syncAndGetAll() {
        long now = System.currentTimeMillis();
        long lastTs = prefs.getLong("simLastTsV3", 0L);
        long balance = prefs.getLong("simBalanceCentsV3", 2_000_00L); // start KES 2,000.00
        long daySpent = prefs.getLong("simDaySpentCentsV3", 0L);      // cumulative daily spend (resets daily)
        long dayKey = prefs.getLong("simDayKeyV3", 0L);
        JSONArray arr = load();

        if (lastTs == 0L) {                    // first run: seed recent history so it isn't empty
            // walk backwards from now to build ~SEED_EVENTS events
            long t = now;
            List<Long> seedTimes = new ArrayList<>();
            for (int i = 0; i < SEED_EVENTS; i++) {
                seedTimes.add(t);
                t = previousEventTime(t, i);
            }
            // generate oldest-first so balance evolves naturally
            for (int i = seedTimes.size() - 1; i >= 0; i--) {
                long ts = seedTimes.get(i);
                long slotDay = dayOf(ts);
                if (slotDay != dayKey) { daySpent = 0L; dayKey = slotDay; }
                JSONObject o = generate(ts, balance, daySpent);
                balance = o.optLong("_bal", balance);
                if (!o.optBoolean("credit")) daySpent += o.optLong("_amt", 0L);
                arr.put(o);
            }
            lastTs = now;
        } else {
            // generate forward from lastTs until we pass now
            long t = lastTs;
            int guard = 0;
            while (guard++ < 500) {
                t = nextEventTime(t);
                if (t > now) break;
                long slotDay = dayOf(t);
                if (slotDay != dayKey) { daySpent = 0L; dayKey = slotDay; }
                JSONObject o = generate(t, balance, daySpent);
                balance = o.optLong("_bal", balance);
                if (!o.optBoolean("credit")) daySpent += o.optLong("_amt", 0L);
                arr.put(o);
                lastTs = t;
            }
        }
        // cap
        while (arr.length() > MAX_STORED) arr.remove(0);
        save(arr);
        prefs.edit().putLong("simLastTsV3", lastTs).putLong("simBalanceCentsV3", balance)
                .putLong("simDaySpentCentsV3", daySpent).putLong("simDayKeyV3", dayKey).apply();

        List<MpesaMsg> out = new ArrayList<>();
        for (int i = arr.length() - 1; i >= 0; i--) out.add(fromJson(arr.optJSONObject(i))); // newest first
        return out;
    }

    private JSONArray load() {
        try { return new JSONArray(prefs.getString("simMsgsV3", "[]")); }
        catch (Exception e) { return new JSONArray(); }
    }
    private void save(JSONArray a) { prefs.edit().putString("simMsgsV3", a.toString()).apply(); }

    /** Next event time: 30-60 min later, but stretched at night (fewer events). */
    private static long nextEventTime(long from) {
        Random r = new Random(from * 0x9E3779B97F4A7C15L);
        long gap = MIN_GAP_MS + (long)(r.nextDouble() * (MAX_GAP_MS - MIN_GAP_MS));
        long candidate = from + gap;
        // at night (00:00-06:00 EAT) only ~15% of slots produce an event -> skip ahead
        while (isQuietHour(candidate) && r.nextDouble() > 0.15) {
            gap = MIN_GAP_MS + (long)(r.nextDouble() * (MAX_GAP_MS - MIN_GAP_MS));
            candidate += gap;
        }
        return candidate;
    }

    /** Walk backwards for seeding: previous event 30-60 min earlier, skipping quiet night hours. */
    private static long previousEventTime(long to, int salt) {
        Random r = new Random((to + salt * 7919L) * 0x9E3779B97F4A7C15L);
        long gap = MIN_GAP_MS + (long)(r.nextDouble() * (MAX_GAP_MS - MIN_GAP_MS));
        long candidate = to - gap;
        while (isQuietHour(candidate) && r.nextDouble() > 0.15) {
            gap = MIN_GAP_MS + (long)(r.nextDouble() * (MAX_GAP_MS - MIN_GAP_MS));
            candidate -= gap;
        }
        return candidate;
    }

    private static boolean isQuietHour(long ms) {
        Calendar c = eat(ms);
        int h = c.get(Calendar.HOUR_OF_DAY);
        return h >= 0 && h < 6;
    }

    private static long dayOf(long ms) {
        Calendar c = eat(ms);
        return c.get(Calendar.YEAR) * 1000L + c.get(Calendar.DAY_OF_YEAR);
    }

    /** Build one message at an exact timestamp; embeds "_bal" and "_amt". */
    private JSONObject generate(long ts, long balanceCents, long daySpentCents) {
        Random rng = new Random(ts * 0x9E3779B97F4A7C15L);
        Calendar c = eat(ts);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int roll = rng.nextInt(100);
        String code = code(ts, rng);
        JSONObject o = new JSONObject();
        try {
            // time-of-day weighted category selection
            if (hour >= 18 && hour < 23) {           // evening: pubs, restaurants, hotels
                if (roll < 30)      putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_PUBS), code, rng, 2_000_00, 15_000_00);
                else if (roll < 55) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_FOOD), code, rng, 1_500_00, 8_000_00);
                else if (roll < 70) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_HOTELS), code, rng, 3_000_00, 12_000_00);
                else if (roll < 85) putP2P(o, ts, balanceCents, daySpentCents, code, rng, false);
                else                putP2P(o, ts, balanceCents, daySpentCents, code, rng, true);
            } else if (hour >= 12 && hour < 14) {    // lunch: food, retail
                if (roll < 45)      putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_FOOD), code, rng, 800_00, 4_000_00);
                else if (roll < 65) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_RETAIL), code, rng, 1_000_00, 6_000_00);
                else if (roll < 85) putP2P(o, ts, balanceCents, daySpentCents, code, rng, false);
                else                putP2P(o, ts, balanceCents, daySpentCents, code, rng, true);
            } else if (hour >= 6 && hour < 12) {     // morning: retail, fuel, transport, paybills
                if (roll < 30)      putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_RETAIL), code, rng, 500_00, 5_000_00);
                else if (roll < 45) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_FUEL), code, rng, 1_000_00, 5_000_00);
                else if (roll < 60) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_TRANSPORT), code, rng, 100_00, 1_500_00);
                else if (roll < 75) putPaybill(o, ts, balanceCents, daySpentCents, code, rng);
                else if (roll < 90) putP2P(o, ts, balanceCents, daySpentCents, code, rng, false);
                else                putP2P(o, ts, balanceCents, daySpentCents, code, rng, true);
            } else {                                  // afternoon & night: mixed, mostly P2P
                if (roll < 40)      putP2P(o, ts, balanceCents, daySpentCents, code, rng, false);
                else if (roll < 65) putP2P(o, ts, balanceCents, daySpentCents, code, rng, true);
                else if (roll < 80) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_RETAIL), code, rng, 500_00, 4_000_00);
                else if (roll < 90) putDebit(o, ts, balanceCents, daySpentCents, pick(rng, TILLS_FOOD), code, rng, 800_00, 3_000_00);
                else                putPaybill(o, ts, balanceCents, daySpentCents, code, rng);
            }
        } catch (Exception ignored) {}
        return o;
    }

    // ---- message builders ----

    /** P2P send or receive. */
    private void putP2P(JSONObject o, long ts, long balanceCents, long daySpentCents, String code, Random rng, boolean credit) throws Exception {
        long amt = amount(rng, 100_00, credit ? 50_000_00 : 20_000_00);
        String name = NAMES[rng.nextInt(NAMES.length)];
        String phone = fullPhone(rng);
        String party = name + " " + phone;
        if (credit) {
            long bal = balanceCents + amt;
            String body = code + " Confirmed.You have received " + ksh(amt) + " from " + party +
                " on " + date(ts) + " at " + time(ts) + "  New M-PESA balance is " + ksh(bal) +
                ". Download My OneApp on " + LINK_RECEIVE;
            put(o, ts, true, ksh(amt), party, code, body, bal);
        } else {
            long cost = p2pCost(amt);
            long bal = Math.max(0, balanceCents - amt - cost);
            String body = code + " Confirmed. " + ksh(amt) + " sent to " + party +
                " on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
                ". Transaction cost, " + ksh(cost) +
                ". Amount you can transact within the day is " + amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) +
                ". Download My OneApp on " + LINK_SEND;
            put(o, ts, false, ksh(amt), party, code, body, bal);
        }
    }

    /** Buy goods / pay a till (pub, shop, hotel, fuel, food). */
    private void putDebit(JSONObject o, long ts, long balanceCents, long daySpentCents, String till, String code, Random rng, long lo, long hi) throws Exception {
        long amt = amount(rng, lo, hi);
        long cost = paybillCost(amt);
        long bal = Math.max(0, balanceCents - amt - cost);
        String body = code + " Confirmed. Ksh" + amountPlain(amt) + " paid to " + till +
            ". on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
            ". Transaction cost, " + ksh(cost) + ". Amount you can transact within the day is " +
            amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) + ". Download My OneApp on " + LINK_SEND;
        put(o, ts, false, ksh(amt), till, code, body, bal);
    }

    /** Paybill with account number. */
    private void putPaybill(JSONObject o, long ts, long balanceCents, long daySpentCents, String code, Random rng) throws Exception {
        long amt = amount(rng, 200_00, 15_000_00);
        long cost = paybillCost(amt);
        long bal = Math.max(0, balanceCents - amt - cost);
        String pb = PAYBILLS[rng.nextInt(PAYBILLS.length)];
        String acct = String.valueOf(100000 + rng.nextInt(900000));
        String body = code + " Confirmed. " + ksh(amt) + " paid to " + pb + " for account " + acct +
            ". on " + date(ts) + " at " + time(ts) + ". New M-PESA balance is " + ksh(bal) +
            ". Transaction cost, " + ksh(cost) + ". Amount you can transact within the day is " +
            amountPlain(DAILY_LIMIT_CENTS - daySpentCents - amt) + ". Download My OneApp on " + LINK_SEND;
        put(o, ts, false, ksh(amt), pb, code, body, bal);
    }

    private static <T> T pick(Random r, T[] arr) { return arr[r.nextInt(arr.length)]; }

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
            o.optString("party"), o.optString("code"), o.optString("body"), false);
    }

    // ---- formatting helpers ----

    private static long amount(Random r, long loCents, long hiCents) {
        long shillings = loCents / 100 + (long) (r.nextDouble() * ((hiCents - loCents) / 100.0));
        return shillings * 100;
    }
    private static String ksh(long cents) { return "Ksh" + amountPlain(cents); }
    private static String amountPlain(long cents) {
        String s = String.format(Locale.US, "%d.%02d", cents / 100, cents % 100);
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
        if (k <= 750000) return 4200;
        return 5500;
    }
}
