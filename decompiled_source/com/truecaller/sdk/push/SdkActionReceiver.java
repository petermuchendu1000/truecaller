package com.truecaller.sdk.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class SdkActionReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (intent.hasExtra("a")) {
            com.truecaller.sdk.push.PushAppData pushAppData = (com.truecaller.sdk.push.PushAppData) intent.getParcelableExtra("a");
            ak.r0.l(context);
            com.truecaller.sdk.o.e(pushAppData);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(16);
                ak.r0.l(context);
            }
        }
    }
}
