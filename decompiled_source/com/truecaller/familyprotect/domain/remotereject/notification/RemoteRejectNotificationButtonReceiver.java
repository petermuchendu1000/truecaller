package com.truecaller.familyprotect.domain.remotereject.notification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RemoteRejectNotificationButtonReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int g = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public qc3.bar c;
    public o02.baz d;
    public ag0.qux e;
    public qc3.bar f;

    public final qc3.bar a() {
        qc3.bar barVar = this.f;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("logger");
        throw null;
    }

    public final void b(android.content.Intent intent) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String stringExtra = intent.getStringExtra("analyticsContext");
        int intExtra = intent.getIntExtra("analyticsAction", -1);
        java.util.Iterator it = com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification) obj).getValue(), stringExtra)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification remoteRejectAnalytics$RemoteRejectNotification = (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification) obj;
        java.util.Iterator it2 = com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (((com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction) obj2).getAction() == intExtra) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction remoteRejectAnalytics$RemoteRejectNotificationAction = (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction) obj2;
        if (remoteRejectAnalytics$RemoteRejectNotification != null && remoteRejectAnalytics$RemoteRejectNotificationAction != null) {
            ag0.qux quxVar = this.e;
            if (quxVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteRejectAnalytics$RemoteRejectNotification, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteRejectAnalytics$RemoteRejectNotificationAction, "action");
                hi3.e eVar = new hi3.e(qx2.nc.f, qx2.nc.g);
                java.lang.String value = remoteRejectAnalytics$RemoteRejectNotification.getValue();
                bi3.j0[] j0VarArr = eVar.b;
                hi3.e.d(j0VarArr[3], value);
                ((qx2.mc) eVar).g = value;
                boolean[] zArr = eVar.c;
                zArr[3] = true;
                bi3.j0 j0Var = j0VarArr[2];
                ((qx2.mc) eVar).e = 1;
                zArr[2] = true;
                int action = remoteRejectAnalytics$RemoteRejectNotificationAction.getAction();
                bi3.j0 j0Var2 = j0VarArr[4];
                ((qx2.mc) eVar).f = action;
                zArr[4] = true;
                qx2.nc e = eVar.e();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
                j71.g.K(e, quxVar.a);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
        ((vl1.bar) a().get()).getClass();
        vl1.bar.b("Invalid notification context/action. context=" + stringExtra + ", action=" + intExtra, true);
    }

    public final void c(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.c0 c0Var = ((ul1.c) o40.bar.k(context)).H.b;
                        this.c = cd3.baz.a(c0Var.a.I4);
                        this.d = c0Var.G3();
                        this.e = c0Var.F3();
                        this.f = cd3.baz.a(c0Var.M3);
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
        c(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -293779797:
                    if (action.equals("hangUpCall")) {
                        ((vl1.bar) a().get()).getClass();
                        vl1.bar.a("Hangup action clicked");
                        int i = com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminService.h;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminService.class);
                        intent2.setAction("sendHangUp");
                        i0.a.A(context, intent2);
                        b(intent);
                        return;
                    }
                    break;
                case 3045982:
                    if (action.equals("call")) {
                        ((vl1.bar) a().get()).getClass();
                        vl1.bar.a("Call action clicked");
                        java.lang.String stringExtra = intent.getStringExtra("phoneNumber");
                        if (stringExtra == null) {
                            return;
                        }
                        int intExtra = intent.getIntExtra("notificationId", -1);
                        qc3.bar barVar = this.c;
                        if (barVar != null) {
                            ((pj1.bar) barVar.get()).i(stringExtra, "familyProtectRemoteRejectCall");
                            o02.baz bazVar = this.d;
                            if (bazVar != null) {
                                if (intExtra != -1) {
                                    ((s62.f) ((s62.d) bazVar.c)).a(intExtra, com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "familyProtect");
                                }
                                b(intent);
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("notificationHelper");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("api");
                        throw null;
                    }
                    break;
                case 98543319:
                    if (action.equals("gotIt")) {
                        ((vl1.bar) a().get()).getClass();
                        vl1.bar.a("Got It action clicked");
                        int intExtra2 = intent.getIntExtra("notificationId", -1);
                        o02.baz bazVar2 = this.d;
                        if (bazVar2 != null) {
                            if (intExtra2 != -1) {
                                ((s62.f) ((s62.d) bazVar2.c)).a(intExtra2, com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "familyProtect");
                            }
                            b(intent);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("notificationHelper");
                        throw null;
                    }
                    break;
                case 1671672458:
                    if (action.equals("dismiss")) {
                        ((vl1.bar) a().get()).getClass();
                        vl1.bar.a("Dismiss action clicked");
                        int i2 = com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminService.h;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                        android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminService.class);
                        intent3.setAction("dismiss");
                        i0.a.A(context, intent3);
                        b(intent);
                        return;
                    }
                    break;
                case 2111788528:
                    if (action.equals("swipeDismiss")) {
                        ((vl1.bar) a().get()).getClass();
                        vl1.bar.a("Swipe dismiss action clicked");
                        b(intent);
                        return;
                    }
                    break;
            }
        }
        vl1.bar barVar2 = (vl1.bar) a().get();
        java.lang.String str = "Notification receiver unknown: " + intent.getAction();
        barVar2.getClass();
        vl1.bar.b(str, true);
    }
}
