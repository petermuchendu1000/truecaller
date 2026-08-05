package com.truecaller.insights.nudges.receivers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BillNudgesBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public d3.g c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((sw1.bar) o40.bar.k(context)).H.b.O2();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.insights.nudges.NudgeAlarmData nudgeAlarmData;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent == null || context == null || (nudgeAlarmData = (com.truecaller.insights.nudges.NudgeAlarmData) intent.getParcelableExtra("extras_nudge_data")) == null) {
            return;
        }
        d3.g gVar = this.c;
        if (gVar != null) {
            gVar.T(nudgeAlarmData);
        } else {
            kotlin.jvm.internal.Intrinsics.n("nudgeNotificationManager");
            throw null;
        }
    }
}
