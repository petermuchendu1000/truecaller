package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class w1 implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit b;

    public /* synthetic */ w1(com.truecaller.ui.TruecallerInit truecallerInit, int i) {
        this.a = i;
        this.b = truecallerInit;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        com.truecaller.ui.TruecallerInit truecallerInit = this.b;
        java.lang.Object obj3 = v2.k.a;
        boolean z4 = false;
        int i2 = 1;
        v2.n nVar = (v2.n) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = com.truecaller.ui.TruecallerInit.y1;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(1100193144, new com.truecaller.ui.w1(truecallerInit, i2), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            case 1:
                int i4 = com.truecaller.ui.TruecallerInit.y1;
                if ((intValue & 3) != 2) {
                    z4 = true;
                }
                if (nVar.P(intValue & 1, z4)) {
                    boolean h = nVar.h(truecallerInit);
                    java.lang.Object M = nVar.M();
                    if (h || M == obj3) {
                        M = new com.truecaller.ui.c2(truecallerInit, 1);
                        nVar.k0(M);
                    }
                    je0.d.f((pv0.f) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function1) M, nVar, 0, 3);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                int i5 = com.truecaller.ui.TruecallerInit.y1;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar.P(intValue & 1, z2)) {
                    com.truecaller.ui.TruecallerInit truecallerInit2 = this.b;
                    v2.t0 r = mf0.o.r(truecallerInit2.m1, nVar, 0, 7);
                    if (truecallerInit2.H0().s() == com.truecaller.bottombar.BottomBarButtonType.CALLS) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    java.lang.Boolean bool = (java.lang.Boolean) r.getValue();
                    bool.booleanValue();
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z3);
                    boolean f = nVar.f(r) | nVar.g(z3) | nVar.h(truecallerInit2);
                    java.lang.Object M2 = nVar.M();
                    if (f || M2 == obj3) {
                        M2 = new a00.b(z3, truecallerInit2, r, (df3.bar) null, 3);
                        nVar.k0(M2);
                    }
                    v2.f.g(bool, valueOf, (kotlin.jvm.functions.Function2) M2, nVar);
                    if (((java.lang.Boolean) r.getValue()).booleanValue() && z3) {
                        nVar.Z(-1360753587);
                        v2.t0 r2 = mf0.o.r(truecallerInit2.n1, nVar, 0, 7);
                        java.lang.Object M3 = nVar.M();
                        if (M3 == obj3) {
                            M3 = androidx.compose.runtime.a.j(java.lang.Boolean.valueOf(com.truecaller.ui.TruecallerInit.h1(r2)));
                            nVar.k0(M3);
                        }
                        v2.t0 t0Var = (v2.t0) M3;
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.truecaller.ui.TruecallerInit.h1(r2));
                        boolean f2 = nVar.f(r2) | nVar.h(truecallerInit2);
                        java.lang.Object M4 = nVar.M();
                        if (f2 || M4 == obj3) {
                            a61.bar barVar = new a61.bar(t0Var, truecallerInit2, r2, (df3.bar) null, 15);
                            nVar.k0(barVar);
                            M4 = barVar;
                        }
                        v2.f.h(valueOf2, (kotlin.jvm.functions.Function2) M4, nVar);
                        yp.d0.o(false, d3.a.d(1151742947, new ce1.a(11, truecallerInit2, r2), nVar), nVar, 48, 1);
                        nVar.p(false);
                    } else {
                        nVar.Z(-1358853721);
                        nVar.p(false);
                        truecallerInit2.q1(16);
                    }
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
        }
    }
}
