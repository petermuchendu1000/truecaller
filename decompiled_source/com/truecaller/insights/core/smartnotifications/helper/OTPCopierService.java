package com.truecaller.insights.core.smartnotifications.helper;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OTPCopierService extends android.app.Service implements bd3.qux {
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public u03.b0 d;
    public m03.b0 e;
    public hy1.f0 f;
    public nc0.bar g;
    public qc3.bar h;
    public zr1.g i;
    public hz1.d j;
    public m03.c k;
    public wm0.bar l;

    public final java.lang.Object X3() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.a.X3();
    }

    public final void a(java.lang.String str, com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel otpAnalyticsModel, java.lang.String str2, boolean z) {
        java.lang.String str3;
        java.lang.String otpProcessor;
        java.lang.String context;
        zr1.g gVar = this.i;
        if (gVar != null) {
            p.c3 c3Var = new p.c3(16);
            if (z) {
                str3 = "custom_smart_notification";
            } else {
                str3 = "otp_notification";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "<set-?>");
            c3Var.a = str3;
            if (z) {
                otpProcessor = "OTP";
            } else {
                otpProcessor = otpAnalyticsModel.getOtpProcessor();
            }
            c3Var.E(otpProcessor);
            c3Var.F(otpAnalyticsModel.getEventInfo());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            c3Var.e = str;
            c3Var.C(str2);
            if (z) {
                context = "";
            } else {
                context = otpAnalyticsModel.getContext();
            }
            c3Var.D(context);
            we0.bar.l(c3Var, otpAnalyticsModel.getRawMessageId());
            we0.bar.m(c3Var, yp.k.z(otpAnalyticsModel.getMessage()));
            if (z) {
                we0.bar.n(c3Var, a.bar.D(otpAnalyticsModel.getMessage()));
            }
            gVar.e(c3Var.e());
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("insightsAnalyticsManager");
        throw null;
    }

    public final void b() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((hu1.baz) X3()).b;
            this.d = (u03.b0) wVar.v4.get();
            this.e = (m03.b0) wVar.I8.get();
            this.f = (hy1.f0) wVar.Lf.get();
            this.g = (nc0.bar) wVar.Y.get();
            tx.c0 c0Var = wVar.b;
            this.h = cd3.baz.a(c0Var.t4);
            this.i = (zr1.g) wVar.F8.get();
            this.j = (hz1.d) wVar.c3.get();
            this.k = (m03.c) wVar.e3.get();
            this.l = c0Var.n2();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        b();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier insightsNotificationIdentifier;
        boolean z;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String action = intent.getAction();
        com.truecaller.log.AssertionUtil.isNotNull(action, "OTPCopierService action should not be null");
        int intExtra = intent.getIntExtra("OTP_NOTIFICATION_ID", -1);
        if (intExtra != -1) {
            insightsNotificationIdentifier = new com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier(intExtra, null, -1);
        } else {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("OTP_NOTIFICATION_ID");
            if (parcelableExtra != null) {
                insightsNotificationIdentifier = (com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier) parcelableExtra;
            } else {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
        }
        int i3 = insightsNotificationIdentifier.a;
        long longExtra = intent.getLongExtra("MESSAGE_ID", -1L);
        long longExtra2 = intent.getLongExtra("CONVERSATION_ID", 0L);
        java.lang.String stringExtra = intent.getStringExtra("SILENT_MARK_AS_READ");
        if (longExtra != -1) {
            c22.f fVar = new c22.f();
            fVar.a = longExtra;
            fVar.b = longExtra2;
            if (stringExtra != null) {
                fVar.f(b91.d.l(0L, "text/plain", 0, stringExtra, false, 0, 0, 0, 0L, null, null, null, null, 0, null, null, 0.0d, 0.0d, 0, null, 1048565));
            }
            fVar.c = com.truecaller.data.entity.messaging.Participant.G;
            com.truecaller.messaging.data.types.Message a = fVar.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "build(...)");
            qc3.bar barVar = this.h;
            if (barVar != null) {
                ((y12.e) barVar.get()).a(a);
            } else {
                kotlin.jvm.internal.Intrinsics.n("insightsMessageStorageBridge");
                throw null;
            }
        } else if (stringExtra != null) {
            hz1.d dVar = this.j;
            if (dVar != null) {
                dVar.a(stringExtra);
                m03.c cVar = this.k;
                if (cVar != null) {
                    if (cVar.b()) {
                        qc3.bar barVar2 = this.h;
                        if (barVar2 != null) {
                            ((y12.v) ((xd0.qux) ((y12.e) barVar2.get()).a.get()).a()).l();
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("insightsMessageStorageBridge");
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
        m03.b0 b0Var = this.e;
        if (b0Var != null) {
            java.lang.String str2 = insightsNotificationIdentifier.b;
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("otp_notification", "analyticsContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationSource, "source");
            u62.l lVar = b0Var.f;
            lVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationSource, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("otp_notification", "analyticsContext");
            ((s62.f) lVar.b).b(i3, pushNotificationSource.getType(), str2, "otp_notification");
            hy1.f0 f0Var = this.f;
            if (f0Var != null) {
                f0Var.t(i3);
                com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel otpAnalyticsModel = (com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel) intent.getParcelableExtra("KEY_OTP_ANALYTICS_MODEL");
                if (i3 != 2131365485) {
                    z = true;
                } else {
                    z = false;
                }
                if (action != null) {
                    int hashCode = action.hashCode();
                    java.lang.String str3 = "";
                    if (hashCode != -648928470) {
                        if (hashCode != 299469613) {
                            if (hashCode == 2031677783 && action.equals("ACTION_MARK_MESSAGE_READ") && otpAnalyticsModel != null) {
                                a("click", otpAnalyticsModel, "mark_read", false);
                                com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction otpNotifAction = com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction.MARK_OTP_READ;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpNotifAction, "action");
                                rc0.b l = p22.bar.l(5, null, otpNotifAction.getValue());
                                nc0.bar barVar3 = this.g;
                                if (barVar3 != null) {
                                    nc0.u1.e(l, barVar3);
                                    return 2;
                                }
                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                throw null;
                            }
                            return 2;
                        }
                        if (action.equals("ACTION_DISMISS_OTP")) {
                            if (otpAnalyticsModel != null) {
                                a("dismiss", otpAnalyticsModel, "", false);
                            }
                            com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction otpNotifAction2 = com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction.DISMISS_OTP;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpNotifAction2, "action");
                            rc0.b l2 = p22.bar.l(5, null, otpNotifAction2.getValue());
                            nc0.bar barVar4 = this.g;
                            if (barVar4 != null) {
                                nc0.u1.e(l2, barVar4);
                                return 2;
                            }
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                        }
                        return 2;
                    }
                    if (action.equals("ACTION_COPY_OTP")) {
                        ak.r0.l(this);
                        java.lang.String stringExtra2 = intent.getStringExtra("OTP");
                        if (stringExtra2 != null) {
                            str3 = stringExtra2;
                        }
                        android.content.Context baseContext = getBaseContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContext, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "clip");
                        try {
                            p40.l.z(baseContext, str3, "com.truecaller.OTP");
                        } catch (java.lang.Exception unused) {
                            com.truecaller.log.AssertionUtil.report("Unable to copy to clipboard.");
                        }
                        hz1.h hVar = hz1.h.a;
                        if (android.os.Build.VERSION.SDK_INT >= 29 && qe0.i1.s() && android.provider.Settings.canDrawOverlays(getBaseContext())) {
                            android.content.Context baseContext2 = getBaseContext();
                            wm0.bar barVar5 = this.l;
                            if (barVar5 != null) {
                                kotlin.jvm.internal.Intrinsics.d(baseContext2);
                                baseContext2.startActivity(barVar5.y(baseContext2, str3));
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("smsIntents");
                                throw null;
                            }
                        }
                        u03.g0 g0Var = this.d;
                        if (g0Var != null) {
                            android.widget.Toast.makeText(this, g0Var.h(2132021789, new java.lang.Object[0]), 0).show();
                            com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction otpNotifAction3 = com.truecaller.analytics.common.event.ViewActionEvent.OtpNotifAction.COPY_OTP;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpNotifAction3, "action");
                            rc0.b l3 = p22.bar.l(5, null, otpNotifAction3.getValue());
                            nc0.bar barVar6 = this.g;
                            if (barVar6 != null) {
                                nc0.u1.e(l3, barVar6);
                                if (otpAnalyticsModel != null) {
                                    if (z) {
                                        str = "copy_otp";
                                    } else {
                                        str = "copy_message";
                                    }
                                    a("click", otpAnalyticsModel, str, z);
                                    return 2;
                                }
                                return 2;
                            }
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
                        throw null;
                    }
                    return 2;
                }
                return 2;
            }
            kotlin.jvm.internal.Intrinsics.n("smsIdBannerManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("insightsTruecallerBridge");
        throw null;
    }
}
