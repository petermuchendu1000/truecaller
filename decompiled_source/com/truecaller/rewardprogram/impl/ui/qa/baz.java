package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class baz implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity b;

    public /* synthetic */ baz(com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity, int i) {
        this.a = i;
        this.b = rewardProgramQaActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        java.lang.String str;
        int i = this.a;
        v2.c cVar = v2.k.a;
        df3.bar barVar = null;
        final com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity = this.b;
        boolean z2 = false;
        boolean z3 = false;
        final int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                int i4 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    java.lang.Object M = nVar.M();
                    java.lang.Object obj3 = M;
                    if (M == cVar) {
                        obj3 = qb.qux.u(nVar);
                    }
                    r2.m6 m6Var = (r2.m6) obj3;
                    com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity2 = this.b;
                    v2.t0 r = mf0.o.r(rewardProgramQaActivity2.s0().k, nVar, 0, 7);
                    e1.f2 z4 = e1.k.z(0, 1, nVar);
                    java.lang.Object M2 = nVar.M();
                    df3.bar barVar2 = null;
                    java.lang.Object obj4 = M2;
                    if (M2 == cVar) {
                        v2.t0 j = androidx.compose.runtime.a.j((java.lang.Object) null);
                        nVar.k0(j);
                        obj4 = j;
                    }
                    v2.t0 t0Var = (v2.t0) obj4;
                    java.lang.Object M3 = nVar.M();
                    java.lang.Object obj5 = M3;
                    if (M3 == cVar) {
                        v2.t0 j2 = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                        nVar.k0(j2);
                        obj5 = j2;
                    }
                    v2.t0 t0Var2 = (v2.t0) obj5;
                    java.lang.Object M4 = nVar.M();
                    java.lang.Object obj6 = M4;
                    if (M4 == cVar) {
                        v2.t0 j3 = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                        nVar.k0(j3);
                        obj6 = j3;
                    }
                    v2.t0 t0Var3 = (v2.t0) obj6;
                    java.lang.String str2 = (java.lang.String) r.getValue();
                    boolean f = nVar.f(r) | nVar.h(rewardProgramQaActivity2);
                    java.lang.Object M5 = nVar.M();
                    if (f || M5 == cVar) {
                        str = str2;
                        com.truecaller.profile.impl.remote.e eVar = new com.truecaller.profile.impl.remote.e(r, m6Var, rewardProgramQaActivity2, barVar2, 1);
                        m6Var = m6Var;
                        nVar.k0(eVar);
                        M5 = eVar;
                    } else {
                        str = str2;
                    }
                    v2.f.h(str, (kotlin.jvm.functions.Function2) M5, nVar);
                    yp.d0.o(false, d3.a.d(-1736822363, new c12.c(m6Var, z4, rewardProgramQaActivity2, t0Var, t0Var2, t0Var3, 2), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            case 1:
                v2.n nVar2 = (v2.n) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                int i5 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (nVar2.P(intValue2 & 1, z2)) {
                    float f2 = 8;
                    m1.v a = m1.t.a(m1.h.g(f2), j3.qux.m, nVar2, 6);
                    long j4 = nVar2.T;
                    int i6 = (int) (j4 ^ (j4 >>> 32));
                    v2.e1 l = nVar2.l();
                    j3.q c = j3.bar.c(j3.n.a, nVar2);
                    j4.e.K9.getClass();
                    j4.c cVar2 = j4.d.b;
                    nVar2.d0();
                    if (nVar2.S) {
                        nVar2.k(cVar2);
                    } else {
                        nVar2.n0();
                    }
                    v2.f.A(a, j4.d.g, nVar2);
                    v2.f.A(l, j4.d.f, nVar2);
                    v2.f.t(nVar2, java.lang.Integer.valueOf(i6), j4.d.j);
                    v2.f.x(j4.d.k, nVar2);
                    v2.f.A(c, j4.d.d, nVar2);
                    j51.b bVar = j51.b.e;
                    final int i7 = 3;
                    j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M6 = nVar2.M();
                    java.lang.Object obj7 = M6;
                    if (h || M6 == cVar) {
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i8 = i2;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i8) {
                                    case 0:
                                        int i9 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i10 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i11 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function0);
                        obj7 = function0;
                    }
                    final int i8 = 6;
                    bVar.v("textOptInTimestamp", e, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset opt-in timestamp", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj7, nVar2, 1572870, 0, 956);
                    j3.q e2 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h2 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M7 = nVar2.M();
                    java.lang.Object obj8 = M7;
                    if (h2 || M7 == cVar) {
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i7;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i9 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i10 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i11 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function02);
                        obj8 = function02;
                    }
                    bVar.v("textUserHomeIntroDialog", e2, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset users home intro dialog", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj8, nVar2, 1572870, 0, 956);
                    j3.q e3 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h3 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M8 = nVar2.M();
                    java.lang.Object obj9 = M8;
                    if (h3 || M8 == cVar) {
                        final int i9 = 4;
                        kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i9;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i92 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i10 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i11 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function03);
                        obj9 = function03;
                    }
                    bVar.v("textUserHomeBadge", e3, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset users home badge", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj9, nVar2, 1572870, 0, 956);
                    j3.q e4 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h4 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M9 = nVar2.M();
                    java.lang.Object obj10 = M9;
                    if (h4 || M9 == cVar) {
                        final int i10 = 5;
                        kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i10;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i92 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i102 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i11 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function04);
                        obj10 = function04;
                    }
                    bVar.v("textToolbarAvatarBadge", e4, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset toolbar avatar badge", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj10, nVar2, 1572870, 0, 956);
                    j3.q e5 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h5 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M10 = nVar2.M();
                    java.lang.Object obj11 = M10;
                    if (h5 || M10 == cVar) {
                        kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i8;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i92 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i102 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i11 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function05);
                        obj11 = function05;
                    }
                    bVar.v("textJoinProgramNotification", e5, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset join program notification", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj11, nVar2, 1572870, 0, 956);
                    r2.h5.g(m1.c.I(u51.e.d(3, (java.lang.String) null), 0.0f, f2, 1), 0.0f, ((y41.i) nVar2.j(y41.j.a)).g().b, nVar2, 0, 2);
                    j3.q e6 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h6 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M11 = nVar2.M();
                    java.lang.Object obj12 = M11;
                    if (h6 || M11 == cVar) {
                        final int i11 = 7;
                        kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i11;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i92 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i102 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i112 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i12 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function06);
                        obj12 = function06;
                    }
                    bVar.v("textLevel", e6, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Reset level", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj12, nVar2, 1572870, 0, 956);
                    j3.q e7 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    boolean h7 = nVar2.h(rewardProgramQaActivity);
                    java.lang.Object M12 = nVar2.M();
                    java.lang.Object obj13 = M12;
                    if (h7 || M12 == cVar) {
                        final int i12 = 8;
                        kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.rewardprogram.impl.ui.qa.qux
                            public final java.lang.Object invoke() {
                                int i82 = i12;
                                com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity3 = rewardProgramQaActivity;
                                switch (i82) {
                                    case 0:
                                        int i92 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity3.s0();
                                        s0.getClass();
                                        s0.o("Contributions reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s0, null, 2));
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i102 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity3.s0();
                                        s02.getClass();
                                        s02.o("Daily tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, null, 5));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i112 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s04 = rewardProgramQaActivity3.s0();
                                        s04.getClass();
                                        s04.o("Opt-in timestamp reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s04, null, 6));
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i122 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s05 = rewardProgramQaActivity3.s0();
                                        s05.getClass();
                                        s05.o("Users home intro dialog reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s05, null, 9));
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s06 = rewardProgramQaActivity3.s0();
                                        s06.getClass();
                                        s06.o("Users home badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s06, null, 8));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i15 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s07 = rewardProgramQaActivity3.s0();
                                        s07.getClass();
                                        s07.o("Toolbar avatar badge reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s07, null, 7));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i16 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s08 = rewardProgramQaActivity3.s0();
                                        s08.getClass();
                                        s08.o("Join program notification reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s08, null, 3));
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i17 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s09 = rewardProgramQaActivity3.s0();
                                        s09.getClass();
                                        s09.o("Level reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s09, null, 4));
                                        return kotlin.Unit.a;
                                    default:
                                        int i18 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                        com.truecaller.rewardprogram.impl.ui.qa.j s010 = rewardProgramQaActivity3.s0();
                                        s010.getClass();
                                        s010.o("Claimable reward deleted", new com.truecaller.rewardprogram.impl.ui.qa.i(s010, null, 0));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar2.k0(function07);
                        obj13 = function07;
                    }
                    bVar.v("textClaimableReward", e7, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Delete claimable reward", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj13, nVar2, 1572870, 0, 956);
                    nVar2.p(true);
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
            default:
                com.truecaller.rewardprogram.impl.ui.qa.components.BonusTasksAlertDialogRequestKey bonusTasksAlertDialogRequestKey = (com.truecaller.rewardprogram.impl.ui.qa.components.BonusTasksAlertDialogRequestKey) obj;
                hl2.qux quxVar = (hl2.qux) obj2;
                int i14 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bonusTasksAlertDialogRequestKey, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "choice");
                int i15 = com.truecaller.rewardprogram.impl.ui.qa.c.a[bonusTasksAlertDialogRequestKey.ordinal()];
                hl2.bar barVar3 = hl2.bar.a;
                if (i15 != 1) {
                    if (i15 == 2) {
                        com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity.s0();
                        s0.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "choice");
                        if (kotlin.jvm.internal.Intrinsics.b(quxVar, barVar3)) {
                            s0.o("All bonus tasks claimed", new com.truecaller.rewardprogram.impl.ui.qa.f(s0, null));
                        } else if (quxVar instanceof hl2.baz) {
                            s0.o(h0.b.Q(((hl2.baz) quxVar).a.name(), " claimed"), new com.truecaller.rewardprogram.impl.ui.qa.g(s0, quxVar, barVar, z3 ? 1 : 0));
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity.s0();
                    s02.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "choice");
                    if (kotlin.jvm.internal.Intrinsics.b(quxVar, barVar3)) {
                        s02.o("All bonus tasks reset", new com.truecaller.rewardprogram.impl.ui.qa.i(s02, barVar, i3));
                    } else if (quxVar instanceof hl2.baz) {
                        s02.o(h0.b.Q(((hl2.baz) quxVar).a.name(), " reset"), new com.truecaller.rewardprogram.impl.ui.qa.g(s02, quxVar, barVar, i3));
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
