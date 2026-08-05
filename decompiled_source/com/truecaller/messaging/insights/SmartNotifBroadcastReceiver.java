package com.truecaller.messaging.insights;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmartNotifBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int l = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public zr1.g c;
    public hu1.qux d;
    public s62.d e;
    public hz1.d f;
    public m03.c g;
    public qc3.bar h;
    public nc0.y0 i;
    public hy1.f0 j;
    public wm0.bar k;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((n22.c) o40.bar.k(context)).o2(this);
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0052, code lost:
    
        if (r3.equals("com.truecaller.insights.notifications.MARK_AS_READ") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0059, code lost:
    
        if (r3.equals("com.truecaller.insights.notifications.DISMISS") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0060, code lost:
    
        if (r3.equals("com.truecaller.insights.notifications.SILENT_MARK_AS_READ") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r3.equals("com.truecaller.insights.notifications.COPY") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r3 = gj.m.m(r25).e();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action;
        vu1.baz bazVar;
        java.lang.String action2;
        java.lang.Throwable th;
        int intExtra;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null && (action = intent.getAction()) != null && action.length() != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
            if (kotlin.jvm.internal.Intrinsics.b(intent.getStringExtra("extra_notification_origin"), "extra_smart_notification")) {
                java.lang.String action3 = intent.getAction();
                if (action3 != null) {
                    switch (action3.hashCode()) {
                        case -614719446:
                            break;
                        case 1548121:
                            break;
                        case 478459522:
                            break;
                        case 729908454:
                            break;
                    }
                    if (bazVar != null) {
                        zr1.g gVar = this.c;
                        if (gVar != null) {
                            gVar.e(bazVar);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("analyticsManager");
                            throw null;
                        }
                    }
                    action2 = intent.getAction();
                    if (action2 == null) {
                        th = null;
                        switch (action2.hashCode()) {
                            case -614719446:
                                if (action2.equals("com.truecaller.insights.notifications.SILENT_MARK_AS_READ") && (stringExtra = intent.getStringExtra("extra_message_text")) != null && stringExtra.length() != 0) {
                                    hz1.d dVar = this.f;
                                    if (dVar != null) {
                                        dVar.a(stringExtra);
                                        m03.c cVar = this.g;
                                        if (cVar != null) {
                                            if (cVar.b()) {
                                                qc3.bar barVar = this.h;
                                                if (barVar != null) {
                                                    ((y12.v) ((xd0.qux) barVar.get()).a()).l();
                                                    break;
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("storage");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("appListener");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("insightConfig");
                                        throw null;
                                    }
                                }
                                break;
                            case 1548121:
                                if (action2.equals("com.truecaller.insights.notifications.DISMISS")) {
                                    long longExtra = intent.getLongExtra("extra_message_id", -1L);
                                    if (longExtra != -1) {
                                        qc3.bar barVar2 = this.h;
                                        if (barVar2 != null) {
                                            ((y12.v) ((xd0.qux) barVar2.get()).a()).V(longExtra);
                                            nc0.y0 y0Var = this.i;
                                            if (y0Var != null) {
                                                li.qux.q(y0Var, "dismiss", longExtra, true);
                                                break;
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("messageAnalytics");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("storage");
                                            throw null;
                                        }
                                    }
                                }
                                break;
                            case 478459522:
                                if (action2.equals("com.truecaller.insights.notifications.MARK_AS_READ")) {
                                    long longExtra2 = intent.getLongExtra("extra_message_id", -1L);
                                    long longExtra3 = intent.getLongExtra("extra_conversation_id", -1L);
                                    if (longExtra2 != -1 && longExtra3 != -1) {
                                        qc3.bar barVar3 = this.h;
                                        if (barVar3 != null) {
                                            ((y12.v) ((xd0.qux) barVar3.get()).a()).e0("notification", false, true, new long[]{longExtra3}, longExtra2);
                                            nc0.y0 y0Var2 = this.i;
                                            if (y0Var2 != null) {
                                                li.qux.q(y0Var2, "markAsRead", longExtra2, true);
                                                break;
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("messageAnalytics");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("storage");
                                            throw null;
                                        }
                                    }
                                }
                                break;
                            case 729908454:
                                if (action2.equals("com.truecaller.insights.notifications.COPY") && context != null) {
                                    java.lang.String stringExtra2 = intent.getStringExtra("OTP");
                                    if (stringExtra2 == null) {
                                        stringExtra2 = "";
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "clip");
                                    try {
                                        p40.l.z(context, stringExtra2, "com.truecaller.OTP");
                                    } catch (java.lang.Exception unused) {
                                    }
                                    hz1.h hVar = hz1.h.a;
                                    if (android.os.Build.VERSION.SDK_INT >= 29 && qe0.i1.s() && android.provider.Settings.canDrawOverlays(context)) {
                                        wm0.bar barVar4 = this.k;
                                        if (barVar4 != null) {
                                            context.startActivity(barVar4.y(context, stringExtra2));
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("smsIntents");
                                            throw null;
                                        }
                                    }
                                    android.widget.Toast.makeText(context, context.getString(2132021789), 0).show();
                                    break;
                                }
                                break;
                        }
                    } else {
                        th = null;
                    }
                    intExtra = intent.getIntExtra("extra_notification_id", -1);
                    if (intExtra == -1) {
                        hu1.qux quxVar = this.d;
                        if (quxVar != null) {
                            ((hu1.d) quxVar).f(intExtra);
                            s62.d dVar2 = this.e;
                            if (dVar2 != null) {
                                ((s62.f) dVar2).a(intExtra, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationSmartCards");
                                hy1.f0 f0Var = this.j;
                                if (f0Var != null) {
                                    f0Var.t(intExtra);
                                    return;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("smsIdBannerManager");
                                    throw th;
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.n("notificationManager");
                            throw th;
                        }
                        kotlin.jvm.internal.Intrinsics.n("smartNotificationManager");
                        throw th;
                    }
                    return;
                }
                bazVar = null;
                if (bazVar != null) {
                }
                action2 = intent.getAction();
                if (action2 == null) {
                }
                intExtra = intent.getIntExtra("extra_notification_id", -1);
                if (intExtra == -1) {
                }
            }
        }
    }
}
