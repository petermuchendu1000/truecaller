package com.truecaller.messaging.transport.im;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ImUnreadRemindersBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public nc0.bar c;
    public s62.d d;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.w wVar = ((f42.a1) o40.bar.k(context)).H.b.a;
                        this.c = (nc0.bar) wVar.Y.get();
                        this.d = (s62.d) wVar.P2.get();
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
        if (context != null && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("analytics_peer");
            java.lang.String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("analytics_unread_period");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            java.lang.String action = intent.getAction();
            if (action != null && action.hashCode() == -592610542 && action.equals("com.truecaller.maybe_later_personal")) {
                hi3.e eVar = new hi3.e(qx2.qf.f, qx2.qf.g);
                bi3.j0[] j0VarArr = eVar.b;
                bi3.j0 j0Var = j0VarArr[2];
                ((qx2.d3) eVar).e = "dismiss";
                boolean[] zArr = eVar.c;
                zArr[2] = true;
                bi3.j0 j0Var2 = j0VarArr[3];
                ((qx2.d3) eVar).f = stringExtra;
                zArr[3] = true;
                bi3.j0 j0Var3 = j0VarArr[4];
                ((qx2.d3) eVar).g = str;
                zArr[4] = true;
                qx2.qf g = eVar.g();
                nc0.a aVar = this.c;
                if (aVar != null) {
                    aVar.c(g);
                    if (stringExtra.equals("121")) {
                        s62.d dVar = this.d;
                        if (dVar != null) {
                            ((s62.f) dVar).a(2131364552, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationImUnreadReminder");
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("notificationManager");
                            throw null;
                        }
                    }
                    ak.r0.l(context);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
            throw new java.lang.RuntimeException(bar.t("Unknown action ", intent.getAction(), " in onReceive"));
        }
    }
}
