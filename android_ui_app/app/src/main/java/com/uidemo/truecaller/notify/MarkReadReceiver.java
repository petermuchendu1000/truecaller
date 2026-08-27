package com.uidemo.truecaller.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.uidemo.truecaller.api.ApiClient;

/** Handles the "Mark as read" and "Delete" notification actions. */
public class MarkReadReceiver extends BroadcastReceiver {
    public static final String ACTION_MARK_READ = "com.uidemo.truecaller.MARK_READ";
    public static final String ACTION_DELETE = "com.uidemo.truecaller.DELETE";
    public static final String EXTRA_TS = "ts";

    @Override public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!ACTION_MARK_READ.equals(action) && !ACTION_DELETE.equals(action)) return;
        long ts = intent.getLongExtra(EXTRA_TS, -1);
        if (ts < 0) return;
        // Both actions clear the alert and advance the read cursor so it does not reappear.
        // (Delete = dismiss this M-PESA alert; Mark as read = same effect for this demo store.)
        ApiClient.get(context).setLastReadMs(ts);
        NotificationManagerCompat.from(context).cancel((int) (ts % Integer.MAX_VALUE));
    }
}
