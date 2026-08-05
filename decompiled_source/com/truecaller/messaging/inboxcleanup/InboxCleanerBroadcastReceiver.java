package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InboxCleanerBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (context != null && intent != null && kotlin.jvm.internal.Intrinsics.b(intent.getAction(), "com.truecaller.stop_cleanup")) {
            com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.k = true;
        }
    }
}
