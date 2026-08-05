package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements ig3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb.e0 b;
    public final /* synthetic */ kotlin.jvm.functions.Function0 c;

    public /* synthetic */ c(rb.e0 e0Var, kotlin.jvm.functions.Function0 function0, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = function0;
    }

    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        switch (this.a) {
            case 0:
                vs0.d dVar = (vs0.d) obj;
                boolean z = dVar instanceof vs0.baz;
                rb.e0 e0Var = this.b;
                if (z) {
                    com.truecaller.call_assistant.presentation.onboarding.i.b(e0Var, "onboarding_carousel");
                } else if (dVar instanceof vs0.qux) {
                    com.truecaller.call_assistant.presentation.onboarding.i.b(e0Var, "onboarding_carrier_selection");
                } else if (dVar instanceof vs0.bar) {
                    com.truecaller.call_assistant.presentation.onboarding.i.b(e0Var, "onboarding_activate");
                } else if (dVar instanceof vs0.c) {
                    com.truecaller.call_assistant.presentation.onboarding.i.b(e0Var, "onboarding_verification");
                } else if (dVar instanceof vs0.b) {
                    com.truecaller.call_assistant.presentation.onboarding.i.b(e0Var, "onboarding_result/" + ((vs0.b) dVar).a);
                } else if (dVar instanceof vs0.a) {
                    this.c.invoke();
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            default:
                d53.e eVar = (d53.e) obj;
                boolean z2 = eVar instanceof d53.d;
                rb.e0 e0Var2 = this.b;
                if (z2) {
                    rb.e0.q(e0Var2, "tutorial", (rb.h0) null, 6);
                } else if (eVar instanceof d53.b) {
                    rb.e0.q(e0Var2, "sim", (rb.h0) null, 6);
                } else if (eVar instanceof d53.qux) {
                    rb.e0.q(e0Var2, "activation", (rb.h0) null, 6);
                } else if (eVar instanceof d53.c) {
                    rb.e0.q(e0Var2, "success", (rb.h0) null, 6);
                } else {
                    this.c.invoke();
                }
                return kotlin.Unit.a;
        }
    }
}
