package com.truecaller.call_alert.receive_notification;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAlertDismissBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public qc3.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = cd3.baz.a(((tx.w) ((yk0.bar) o40.bar.k(context))).H.b.K1);
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
        qc3.bar barVar = this.c;
        if (barVar != null) {
            nc0.bar barVar2 = ((sk0.bar) barVar.get()).a;
            hi3.e eVar = new hi3.e(qx2.g3.e, qx2.g3.f);
            bi3.j0 j0Var = eVar.b[2];
            ((qx2.f3) eVar).e = "user_dismissed";
            eVar.c[2] = true;
            ci3.m e = eVar.e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
            ((nc0.a) barVar2).c(e);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("callAlertAnalytics");
        throw null;
    }
}
