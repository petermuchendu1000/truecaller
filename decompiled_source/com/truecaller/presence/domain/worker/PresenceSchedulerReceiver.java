package com.truecaller.presence.domain.worker;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class PresenceSchedulerReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public xf2.a c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (xf2.a) ((tx.w) ((gg2.a) o40.bar.k(context))).H.b.a.M1.get();
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
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            ((ag2.q) this.c).h(com.truecaller.presence.api.model.AvailabilityTrigger.RECURRING_TASK, true);
        }
    }
}
