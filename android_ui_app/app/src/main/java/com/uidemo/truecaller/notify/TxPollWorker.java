package com.uidemo.truecaller.notify;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.uidemo.truecaller.api.ApiClient;
import com.uidemo.truecaller.api.Invest254Api;

/**
 * Background listener that keeps withdrawal alerts flowing when the app is closed.
 *
 * WorkManager periodic worker (minimum interval 15 min — the OS-guaranteed floor for
 * battery-friendly background work) polls GET /marketers/me/transactions and raises a
 * Truecaller-style "SMS from MPESA" notification for every credit newer than the last-seen
 * cursor. The cursor lives in SharedPreferences, so it survives process death and reboots.
 *
 * While the app is OPEN, TxSync's 10s loop gives near-real-time alerts; this worker is the
 * safety net for the closed-app case (and catches anything missed after a kill/reboot).
 */
public class TxPollWorker extends Worker {
    public static final String UNIQUE_NAME = "tx-poll";

    public TxPollWorker(@NonNull Context context, @NonNull WorkerParameters params) {
        super(context, params);
    }

    /** Schedule (idempotent) the periodic background poll. */
    public static void schedule(Context ctx) {
        PeriodicWorkRequest req = new PeriodicWorkRequest.Builder(TxPollWorker.class, 15, TimeUnit.MINUTES)
                .build();
        WorkManager.getInstance(ctx).enqueueUniquePeriodicWork(
                UNIQUE_NAME, ExistingPeriodicWorkPolicy.KEEP, req);
    }

    public static void cancel(Context ctx) {
        WorkManager.getInstance(ctx).cancelUniqueWork(UNIQUE_NAME);
    }

    @NonNull @Override public Result doWork() {
        Context ctx = getApplicationContext();
        ApiClient client = ApiClient.get(ctx);
        if (!client.isLoggedIn()) return Result.success(); // nothing to poll until sign-in
        try {
            List<Invest254Api.Tx> txs = new Invest254Api(client).getTransactions(50);
            long lastSeen = client.getLastSeenTxId();
            long maxId = lastSeen;
            for (Invest254Api.Tx t : txs) {          // newest first from the API
                if (t.id > maxId) maxId = t.id;
            }
            // Notify oldest-first so the newest alert lands on top of the shade.
            for (int i = txs.size() - 1; i >= 0; i--) {
                Invest254Api.Tx t = txs.get(i);
                if (t.id > lastSeen && "in".equals(t.direction)) {
                    TcNotifications.showSms(ctx, t);
                }
            }
            client.setLastSeenTxId(maxId);
            return Result.success();
        } catch (Invest254Api.ApiException e) {
            if (e.status == 401 || e.status == 403) client.clearSession();
            return Result.success(); // session cleared; next run is a no-op until re-login
        } catch (Exception e) {
            return Result.retry();   // transient network failure — back off and try again
        }
    }
}
