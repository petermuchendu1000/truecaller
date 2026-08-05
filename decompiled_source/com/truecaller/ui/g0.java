package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g0 implements com.truecaller.ui.c0 {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final android.content.Context e;

    public g0(android.content.Context context, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "mInsightsAnalyticsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "mNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "mSmartNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "mSmsIdBannerManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = barVar4;
        this.e = context;
    }

    @Override // com.truecaller.ui.c0
    public final void a(android.net.Uri uri, android.os.Bundle bundle) {
        p.c3 c3Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "extras");
        if (kotlin.jvm.internal.Intrinsics.b(bundle.getString("extra_notification_origin"), "extra_smart_notification")) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "<this>");
            if (!kotlin.jvm.internal.Intrinsics.b(bundle.getString("extra_notification_origin"), "extra_smart_notification")) {
                c3Var = new p.c3(16);
            } else {
                java.lang.String string = bundle.getString("extra_action_info");
                java.lang.String str = "";
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = bundle.getString("extra_action_type");
                if (string2 != null) {
                    str = string2;
                }
                com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel otpAnalyticsModel = (android.os.Parcelable) t80.g.q(bundle, "extra_otp_analytics_model", com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel.class);
                if (otpAnalyticsModel != null) {
                    c3Var = gf0.e.t(otpAnalyticsModel);
                } else {
                    p.c3 s = gf0.e.s((android.os.Parcelable) t80.g.q(bundle, "extra_smart_notif_metadata", com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata.class));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
                    s.e = str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "<set-?>");
                    s.f = string;
                    c3Var = s;
                }
            }
            ((zr1.g) this.a.get()).e(c3Var.e());
            int i = bundle.getInt("extra_notification_id", -1);
            if (i != -1) {
                ((s62.d) this.b.get()).a(i, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "pushNotification-smartSmsOnboarding");
                ((hu1.qux) this.c.get()).f(i);
                ((hy1.f0) this.d.get()).t(i);
                ak.r0.l(this.e);
            }
        }
    }
}
