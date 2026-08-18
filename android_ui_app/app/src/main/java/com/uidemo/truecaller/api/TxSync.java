package com.uidemo.truecaller.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.model.MpesaMsg;

/**
 * Foreground poller for the MPESA conversation. Every 10s it fetches the real invest254
 * transactions, merges them with the locally-simulated 6-hourly M-PESA SMS, hands the unified
 * newest-first list to the Messages screen, and raises notifications for anything new. The
 * background WorkManager job (TxPollWorker) does the same when the app is closed.
 */
public class TxSync {
    public interface Listener {
        void onMessages(List<MpesaMsg> msgs);   // unified, newest-first (may be empty)
        void onError(String message);           // non-fatal: demo data stays visible
        void onLoggedOut();                     // 401/403: token invalid / marketer disabled -> login
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

    /** Force an immediate refresh (e.g. screen resume). */
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
            final List<MpesaMsg> merged = MpesaFeed.merge(appContext, txs);
            MpesaCache.save(appContext, merged);   // keep the thread/inbox cache warm for instant opens
            MpesaFeed.notifyNew(appContext, merged);
            main.post(() -> { if (listener != null) listener.onMessages(merged); });
        } catch (Invest254Api.ApiException e) {
            if (e.status == 401 || e.status == 403) {   // token expired OR marketer disabled by admin
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
