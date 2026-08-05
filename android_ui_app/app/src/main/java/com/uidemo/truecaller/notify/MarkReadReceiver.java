package com.uidemo.truecaller.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.uidemo.truecaller.api.ApiClient;

/** Handles the "Mark as read" notification action: clears the alert and advances the read cursor. */
public class MarkReadReceiver extends BroadcastReceiver {
    public static final String ACTION_MARK_READ = "com.uidemo.truecaller.MARK_READ";
    public static final String EXTRA_TS = "ts";

    @Override public void onReceive(Context context, Intent intent) {
        if (!ACTION_MARK_READ.equals(intent.getAction())) return;
        long ts = intent.getLongExtra(EXTRA_TS, -1);
        if (ts < 0) return;
        ApiClient.get(context).setLastReadMs(ts);   // mark this message (and older) read
        NotificationManagerCompat.from(context).cancel((int) (ts % Integer.MAX_VALUE));
    }
}
