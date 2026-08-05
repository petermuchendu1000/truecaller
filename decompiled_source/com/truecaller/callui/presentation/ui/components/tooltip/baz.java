package com.truecaller.callui.presentation.ui.components.tooltip;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class baz {
    public static final void a(com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel callUITooltipViewModel, j3.q qVar, v2.n nVar, int i) {
        int i2;
        boolean z;
        com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel callUITooltipViewModel2;
        a9.qux quxVar;
        int i3;
        v2.n nVar2 = nVar;
        nVar2.b0(719808859);
        int i4 = i | 2;
        if (nVar2.f(qVar)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i4 | i2;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i5 & 1, z)) {
            nVar2.U();
            if ((i & 1) != 0 && !nVar2.z()) {
                nVar2.S();
                i3 = i5 & (-15);
                callUITooltipViewModel2 = callUITooltipViewModel;
            } else {
                nVar2.a0(1890788296);
                androidx.lifecycle.n a = b9.bar.a(nVar2);
                if (a != null) {
                    xc3.c t = com.bumptech.glide.qux.t(a, nVar2);
                    nVar2.a0(1729797275);
                    if (a instanceof androidx.lifecycle.n) {
                        quxVar = a.getDefaultViewModelCreationExtras();
                    } else {
                        quxVar = a9.bar.b;
                    }
                    androidx.lifecycle.n1 K = df0.qux.K(com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.class, a, null, t, quxVar, nVar);
                    nVar2 = nVar;
                    nVar2.p(false);
                    nVar2.p(false);
                    i3 = i5 & (-15);
                    callUITooltipViewModel2 = (com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel) K;
                } else {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            nVar2.q();
            v2.t0 r = mf0.o.r(callUITooltipViewModel2.p, nVar2, 0, 7);
            java.lang.Object M = nVar2.M();
            java.lang.Object obj = v2.k.a;
            if (M == obj) {
                M = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar2.k0(M);
            }
            v2.t0 t0Var = (v2.t0) M;
            java.lang.Object M2 = nVar2.M();
            if (M2 == obj) {
                M2 = androidx.compose.runtime.a.j((java.lang.Object) null);
                nVar2.k0(M2);
            }
            v2.t0 t0Var2 = (v2.t0) M2;
            kotlin.Unit unit = kotlin.Unit.a;
            boolean h = nVar2.h(callUITooltipViewModel2);
            java.lang.Object M3 = nVar2.M();
            if (h || M3 == obj) {
                M3 = new vb.b3(callUITooltipViewModel2, (df3.bar) null, 28);
                nVar2.k0(M3);
            }
            v2.f.h(unit, (kotlin.jvm.functions.Function2) M3, nVar2);
            yy0.baz bazVar = (yy0.baz) r.getValue();
            boolean f = nVar2.f(r);
            java.lang.Object M4 = nVar2.M();
            if (f || M4 == obj) {
                y01.baz bazVar2 = new y01.baz(r, t0Var, t0Var2, (df3.bar) null, 13);
                nVar2.k0(bazVar2);
                M4 = bazVar2;
            }
            v2.f.h(bazVar, (kotlin.jvm.functions.Function2) M4, nVar2);
            boolean booleanValue = ((java.lang.Boolean) t0Var.getValue()).booleanValue();
            c1.l1 u = c1.a.u(300, 0, (c1.t) null, 6);
            java.lang.Object M5 = nVar2.M();
            if (M5 == obj) {
                M5 = new yo0.b(10);
                nVar2.k0(M5);
            }
            b1.a1 a2 = b1.v0.o(u, (kotlin.jvm.functions.Function1) M5).a(b1.v0.e((c1.w) null, 3));
            c1.l1 u2 = c1.a.u(300, 0, (c1.t) null, 6);
            java.lang.Object M6 = nVar2.M();
            if (M6 == obj) {
                M6 = new yo0.b(11);
                nVar2.k0(M6);
            }
            b1.t1.e(booleanValue, qVar, a2, b1.v0.q(u2, new b1.u0(3, (kotlin.jvm.functions.Function1) M6)).a(b1.v0.f((c1.w) null, 3)), (java.lang.String) null, d3.a.d(1341120051, new k02.a(t0Var2, 7), nVar2), nVar2, (i3 & 112) | 196608, 16);
        } else {
            nVar.S();
            callUITooltipViewModel2 = callUITooltipViewModel;
        }
        v2.h1 r2 = nVar.r();
        if (r2 != null) {
            r2.d = new xy1.a1(callUITooltipViewModel2, qVar, i, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final void b(com.truecaller.callui.presentation.ui.components.tooltip.qux quxVar, v2.n nVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ?? r12;
        nVar.b0(-126177735);
        if (nVar.f(quxVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i4 & 1, z)) {
            j3.q b = u51.e.b(u51.e.d(3, (java.lang.String) null), "callUIPillView", true);
            h4.a1 d = m1.n.d(j3.qux.e, false);
            long j = nVar.T;
            int i5 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(b, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(d, bVar, nVar);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i5);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar);
            j3.q d2 = u51.e.d(3, (java.lang.String) null);
            v2.q2 q2Var = fz0.a.a;
            j3.q i6 = e1.k.i(d2, ((fz0.qux) nVar.j(q2Var)).u, u1.b.a(50));
            float f = 4;
            m1.y1 a = m1.x1.a(m1.h.g(f), j3.qux.k, nVar, 54);
            long j2 = nVar.T;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar.l();
            j3.q c2 = j3.bar.c(i6, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a, bVar, nVar);
            v2.f.A(l2, bVar2, nVar);
            h0.b.Y(i7, nVar, bVar3, nVar, aVar);
            v2.f.A(c2, bVar4, nVar);
            ap1.d dVar = quxVar.b;
            if (dVar instanceof yy0.qux) {
                nVar.Z(-845721016);
                my0.c.d(((yy0.qux) dVar).f, l51.e.b, m1.c.G(u51.e.d(3, (java.lang.String) null), f), false, null, nVar, 48, 24);
                nVar.p(false);
                z2 = true;
            } else if (dVar instanceof yy0.a) {
                nVar.Z(-845423447);
                j3.q o = m1.c2.o(m1.c.G(u51.e.d(3, (java.lang.String) null), f), 24);
                com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type type = quxVar.c;
                int i8 = com.truecaller.callui.presentation.ui.components.tooltip.bar.a[type.ordinal()];
                z2 = true;
                if (i8 != 1) {
                    if (i8 == 2) {
                        nVar.Z(8532733);
                        i3 = ((fz0.qux) nVar.j(q2Var)).w.b;
                        nVar.p(false);
                        r12 = 0;
                    } else {
                        nVar.Z(-415363807);
                        nVar.p(false);
                        throw new java.lang.IllegalStateException(("getTooltipIconRes called with unexpected type: " + type + ". Only SIGNAL and BATTERY are supported.").toString());
                    }
                } else {
                    nVar.Z(8412670);
                    i3 = ((fz0.qux) nVar.j(q2Var)).w.a;
                    r12 = 0;
                    nVar.p(false);
                }
                e1.k.c(qe0.i1.z(i3, r12, nVar), (java.lang.String) null, o, (j3.b) null, (h4.n) null, 0.0f, (q3.j) null, nVar, 56, 120);
                nVar.p((boolean) r12);
            } else {
                throw ro0.f.G(1219642579, nVar, false);
            }
            boolean z3 = z2;
            j51.b.q.E("callUIPillViewText", m1.c.K(u51.e.d(3, (java.lang.String) null), 0.0f, 0.0f, 16, 0.0f, 11), quxVar.a, ((i51.a) nVar.j(i51.bar.a)).c, q3.r.e, (f5.i) null, 2, 1, 0, (f5.h) null, 0L, nVar, 14180358, 0, 3872);
            nVar.p(z3);
            nVar.p(z3);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new ww2.bar(quxVar, i, 18);
        }
    }
}
