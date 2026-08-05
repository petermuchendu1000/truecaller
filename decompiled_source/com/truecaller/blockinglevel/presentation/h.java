package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ h(com.truecaller.blockinglevel.presentation.m0 m0Var, boolean z, boolean z2, float f, kotlin.jvm.functions.Function0 function0, int i) {
        this.e = m0Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.f = function0;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        ts0.c cVar;
        switch (this.a) {
            case 0:
                ((java.lang.Integer) obj2).getClass();
                com.truecaller.blockinglevel.presentation.g0.q((com.truecaller.blockinglevel.presentation.m0) this.e, this.b, this.c, this.d, (kotlin.jvm.functions.Function0) this.f, (v2.n) obj, v2.f.D(1));
                return kotlin.Unit.a;
            default:
                com.truecaller.call_assistant.presentation.onboarding.h hVar = (com.truecaller.call_assistant.presentation.onboarding.h) this.e;
                v2.t0 t0Var = (v2.t0) this.f;
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    if (!this.b) {
                        nVar.Z(27247653);
                        if (this.c) {
                            cVar = ts0.a.a;
                        } else if (!((java.lang.Boolean) t0Var.getValue()).booleanValue()) {
                            cVar = ts0.b.a;
                        } else {
                            cVar = ts0.qux.a;
                        }
                        boolean h = nVar.h(hVar);
                        java.lang.Object M = nVar.M();
                        if (h || M == v2.k.a) {
                            M = new com.truecaller.blockinglevel.presentation.qux(0, hVar, com.truecaller.call_assistant.presentation.onboarding.h.class, "onPreviousStep", "onPreviousStep()V", 0, 7);
                            nVar.k0(M);
                        }
                        lf.bar.c((kotlin.reflect.KFunction) M, this.d, cVar, nVar, 0);
                    } else {
                        nVar.Z(20714806);
                    }
                    nVar.p(false);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ h(boolean z, boolean z2, com.truecaller.call_assistant.presentation.onboarding.h hVar, float f, v2.t0 t0Var) {
        this.b = z;
        this.c = z2;
        this.e = hVar;
        this.d = f;
        this.f = t0Var;
    }
}
