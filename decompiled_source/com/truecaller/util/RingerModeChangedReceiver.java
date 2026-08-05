package com.truecaller.util;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RingerModeChangedReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public cd3.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((m03.x0) o40.bar.k(context)).H.b.a.M1;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null && kotlin.jvm.internal.Intrinsics.b(intent.getAction(), "android.media.RINGER_MODE_CHANGED")) {
            cd3.bar barVar = this.c;
            if (barVar != null) {
                ((xf2.a) barVar.get()).h(com.truecaller.presence.api.model.AvailabilityTrigger.USER_ACTION, false);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("presenceManager");
            throw null;
        }
    }
}
