package com.truecaller.call_assistant.core.settings;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/core/settings/CallAssistantSettingsInnerScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "h72/a", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantSettingsInnerScreenActivity extends com.truecaller.call_assistant.core.settings.Hilt_CallAssistantSettingsInnerScreenActivity {
    public static final /* synthetic */ int f0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 20));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(new jq0.baz(this, 24));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.settings.Hilt_CallAssistantSettingsInnerScreenActivity
    public final void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment i;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        android.widget.LinearLayout linearLayout = ((xp0.qux) lazy.getValue()).a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        ak.r0.i(linearLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
        setContentView(((xp0.qux) lazy.getValue()).a);
        java.lang.String stringExtra = getIntent().getStringExtra("EXTRA_TITLE");
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_FRAGMENT_TO_OPEN");
        kotlin.jvm.internal.Intrinsics.e(serializableExtra, "null cannot be cast to non-null type com.truecaller.call_assistant.core.settings.InnerScreen");
        com.truecaller.call_assistant.core.settings.InnerScreen innerScreen = (com.truecaller.call_assistant.core.settings.InnerScreen) serializableExtra;
        setSupportActionBar(((xp0.qux) lazy.getValue()).b);
        setTitle(stringExtra);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        getSupportFragmentManager().h0("step_completed", this, new jc3.bar(this, 12));
        ((xp0.qux) lazy.getValue()).b.setNavigationOnClickListener(new gr2.bar(this, 27));
        int i2 = kr0.k.a[innerScreen.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = new mr0.g();
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                i = new np0.qux();
            }
        } else {
            p02.u3 u3Var = tq0.b.r;
            com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceFeatureContext onboardingStepVoiceFeatureContext = com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceFeatureContext.Settings;
            java.lang.String str = (java.lang.String) this.e0.getValue();
            u3Var.getClass();
            i = p02.u3.i(onboardingStepVoiceFeatureContext, str);
        }
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            ((androidx.fragment.app.q1) barVar).p = true;
            barVar.g(2131364005, i, (java.lang.String) null);
            barVar.l();
        }
    }
}
