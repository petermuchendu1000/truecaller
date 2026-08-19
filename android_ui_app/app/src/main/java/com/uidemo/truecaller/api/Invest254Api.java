package com.uidemo.truecaller.api;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/** Blocking HTTP calls against the invest254 API. Always invoke off the main thread. */
public class Invest254Api {

    public static class ApiException extends Exception {
        public final int status;
        public ApiException(int status, String message) { super(message); this.status = status; }
    }

    /** One transaction from GET /api/v1/marketers/me/transactions. */
    public static class Tx {
        public long id;
        public String entryType;
        public long amountCents;        // signed: +credit / -withdrawal
        public long balanceAfterCents;
        public String ref;
        public String source;           // e.g. "game_withdrawal"
        public String direction;        // "in" | "out"
        public long createdAtMs;
        public String mpesaCode;
        public String mpesaParty;
        public String mpesaAmountText;  // e.g. "Ksh500.00"
        public String mpesaMessage;     // full M-PESA-style SMS body
    }

    public static class LoginResult {
        public String token;
        public String marketerName;
        public String marketerPhone;
    }

    private final ApiClient client;
    public Invest254Api(ApiClient client) { this.client = client; }

    /** Website-credential login: same phone + password as the invest254 site. */
    public LoginResult loginWeb(String phone, String password) throws Exception {
        JSONObject body = new JSONObject();
        body.put("phone", phone);
        body.put("password", password);
        // Brand-scope the login so a phone shared across brands resolves to THIS brand's marketer.
        body.put("site", ApiClient.SITE);
        JSONObject res = request("POST", "/api/v1/marketers/auth/login-web", body, null);
        LoginResult out = new LoginResult();
        out.token = res.getString("token");
        JSONObject m = res.getJSONObject("marketer");
        out.marketerName = m.optString("name", "");
        out.marketerPhone = m.optString("phone", phone);
        return out;
    }

    /**
     * Verify the marketer session is still valid and active. Throws ApiException(403) when the
     * admin has disabled/suspended this marketer — the caller uses that to lock the app. Returns
     * silently on 200. Used to enforce an admin "disable app" action even before any tx poll.
     */
    public void me() throws Exception {
        String token = client.getToken();
        if (token == null) throw new ApiException(401, "not logged in");
        request("GET", "/api/v1/marketers/me", null, token);
    }

    /** Newest-first transaction feed for the authenticated marketer. */
    public List<Tx> getTransactions(int limit) throws Exception {        String token = client.getToken();
        if (token == null) throw new ApiException(401, "not logged in");
        JSONObject res = request("GET", "/api/v1/marketers/me/transactions?limit=" + limit, null, token);
        JSONArray items = res.getJSONArray("items");
        List<Tx> out = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject o = items.getJSONObject(i);
            Tx t = new Tx();
            t.id = o.getLong("id");
            t.entryType = o.optString("entryType", "");
            t.amountCents = o.getLong("amountCents");
            t.balanceAfterCents = o.getLong("balanceAfterCents");
            t.ref = o.optString("ref", null);
            t.source = o.optString("source", null);
            t.direction = o.optString("direction", "in");
            t.createdAtMs = o.getLong("createdAtMs");
            JSONObject mp = o.getJSONObject("mpesa");
            t.mpesaCode = mp.optString("code", "");
            t.mpesaParty = mp.optString("party", "");
            t.mpesaAmountText = mp.optString("amountText", "");
            t.mpesaMessage = mp.optString("message", "");
            out.add(t);
        }
        return out;
    }

    private JSONObject request(String method, String path, JSONObject body, String token) throws Exception {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(client.getBaseUrl() + path);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(method);
            conn.setConnectTimeout(10_000);
            conn.setReadTimeout(15_000);
            conn.setRequestProperty("Accept", "application/json");
            if (token != null) conn.setRequestProperty("Authorization", "Bearer " + token);
            if (body != null) {
                conn.setDoOutput(true);
                conn.setRequestProperty("Content-Type", "application/json");
                byte[] bytes = body.toString().getBytes(StandardCharsets.UTF_8);
                try (OutputStream os = conn.getOutputStream()) { os.write(bytes); }
            }
            int status = conn.getResponseCode();
            InputStream is = status >= 400 ? conn.getErrorStream() : conn.getInputStream();
            String text = readAll(is);
            if (status >= 400) {
                String msg = "HTTP " + status;
                try { msg = new JSONObject(text).optJSONObject("error") != null
                        ? new JSONObject(text).getJSONObject("error").optString("message", msg) : msg; }
                catch (Exception ignored) {}
                throw new ApiException(status, msg);
            }
            return new JSONObject(text);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String readAll(InputStream is) throws Exception {
        if (is == null) return "{}";
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) sb.append(line);
        }
        return sb.length() == 0 ? "{}" : sb.toString();
    }
}
