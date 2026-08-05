package com.truecaller.insights.reminders.receiver;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReminderBootReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
    }
}
