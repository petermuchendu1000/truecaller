package com.uidemo.truecaller.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/** Re-schedule the background poll after device reboot (WorkManager survives, this is a belt-and-braces re-arm). */
public class BootReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            TxPollWorker.schedule(context);
        }
    }
}
