package com.uidemo.truecaller.api;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Thin HTTP client for the invest254 backend. Holds the marketer JWT after login and
 * exposes the two endpoints the app needs:
 *   POST /api/v1/marketers/auth/login-web  (website phone + password -> marketer token)
 *   GET  /api/v1/marketers/me/transactions (newest-first M-PESA-style transaction feed)
 */
public class ApiClient {
    // Production API (fly.io). Override for testing with setBaseUrl().
    public static final String DEFAULT_BASE_URL = "https://invest254-api.fly.dev";
    private static final String PREFS = "invest254";
    private static ApiClient instance;

    private final SharedPreferences prefs;
    private String baseUrl = DEFAULT_BASE_URL;

    private ApiClient(Context ctx) {
        prefs = ctx.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        String saved = prefs.getString("baseUrl", null);
        if (saved != null) baseUrl = saved;
    }

    public static synchronized ApiClient get(Context ctx) {
        if (instance == null) instance = new ApiClient(ctx);
        return instance;
    }

    public void setBaseUrl(String url) { baseUrl = url; prefs.edit().putString("baseUrl", url).apply(); }
    public String getBaseUrl() { return baseUrl; }

    public String getToken() { return prefs.getString("token", null); }
    public String getMarketerName() { return prefs.getString("marketerName", null); }
    public String getMarketerPhone() { return prefs.getString("marketerPhone", null); }

    public void saveSession(String token, String name, String phone) {
        prefs.edit().putString("token", token).putString("marketerName", name).putString("marketerPhone", phone).apply();
    }

    public void clearSession() { prefs.edit().remove("token").remove("marketerName").remove("marketerPhone").apply(); }
    public boolean isLoggedIn() { return getToken() != null; }

    /** Highest transaction id the app has already surfaced (for new-message detection). */
    public long getLastSeenTxId() { return prefs.getLong("lastSeenTxId", 0L); }
    public void setLastSeenTxId(long id) { prefs.edit().putLong("lastSeenTxId", id).apply(); }

    /** Highest transaction id the user has actually opened in the Messages thread (read cursor). */
    public long getLastReadTxId() { return prefs.getLong("lastReadTxId", 0L); }
    public void setLastReadTxId(long id) { prefs.edit().putLong("lastReadTxId", id).apply(); }

    // Timestamp cursors for the unified MPESA conversation (real invest254 tx + simulated SMS).
    /** Latest message timestamp the user has seen in the thread (drives the unread badge). */
    public long getLastReadMs() { return prefs.getLong("lastReadMs", 0L); }
    public void setLastReadMs(long ms) { if (ms > getLastReadMs()) prefs.edit().putLong("lastReadMs", ms).apply(); }
    /** Latest message timestamp already raised as a notification (drives closed-app alerts). */
    public long getLastNotifiedMs() { return prefs.getLong("lastNotifiedMs", 0L); }
    public void setLastNotifiedMs(long ms) { if (ms > getLastNotifiedMs()) prefs.edit().putLong("lastNotifiedMs", ms).apply(); }
    /**
     * Highest REAL invest254 ledger id already raised as a notification. Monotonic and
     * clock-INDEPENDENT, so a device clock ahead of the server can never suppress a real
     * withdrawal alert (the timestamp cursor above governs only simulated filler SMS).
     */
    public long getLastNotifiedTxId() { return prefs.getLong("lastNotifiedTxId", 0L); }
    public void setLastNotifiedTxId(long id) { if (id > getLastNotifiedTxId()) prefs.edit().putLong("lastNotifiedTxId", id).apply(); }
    /** True until the first successful poll seeds the cursors (avoids notifying all history at once). */
    public boolean isFeedSeeded() { return prefs.getBoolean("feedSeeded", false); }
    public void setFeedSeeded() { prefs.edit().putBoolean("feedSeeded", true).apply(); }
}
