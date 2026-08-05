package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity b;

    public /* synthetic */ bar(com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity assistantOnboardingActivity, int i) {
        this.a = i;
        this.b = assistantOnboardingActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        int i2 = 1;
        v2.n nVar = (v2.n) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity.f0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(-902963922, new com.truecaller.call_assistant.presentation.onboarding.bar(this.b, i2), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                int i4 = com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity.f0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar.P(intValue & 1, z2)) {
                    com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity assistantOnboardingActivity = this.b;
                    com.truecaller.call_assistant.presentation.onboarding.h hVar = (com.truecaller.call_assistant.presentation.onboarding.h) assistantOnboardingActivity.e0.getValue();
                    boolean h = nVar.h(assistantOnboardingActivity);
                    java.lang.Object M = nVar.M();
                    if (h || M == v2.k.a) {
                        com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, assistantOnboardingActivity, com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity.class, "finish", "finish()V", 0, 6);
                        nVar.k0(quxVar);
                        M = quxVar;
                    }
                    com.truecaller.call_assistant.presentation.onboarding.i.a(null, hVar, (kotlin.reflect.KFunction) M, nVar, 0);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
        }
    }
}
