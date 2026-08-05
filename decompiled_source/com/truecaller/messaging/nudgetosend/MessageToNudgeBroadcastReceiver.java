package com.truecaller.messaging.nudgetosend;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageToNudgeBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public nc0.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.w wVar = ((j32.baz) o40.bar.k(context)).H.b.a;
                        this.c = (nc0.bar) wVar.Y.get();
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
        java.lang.String action;
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (context != null && intent != null && (action = intent.getAction()) != null && action.hashCode() == 1969746501 && action.equals("ACTION_DISMISS_NUDGE_MESSAGE")) {
            if (intent.getBooleanExtra("extra_is_delivered", false)) {
                str = "deliveredNotRead";
            } else {
                str = "sentNotDelivered";
            }
            hi3.e eVar = new hi3.e(qx2.lb.e, qx2.lb.f);
            bi3.j0[] j0VarArr = eVar.b;
            bi3.j0 j0Var = j0VarArr[2];
            ((qx2.p) eVar).e = "dismiss";
            boolean[] zArr = eVar.c;
            zArr[2] = true;
            bi3.j0 j0Var2 = j0VarArr[3];
            ((qx2.p) eVar).f = str;
            zArr[3] = true;
            qx2.lb g = eVar.g();
            nc0.a aVar = this.c;
            if (aVar != null) {
                aVar.c(g);
            } else {
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
        }
    }
}
