package com.uidemo.truecaller.api;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import com.uidemo.truecaller.model.MpesaMsg;

/**
 * Last-known M-PESA conversation cache (stale-while-revalidate).
 *
 * The M-PESA thread previously fetched the invest254 transaction feed over HTTP on EVERY open and
 * rendered nothing until it returned — so tapping Truecaller -> M-PESA felt slow. We now persist the
 * merged (real + simulated) message list here after each successful sync. On open the UI renders
 * this cache INSTANTLY (straight to the newest message) and refreshes in the background, so a tap
 * is immediate whether online, offline or on a slow link.
 *
 * Stored as a compact JSON array in the existing "invest254" SharedPreferences. Best-effort: any
 * read/write failure degrades gracefully to the old fetch-then-render behaviour.
 */
public final class MpesaCache {
    private static final String PREFS = "invest254";
    private static final String KEY = "mpesaThreadCacheV1";
    private static final int MAX = 200; // cap so the blob stays small/fast

    private MpesaCache() {}

    private static SharedPreferences prefs(Context ctx) {
        return ctx.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    /** Persist the newest-first merged message list (capped). Best-effort; never throws. */
    public static void save(Context ctx, List<MpesaMsg> msgs) {
        if (msgs == null) return;
        try {
            JSONArray arr = new JSONArray();
            int n = Math.min(msgs.size(), MAX);
            for (int i = 0; i < n; i++) {
                MpesaMsg m = msgs.get(i);
                JSONObject o = new JSONObject();
                o.put("ts", m.ts);
                o.put("credit", m.credit);
                o.put("amountText", m.amountText == null ? "" : m.amountText);
                o.put("party", m.party == null ? "" : m.party);
                o.put("code", m.code == null ? "" : m.code);
                o.put("fullBody", m.fullBody == null ? "" : m.fullBody);
                o.put("sim", m.sim);
                o.put("fuliza", m.fuliza);
                o.put("failed", m.failed);
                arr.put(o);
            }
            prefs(ctx).edit().putString(KEY, arr.toString()).apply();
        } catch (Exception ignored) { /* cache is best-effort */ }
    }

    /** Load the last-known message list (newest-first), or an empty list if none/parse fails. */
    public static List<MpesaMsg> load(Context ctx) {
        List<MpesaMsg> out = new ArrayList<>();
        try {
            String raw = prefs(ctx).getString(KEY, null);
            if (raw == null || raw.isEmpty()) return out;
            JSONArray arr = new JSONArray(raw);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.getJSONObject(i);
                out.add(new MpesaMsg(
                        o.optLong("ts", 0L),
                        o.optBoolean("credit", true),
                        o.optString("amountText", ""),
                        o.optString("party", "M-PESA"),
                        o.optString("code", ""),
                        o.optString("fullBody", ""),
                        o.optBoolean("sim", false),
                        o.optBoolean("fuliza", false),
                        o.optBoolean("failed", false)));
            }
        } catch (Exception ignored) { out.clear(); }
        return out;
    }

    public static boolean has(Context ctx) {
        String raw = prefs(ctx).getString(KEY, null);
        return raw != null && raw.length() > 2;
    }
}
