package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class u implements nf3.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ u(com.truecaller.blockinglevel.presentation.i0 i0Var, boolean z) {
        this.a = 0;
        this.c = i0Var;
        this.b = z;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        boolean z2;
        int i;
        java.lang.String str;
        boolean z3;
        boolean z4;
        j3.q d;
        int i2;
        int i3 = this.a;
        boolean z5 = false;
        java.lang.Object obj4 = this.c;
        boolean z6 = this.b;
        switch (i3) {
            case 0:
                com.truecaller.blockinglevel.presentation.i0 i0Var = (com.truecaller.blockinglevel.presentation.i0) obj4;
                v2.n nVar = (v2.n) obj2;
                int intValue = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    float f = 16;
                    j3.q G = m1.c.G(u51.e.d(3, (java.lang.String) null), f);
                    m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar, 0);
                    long j = nVar.T;
                    int i4 = (int) (j ^ (j >>> 32));
                    v2.e1 l = nVar.l();
                    j3.q c = j3.bar.c(G, nVar);
                    j4.e.K9.getClass();
                    j4.c cVar = j4.d.b;
                    nVar.d0();
                    if (nVar.S) {
                        nVar.k(cVar);
                    } else {
                        nVar.n0();
                    }
                    v2.f.A(a, j4.d.g, nVar);
                    v2.f.A(l, j4.d.f, nVar);
                    v2.f.t(nVar, java.lang.Integer.valueOf(i4), j4.d.j);
                    v2.f.x(j4.d.k, nVar);
                    v2.f.A(c, j4.d.d, nVar);
                    j51.b.q.E("block_level_level_title", (j3.q) null, i0Var.e, ((i51.a) nVar.j(i51.bar.a)).s, ((y41.i) nVar.j(y41.j.a)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 0, 0, 4066);
                    m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f), nVar);
                    com.truecaller.blockinglevel.api.BlockLevel blockLevel = i0Var.g;
                    vj0.bar.c(qk.b1.u(2132019707, nVar), "block_level_level_property_identify", true, 300, null, nVar, 384);
                    java.lang.String u = qk.b1.u(2132019704, nVar);
                    if (blockLevel != com.truecaller.blockinglevel.api.BlockLevel.BASIC && blockLevel != com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    vj0.bar.c(u, "block_level_level_property_block_auto", z2, 300, null, nVar, 0);
                    if (z6) {
                        i = 2132019705;
                    } else {
                        i = 2132019703;
                    }
                    java.lang.String u2 = qk.b1.u(i, nVar);
                    if (z6) {
                        str = "fraud";
                    } else {
                        str = "all";
                    }
                    java.lang.String concat = "block_level_level_property_block_".concat(str);
                    if (blockLevel == com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    vj0.bar.c(u2, concat, z3, 300, null, nVar, 0);
                    nVar.p(true);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            case 1:
                vb2.j jVar = (vb2.j) obj4;
                nf3.i iVar = (nf3.i) obj;
                v2.n nVar2 = (v2.n) obj2;
                int intValue2 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "launchBottomSheet");
                if ((intValue2 & 6) == 0) {
                    if (nVar2.h(iVar)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (nVar2.P(intValue2 & 1, z4)) {
                    j3.q d2 = u51.e.d(3, (java.lang.String) null);
                    if (z6) {
                        d = m1.c.A(u51.e.d(3, (java.lang.String) null));
                    } else {
                        d = u51.e.d(3, (java.lang.String) null);
                    }
                    j3.q o = d2.o(d);
                    i82.r U4 = jVar.U4();
                    p.c3 c3Var = jVar.R4().g;
                    gf2.d dVar = jVar.i;
                    if (dVar != null) {
                        ak.r0.d(o, U4, c3Var, dVar, (wb2.c0) null, nVar2, 0);
                        boolean h = nVar2.h(jVar);
                        if ((intValue2 & 14) == 4) {
                            z5 = true;
                        }
                        boolean z7 = h | z5;
                        java.lang.Object M = nVar2.M();
                        if (z7 || M == v2.k.a) {
                            M = new v1.j1(9, jVar, iVar);
                            nVar2.k0(M);
                        }
                        jVar.n = (kotlin.jvm.functions.Function1) M;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("activityProvider");
                        throw null;
                    }
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
            default:
                mn2.c cVar2 = (mn2.c) obj4;
                v2.n nVar3 = (v2.n) obj2;
                int intValue3 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.z1) obj, "$this$Primary");
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                }
                if (nVar3.P(intValue3 & 1, z5)) {
                    m1.y1 a2 = m1.x1.a(m1.h.g(8), j3.qux.k, nVar3, 54);
                    long j2 = nVar3.T;
                    int i5 = (int) ((j2 >>> 32) ^ j2);
                    v2.e1 l2 = nVar3.l();
                    j3.q c2 = j3.bar.c(j3.n.a, nVar3);
                    j4.e.K9.getClass();
                    j4.c cVar3 = j4.d.b;
                    nVar3.d0();
                    if (nVar3.S) {
                        nVar3.k(cVar3);
                    } else {
                        nVar3.n0();
                    }
                    v2.f.A(a2, j4.d.g, nVar3);
                    v2.f.A(l2, j4.d.f, nVar3);
                    v2.f.t(nVar3, java.lang.Integer.valueOf(i5), j4.d.j);
                    v2.f.x(j4.d.k, nVar3);
                    v2.f.A(c2, j4.d.d, nVar3);
                    b1.k.b(java.lang.Boolean.valueOf(z6), (j3.q) null, (kotlin.jvm.functions.Function1) null, (j3.b) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, d3.a.d(-147474090, new a63.f(cVar2, 13), nVar3), nVar3, 1572864, 62);
                    nVar3.p(true);
                } else {
                    nVar3.S();
                }
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ u(boolean z, java.lang.Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
