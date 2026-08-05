package com.truecaller.voicemail.presentation.onboarding.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/voicemail/presentation/onboarding/ui/VoicemailOnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailOnboardingActivity extends com.truecaller.voicemail.presentation.onboarding.ui.Hilt_VoicemailOnboardingActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0;

    public VoicemailOnboardingActivity() {
        cu0.h hVar = new cu0.h(this, 6);
        this.d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(d53.k.class), new d53.g(this, 1), new d53.g(this, 0), new ad2.a(hVar, this, 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.voicemail.presentation.onboarding.ui.Hilt_VoicemailOnboardingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(-2126563316, new d53.f(this, 0), true));
    }
}
