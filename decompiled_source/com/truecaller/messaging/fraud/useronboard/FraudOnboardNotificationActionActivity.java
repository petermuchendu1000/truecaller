package com.truecaller.messaging.fraud.useronboard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/fraud/useronboard/FraudOnboardNotificationActionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudOnboardNotificationActionActivity extends com.truecaller.messaging.fraud.useronboard.Hilt_FraudOnboardNotificationActionActivity {
    public static final /* synthetic */ int f0 = 0;
    public kv1.i d0;
    public qc3.bar e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.fraud.useronboard.Hilt_FraudOnboardNotificationActionActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        qc3.bar barVar = this.e0;
        if (barVar != null) {
            ((s62.f) ((s62.d) ((rv1.bar) barVar.get()).i.getValue())).a(1181904740, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "fraud_model_onboarding_notification");
            java.lang.String stringExtra = getIntent().getStringExtra("fraud_onboard_action");
            if (stringExtra != null) {
                int hashCode = stringExtra.hashCode();
                if (hashCode != 101142) {
                    if (hashCode == 1434631203 && stringExtra.equals("settings")) {
                        com.truecaller.insights.fraud.analytics.FraudUserActionType fraudUserActionType = com.truecaller.insights.fraud.analytics.FraudUserActionType.GO_TO_SETTINGS;
                        kv1.i iVar = this.d0;
                        if (iVar != null) {
                            k9.d.i(iVar, fraudUserActionType, com.truecaller.insights.fraud.analytics.FraudActionScope.SETTING, com.truecaller.insights.fraud.analytics.FraudActionSurface.ONBOARDING, (java.lang.Long) null, (java.lang.Boolean) null, (com.truecaller.insights.fraud.analytics.FraudLabelValue) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1016);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("fraudSystemAnalytics");
                            throw null;
                        }
                    }
                } else if (stringExtra.equals("faq")) {
                    com.truecaller.insights.fraud.analytics.FraudUserActionType fraudUserActionType2 = com.truecaller.insights.fraud.analytics.FraudUserActionType.OPEN_FAQ;
                    kv1.i iVar2 = this.d0;
                    if (iVar2 != null) {
                        k9.d.i(iVar2, fraudUserActionType2, com.truecaller.insights.fraud.analytics.FraudActionScope.SETTING, com.truecaller.insights.fraud.analytics.FraudActionSurface.ONBOARDING, (java.lang.Long) null, (java.lang.Boolean) null, (com.truecaller.insights.fraud.analytics.FraudLabelValue) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1016);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("fraudSystemAnalytics");
                        throw null;
                    }
                }
            }
            android.content.Intent intent = (android.content.Intent) g6.b.g(getIntent(), "fraud_onboard_destination_intent", android.content.Intent.class);
            if (intent != null) {
                try {
                    kotlin.o oVar = kotlin.q.b;
                    startActivity(intent);
                    kotlin.Unit unit = kotlin.Unit.a;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    od.p.o(th);
                }
            }
            finish();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("fraudUserOnboardManager");
        throw null;
    }
}
