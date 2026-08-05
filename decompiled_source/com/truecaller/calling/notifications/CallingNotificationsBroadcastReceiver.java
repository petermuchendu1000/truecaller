package com.truecaller.calling.notifications;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallingNotificationsBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int i = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public nc0.bar c;
    public qw2.u d;
    public s62.d e;
    public nc0.l1 f;
    public com.truecaller.ui.b0 g;
    public kp1.bar h;

    public static void a(com.truecaller.calling.notifications.CallingNotificationsBroadcastReceiver callingNotificationsBroadcastReceiver, java.lang.String str, qx2.mi miVar) {
        nc0.l1 l1Var = callingNotificationsBroadcastReceiver.f;
        if (l1Var != null) {
            l1Var.c(str, "Opened", miVar);
        } else {
            kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
            throw null;
        }
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((tx.w) ((qv0.bar) o40.bar.k(context))).f2(this);
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r1.equals("com.truecaller.request_ignore_battery_optimizations_button") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        r13 = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r13 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        r13.a(2131366134, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIgnoreBatteryOptimizations");
        ak.r0.Y(r12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
    
        kotlin.jvm.internal.Intrinsics.n("notificationManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        if (r1.equals("com.truecaller.request_ignore_battery_optimizations") != false) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0039. Please report as an issue. */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        b(context, intent);
        if (context != null && intent != null) {
            qx2.mi t = ee0.l.t(intent, "notification_interaction", qx2.mi.class);
            if (t == null) {
                t = new qx2.mi("", "Body");
            }
            java.lang.String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -2104750529:
                        if (action.equals("com.truecaller.request_allow_draw_over_other_apps")) {
                            try {
                                context.startActivity(ak.r0.a0(context, true));
                            } catch (android.content.ActivityNotFoundException e) {
                                o82.a.C(e);
                            }
                            android.widget.Toast.makeText(context, 2132018376, 1).show();
                            a(this, "notificationDrawOverOtherApps", t);
                            nc0.bar barVar = this.c;
                            if (barVar != null) {
                                cg1.g.a(barVar, "notification", "Asked");
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                throw null;
                            }
                        }
                        break;
                    case -1577368897:
                        break;
                    case -720889926:
                        if (action.equals("com.truecaller.request_set_as_default_phone_app")) {
                            qw2.u uVar = this.d;
                            if (uVar != null) {
                                uVar.c(new qm1.b(21));
                                a(this, "notificationUnableToBlockCall", t);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("roleRequester");
                                throw null;
                            }
                        }
                        break;
                    case -188537137:
                        if (action.equals("com.truecaller.request_set_as_call_screening_app")) {
                            qw2.u uVar2 = this.d;
                            if (uVar2 != null) {
                                uVar2.b(new qm1.b(20), false);
                                a(this, "notificationCallerIDpermission", t);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("roleRequester");
                                throw null;
                            }
                        }
                        break;
                    case 461970610:
                        break;
                    case 662803603:
                        if (action.equals("com.truecaller.delete_ignore_battery_optimizations")) {
                            s62.f fVar = this.e;
                            if (fVar != null) {
                                fVar.a(2131366134, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIgnoreBatteryOptimizations");
                                nc0.l1 l1Var = this.f;
                                if (l1Var != null) {
                                    l1Var.c("notificationIgnoreBatteryOptimizations", "Dismissed", t);
                                    return;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.n("notificationManager");
                            throw null;
                        }
                        break;
                    case 1585389260:
                        if (action.equals("com.truecaller.call_recording_moved")) {
                            com.truecaller.ui.b0 b0Var = this.g;
                            if (b0Var != null) {
                                f6.k1 e2 = b0Var.e(context);
                                if (this.h != null) {
                                    com.truecaller.floatingtoolbar.api.CallHistoryTab.Type type = com.truecaller.floatingtoolbar.api.CallHistoryTab.Type.Recordings;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "selectedTab");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notification", "analyticsContext");
                                    int i2 = com.truecaller.floatingtoolbar.impl.ui.TabsContainerActivity.i0;
                                    e2.a.add(ok3.bar.N(context, type, "notification", false));
                                    e2.d();
                                    a(this, "notificationCallRecordingMoved", t);
                                    return;
                                }
                                kotlin.jvm.internal.Intrinsics.n("tabIntentFactory");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                            throw null;
                        }
                        break;
                }
            }
            throw new java.lang.RuntimeException(bar.t("Unknown action ", intent.getAction(), " in onReceive"));
        }
    }
}
