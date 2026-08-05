package com.truecaller.call_assistant.core.onboarding;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/LegacyAssistantOnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lgq0/bar;", "<init>", "()V", "ue0/i", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class LegacyAssistantOnboardingActivity extends com.truecaller.call_assistant.core.onboarding.Hilt_LegacyAssistantOnboardingActivity implements gq0.bar {
    public static final /* synthetic */ int i0 = 0;
    public gq0.b d0;
    public final kotlin.Lazy e0;
    public final kotlin.Lazy f0;
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 13));
    public gq0.h h0;

    public LegacyAssistantOnboardingActivity() {
        final int i = 0;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: gq0.c
            public final /* synthetic */ com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.io.Serializable serializable;
                android.os.Bundle extras;
                java.lang.String stringExtra;
                int i2 = i;
                bd3.qux quxVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.i0;
                        android.content.Intent intent = quxVar.getIntent();
                        com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow callAssistantNavigatorUtil$AssistantOnBoardingFlow = null;
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            serializable = extras.getSerializable("assistant_on_boarding_flow");
                        } else {
                            serializable = null;
                        }
                        if (serializable instanceof com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow) {
                            callAssistantNavigatorUtil$AssistantOnBoardingFlow = (com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow) serializable;
                        }
                        if (callAssistantNavigatorUtil$AssistantOnBoardingFlow == null) {
                            return com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow.DEFAULT;
                        }
                        return callAssistantNavigatorUtil$AssistantOnBoardingFlow;
                    default:
                        int i4 = com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.i0;
                        android.content.Intent intent2 = quxVar.getIntent();
                        if (intent2 == null || (stringExtra = intent2.getStringExtra("KEY_ANALYTICS_CONTEXT")) == null) {
                            return "undefined";
                        }
                        return stringExtra;
                }
            }
        });
        final int i2 = 1;
        this.f0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: gq0.c
            public final /* synthetic */ com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.io.Serializable serializable;
                android.os.Bundle extras;
                java.lang.String stringExtra;
                int i22 = i2;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.i0;
                        android.content.Intent intent = quxVar.getIntent();
                        com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow callAssistantNavigatorUtil$AssistantOnBoardingFlow = null;
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            serializable = extras.getSerializable("assistant_on_boarding_flow");
                        } else {
                            serializable = null;
                        }
                        if (serializable instanceof com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow) {
                            callAssistantNavigatorUtil$AssistantOnBoardingFlow = (com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow) serializable;
                        }
                        if (callAssistantNavigatorUtil$AssistantOnBoardingFlow == null) {
                            return com.truecaller.call_assistant.core.utils.navigation.CallAssistantNavigatorUtil$AssistantOnBoardingFlow.DEFAULT;
                        }
                        return callAssistantNavigatorUtil$AssistantOnBoardingFlow;
                    default:
                        int i4 = com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.i0;
                        android.content.Intent intent2 = quxVar.getIntent();
                        if (intent2 == null || (stringExtra = intent2.getStringExtra("KEY_ANALYTICS_CONTEXT")) == null) {
                            return "undefined";
                        }
                        return stringExtra;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.onboarding.Hilt_LegacyAssistantOnboardingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        setContentView(t0().a);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = t0().a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
        setSupportActionBar(t0().d);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.B((java.lang.CharSequence) null);
        }
        getSupportFragmentManager().h0("step_completed", this, new dj2.w(this, 15));
        u0().u0(this);
        t0().d.setNavigationOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 27));
        getOnBackPressedDispatcher().a(this, new ah.h0(this, 12));
    }

    @Override // com.truecaller.call_assistant.core.onboarding.Hilt_LegacyAssistantOnboardingActivity
    public final void onDestroy() {
        u0().m1();
        super.onDestroy();
    }

    public final xp0.baz t0() {
        return (xp0.baz) this.g0.getValue();
    }

    public final gq0.b u0() {
        gq0.b bVar = this.d0;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void v0(gq0.h hVar) {
        this.h0 = hVar;
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        ((androidx.fragment.app.q1) barVar).p = true;
        barVar.g(2131364005, hVar, (java.lang.String) null);
        barVar.d((java.lang.String) null);
        barVar.m(true, true);
    }
}
