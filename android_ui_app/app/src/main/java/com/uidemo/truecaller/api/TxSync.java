package com.uidemo.truecaller.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.model.MsgRow;

/**
 * Polls the invest254 transaction feed and converts it into MsgRow entries for the Messages
 * screen. Live transactions are always sorted newest-first and sit at the TOP of the list,
 * ahead of any demo content. New (never-before-seen) transactions are flagged unread so the
 * app surfaces them like incoming SMS.
 */
public class TxSync {
    public interface Listener {
        void onTransactions(List<MsgRow> rows);   // live rows, newest first (may be empty)
        void onError(String message);             // non-fatal: demo data stays visible
        void onLoggedOut();                       // 401: token expired -> back to login
    }

    private static final long POLL_MS = 10_000;
    private final ApiClient client;
    private final Invest254Api api;
    private final ExecutorService io = Executors.newSingleThreadExecutor();
    private final Handler main = new Handler(Looper.getMainLooper());
    private Listener listener;
    private boolean running;

    public TxSync(Context ctx) {
        this.client = ApiClient.get(ctx);
        this.api = new Invest254Api(client);
    }

    public void setListener(Listener l) { listener = l; }

    public void start() {
        if (running || !client.isLoggedIn()) return;
        running = true;
        main.post(loop);
    }

    public void stop() { running = false; main.removeCallbacks(loop); }

    /** Force an immediate refresh (e.g. pull-to-refresh / screen resume). */
    public void refreshNow() { if (client.isLoggedIn()) io.execute(this::fetchOnce); }

    private final Runnable loop = new Runnable() {
        @Override public void run() {
            if (!running) return;
            io.execute(TxSync.this::fetchOnce);
            main.postDelayed(this, POLL_MS);
        }
    };

    private void fetchOnce() {
        try {
            List<Invest254Api.Tx> txs = api.getTransactions(50);
            long lastSeen = client.getLastSeenTxId();
            long maxId = lastSeen;
            List<MsgRow> rows = new ArrayList<>();
            for (Invest254Api.Tx t : txs) {           // API returns newest first; keep that order
                rows.add(toRow(t, t.id > lastSeen));
                if (t.id > maxId) maxId = t.id;
            }
            client.setLastSeenTxId(maxId);
            List<MsgRow> out = rows;
            main.post(() -> { if (listener != null) listener.onTransactions(out); });
        } catch (Invest254Api.ApiException e) {
            if (e.status == 401 || e.status == 403) {
                client.clearSession();
                main.post(() -> { if (listener != null) listener.onLoggedOut(); });
            } else {
                main.post(() -> { if (listener != null) listener.onError(e.getMessage()); });
            }
        } catch (Exception e) {
            main.post(() -> { if (listener != null) listener.onError(e.getMessage()); });
        }
    }

    /** Map one API transaction to a Messages row (M-PESA style, logo avatar). */
    static MsgRow toRow(Invest254Api.Tx t, boolean unread) {
        boolean credit = "in".equals(t.direction);
        String sign = credit ? "+ " : "- ";
        String title = "MPESA";
        String subtitle = credit ? "Received" : "Sent";
        if ("game_withdrawal".equals(t.source)) subtitle = "Invest254 Withdrawal";
        MsgRow r = MsgRow.txn(
                MsgRow.TRANSACTION, MsgRow.AV_WHITE, "M", title,
                sign + t.mpesaAmountText.replace("Ksh", "KSH "),
                credit, subtitle, formatTime(t.createdAtMs), unread ? 1 : 0)
                .logo(R.drawable.av_mpesa);
        r.body = t.mpesaMessage;
        r.createdAtMs = t.createdAtMs;
        return r;
    }

    static String formatTime(long ms) {
        Date d = new Date(ms);
        Date now = new Date();
        SimpleDateFormat day = new SimpleDateFormat("yyyyMMdd", Locale.US);
        if (day.format(d).equals(day.format(now))) {
            return new SimpleDateFormat("HH:mm", Locale.US).format(d);
        }
        long diffDays = (now.getTime() - ms) / 86_400_000L;
        if (diffDays < 7) return new SimpleDateFormat("EEE", Locale.US).format(d);
        return new SimpleDateFormat("d/M/yy", Locale.US).format(d);
    }
}
