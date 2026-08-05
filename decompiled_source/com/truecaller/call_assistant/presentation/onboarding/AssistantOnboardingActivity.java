package com.truecaller.call_assistant.presentation.onboarding;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/presentation/onboarding/AssistantOnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantOnboardingActivity extends com.truecaller.call_assistant.presentation.onboarding.Hilt_AssistantOnboardingActivity {
    public static final /* synthetic */ int f0 = 0;
    public tr0.bar d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.call_assistant.presentation.onboarding.h.class), new com.truecaller.call_assistant.presentation.onboarding.baz(this, 1), new com.truecaller.call_assistant.presentation.onboarding.baz(this, 0), new com.truecaller.call_assistant.presentation.onboarding.baz(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.presentation.onboarding.Hilt_AssistantOnboardingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        tr0.bar barVar = this.d0;
        if (barVar != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("KEY_ANALYTICS_CONTEXT");
            if (stringExtra == null) {
                stringExtra = "undefined";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "entryContext");
            barVar.d = stringExtra;
            e.d.a(this, new d3.qux(534084818, new com.truecaller.call_assistant.presentation.onboarding.bar(this, 0), true));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }
}
