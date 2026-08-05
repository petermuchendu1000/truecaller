package com.uidemo.truecaller.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.notify.TcNotifications;

/**
 * Polls the invest254 transaction feed and hands the raw, newest-first transaction list to the
 * Messages screen. The screen collapses these into a SINGLE "MPESA" conversation thread (like
 * real Truecaller — one row per sender), so this class deliberately does NOT pre-build per-row
 * UI. New (never-notified) credits raise Truecaller-style "SMS from MPESA" notifications.
 */
public class TxSync {
    public interface Listener {
        void onTransactions(List<Invest254Api.Tx> txs); // newest-first (may be empty)
        void onError(String message);                   // non-fatal: demo data stays visible
        void onLoggedOut();                             // 401/403: token invalid -> back to login
    }

    private static final long POLL_MS = 10_000;
    private final ApiClient client;
    private final Invest254Api api;
    private final Context appContext;
    private final ExecutorService io = Executors.newSingleThreadExecutor();
    private final Handler main = new Handler(Looper.getMainLooper());
    private Listener listener;
    private boolean running;

    public TxSync(Context ctx) {
        this.appContext = ctx.getApplicationContext();
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
            final List<Invest254Api.Tx> txs = api.getTransactions(50);
            long lastSeen = client.getLastSeenTxId();
            long maxId = lastSeen;
            for (Invest254Api.Tx t : txs) if (t.id > maxId) maxId = t.id;

            // Raise Truecaller-style "SMS from MPESA" notifications for new credits, oldest-first
            // so the newest alert lands on top of the shade.
            for (int i = txs.size() - 1; i >= 0; i--) {
                Invest254Api.Tx t = txs.get(i);
                if (t.id > lastSeen && "in".equals(t.direction)) {
                    TcNotifications.showSms(appContext, t);
                }
            }
            client.setLastSeenTxId(maxId);
            main.post(() -> { if (listener != null) listener.onTransactions(txs); });
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
}
