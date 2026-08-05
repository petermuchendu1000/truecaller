package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class g0 {
    public static final d3.qux a = new d3.qux(1760446980, new ce1.bar(12), false);
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    static {
        new d3.qux(-1028920664, new ce1.bar(14), false);
        new d3.qux(-1668611106, new ce1.bar(15), false);
        new d3.qux(-305198147, new ce1.bar(16), false);
        new d3.qux(-1420018336, new ce1.bar(17), false);
        new d3.qux(163640811, new ce1.bar(18), false);
        new d3.qux(-1145347602, new ce1.bar(13), false);
    }

    public static final void a(final com.truecaller.blockinglevel.api.BlockLevel blockLevel, final boolean z, final boolean z2, final boolean z3, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, final d3.qux quxVar, v2.n nVar, final int i) {
        int i2;
        boolean z4;
        v2.n nVar2;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "selectedLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onLevelSelected");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onSkipClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "buttonContent");
        nVar.b0(-1159090770);
        if ((i & 6) == 0) {
            if (nVar.d(blockLevel.ordinal())) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (nVar.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (nVar.g(z2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (nVar.g(z3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (nVar.h(function1)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (nVar.h(function0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (nVar.h(quxVar)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (nVar.P(i2 & 1, z4)) {
            java.lang.String u = qk.b1.u(2132019707, nVar);
            java.lang.String u2 = qk.b1.u(2132019704, nVar);
            java.lang.String u3 = qk.b1.u(2132019706, nVar);
            com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = com.truecaller.blockinglevel.api.BlockLevel.MAX;
            java.lang.String u4 = qk.b1.u(2132019698, nVar);
            java.lang.String u5 = qk.b1.u(2132019703, nVar);
            zf3.b q = oj3.e.q(new java.lang.String[]{u, u2, u3});
            v2.q2 q2Var = y41.j.a;
            final zf3.b q2 = oj3.e.q(new com.truecaller.blockinglevel.presentation.m0[]{new com.truecaller.blockinglevel.presentation.m0(blockLevel2, 2131231508, u4, u5, q, ((y41.i) nVar.j(q2Var)).g().n), new com.truecaller.blockinglevel.presentation.m0(com.truecaller.blockinglevel.api.BlockLevel.BASIC, 2131231507, qk.b1.u(2132019691, nVar), qk.b1.u(2132019692, nVar), oj3.e.q(new java.lang.String[]{u, u2}), ((y41.i) nVar.j(q2Var)).g().m), new com.truecaller.blockinglevel.presentation.m0(com.truecaller.blockinglevel.api.BlockLevel.OFF, 2131231509, qk.b1.u(2132019701, nVar), qk.b1.u(2132019695, nVar), oj3.e.q(new java.lang.String[]{u}), ((y41.i) nVar.j(q2Var)).g().l)});
            java.util.WeakHashMap weakHashMap = m1.p2.w;
            m1.x0 l = m1.c.l(m1.b.f(nVar).g, nVar);
            final float d = l.d();
            final float a2 = l.a();
            j3.q i11 = e1.k.i(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), ((y41.i) nVar.j(q2Var)).g().a, q3.a0.b);
            v2.q2 q2Var2 = k4.g1.n;
            nVar2 = nVar;
            m1.c.a(m1.c.K(i11, m1.c.o(l, (h5.j) nVar.j(q2Var2)), 0.0f, m1.c.n(l, (h5.j) nVar.j(q2Var2)), 0.0f, 10), (j3.b) null, false, d3.a.d(-1371460220, new nf3.i() { // from class: com.truecaller.blockinglevel.presentation.e
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    boolean z10;
                    char c2;
                    int i12;
                    m1.s sVar = (m1.s) obj;
                    v2.n nVar3 = (v2.n) obj2;
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "$this$BoxWithConstraints");
                    if ((intValue & 6) == 0) {
                        if (nVar3.f(sVar)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & 19) != 18) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (nVar3.P(intValue & 1, z6)) {
                        if (h5.c.a(sVar.c(), 680) < 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        float f = z7 ? 16 : 32;
                        float f2 = z7 ? 6 : 12;
                        float f3 = z7 ? 12 : 24;
                        float f4 = z7 ? 8 : 16;
                        float f5 = z7 ? 10 : 16;
                        float f6 = f2;
                        j3.q d2 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
                        m1.b bVar = m1.h.c;
                        float f7 = f4;
                        j3.e eVar = j3.qux.m;
                        m1.v a3 = m1.t.a(bVar, eVar, nVar3, 0);
                        float f8 = f;
                        long j = nVar3.T;
                        int i13 = (int) (j ^ (j >>> 32));
                        v2.e1 l2 = nVar3.l();
                        j3.q c3 = j3.bar.c(d2, nVar3);
                        j4.e.K9.getClass();
                        j4.c cVar = j4.d.b;
                        nVar3.d0();
                        if (nVar3.S) {
                            nVar3.k(cVar);
                        } else {
                            nVar3.n0();
                        }
                        j4.b bVar2 = j4.d.g;
                        v2.f.A(a3, bVar2, nVar3);
                        j4.b bVar3 = j4.d.f;
                        v2.f.A(l2, bVar3, nVar3);
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i13);
                        j4.b bVar4 = j4.d.j;
                        v2.f.t(nVar3, valueOf, bVar4);
                        j4.a aVar = j4.d.k;
                        v2.f.x(aVar, nVar3);
                        j4.b bVar5 = j4.d.d;
                        v2.f.A(c3, bVar5, nVar3);
                        j3.q d3 = u51.e.d(3, (java.lang.String) null);
                        if (1.0f <= 0.0d) {
                            n1.bar.a("invalid weight; must be greater than zero");
                        }
                        j3.q D = e1.k.D(os0.bar.s(1.0f, d3, true), e1.k.z(0, 1, nVar3), false, 14);
                        m1.v a4 = m1.t.a(bVar, eVar, nVar3, 0);
                        float f9 = f3;
                        long j2 = nVar3.T;
                        int i14 = (int) (j2 ^ (j2 >>> 32));
                        v2.e1 l3 = nVar3.l();
                        j3.q c4 = j3.bar.c(D, nVar3);
                        nVar3.d0();
                        if (nVar3.S) {
                            nVar3.k(cVar);
                        } else {
                            nVar3.n0();
                        }
                        v2.f.A(a4, bVar2, nVar3);
                        v2.f.A(l3, bVar3, nVar3);
                        h0.b.Y(i14, nVar3, bVar4, nVar3, aVar);
                        v2.f.A(c4, bVar5, nVar3);
                        j3.q K = m1.c.K(m1.c.I(u51.e.d(3, (java.lang.String) null), 24, 0.0f, 2), 0.0f, d + f8, 0.0f, 0.0f, 13);
                        m1.v a5 = m1.t.a(bVar, eVar, nVar3, 0);
                        long j3 = nVar3.T;
                        int i15 = (int) (j3 ^ (j3 >>> 32));
                        v2.e1 l4 = nVar3.l();
                        j3.q c5 = j3.bar.c(K, nVar3);
                        nVar3.d0();
                        if (nVar3.S) {
                            nVar3.k(cVar);
                        } else {
                            nVar3.n0();
                        }
                        v2.f.A(a5, bVar2, nVar3);
                        v2.f.A(l4, bVar3, nVar3);
                        h0.b.Y(i15, nVar3, bVar4, nVar3, aVar);
                        v2.f.A(c5, bVar5, nVar3);
                        j51.b bVar6 = j51.b.q;
                        java.lang.String u6 = qk.b1.u(2132019712, nVar3);
                        v2.q2 q2Var3 = i51.bar.a;
                        u4.v0 v0Var = ((i51.a) nVar3.j(q2Var3)).s;
                        v2.q2 q2Var4 = y41.j.a;
                        float f12 = f5;
                        bVar6.E("set_protection_level_title", (j3.q) null, u6, v0Var, ((y41.i) nVar3.j(q2Var4)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, com.moloco.sdk.internal.publisher.b0.L(8589934592L, 1.1f), nVar3, 0, 0, 2018);
                        ia0.bar.r(null, 3, f6, nVar3);
                        bVar6.E("set_protection_level_subtitle", (j3.q) null, qk.b1.u(2132019711, nVar3), ((i51.a) nVar3.j(q2Var3)).i, ((y41.i) nVar3.j(q2Var4)).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar3, 0, 0, 4066);
                        m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f9), nVar3);
                        nVar3.p(true);
                        float f13 = 16;
                        j3.q I = m1.c.I(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f13, 0.0f, 2);
                        m1.v a6 = m1.t.a(bVar, eVar, nVar3, 0);
                        long j4 = nVar3.T;
                        int i16 = (int) (j4 ^ (j4 >>> 32));
                        v2.e1 l5 = nVar3.l();
                        j3.q c6 = j3.bar.c(I, nVar3);
                        nVar3.d0();
                        if (nVar3.S) {
                            nVar3.k(cVar);
                        } else {
                            nVar3.n0();
                        }
                        v2.f.A(a6, bVar2, nVar3);
                        v2.f.A(l5, bVar3, nVar3);
                        h0.b.Y(i16, nVar3, bVar4, nVar3, aVar);
                        v2.f.A(c6, bVar5, nVar3);
                        nVar3.Z(1738089661);
                        for (com.truecaller.blockinglevel.presentation.m0 m0Var : q2) {
                            com.truecaller.blockinglevel.api.BlockLevel blockLevel3 = m0Var.a;
                            if (blockLevel == blockLevel3) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (blockLevel3 == com.truecaller.blockinglevel.api.BlockLevel.MAX && !z) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            kotlin.jvm.functions.Function1 function12 = function1;
                            boolean f14 = nVar3.f(function12) | nVar3.f(m0Var);
                            java.lang.Object M = nVar3.M();
                            if (!f14 && M != v2.k.a) {
                                c2 = 14;
                            } else {
                                c2 = 14;
                                M = new by2.a(14, function12, m0Var);
                                nVar3.k0(M);
                            }
                            com.truecaller.blockinglevel.presentation.g0.q(m0Var, z9, z10, f12, (kotlin.jvm.functions.Function0) M, nVar3, 0);
                            ia0.bar.r(null, 3, f7, nVar3);
                        }
                        qb.qux.x(nVar3, false, true, true);
                        float f15 = 8;
                        j3.q K2 = m1.c.K(m1.c.I(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f13, 0.0f, 2), 0.0f, f15, 0.0f, a2 + f15, 5);
                        m1.v a7 = m1.t.a(m1.h.c, j3.qux.n, nVar3, 48);
                        long j5 = nVar3.T;
                        int i17 = (int) (j5 ^ (j5 >>> 32));
                        v2.e1 l6 = nVar3.l();
                        j3.q c7 = j3.bar.c(K2, nVar3);
                        j4.e.K9.getClass();
                        j4.c cVar2 = j4.d.b;
                        nVar3.d0();
                        if (nVar3.S) {
                            nVar3.k(cVar2);
                        } else {
                            nVar3.n0();
                        }
                        v2.f.A(a7, j4.d.g, nVar3);
                        v2.f.A(l6, j4.d.f, nVar3);
                        v2.f.t(nVar3, java.lang.Integer.valueOf(i17), j4.d.j);
                        v2.f.x(j4.d.k, nVar3);
                        v2.f.A(c7, j4.d.d, nVar3);
                        quxVar.invoke(nVar3, 0);
                        if (z3) {
                            nVar3.Z(413470553);
                            m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f15), nVar3);
                            z8 = false;
                            j51.b.e.A("set_protection_level_button_skip", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), com.truecaller.compose.ui.components.TrueButton.ButtonStyleSecondary.SECONDARY, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, qk.b1.u(2132019700, nVar3), false, (v3.baz) null, (u4.v0) null, function0, nVar3, 384, 0, 1976);
                        } else {
                            z8 = false;
                            nVar3.Z(404706171);
                        }
                        nVar3.p(z8);
                        nVar3.p(true);
                        nVar3.p(true);
                    } else {
                        nVar3.S();
                    }
                    return kotlin.Unit.a;
                }
            }, nVar), nVar2, 3072, 6);
            if (z2) {
                nVar2.Z(1069736018);
                z5 = false;
                p(0, nVar2);
            } else {
                z5 = false;
                nVar2.Z(1060454804);
            }
            nVar2.p(z5);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new kotlin.jvm.functions.Function2() { // from class: com.truecaller.blockinglevel.presentation.f
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    com.truecaller.blockinglevel.presentation.g0.a(com.truecaller.blockinglevel.api.BlockLevel.this, z, z2, z3, function1, function0, quxVar, (v2.n) obj, v2.f.D(i | 1));
                    return kotlin.Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(com.truecaller.blockinglevel.api.BlockLevel blockLevel, final boolean z, boolean z2, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, final d3.qux quxVar, com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant, v2.n nVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int ordinal;
        boolean z3;
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant2;
        v2.h1 r;
        final com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant3;
        v2.n nVar2 = nVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onLevelSelected");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onSkipClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "buttonContent");
        nVar2.b0(-1923619596);
        if (nVar2.d(blockLevel.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i | i3;
        if (nVar2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i9 | i4;
        if (nVar2.g(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (nVar2.h(function1)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (nVar2.h(function0)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (nVar2.h(quxVar)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        int i16 = i2 & 64;
        int i17 = 1572864;
        if (i16 == 0) {
            if ((i & 1572864) == 0) {
                if (blockLevelVariant == null) {
                    ordinal = -1;
                } else {
                    ordinal = blockLevelVariant.ordinal();
                }
                if (nVar2.d(ordinal)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
            }
            if ((599187 & i15) == 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!nVar2.P(i15 & 1, z3)) {
                if (i16 != 0) {
                    blockLevelVariant3 = com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT;
                } else {
                    blockLevelVariant3 = blockLevelVariant;
                }
                final float f = 72;
                final zf3.b q = oj3.e.q(new com.truecaller.blockinglevel.presentation.i0[]{s(com.truecaller.blockinglevel.api.BlockLevel.OFF, null, nVar2, 1), s(com.truecaller.blockinglevel.api.BlockLevel.BASIC, null, nVar2, 1), s(com.truecaller.blockinglevel.api.BlockLevel.MAX, null, nVar2, 1)});
                final com.truecaller.blockinglevel.presentation.i0 s = s(blockLevel, blockLevelVariant3, nVar2, 0);
                v2.p2 b2 = b1.k2.b(s.a, c1.a.u(300, 0, (c1.t) null, 6), "gradientStart", nVar2, 432, 8);
                v2.p2 b3 = b1.k2.b(s.b, c1.a.u(300, 0, (c1.t) null, 6), "gradientEnd", nVar, 432, 8);
                java.lang.Object M = nVar.M();
                if (M == v2.k.a) {
                    M = androidx.compose.runtime.a.d(new com.truecaller.blockinglevel.presentation.l(b2, b3, 1));
                    nVar.k0(M);
                }
                java.util.WeakHashMap weakHashMap = m1.p2.w;
                m1.x0 l = m1.c.l(m1.b.f(nVar).g, nVar);
                final float a2 = l.a();
                final float d = l.d();
                j3.q d2 = m1.c2.d(e1.k.h(u51.e.d(3, (java.lang.String) null), (q3.n) ((v2.p2) M).getValue(), (q3.q0) null, 6), 1.0f);
                v2.q2 q2Var = k4.g1.n;
                j3.q K = m1.c.K(d2, m1.c.o(l, (h5.j) nVar.j(q2Var)), 0.0f, m1.c.n(l, (h5.j) nVar.j(q2Var)), 0.0f, 10);
                nf3.i iVar = new nf3.i() { // from class: com.truecaller.blockinglevel.presentation.s
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        boolean z4;
                        boolean z5;
                        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant4;
                        boolean z6;
                        boolean z7;
                        boolean z8;
                        v2.n nVar3;
                        int i18;
                        m1.s sVar = (m1.s) obj;
                        v2.n nVar4 = (v2.n) obj2;
                        int intValue = ((java.lang.Integer) obj3).intValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "$this$BoxWithConstraints");
                        if ((intValue & 6) == 0) {
                            if (nVar4.f(sVar)) {
                                i18 = 4;
                            } else {
                                i18 = 2;
                            }
                            intValue |= i18;
                        }
                        if ((intValue & 19) != 18) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (nVar4.P(intValue & 1, z4)) {
                            float c2 = sVar.c();
                            j3.q d3 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
                            m1.b bVar = m1.h.c;
                            j3.e eVar = j3.qux.m;
                            m1.v a3 = m1.t.a(bVar, eVar, nVar4, 0);
                            long j = nVar4.T;
                            int i19 = (int) (j ^ (j >>> 32));
                            v2.e1 l2 = nVar4.l();
                            j3.q c3 = j3.bar.c(d3, nVar4);
                            j4.e.K9.getClass();
                            j4.c cVar = j4.d.b;
                            nVar4.d0();
                            if (nVar4.S) {
                                nVar4.k(cVar);
                            } else {
                                nVar4.n0();
                            }
                            j4.b bVar2 = j4.d.g;
                            v2.f.A(a3, bVar2, nVar4);
                            j4.b bVar3 = j4.d.f;
                            v2.f.A(l2, bVar3, nVar4);
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
                            j4.b bVar4 = j4.d.j;
                            v2.f.t(nVar4, valueOf, bVar4);
                            j4.a aVar = j4.d.k;
                            v2.f.x(aVar, nVar4);
                            j4.b bVar5 = j4.d.d;
                            v2.f.A(c3, bVar5, nVar4);
                            java.lang.Object M2 = nVar4.M();
                            v2.c cVar2 = v2.k.a;
                            if (M2 == cVar2) {
                                M2 = androidx.compose.runtime.a.g(0);
                                nVar4.k0(M2);
                            }
                            v2.c2 c2Var = (v2.c2) M2;
                            j3.q d4 = u51.e.d(3, (java.lang.String) null);
                            if (1.0f <= 0.0d) {
                                n1.bar.a("invalid weight; must be greater than zero");
                            }
                            j3.q D = e1.k.D(os0.bar.s(1.0f, d4, true), e1.k.z(0, 1, nVar4), false, 14);
                            m1.v a4 = m1.t.a(bVar, eVar, nVar4, 0);
                            long j2 = nVar4.T;
                            int i21 = (int) (j2 ^ (j2 >>> 32));
                            v2.e1 l3 = nVar4.l();
                            j3.q c4 = j3.bar.c(D, nVar4);
                            nVar4.d0();
                            if (nVar4.S) {
                                nVar4.k(cVar);
                            } else {
                                nVar4.n0();
                            }
                            v2.f.A(a4, bVar2, nVar4);
                            v2.f.A(l3, bVar3, nVar4);
                            h0.b.Y(i21, nVar4, bVar4, nVar4, aVar);
                            v2.f.A(c4, bVar5, nVar4);
                            j3.q d5 = u51.e.d(3, (java.lang.String) null);
                            float f2 = d;
                            m1.c.h(m1.c2.o(d5, f2), nVar4);
                            java.lang.Object M3 = nVar4.M();
                            java.lang.Object obj4 = M3;
                            if (M3 == cVar2) {
                                v2.c2 g = androidx.compose.runtime.a.g(0);
                                nVar4.k0(g);
                                obj4 = g;
                            }
                            v2.c2 c2Var2 = (v2.c2) obj4;
                            float f3 = 320;
                            j3.q s2 = m1.c2.s(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, f3, 0.0f, uf3.p.a(new h5.c(((android.content.res.Configuration) nVar4.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.56f), new h5.c(f3)).a, 5);
                            java.lang.Object M4 = nVar4.M();
                            if (M4 == cVar2) {
                                M4 = new cc2.z(c2Var2, 3);
                                nVar4.k0(M4);
                            }
                            j3.q p = h4.d0.p(s2, (kotlin.jvm.functions.Function1) M4);
                            com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant5 = com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD;
                            com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant6 = blockLevelVariant3;
                            if (blockLevelVariant6 == blockLevelVariant5) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            kotlin.jvm.functions.Function1 function12 = function1;
                            boolean f4 = nVar4.f(function12);
                            java.lang.Object M5 = nVar4.M();
                            if (!f4 && M5 != cVar2) {
                                blockLevelVariant4 = blockLevelVariant5;
                            } else {
                                blockLevelVariant4 = blockLevelVariant5;
                                M5 = new bb1.baz(7, function12);
                                nVar4.k0(M5);
                            }
                            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) M5;
                            com.truecaller.blockinglevel.presentation.i0 i0Var = s;
                            com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant7 = blockLevelVariant4;
                            com.truecaller.blockinglevel.presentation.g0.j(i0Var, q, f, function13, p, z5, nVar4, 3456);
                            float g2 = c2Var2.g();
                            v2.q2 q2Var2 = k4.g1.h;
                            j3.q h = m1.c2.h(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), java.lang.Math.max(152, ((c2 - (g2 / ((h5.qux) nVar4.j(q2Var2)).d())) - (c2Var.g() / ((h5.qux) nVar4.j(q2Var2)).d())) - f2), 0.0f, 2);
                            if (blockLevelVariant6 == blockLevelVariant7) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            com.truecaller.blockinglevel.presentation.g0.h(i0Var, h, z6, nVar4, 48);
                            nVar4.p(true);
                            j3.q i22 = e1.k.i(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), ((y41.i) nVar4.j(y41.j.a)).g().a, q3.a0.b);
                            java.lang.Object M6 = nVar4.M();
                            if (M6 == cVar2) {
                                M6 = new cc2.z(c2Var, 4);
                                nVar4.k0(M6);
                            }
                            j3.q p2 = h4.d0.p(i22, (kotlin.jvm.functions.Function1) M6);
                            h4.a1 d6 = m1.n.d(j3.qux.a, false);
                            long j3 = nVar4.T;
                            int i23 = (int) (j3 ^ (j3 >>> 32));
                            v2.e1 l4 = nVar4.l();
                            j3.q c5 = j3.bar.c(p2, nVar4);
                            nVar4.d0();
                            if (nVar4.S) {
                                nVar4.k(cVar);
                            } else {
                                nVar4.n0();
                            }
                            v2.f.A(d6, bVar2, nVar4);
                            v2.f.A(l4, bVar3, nVar4);
                            h0.b.Y(i23, nVar4, bVar4, nVar4, aVar);
                            v2.f.A(c5, bVar5, nVar4);
                            float f5 = 8;
                            float f6 = 16;
                            j3.q J = m1.c.J(u51.e.d(3, (java.lang.String) null), f6, f5, f6, a2 + f5);
                            m1.v a5 = m1.t.a(bVar, eVar, nVar4, 0);
                            long j4 = nVar4.T;
                            int i24 = (int) (j4 ^ (j4 >>> 32));
                            v2.e1 l5 = nVar4.l();
                            j3.q c6 = j3.bar.c(J, nVar4);
                            nVar4.d0();
                            if (nVar4.S) {
                                nVar4.k(cVar);
                            } else {
                                nVar4.n0();
                            }
                            v2.f.A(a5, bVar2, nVar4);
                            v2.f.A(l5, bVar3, nVar4);
                            h0.b.Y(i24, nVar4, bVar4, nVar4, aVar);
                            v2.f.A(c6, bVar5, nVar4);
                            quxVar.invoke(nVar4, 0);
                            if (z) {
                                nVar4.Z(-98473745);
                                m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f5), nVar4);
                                j51.b bVar6 = j51.b.e;
                                j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                                java.lang.String u = qk.b1.u(2132019700, nVar4);
                                z7 = true;
                                nVar3 = nVar4;
                                z8 = false;
                                bVar6.A("block_level_button_skip", e, com.truecaller.compose.ui.components.TrueButton.ButtonStyleSecondary.SECONDARY, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, u, false, (v3.baz) null, (u4.v0) null, function0, nVar3, 384, 0, 1976);
                            } else {
                                z7 = true;
                                z8 = false;
                                nVar3 = nVar4;
                                nVar3.Z(-106879674);
                            }
                            nVar3.p(z8);
                            qb.qux.x(nVar3, z7, z7, z7);
                        } else {
                            nVar4.S();
                        }
                        return kotlin.Unit.a;
                    }
                };
                com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant4 = blockLevelVariant3;
                nVar2 = nVar;
                m1.c.a(K, (j3.b) null, false, d3.a.d(147769162, iVar, nVar), nVar2, 3072, 6);
                if (z2) {
                    nVar2.Z(1202160462);
                    vj0.bar.e(0, nVar2);
                } else {
                    nVar2.Z(1193199726);
                }
                nVar2.p(false);
                blockLevelVariant2 = blockLevelVariant4;
            } else {
                nVar2.S();
                blockLevelVariant2 = blockLevelVariant;
            }
            r = nVar2.r();
            if (r == null) {
                r.d = new at0.qux(blockLevel, z, z2, function1, function0, quxVar, blockLevelVariant2, i, i2);
                return;
            }
            return;
        }
        i15 |= i17;
        if ((599187 & i15) == 599186) {
        }
        if (!nVar2.P(i15 & 1, z3)) {
        }
        r = nVar2.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ad  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(com.truecaller.blockinglevel.api.BlockLevel blockLevel, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, d3.qux quxVar, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        d3.qux quxVar2;
        ?? r7;
        boolean z4;
        v2.c cVar;
        v2.c cVar2;
        v2.c cVar3;
        java.lang.Object M;
        ?? r2;
        v2.n nVar2 = nVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onLevelSelected");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onSkipClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "buttonContent");
        nVar2.b0(2123729038);
        if (nVar2.d(blockLevel.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (nVar2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (nVar2.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i9 | i4;
        if (nVar2.h(function1)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (nVar2.h(function0)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (nVar2.h(quxVar)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((74899 & i14) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nVar2.P(i14 & 1, z3)) {
            float f = 72;
            zf3.b q = oj3.e.q(new com.truecaller.blockinglevel.presentation.i0[]{s(com.truecaller.blockinglevel.api.BlockLevel.OFF, null, nVar2, 1), s(com.truecaller.blockinglevel.api.BlockLevel.BASIC, null, nVar2, 1), s(com.truecaller.blockinglevel.api.BlockLevel.MAX, null, nVar2, 1)});
            com.truecaller.blockinglevel.presentation.i0 s = s(blockLevel, null, nVar2, 1);
            v2.p2 b2 = b1.k2.b(s.a, c1.a.u(300, 0, (c1.t) null, 6), "gradientStart", nVar2, 432, 8);
            v2.p2 b3 = b1.k2.b(s.b, c1.a.u(300, 0, (c1.t) null, 6), "gradientEnd", nVar, 432, 8);
            java.lang.Object M2 = nVar.M();
            v2.c cVar4 = v2.k.a;
            if (M2 == cVar4) {
                M2 = androidx.compose.runtime.a.d(new com.truecaller.blockinglevel.presentation.l(b2, b3, 0));
                nVar.k0(M2);
            }
            java.util.WeakHashMap weakHashMap = m1.p2.w;
            m1.x0 l = m1.c.l(m1.b.f(nVar).g, nVar);
            float a2 = l.a();
            float d = l.d();
            j3.q d2 = m1.c2.d(e1.k.h(u51.e.d(3, (java.lang.String) null), (q3.n) ((v2.p2) M2).getValue(), (q3.q0) null, 6), 1.0f);
            v2.q2 q2Var = k4.g1.n;
            j3.q K = m1.c.K(d2, m1.c.o(l, (h5.j) nVar.j(q2Var)), 0.0f, m1.c.n(l, (h5.j) nVar.j(q2Var)), 0.0f, 10);
            j3.g gVar = j3.qux.a;
            h4.a1 d3 = m1.n.d(gVar, false);
            long j = nVar.T;
            int i15 = (int) (j ^ (j >>> 32));
            v2.e1 l2 = nVar.l();
            j3.q c2 = j3.bar.c(K, nVar);
            j4.e.K9.getClass();
            j4.c cVar5 = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar5);
            } else {
                nVar.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(d3, bVar, nVar);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l2, bVar2, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i15);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c2, bVar4, nVar);
            j3.q d4 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            m1.b bVar5 = m1.h.c;
            j3.e eVar = j3.qux.m;
            m1.v a3 = m1.t.a(bVar5, eVar, nVar, 0);
            long j2 = nVar.T;
            int i16 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l3 = nVar.l();
            j3.q c3 = j3.bar.c(d4, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar5);
            } else {
                nVar.n0();
            }
            v2.f.A(a3, bVar, nVar);
            v2.f.A(l3, bVar2, nVar);
            h0.b.Y(i16, nVar, bVar3, nVar, aVar);
            v2.f.A(c3, bVar4, nVar);
            java.lang.Object M3 = nVar.M();
            if (M3 == cVar4) {
                r7 = 0;
                M3 = androidx.compose.runtime.a.g(0);
                nVar.k0(M3);
            } else {
                r7 = 0;
            }
            v2.c2 c2Var = (v2.c2) M3;
            j3.q D = e1.k.D(li.qux.G(u51.e.d(3, (java.lang.String) null), 1.0f), e1.k.z((int) r7, 1, nVar), (boolean) r7, 14);
            m1.v a4 = m1.t.a(bVar5, eVar, nVar, (int) r7);
            long j3 = nVar.T;
            int i17 = (int) (j3 ^ (j3 >>> 32));
            v2.e1 l4 = nVar.l();
            j3.q c4 = j3.bar.c(D, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar5);
            } else {
                nVar.n0();
            }
            v2.f.A(a4, bVar, nVar);
            v2.f.A(l4, bVar2, nVar);
            h0.b.Y(i17, nVar, bVar3, nVar, aVar);
            v2.f.A(c4, bVar4, nVar);
            m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), d), nVar);
            float f2 = 160;
            j3.q g = m1.c2.g(li.qux.G(u51.e.d(3, (java.lang.String) null), 1.0f), f2, uf3.p.a(new h5.c(((android.content.res.Configuration) nVar.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.4f), new h5.c(f2)).a);
            m1.b bVar6 = m1.h.d;
            m1.v a5 = m1.t.a(bVar6, eVar, nVar, 6);
            long j4 = nVar.T;
            int i18 = (int) (j4 ^ (j4 >>> 32));
            v2.e1 l5 = nVar.l();
            j3.q c5 = j3.bar.c(g, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar5);
            } else {
                nVar.n0();
            }
            v2.f.A(a5, bVar, nVar);
            v2.f.A(l5, bVar2, nVar);
            h0.b.Y(i18, nVar, bVar3, nVar, aVar);
            v2.f.A(c5, bVar4, nVar);
            k(s, q, f, m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), nVar, 3456);
            nVar.p(true);
            j3.q d5 = u51.e.d(3, (java.lang.String) null);
            m1.v a6 = m1.t.a(bVar6, eVar, nVar, 6);
            long j5 = nVar.T;
            int i19 = (int) (j5 ^ (j5 >>> 32));
            v2.e1 l6 = nVar.l();
            j3.q c6 = j3.bar.c(d5, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar5);
            } else {
                nVar.n0();
            }
            v2.f.A(a6, bVar, nVar);
            v2.f.A(l6, bVar2, nVar);
            h0.b.Y(i19, nVar, bVar3, nVar, aVar);
            v2.f.A(c6, bVar4, nVar);
            j3.q d6 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            if ((i14 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            java.lang.Object M4 = nVar.M();
            if (!z4) {
                cVar = cVar4;
                if (M4 != cVar) {
                    cVar2 = cVar;
                    cVar3 = cVar2;
                    i(s, q, 0, (kotlin.jvm.functions.Function1) M4, d6, nVar, 0);
                    nVar2 = nVar;
                    j3.q i21 = e1.k.i(m1.c2.e(os0.bar.t(3, null, nVar2, true, true), 1.0f), ((y41.i) nVar2.j(y41.j.a)).g().a, q3.a0.b);
                    M = nVar2.M();
                    if (M == cVar3) {
                        M = new cc2.z(c2Var, 2);
                        nVar2.k0(M);
                    }
                    j3.q p = h4.d0.p(i21, (kotlin.jvm.functions.Function1) M);
                    h4.a1 d7 = m1.n.d(gVar, false);
                    long j6 = nVar2.T;
                    int i22 = (int) (j6 ^ (j6 >>> 32));
                    v2.e1 l7 = nVar2.l();
                    j3.q c7 = j3.bar.c(p, nVar2);
                    nVar2.d0();
                    if (!nVar2.S) {
                        nVar2.k(cVar5);
                    } else {
                        nVar2.n0();
                    }
                    v2.f.A(d7, bVar, nVar2);
                    v2.f.A(l7, bVar2, nVar2);
                    h0.b.Y(i22, nVar2, bVar3, nVar2, aVar);
                    v2.f.A(c7, bVar4, nVar2);
                    float f3 = 8;
                    float f4 = 16;
                    j3.q J = m1.c.J(u51.e.d(3, (java.lang.String) null), f4, f3, f4, a2 + f3);
                    m1.v a7 = m1.t.a(bVar5, eVar, nVar2, 0);
                    long j7 = nVar2.T;
                    int i23 = (int) (j7 ^ (j7 >>> 32));
                    v2.e1 l8 = nVar2.l();
                    j3.q c8 = j3.bar.c(J, nVar2);
                    nVar2.d0();
                    if (!nVar2.S) {
                        nVar2.k(cVar5);
                    } else {
                        nVar2.n0();
                    }
                    v2.f.A(a7, bVar, nVar2);
                    v2.f.A(l8, bVar2, nVar2);
                    h0.b.Y(i23, nVar2, bVar3, nVar2, aVar);
                    v2.f.A(c8, bVar4, nVar2);
                    quxVar2 = quxVar;
                    quxVar2.invoke(nVar2, java.lang.Integer.valueOf((i14 >> 15) & 14));
                    if (!z) {
                        nVar2.Z(-1071594011);
                        m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f3), nVar2);
                        r2 = 0;
                        j51.b.e.A("block_level_button_skip", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), com.truecaller.compose.ui.components.TrueButton.ButtonStyleSecondary.SECONDARY, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, qk.b1.u(2132019700, nVar2), false, (v3.baz) null, (u4.v0) null, function0, nVar, 384, (i14 >> 9) & 112, 1976);
                        nVar2 = nVar;
                    } else {
                        r2 = 0;
                        nVar2.Z(-1079415652);
                    }
                    nVar2.p((boolean) r2);
                    bar.F(nVar2, true, true, true, true);
                    if (!z2) {
                        nVar2.Z(-1146884268);
                        vj0.bar.e(r2, nVar2);
                    } else {
                        nVar2.Z(-1155260716);
                    }
                    nVar2.p((boolean) r2);
                }
            } else {
                cVar = cVar4;
            }
            cVar2 = cVar;
            M4 = new bb1.baz(6, function1);
            nVar.k0(M4);
            cVar3 = cVar2;
            i(s, q, 0, (kotlin.jvm.functions.Function1) M4, d6, nVar, 0);
            nVar2 = nVar;
            j3.q i212 = e1.k.i(m1.c2.e(os0.bar.t(3, null, nVar2, true, true), 1.0f), ((y41.i) nVar2.j(y41.j.a)).g().a, q3.a0.b);
            M = nVar2.M();
            if (M == cVar3) {
            }
            j3.q p2 = h4.d0.p(i212, (kotlin.jvm.functions.Function1) M);
            h4.a1 d72 = m1.n.d(gVar, false);
            long j62 = nVar2.T;
            int i222 = (int) (j62 ^ (j62 >>> 32));
            v2.e1 l72 = nVar2.l();
            j3.q c72 = j3.bar.c(p2, nVar2);
            nVar2.d0();
            if (!nVar2.S) {
            }
            v2.f.A(d72, bVar, nVar2);
            v2.f.A(l72, bVar2, nVar2);
            h0.b.Y(i222, nVar2, bVar3, nVar2, aVar);
            v2.f.A(c72, bVar4, nVar2);
            float f32 = 8;
            float f42 = 16;
            j3.q J2 = m1.c.J(u51.e.d(3, (java.lang.String) null), f42, f32, f42, a2 + f32);
            m1.v a72 = m1.t.a(bVar5, eVar, nVar2, 0);
            long j72 = nVar2.T;
            int i232 = (int) (j72 ^ (j72 >>> 32));
            v2.e1 l82 = nVar2.l();
            j3.q c82 = j3.bar.c(J2, nVar2);
            nVar2.d0();
            if (!nVar2.S) {
            }
            v2.f.A(a72, bVar, nVar2);
            v2.f.A(l82, bVar2, nVar2);
            h0.b.Y(i232, nVar2, bVar3, nVar2, aVar);
            v2.f.A(c82, bVar4, nVar2);
            quxVar2 = quxVar;
            quxVar2.invoke(nVar2, java.lang.Integer.valueOf((i14 >> 15) & 14));
            if (!z) {
            }
            nVar2.p((boolean) r2);
            bar.F(nVar2, true, true, true, true);
            if (!z2) {
            }
            nVar2.p((boolean) r2);
        } else {
            quxVar2 = quxVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new com.truecaller.blockinglevel.presentation.n(blockLevel, z, z2, function1, function0, quxVar2, i, 0);
        }
    }

    public static final void d(com.truecaller.blockinglevel.api.BlockLevel blockLevel, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, d3.qux quxVar, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onLevelSelected");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onSkipClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "buttonContent");
        nVar.b0(-1738723942);
        if (nVar.d(blockLevel.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (nVar.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (nVar.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i9 | i4;
        if (nVar.h(function1)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (nVar.h(function0)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (nVar.h(quxVar)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((74899 & i14) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nVar.P(i14 & 1, z3)) {
            b(blockLevel, z, z2, function1, function0, quxVar, com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD, nVar, (i14 & 14) | 1572864 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 0);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new com.truecaller.blockinglevel.presentation.n(blockLevel, z, z2, function1, function0, quxVar, i, 1);
        }
    }

    public static final void e(java.lang.String str, com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary, kotlin.jvm.functions.Function0 function0, j3.q qVar, v2.n nVar, int i, int i2) {
        int i3;
        int ordinal;
        int i4;
        int i5;
        boolean z;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary2;
        j3.q qVar2;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary3;
        int i6;
        j3.q d;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        nVar.b0(274414451);
        if ((i & 6) == 0) {
            if (nVar.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i5 = i3 | 48;
        } else {
            if (buttonStylePrimary == null) {
                ordinal = -1;
            } else {
                ordinal = buttonStylePrimary.ordinal();
            }
            if (nVar.d(ordinal)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i3 | i4;
        }
        if ((i & 384) == 0) {
            if (nVar.h(function0)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i5 |= i7;
        }
        int i11 = i5 | 1024;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i11 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
                buttonStylePrimary3 = buttonStylePrimary;
                i6 = i11 & (-7169);
                d = qVar;
            } else {
                if (i9 != 0) {
                    buttonStylePrimary3 = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
                } else {
                    buttonStylePrimary3 = buttonStylePrimary;
                }
                i6 = i11 & (-7169);
                d = u51.e.d(3, (java.lang.String) null);
            }
            nVar.q();
            com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary4 = buttonStylePrimary3;
            j3.q qVar3 = d;
            j51.b.e.v("block_level_button_continue", m1.c2.e(d, 1.0f), buttonStylePrimary4, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, str, (v3.baz) null, r2.m0.b(4, 0.0f, 0.0f, 0.0f, 0.0f, 30), false, function0, nVar, ((i6 << 3) & 896) | ((i6 << 18) & 3670016), (i6 >> 6) & 14, 696);
            buttonStylePrimary2 = buttonStylePrimary4;
            qVar2 = qVar3;
        } else {
            nVar.S();
            buttonStylePrimary2 = buttonStylePrimary;
            qVar2 = qVar;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new com.truecaller.blockinglevel.presentation.d(str, buttonStylePrimary2, function0, qVar2, i, i2, 1);
        }
    }

    public static final void f(java.lang.String str, com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary, kotlin.jvm.functions.Function0 function0, j3.q qVar, v2.n nVar, int i, int i2) {
        int i3;
        int ordinal;
        int i4;
        int i5;
        boolean z;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary2;
        j3.q qVar2;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary3;
        int i6;
        j3.q d;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        nVar.b0(1802145120);
        if ((i & 6) == 0) {
            if (nVar.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i5 = i3 | 48;
        } else {
            if (buttonStylePrimary == null) {
                ordinal = -1;
            } else {
                ordinal = buttonStylePrimary.ordinal();
            }
            if (nVar.d(ordinal)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i3 | i4;
        }
        if ((i & 384) == 0) {
            if (nVar.h(function0)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i5 |= i7;
        }
        int i11 = i5 | 1024;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i11 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
                buttonStylePrimary3 = buttonStylePrimary;
                i6 = i11 & (-7169);
                d = qVar;
            } else {
                if (i9 != 0) {
                    buttonStylePrimary3 = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
                } else {
                    buttonStylePrimary3 = buttonStylePrimary;
                }
                i6 = i11 & (-7169);
                d = u51.e.d(3, (java.lang.String) null);
            }
            nVar.q();
            com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary4 = buttonStylePrimary3;
            j3.q qVar3 = d;
            j51.b.e.v("block_level_button_continue_premium", m1.c2.e(d, 1.0f), buttonStylePrimary4, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, str, (v3.baz) null, r2.m0.b(4, 0.0f, 0.0f, 0.0f, 0.0f, 30), false, function0, nVar, ((i6 << 3) & 896) | ((i6 << 18) & 3670016), (i6 >> 6) & 14, 696);
            buttonStylePrimary2 = buttonStylePrimary4;
            qVar2 = qVar3;
        } else {
            nVar.S();
            buttonStylePrimary2 = buttonStylePrimary;
            qVar2 = qVar;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new com.truecaller.blockinglevel.presentation.d(str, buttonStylePrimary2, function0, qVar2, i, i2, 0);
        }
    }

    public static final void g(java.lang.String str, java.lang.String str2, boolean z, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long j;
        v2.n nVar2 = nVar;
        nVar2.b0(224921343);
        if (nVar2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (nVar2.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nVar2.P(i7 & 1, z2)) {
            if (z) {
                nVar2.Z(1401052196);
                j = ((y41.i) nVar2.j(y41.j.a)).g().n;
                nVar2.p(false);
            } else {
                nVar2.Z(1401053992);
                j = ((y41.i) nVar2.j(y41.j.a)).g().b;
                nVar2.p(false);
            }
            v2.p2 b2 = b1.k2.b(j, c1.a.u(500, 0, (c1.t) null, 6), k9.d.q("featureIconTint_", str), nVar2, 48, 8);
            float f = 4;
            j3.q K = m1.c.K(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            m1.y1 a2 = m1.x1.a(m1.h.g(f), j3.qux.k, nVar2, 54);
            long j2 = nVar2.T;
            int i8 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c2 = j3.bar.c(K, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(a2, j4.d.g, nVar2);
            v2.f.A(l, j4.d.f, nVar2);
            v2.f.t(nVar2, java.lang.Integer.valueOf(i8), j4.d.j);
            v2.f.x(j4.d.k, nVar2);
            v2.f.A(c2, j4.d.d, nVar2);
            r2.d3.a(qe0.i1.z(2131232403, 0, nVar2), (java.lang.String) null, m1.c2.o(u51.e.d(3, (java.lang.String) null), 16), ((q3.r) b2.getValue()).a, nVar, 56, 0);
            nVar2 = nVar;
            j51.b.q.E(str, (j3.q) null, str2, ((i51.a) nVar2.j(i51.bar.a)).e, ((y41.i) nVar2.j(y41.j.a)).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, (i7 & 14) | ((i7 << 3) & 896), 0, 4066);
            nVar2.p(true);
        } else {
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new aj2.h(str, str2, z, i, 1);
        }
    }

    public static final void h(com.truecaller.blockinglevel.presentation.i0 i0Var, j3.q qVar, boolean z, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        nVar.b0(1896587099);
        if (nVar.f(i0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.f(qVar)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (nVar.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nVar.P(i7 & 1, z2)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
            }
            nVar.q();
            float f = 16;
            r2.h5.e(qVar, u1.b.d(f, f, 0.0f, 0.0f, 12), r2.h5.w(((y41.i) nVar.j(y41.j.a)).g().a, nVar, 0), (r2.q0) null, (e1.s) null, d3.a.d(-190237747, new com.truecaller.blockinglevel.presentation.u(i0Var, z), nVar), nVar, ((i7 >> 6) & 14) | 196608, 24);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new aj2.h(i0Var, qVar, z, i, 2);
        }
    }

    public static final void i(final com.truecaller.blockinglevel.presentation.i0 i0Var, final zf3.baz bazVar, int i, final kotlin.jvm.functions.Function1 function1, j3.q qVar, v2.n nVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        final int i8;
        nVar.b0(-1919872116);
        if (nVar.f(i0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (nVar.f(bazVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i9 | i4 | 384;
        if (nVar.h(function1)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (nVar.f(qVar)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i13 & 1, z)) {
            nVar.U();
            if ((i2 & 1) != 0 && !nVar.z()) {
                nVar.S();
                i8 = i;
            } else {
                i8 = 300;
            }
            nVar.q();
            float f = 16;
            r2.h5.e(qVar, u1.b.d(f, f, 0.0f, 0.0f, 12), r2.h5.w(((y41.i) nVar.j(y41.j.a)).g().a, nVar, 0), (r2.q0) null, (e1.s) null, d3.a.d(-2078415234, new nf3.i() { // from class: com.truecaller.blockinglevel.presentation.o
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    v2.n nVar2 = (v2.n) obj2;
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
                    if ((intValue & 17) != 16) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (nVar2.P(intValue & 1, z2)) {
                        j3.q G = m1.c.G(u51.e.d(3, (java.lang.String) null), 16);
                        m1.v a2 = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
                        long j = nVar2.T;
                        int i14 = (int) (j ^ (j >>> 32));
                        v2.e1 l = nVar2.l();
                        j3.q c2 = j3.bar.c(G, nVar2);
                        j4.e.K9.getClass();
                        j4.c cVar = j4.d.b;
                        nVar2.d0();
                        if (nVar2.S) {
                            nVar2.k(cVar);
                        } else {
                            nVar2.n0();
                        }
                        v2.f.A(a2, j4.d.g, nVar2);
                        v2.f.A(l, j4.d.f, nVar2);
                        v2.f.t(nVar2, java.lang.Integer.valueOf(i14), j4.d.j);
                        v2.f.x(j4.d.k, nVar2);
                        v2.f.A(c2, j4.d.d, nVar2);
                        j51.b bVar = j51.b.q;
                        com.truecaller.blockinglevel.presentation.i0 i0Var2 = com.truecaller.blockinglevel.presentation.i0.this;
                        bVar.E("block_level_level_title", (j3.q) null, i0Var2.e, ((i51.a) nVar2.j(i51.bar.a)).s, ((y41.i) nVar2.j(y41.j.a)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, 0, 0, 4066);
                        float f2 = 32;
                        m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f2), nVar2);
                        com.truecaller.blockinglevel.api.BlockLevel blockLevel = i0Var2.g;
                        java.lang.String u = qk.b1.u(2132019707, nVar2);
                        int i15 = i8;
                        vj0.bar.c(u, "block_level_level_property_identify", true, i15, null, nVar2, 384);
                        java.lang.String u2 = qk.b1.u(2132019704, nVar2);
                        if (blockLevel != com.truecaller.blockinglevel.api.BlockLevel.BASIC && blockLevel != com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        vj0.bar.c(u2, "block_level_level_property_block_auto", z3, i15, null, nVar2, 0);
                        java.lang.String u3 = qk.b1.u(2132019703, nVar2);
                        if (blockLevel == com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        vj0.bar.c(u3, "block_level_level_property_block_all", z4, i15, null, nVar2, 0);
                        m1.c.h(m1.c2.o(u51.e.d(3, (java.lang.String) null), f2), nVar2);
                        com.truecaller.blockinglevel.presentation.g0.m(i0Var2, bazVar, null, null, 72, 0, function1, nVar2, 24576);
                        nVar2.p(true);
                    } else {
                        nVar2.S();
                    }
                    return kotlin.Unit.a;
                }
            }, nVar), nVar, ((i13 >> 12) & 14) | 196608, 24);
            i7 = i8;
        } else {
            nVar.S();
            i7 = i;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a23.x(i0Var, bazVar, i7, function1, qVar, i2);
        }
    }

    public static final void j(com.truecaller.blockinglevel.presentation.i0 i0Var, final zf3.baz bazVar, final float f, final kotlin.jvm.functions.Function1 function1, final j3.q qVar, final boolean z, v2.n nVar, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        final com.truecaller.blockinglevel.presentation.i0 i0Var2 = i0Var;
        v2.n nVar2 = nVar;
        nVar2.b0(1382264790);
        if (nVar2.f(i0Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (nVar2.f(bazVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (nVar2.h(function1)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i9 = i8 | i4;
        if (nVar2.f(qVar)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        int i11 = i9 | i5;
        if (nVar2.g(z)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i12 = i11 | i6;
        if ((i12 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nVar2.P(i12 & 1, z2)) {
            nVar2.U();
            if ((i & 1) != 0 && !nVar2.z()) {
                nVar2.S();
            }
            nVar2.q();
            m1.v a2 = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
            long j = nVar2.T;
            int i13 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c2 = j3.bar.c(qVar, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(a2, j4.d.g, nVar2);
            v2.f.A(l, j4.d.f, nVar2);
            v2.f.t(nVar2, java.lang.Integer.valueOf(i13), j4.d.j);
            v2.f.x(j4.d.k, nVar2);
            v2.f.A(c2, j4.d.d, nVar2);
            j51.b bVar = j51.b.q;
            java.lang.String u = qk.b1.u(2132019712, nVar2);
            v2.q2 q2Var = i51.bar.a;
            u4.v0 v0Var = ((i51.a) nVar2.j(q2Var)).p;
            v2.q2 q2Var2 = y41.j.a;
            float f2 = 24;
            bVar.E("block_level_title", m1.c.J(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f2, 32, f2, 20), u, v0Var, ((y41.i) nVar2.j(q2Var2)).g().q, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, 0, 0, 4064);
            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            if (1.0f <= 0.0d) {
                n1.bar.a("invalid weight; must be greater than zero");
            }
            float f3 = 16;
            float f4 = 8;
            vj0.bar.d(bazVar, i0Var2, f, f4, m1.c.I(os0.bar.s(1.0f, e, true), f3, 0.0f, 2), nVar, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | 24960);
            n(i0Var, bazVar, m1.c.I(u51.e.d(3, (java.lang.String) null), f3, 0.0f, 2), null, 0.0f, 0, function1, nVar, (i12 & 126) | (3670016 & (i12 << 6)));
            i0Var2 = i0Var;
            nVar2 = nVar;
            if (!z && i0Var2.g == com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                bVar.E("block_level_max_level_notice", m1.c.H(m1.c2.h(os0.bar.u(nVar2, -1603753439, null, 3, 1.0f), 40, 0.0f, 2), f3, f4), qk.b1.u(2132019699, nVar2), ((i51.a) nVar2.j(q2Var)).a, ((y41.i) nVar2.j(q2Var2)).k().d().c, (f5.i) null, 0, 0, 0, new f5.h(3), 0L, nVar2, 0, 0, 3552);
                nVar2.p(false);
            } else {
                nVar2.Z(-1603854840);
                f63.qux.t(u51.e.d(3, (java.lang.String) null), 40, nVar2, false);
            }
            nVar2.p(true);
        } else {
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new kotlin.jvm.functions.Function2(bazVar, f, function1, qVar, z, i) { // from class: com.truecaller.blockinglevel.presentation.t
                public final /* synthetic */ zf3.baz b;
                public final /* synthetic */ float c;
                public final /* synthetic */ kotlin.jvm.functions.Function1 d;
                public final /* synthetic */ j3.q e;
                public final /* synthetic */ boolean f;

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int D = v2.f.D(3457);
                    com.truecaller.blockinglevel.presentation.g0.j(com.truecaller.blockinglevel.presentation.i0.this, this.b, this.c, this.d, this.e, this.f, (v2.n) obj, D);
                    return kotlin.Unit.a;
                }
            };
        }
    }

    public static final void k(com.truecaller.blockinglevel.presentation.i0 i0Var, zf3.baz bazVar, float f, j3.q qVar, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        v2.n nVar2;
        nVar.b0(-1489082539);
        if (nVar.f(i0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.f(bazVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (nVar.f(qVar)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i7 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
            }
            nVar.q();
            m1.v a2 = m1.t.a(m1.h.c, j3.qux.m, nVar, 0);
            long j = nVar.T;
            int i8 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c2 = j3.bar.c(qVar, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(a2, bVar, nVar);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i8);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c2, bVar4, nVar);
            j51.b bVar5 = j51.b.q;
            java.lang.String u = qk.b1.u(2132019712, nVar);
            v2.q2 q2Var = i51.bar.a;
            u4.v0 v0Var = ((i51.a) nVar.j(q2Var)).p;
            v2.q2 q2Var2 = y41.j.a;
            long j2 = ((y41.i) nVar.j(q2Var2)).g().q;
            float f2 = 24;
            bVar5.E("block_level_title", m1.c.J(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f2, 32, f2, 20), u, v0Var, j2, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 0, 0, 4064);
            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            if (1.0f <= 0.0d) {
                n1.bar.a("invalid weight; must be greater than zero");
            }
            float f3 = 16;
            j3.q d = m1.c2.d(m1.c.I(os0.bar.s(1.0f, e, true), f3, 0.0f, 2), 1.0f);
            m1.v a3 = m1.t.a(m1.h.d, j3.qux.n, nVar, 54);
            long j3 = nVar.T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            v2.e1 l2 = nVar.l();
            j3.q c3 = j3.bar.c(d, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a3, bVar, nVar);
            v2.f.A(l2, bVar2, nVar);
            h0.b.Y(i9, nVar, bVar3, nVar, aVar);
            v2.f.A(c3, bVar4, nVar);
            float f4 = 8;
            nVar2 = nVar;
            vj0.bar.d(bazVar, i0Var, f, f4, m1.c2.h(u51.e.d(3, (java.lang.String) null), 0.0f, 235, 1), nVar2, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112) | 24960);
            nVar2.p(true);
            float f5 = 40;
            if (i0Var.g == com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                bVar5.E("block_level_max_level_notice", m1.c.H(m1.c2.h(os0.bar.u(nVar2, 1445469083, null, 3, 1.0f), f5, 0.0f, 2), f3, f4), qk.b1.u(2132019699, nVar2), ((i51.a) nVar2.j(q2Var)).a, ((y41.i) nVar2.j(q2Var2)).k().d().c, (f5.i) null, 0, 0, 0, new f5.h(3), 0L, nVar, 0, 0, 3552);
                nVar2 = nVar;
                nVar2.p(false);
            } else {
                nVar2.Z(1446017442);
                m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f5), nVar2);
                nVar2.p(false);
            }
            nVar2.p(true);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new bo2.c(i0Var, bazVar, f, qVar, i);
        }
    }

    public static final void l(final int i, final boolean z, final long j, v2.n nVar, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        long j2;
        v2.n nVar2 = nVar;
        nVar2.b0(-497294323);
        if (nVar2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (nVar2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (nVar2.e(j)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nVar2.P(i8 & 1, z2)) {
            if (z) {
                nVar2.Z(-1158468385);
                nVar2.p(false);
                j2 = j;
            } else {
                nVar2.Z(-1158466598);
                j2 = ((y41.i) nVar2.j(y41.j.a)).i().g;
                nVar2.p(false);
            }
            j3.q i9 = e1.k.i(m1.c2.o(u51.e.d(3, (java.lang.String) null), 40), ((q3.r) b1.k2.b(j2, c1.a.u(500, 0, (c1.t) null, 6), "iconBackground", nVar2, 432, 8).getValue()).a, u1.b.b(8));
            h4.a1 d = m1.n.d(j3.qux.e, false);
            long j3 = nVar2.T;
            int i11 = (int) (j3 ^ (j3 >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c2 = j3.bar.c(i9, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(d, j4.d.g, nVar2);
            v2.f.A(l, j4.d.f, nVar2);
            v2.f.t(nVar2, java.lang.Integer.valueOf(i11), j4.d.j);
            v2.f.x(j4.d.k, nVar2);
            v2.f.A(c2, j4.d.d, nVar2);
            r2.d3.a(qe0.i1.z(i, i8 & 14, nVar2), (java.lang.String) null, m1.c2.o(u51.e.d(3, (java.lang.String) null), 32), ((y41.i) nVar2.j(y41.j.a)).g().q, nVar2, 56, 0);
            nVar2 = nVar2;
            nVar2.p(true);
        } else {
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new kotlin.jvm.functions.Function2(i, i2, j, z) { // from class: com.truecaller.blockinglevel.presentation.i
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;

                {
                    this.b = z;
                    this.c = j;
                }

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int D = v2.f.D(1);
                    com.truecaller.blockinglevel.presentation.g0.l(this.a, this.b, this.c, (v2.n) obj, D);
                    return kotlin.Unit.a;
                }
            };
        }
    }

    public static final void m(final com.truecaller.blockinglevel.presentation.i0 i0Var, final zf3.baz bazVar, j3.q qVar, q3.q0 q0Var, float f, int i, final kotlin.jvm.functions.Function1 function1, v2.n nVar, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        float f2;
        final j3.q qVar2;
        final q3.q0 q0Var2;
        final int i6;
        j3.q d;
        final q3.q0 a2;
        nVar.b0(966520982);
        if (nVar.f(i0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (nVar.f(bazVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4 | 197760;
        if (nVar.h(function1)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i9 = i8 | i5;
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i9 & 1, z)) {
            nVar.U();
            if ((i2 & 1) != 0 && !nVar.z()) {
                nVar.S();
                d = qVar;
                a2 = q0Var;
                i6 = i;
            } else {
                d = u51.e.d(3, (java.lang.String) null);
                a2 = u1.b.a(80);
                i6 = 200;
            }
            nVar.q();
            v2.q2 q2Var = y41.j.a;
            long j = ((y41.i) nVar.j(q2Var)).g().e;
            final long j2 = ((y41.i) nVar.j(q2Var)).g().d;
            f2 = f;
            j3.q i11 = e1.k.i(n3.d.b(m1.c2.i(d, f2), a2), j, q3.a0.b);
            float f3 = 8;
            m1.c.a(m1.c.H(i11, f3, f3), (j3.b) null, false, d3.a.d(431507564, new nf3.i() { // from class: com.truecaller.blockinglevel.presentation.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    boolean z2;
                    boolean z3;
                    float f4;
                    int i12;
                    com.truecaller.blockinglevel.presentation.p pVar = this;
                    m1.s sVar = (m1.s) obj;
                    v2.n nVar2 = (v2.n) obj2;
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "$this$BoxWithConstraints");
                    int i13 = 2;
                    if ((intValue & 6) == 0) {
                        if (nVar2.f(sVar)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    boolean z4 = true;
                    if ((intValue & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (nVar2.P(intValue & 1, z2)) {
                        float h = (float) ((h5.bar.h(sVar.b) / 3.0d) / ((h5.qux) nVar2.j(k4.g1.h)).d());
                        com.truecaller.blockinglevel.presentation.i0 i0Var2 = com.truecaller.blockinglevel.presentation.i0.this;
                        int i14 = i6;
                        java.lang.String str = null;
                        v2.p2 c2 = c1.b.c((qf3.a.a(r1 * i0Var2.h) << 32) | (0 & 4294967295L), c1.a.u(i14, 0, (c1.t) null, 6), "indicatorOffset", nVar2, 384);
                        int i15 = 3;
                        j3.q d2 = u51.e.d(3, (java.lang.String) null);
                        boolean f5 = nVar2.f(c2);
                        java.lang.Object M = nVar2.M();
                        java.lang.Object obj4 = v2.k.a;
                        if (f5 || M == obj4) {
                            M = new az0.a(c2, 2);
                            nVar2.k0(M);
                        }
                        j3.q t = m1.c2.t(m1.c.B(d2, (kotlin.jvm.functions.Function1) M), h);
                        float f6 = 1.0f;
                        m1.n.a(e1.k.i(m1.c2.c(t, 1.0f), j2, a2), nVar2, 0);
                        j3.q d3 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
                        m1.y1 a3 = m1.x1.a(m1.h.h, j3.qux.k, nVar2, 54);
                        com.truecaller.blockinglevel.presentation.i0 i0Var3 = i0Var2;
                        long j3 = nVar2.T;
                        int i16 = (int) (j3 ^ (j3 >>> 32));
                        v2.e1 l = nVar2.l();
                        j3.q c3 = j3.bar.c(d3, nVar2);
                        j4.e.K9.getClass();
                        j4.c cVar = j4.d.b;
                        nVar2.d0();
                        if (nVar2.S) {
                            nVar2.k(cVar);
                        } else {
                            nVar2.n0();
                        }
                        v2.f.A(a3, j4.d.g, nVar2);
                        v2.f.A(l, j4.d.f, nVar2);
                        v2.f.t(nVar2, java.lang.Integer.valueOf(i16), j4.d.j);
                        v2.f.x(j4.d.k, nVar2);
                        v2.f.A(c3, j4.d.d, nVar2);
                        nVar2.Z(-592770171);
                        java.util.Iterator it = bazVar.iterator();
                        while (it.hasNext()) {
                            final com.truecaller.blockinglevel.presentation.i0 i0Var4 = (com.truecaller.blockinglevel.presentation.i0) it.next();
                            j3.q d4 = u51.e.d(i15, str);
                            if (f6 <= 0.0d) {
                                n1.bar.a("invalid weight; must be greater than zero");
                            }
                            j3.q c4 = m1.c2.c(d4.o(new m1.f1(f6, z4)), f6);
                            java.lang.Object M2 = nVar2.M();
                            if (M2 == obj4) {
                                M2 = d4.t.q(nVar2);
                            }
                            k1.h hVar = (k1.h) M2;
                            final kotlin.jvm.functions.Function1 function12 = function1;
                            boolean f7 = nVar2.f(function12) | nVar2.f(i0Var4);
                            java.lang.Object M3 = nVar2.M();
                            if (f7 || M3 == obj4) {
                                final int i17 = 0;
                                M3 = new kotlin.jvm.functions.Function0() { // from class: com.truecaller.blockinglevel.presentation.m
                                    public final java.lang.Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                function12.invoke(i0Var4);
                                                return kotlin.Unit.a;
                                            default:
                                                function12.invoke(i0Var4);
                                                return kotlin.Unit.a;
                                        }
                                    }
                                };
                                nVar2.k0(M3);
                            }
                            j3.q I = m1.c.I(e1.k.o(c4, hVar, (e1.y0) null, false, (java.lang.String) null, (r4.g) null, (kotlin.jvm.functions.Function0) M3, 28), 16, 0.0f, i13);
                            h4.a1 d5 = m1.n.d(j3.qux.e, false);
                            long j4 = nVar2.T;
                            int i18 = (int) (j4 ^ (j4 >>> 32));
                            v2.e1 l2 = nVar2.l();
                            j3.q c5 = j3.bar.c(I, nVar2);
                            j4.e.K9.getClass();
                            j4.c cVar2 = j4.d.b;
                            nVar2.d0();
                            if (nVar2.S) {
                                nVar2.k(cVar2);
                            } else {
                                nVar2.n0();
                            }
                            v2.f.A(d5, j4.d.g, nVar2);
                            v2.f.A(l2, j4.d.f, nVar2);
                            v2.f.t(nVar2, java.lang.Integer.valueOf(i18), j4.d.j);
                            v2.f.x(j4.d.k, nVar2);
                            v2.f.A(c5, j4.d.d, nVar2);
                            com.truecaller.blockinglevel.presentation.i0 i0Var5 = i0Var3;
                            if (i0Var5.g == i0Var4.g) {
                                z3 = z4;
                            } else {
                                z3 = false;
                            }
                            long j5 = ((y41.i) nVar2.j(y41.j.a)).m().b;
                            if (z3) {
                                j5 = i0Var4.c;
                            }
                            java.lang.Object obj5 = obj4;
                            long j6 = j5;
                            float f8 = f6;
                            v2.p2 b2 = b1.k2.b(j6, c1.a.u(i14, 0, (c1.t) null, 6), "textColor", nVar2, 384, 8);
                            if (z3) {
                                f4 = f8;
                            } else {
                                f4 = 0.0f;
                            }
                            v2.p2 b3 = c1.b.b(f4, c1.a.u(i14, 0, (c1.t) null, 6), "textStyle", (kotlin.jvm.functions.Function1) null, nVar2, 3072, 20);
                            v2.q2 q2Var2 = i51.bar.a;
                            u4.v0 j7 = u4.p.j(((i51.a) nVar2.j(q2Var2)).i, ((i51.a) nVar2.j(q2Var2)).m, ((java.lang.Number) b3.getValue()).floatValue());
                            v2.n nVar3 = nVar2;
                            j51.b.q.E("block_level_level_" + i0Var4.g, (j3.q) null, i0Var4.d, j7, ((q3.r) b2.getValue()).a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar3, 0, 0, 4066);
                            nVar2 = nVar3;
                            nVar2.p(true);
                            it = it;
                            z4 = true;
                            f6 = f8;
                            obj4 = obj5;
                            i15 = 3;
                            i13 = 2;
                            i14 = i14;
                            i0Var3 = i0Var5;
                            str = null;
                            pVar = this;
                        }
                        nVar2.p(false);
                        nVar2.p(z4);
                    } else {
                        nVar2.S();
                    }
                    return kotlin.Unit.a;
                }
            }, nVar), nVar, 3072, 6);
            q0Var2 = a2;
            qVar2 = d;
        } else {
            f2 = f;
            nVar.S();
            qVar2 = qVar;
            q0Var2 = q0Var;
            i6 = i;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            final float f4 = f2;
            r.d = new kotlin.jvm.functions.Function2(bazVar, qVar2, q0Var2, f4, i6, function1, i2) { // from class: com.truecaller.blockinglevel.presentation.q
                public final /* synthetic */ zf3.baz b;
                public final /* synthetic */ j3.q c;
                public final /* synthetic */ q3.q0 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ int f;
                public final /* synthetic */ kotlin.jvm.functions.Function1 g;

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int D = v2.f.D(24577);
                    com.truecaller.blockinglevel.presentation.g0.m(com.truecaller.blockinglevel.presentation.i0.this, this.b, this.c, this.d, this.e, this.f, this.g, (v2.n) obj, D);
                    return kotlin.Unit.a;
                }
            };
        }
    }

    public static final void n(final com.truecaller.blockinglevel.presentation.i0 i0Var, final zf3.baz bazVar, final j3.q qVar, q3.q0 q0Var, float f, int i, final kotlin.jvm.functions.Function1 function1, v2.n nVar, final int i2) {
        int i3;
        boolean z;
        final q3.q0 q0Var2;
        final float f2;
        final int i4;
        float f3;
        q3.q0 a2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        nVar.b0(-819823128);
        if ((i2 & 6) == 0) {
            if (nVar.f(i0Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (nVar.f(bazVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (nVar.f(qVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i11 = i3 | 221184;
        if ((1572864 & i2) == 0) {
            if (nVar.h(function1)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i11 |= i6;
        }
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i11 & 1, z)) {
            nVar.U();
            if ((i2 & 1) != 0 && !nVar.z()) {
                nVar.S();
                a2 = q0Var;
                f3 = f;
                i5 = i;
            } else {
                f3 = 56;
                a2 = u1.b.a(78);
                i5 = 200;
            }
            nVar.q();
            float f4 = 8;
            m1.c.a(m1.c.H(e1.k.i(n3.d.b(m1.c2.f(qVar, f3), a2), q3.r.c(((y41.i) nVar.j(y41.j.a)).g().q, 0.15f, 0.0f, 0.0f, 0.0f, 14), q3.a0.b), f4, f4), (j3.b) null, false, d3.a.d(-1308955074, new an1.k(i0Var, i5, a2, bazVar, function1), nVar), nVar, 3072, 6);
            f2 = f3;
            i4 = i5;
            q0Var2 = a2;
        } else {
            nVar.S();
            q0Var2 = q0Var;
            f2 = f;
            i4 = i;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new kotlin.jvm.functions.Function2() { // from class: com.truecaller.blockinglevel.presentation.r
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    com.truecaller.blockinglevel.presentation.g0.n(com.truecaller.blockinglevel.presentation.i0.this, bazVar, qVar, q0Var2, f2, i4, function1, (v2.n) obj, v2.f.D(i2 | 1));
                    return kotlin.Unit.a;
                }
            };
        }
    }

    public static final void o(int i, v2.n nVar) {
        boolean z;
        nVar.b0(-548080526);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i & 1, z)) {
            j3.q d = u51.e.d(3, (java.lang.String) null);
            v2.q2 q2Var = y41.j.a;
            float f = 4;
            j3.q J = m1.c.J(e1.k.i(d, q3.r.c(((y41.i) nVar.j(q2Var)).g().m, 0.12f, 0.0f, 0.0f, 0.0f, 14), u1.b.b(100)), f, f, 6, f);
            m1.y1 a2 = m1.x1.a(m1.h.g(f), j3.qux.k, nVar, 54);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c2 = j3.bar.c(J, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a2, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c2, j4.d.d, nVar);
            float f2 = 16;
            e1.k.c(qe0.i1.z(2131232255, 0, nVar), (java.lang.String) null, e1.k.i(m1.c2.o(u51.e.d(3, (java.lang.String) null), f2), ((y41.i) nVar.j(q2Var)).g().m, u1.b.b(f2)), (j3.b) null, h4.m.e, 0.0f, (q3.j) null, nVar, 24632, 104);
            j51.b.q.E("set_protection_level_premium_badge_label", (j3.q) null, qk.b1.u(2132019702, nVar), ((i51.a) nVar.j(i51.bar.a)).d, ((y41.i) nVar.j(q2Var)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 0, 0, 4066);
            nVar.p(true);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new ce1.bar(i, 11);
        }
    }

    public static final void p(int i, v2.n nVar) {
        boolean z;
        v2.n nVar2;
        nVar.b0(-2014896531);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i & 1, z)) {
            java.lang.Object M = nVar.M();
            if (M == v2.k.a) {
                M = new com.truecaller.ads.util.u0(6);
                nVar.k0(M);
            }
            nVar2 = nVar;
            com.bumptech.glide.qux.g((kotlin.jvm.functions.Function0) M, (l5.r) null, a, nVar2, 390, 2);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new ce1.bar(i, 10);
        }
    }

    public static final void q(final com.truecaller.blockinglevel.presentation.m0 m0Var, final boolean z, final boolean z2, final float f, kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        long j;
        float f2;
        com.truecaller.blockinglevel.api.BlockLevel blockLevel = m0Var.a;
        nVar.b0(1450849510);
        if (nVar.f(m0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (nVar.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (nVar.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (nVar.c(f)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i9 | i5;
        if (nVar.h(function0)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if ((i12 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nVar.P(i12 & 1, z3)) {
            u1.a b2 = u1.b.b(16);
            if (z) {
                nVar.Z(-1597981142);
                j = ((y41.i) nVar.j(y41.j.a)).g().m;
                nVar.p(false);
            } else {
                nVar.Z(-1597979378);
                j = ((y41.i) nVar.j(y41.j.a)).g().c;
                nVar.p(false);
            }
            v2.p2 b3 = b1.k2.b(j, c1.a.u(500, 0, (c1.t) null, 6), "cardBorderColor_" + blockLevel, nVar, 48, 8);
            if (z) {
                f2 = 2;
            } else {
                f2 = 1;
            }
            r2.h5.f(function0, e1.k.k(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), ((h5.c) c1.b.a(f2, c1.a.u(500, 0, (c1.t) null, 6), "cardBorderWidth_" + blockLevel, nVar, 48, 8).getValue()).a, ((q3.r) b3.getValue()).a, b2), false, b2, r2.h5.w(((y41.i) nVar.j(y41.j.a)).g().f, nVar, 0), r2.h5.x(0, 62), (e1.s) null, d3.a.d(153511633, new nf3.i() { // from class: com.truecaller.blockinglevel.presentation.g
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    boolean z4;
                    int i13;
                    boolean z5;
                    int i14;
                    long j2;
                    v2.n nVar2 = (v2.n) obj2;
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
                    if ((intValue & 17) != 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (nVar2.P(intValue & 1, z4)) {
                        j3.q G = m1.c.G(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f);
                        j3.f fVar = j3.qux.j;
                        m1.b bVar = m1.h.a;
                        m1.y1 a2 = m1.x1.a(bVar, fVar, nVar2, 48);
                        long j3 = nVar2.T;
                        int i15 = (int) (j3 ^ (j3 >>> 32));
                        v2.e1 l = nVar2.l();
                        j3.q c2 = j3.bar.c(G, nVar2);
                        j4.e.K9.getClass();
                        j4.c cVar = j4.d.b;
                        nVar2.d0();
                        if (nVar2.S) {
                            nVar2.k(cVar);
                        } else {
                            nVar2.n0();
                        }
                        j4.b bVar2 = j4.d.g;
                        v2.f.A(a2, bVar2, nVar2);
                        j4.b bVar3 = j4.d.f;
                        v2.f.A(l, bVar3, nVar2);
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i15);
                        j4.b bVar4 = j4.d.j;
                        v2.f.t(nVar2, valueOf, bVar4);
                        j4.a aVar = j4.d.k;
                        v2.f.x(aVar, nVar2);
                        j4.b bVar5 = j4.d.d;
                        v2.f.A(c2, bVar5, nVar2);
                        com.truecaller.blockinglevel.presentation.m0 m0Var2 = m0Var;
                        int i16 = m0Var2.b;
                        com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = m0Var2.a;
                        long j4 = m0Var2.f;
                        boolean z6 = z;
                        com.truecaller.blockinglevel.presentation.g0.l(i16, z6, j4, nVar2, 0);
                        float f3 = 8;
                        m1.c.h(m1.c2.t(u51.e.d(3, (java.lang.String) null), f3), nVar2);
                        j3.q d = u51.e.d(3, (java.lang.String) null);
                        if (1.0f <= 0.0d) {
                            n1.bar.a("invalid weight; must be greater than zero");
                        }
                        j3.q s = os0.bar.s(1.0f, d, true);
                        m1.v a3 = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
                        long j5 = nVar2.T;
                        int i17 = (int) (j5 ^ (j5 >>> 32));
                        v2.e1 l2 = nVar2.l();
                        j3.q c3 = j3.bar.c(s, nVar2);
                        nVar2.d0();
                        if (nVar2.S) {
                            nVar2.k(cVar);
                        } else {
                            nVar2.n0();
                        }
                        v2.f.A(a3, bVar2, nVar2);
                        v2.f.A(l2, bVar3, nVar2);
                        h0.b.Y(i17, nVar2, bVar4, nVar2, aVar);
                        v2.f.A(c3, bVar5, nVar2);
                        m1.y1 a4 = m1.x1.a(bVar, j3.qux.k, nVar2, 48);
                        long j6 = nVar2.T;
                        int i18 = (int) (j6 ^ (j6 >>> 32));
                        v2.e1 l3 = nVar2.l();
                        j3.q c4 = j3.bar.c(j3.n.a, nVar2);
                        nVar2.d0();
                        if (nVar2.S) {
                            nVar2.k(cVar);
                        } else {
                            nVar2.n0();
                        }
                        v2.f.A(a4, bVar2, nVar2);
                        v2.f.A(l3, bVar3, nVar2);
                        h0.b.Y(i18, nVar2, bVar4, nVar2, aVar);
                        v2.f.A(c4, bVar5, nVar2);
                        j51.b bVar6 = j51.b.q;
                        java.lang.String str = m0Var2.c;
                        v2.q2 q2Var = i51.bar.a;
                        u4.v0 v0Var = ((i51.a) nVar2.j(q2Var)).l;
                        v2.q2 q2Var2 = y41.j.a;
                        bVar6.E("set_protection_level_level_" + blockLevel2 + "_title", (j3.q) null, str, v0Var, ((y41.i) nVar2.j(q2Var2)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, com.moloco.sdk.internal.publisher.b0.L(8589934592L, 1.1f), nVar2, 0, 0, 2018);
                        if (z2) {
                            nVar2.Z(290250072);
                            i13 = 3;
                            m1.c.h(m1.c2.t(u51.e.d(3, (java.lang.String) null), f3), nVar2);
                            z5 = false;
                            com.truecaller.blockinglevel.presentation.g0.o(0, nVar2);
                        } else {
                            i13 = 3;
                            z5 = false;
                            nVar2.Z(277930703);
                        }
                        nVar2.p(z5);
                        nVar2.p(true);
                        m1.c.h(m1.c2.f(u51.e.d(i13, (java.lang.String) null), 4), nVar2);
                        if (z6) {
                            nVar2.Z(1189118174);
                            j2 = ((y41.i) nVar2.j(q2Var2)).m().a;
                            i14 = 0;
                            nVar2.p(false);
                        } else {
                            i14 = 0;
                            nVar2.Z(1189120128);
                            j2 = ((y41.i) nVar2.j(q2Var2)).m().b;
                            nVar2.p(false);
                        }
                        bVar6.E("set_protection_level_level_" + blockLevel2 + "_subtitle", (j3.q) null, m0Var2.d, ((i51.a) nVar2.j(q2Var)).e, ((q3.r) b1.k2.b(j2, c1.a.u(500, i14, (c1.t) null, 6), "subtitleColor_" + blockLevel2, nVar2, 48, 8).getValue()).a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, 0, 0, 4066);
                        m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), (float) 12), nVar2);
                        nVar2.Z(1189137921);
                        int i19 = 0;
                        for (java.lang.Object obj4 : m0Var2.e) {
                            int i21 = i19 + 1;
                            if (i19 >= 0) {
                                com.truecaller.blockinglevel.presentation.g0.g("set_protection_level_level_" + blockLevel2 + "_feature_" + i19, (java.lang.String) obj4, z6, nVar2, 0);
                                i19 = i21;
                            } else {
                                kotlin.collections.y.p();
                                throw null;
                            }
                        }
                        nVar2.p(false);
                        nVar2.p(true);
                        v2.q2 q2Var3 = y41.j.a;
                        r2.f5.a(z6, (kotlin.jvm.functions.Function0) null, m1.c2.o(u51.e.d(3, (java.lang.String) null), 24), false, r2.h5.z(((y41.i) nVar2.j(q2Var3)).g().m, ((y41.i) nVar2.j(q2Var3)).g().b, nVar2), nVar2, 48, 40);
                        nVar2.p(true);
                    } else {
                        nVar2.S();
                    }
                    return kotlin.Unit.a;
                }
            }, nVar), nVar, ((i12 >> 12) & 14) | 100663296, 196);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new com.truecaller.blockinglevel.presentation.h(m0Var, z, z2, f, function0, i);
        }
    }

    public static final void r(i82.r rVar, gf2.y yVar, j3.q qVar, v2.n nVar, int i) {
        int i2;
        int i3;
        boolean z;
        j3.q qVar2;
        int i4;
        j3.q d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "purchaseStateListener");
        nVar.b0(-253101710);
        if (nVar.h(rVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.h(yVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i6 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
                i4 = i6 & (-897);
                d = qVar;
            } else {
                i4 = i6 & (-897);
                d = u51.e.d(3, (java.lang.String) null);
            }
            int i7 = i4;
            nVar.q();
            fe0.m.d(m1.c2.e(d, 1.0f), null, new gf2.b(rVar, (com.truecaller.premium.data.ConfigComponent) null, (df2.y) null, (com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonConfigDto) null, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.ui.embedded.EmbeddedCtaConfig) null, (pe2.k) null, false, (java.lang.String) null, (java.lang.String) null, 4094), (re2.qux) nVar.j(re2.baz.a), null, null, null, null, yVar, null, nVar, 512 | ((i7 << 24) & 1879048192), 1514);
            qVar2 = d;
        } else {
            nVar.S();
            qVar2 = qVar;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a2.j(rVar, yVar, qVar2, i, 16);
        }
    }

    public static final com.truecaller.blockinglevel.presentation.i0 s(com.truecaller.blockinglevel.api.BlockLevel blockLevel, com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant, v2.n nVar, int i) {
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "<this>");
        if ((i & 1) != 0) {
            blockLevelVariant2 = null;
        } else {
            blockLevelVariant2 = blockLevelVariant;
        }
        int i5 = com.truecaller.blockinglevel.presentation.j.b[blockLevel.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    nVar.Z(914599976);
                    v2.q2 q2Var = y41.j.a;
                    long j7 = ((y41.i) nVar.j(q2Var)).g().n;
                    com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant3 = blockLevelVariant2;
                    q3.r rVar = (q3.r) kotlin.collections.CollectionsKt.e0((java.util.List) ((y41.i) nVar.j(q2Var)).h().f.getValue());
                    if (rVar != null) {
                        j5 = rVar.a;
                    } else {
                        j5 = j7;
                    }
                    q3.r rVar2 = (q3.r) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((y41.i) nVar.j(q2Var)).h().f.getValue());
                    if (rVar2 != null) {
                        j6 = rVar2.a;
                    } else {
                        j6 = j7;
                    }
                    java.lang.String u = qk.b1.u(2132019698, nVar);
                    if (blockLevelVariant3 == null) {
                        i2 = -1;
                    } else {
                        i2 = com.truecaller.blockinglevel.presentation.j.a[blockLevelVariant3.ordinal()];
                    }
                    if (i2 == 1) {
                        i3 = 1137900781;
                        i4 = 2132019694;
                    } else {
                        i3 = 1137903495;
                        i4 = 2132019693;
                    }
                    long j8 = j5;
                    com.truecaller.blockinglevel.presentation.i0 i0Var = new com.truecaller.blockinglevel.presentation.i0(j8, j6, j7, u, k9.d.t(nVar, i3, i4, nVar, false), qe0.i1.z(2131231508, 0, nVar), blockLevel, 2, 1.0f);
                    nVar.p(false);
                    return i0Var;
                }
                throw ro0.f.G(1137833400, nVar, false);
            }
            nVar.Z(913780212);
            v2.q2 q2Var2 = y41.j.a;
            long j9 = ((y41.i) nVar.j(q2Var2)).g().m;
            q3.r rVar3 = (q3.r) kotlin.collections.CollectionsKt.e0((java.util.List) ((y41.i) nVar.j(q2Var2)).h().e.getValue());
            if (rVar3 != null) {
                j3 = rVar3.a;
            } else {
                j3 = j9;
            }
            q3.r rVar4 = (q3.r) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((y41.i) nVar.j(q2Var2)).h().e.getValue());
            if (rVar4 != null) {
                j4 = rVar4.a;
            } else {
                j4 = j9;
            }
            com.truecaller.blockinglevel.presentation.i0 i0Var2 = new com.truecaller.blockinglevel.presentation.i0(j3, j4, j9, qk.b1.u(2132019691, nVar), qk.b1.u(2132019692, nVar), qe0.i1.z(2131231507, 0, nVar), blockLevel, 1, 0.61538464f);
            nVar.p(false);
            return i0Var2;
        }
        nVar.Z(913075272);
        v2.q2 q2Var3 = y41.j.a;
        long j11 = ((y41.i) nVar.j(q2Var3)).g().l;
        q3.r rVar5 = (q3.r) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((y41.i) nVar.j(q2Var3)).h().d.getValue());
        if (rVar5 != null) {
            j = rVar5.a;
        } else {
            j = j11;
        }
        q3.r rVar6 = (q3.r) kotlin.collections.CollectionsKt.e0((java.util.List) ((y41.i) nVar.j(q2Var3)).h().d.getValue());
        if (rVar6 != null) {
            j2 = rVar6.a;
        } else {
            j2 = j11;
        }
        com.truecaller.blockinglevel.presentation.i0 i0Var3 = new com.truecaller.blockinglevel.presentation.i0(j, j2, j11, qk.b1.u(2132019701, nVar), qk.b1.u(2132019695, nVar), qe0.i1.z(2131231509, 0, nVar), blockLevel, 0, 0.26923078f);
        nVar.p(false);
        return i0Var3;
    }
}
