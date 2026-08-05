package com.uidemo.truecaller.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.uidemo.truecaller.api.ApiClient;

/** Handles the "Mark as read" notification action: clears the alert and marks the tx seen. */
public class MarkReadReceiver extends BroadcastReceiver {
    public static final String ACTION_MARK_READ = "com.uidemo.truecaller.MARK_READ";
    public static final String EXTRA_TX_ID = "txId";

    @Override public void onReceive(Context context, Intent intent) {
        if (!ACTION_MARK_READ.equals(intent.getAction())) return;
        long txId = intent.getLongExtra(EXTRA_TX_ID, -1);
        if (txId < 0) return;
        // Advance the seen cursor past this tx so it isn't re-notified, and dismiss the alert.
        ApiClient client = ApiClient.get(context);
        if (txId > client.getLastSeenTxId()) client.setLastSeenTxId(txId);
        NotificationManagerCompat.from(context).cancel((int) (txId % Integer.MAX_VALUE));
    }
}
