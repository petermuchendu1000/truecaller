package com.truecaller.insights.ui.notifications.smsid;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/ui/notifications/smsid/MessageIdSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageIdSettingsActivity extends com.truecaller.insights.ui.notifications.smsid.Hilt_MessageIdSettingsActivity {
    public static final /* synthetic */ int g0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ry1.baz.class), new hy1.c(this, 1), new hy1.c(this, 0), new hy1.c(this, 2));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(new hy1.a(this, 0));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new hy1.a(this, 1));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.ui.notifications.smsid.Hilt_MessageIdSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.B(this, true, ex2.a.a);
        e.d.a(this, new d3.qux(-1389279587, new hy1.b(this, 0), true));
        ry1.baz bazVar = (ry1.baz) this.d0.getValue();
        java.lang.String str2 = (java.lang.String) this.e0.getValue();
        java.lang.String str3 = (java.lang.String) this.f0.getValue();
        bazVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticsContext");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("permission", "<set-?>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("view", "<set-?>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("message_id_preference", "<set-?>");
        if (str3 == null) {
            str = "";
        } else {
            str = hz1.h.g(str3, bazVar.d.b());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "<set-?>");
        bazVar.c.e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("permission", "message_id_preference", str, str2, "view", "", 0L, null, false, 448, null), kotlin.collections.r0.q(linkedHashMap)));
        fg3.h0.J(androidx.lifecycle.g1.l(bazVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qd1.b(bazVar, (df3.bar) null, 25), 3);
    }

    @Override // com.truecaller.insights.ui.notifications.smsid.Hilt_MessageIdSettingsActivity
    public final void onDestroy() {
        java.lang.String str;
        java.lang.String str2;
        super.onDestroy();
        ry1.baz bazVar = (ry1.baz) this.d0.getValue();
        java.lang.String str3 = (java.lang.String) this.e0.getValue();
        java.lang.String str4 = (java.lang.String) this.f0.getValue();
        bazVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "analyticsContext");
        for (java.util.Map.Entry entry : bazVar.g.entrySet()) {
            com.truecaller.insights.models.messageid.MessageIdSettingType messageIdSettingType = (com.truecaller.insights.models.messageid.MessageIdSettingType) entry.getKey();
            java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
            boolean booleanValue = bool.booleanValue();
            if (!kotlin.jvm.internal.Intrinsics.b(bazVar.f.get(messageIdSettingType), bool)) {
                switch (ry1.bar.a[messageIdSettingType.ordinal()]) {
                    case 1:
                        str = "OTP";
                        break;
                    case 2:
                        str = "Bank";
                        break;
                    case 3:
                        str = "Bill";
                        break;
                    case 4:
                        str = "Delivery";
                        break;
                    case 5:
                        str = "Travel";
                        break;
                    case 6:
                        str = "Event";
                        break;
                    case 7:
                        str = "Fraud";
                        break;
                    case 8:
                        str = "GovUpdate";
                        break;
                    case 9:
                        str = "LlmSummary";
                        break;
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        str = "feedback_MID";
                        break;
                    default:
                        str = "";
                        break;
                }
                java.util.Locale locale = java.util.Locale.US;
                java.lang.String r = ax1.bar.r(locale, "US", str, locale, "toLowerCase(...)");
                if (booleanValue) {
                    str2 = "enable";
                } else {
                    str2 = "disable";
                }
                java.lang.String str5 = str2;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("permission", "<set-?>");
                java.lang.String str6 = "";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("message_id_preference", "<set-?>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "<set-?>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "<set-?>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "<set-?>");
                if (str4 != null) {
                    str6 = hz1.h.g(str4, bazVar.d.b());
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "<set-?>");
                }
                bazVar.c.e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("permission", "message_id_preference", str6, str3, str5, r, 0L, null, false, 448, null), kotlin.collections.r0.q(linkedHashMap)));
            }
        }
    }
}
