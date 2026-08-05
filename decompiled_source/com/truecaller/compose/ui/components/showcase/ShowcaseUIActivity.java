package com.truecaller.compose.ui.components.showcase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/compose/ui/components/showcase/ShowcaseUIActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "isLightTheme", "", "selectedDestination", "Lz51/bar;", "alertInfo", "compose-ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ShowcaseUIActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int a0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        dx2.bar barVar = dx2.bar.a;
        dx2.bar.c(0, this, 0);
        setTheme(2132084058);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        yy.qux.B(this, true, ex2.a.a);
        e.d.a(this, new d3.qux(-1506516903, new ww2.bar(this, 19), true));
    }

    public final void s0(m1.o1 o1Var, v2.n nVar, int i) {
        int i2;
        boolean z;
        v2.p2 p2Var;
        v2.p2 p2Var2;
        java.lang.Object obj;
        boolean z2;
        boolean z3;
        int i3;
        v2.n nVar2 = nVar;
        nVar2.b0(-829759790);
        if ((i & 6) == 0) {
            if (nVar2.f(o1Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i2 & 1, z)) {
            java.util.List j = kotlin.collections.y.j(new java.lang.String[]{"Colors", "Primary Buttons", "Secondary Buttons", "Badge", "Alerts"});
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object M = nVar2.M();
            java.lang.Object obj2 = v2.k.a;
            if (M == obj2) {
                M = new z41.a(18);
                nVar2.k0(M);
            }
            v2.c2 c2Var = (v2.c2) g3.g.e(objArr, (kotlin.jvm.functions.Function0) M, nVar2, 48);
            java.lang.Object M2 = nVar2.M();
            if (M2 == obj2) {
                M2 = androidx.compose.runtime.a.j(java.lang.Boolean.TRUE);
                nVar2.k0(M2);
            }
            v2.p2 p2Var3 = (v2.t0) M2;
            java.lang.Object M3 = nVar2.M();
            if (M3 == obj2) {
                M3 = androidx.compose.runtime.a.j((java.lang.Object) null);
                nVar2.k0(M3);
            }
            v2.p2 p2Var4 = (v2.t0) M3;
            j3.q k = uf.qux.k((java.lang.String) null, 3, 1.0f, o1Var);
            v2.q2 q2Var = y41.j.a;
            j3.q i4 = e1.k.i(k, ((y41.i) nVar2.j(q2Var)).g().a, q3.a0.b);
            m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
            long j2 = nVar2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c = j3.bar.c(i4, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(a, bVar, nVar2);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i5);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar2, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar2);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar2);
            r2.h5.o(c2Var.g(), (j3.q) null, ((y41.i) nVar2.j(q2Var)).g().a, ((y41.i) nVar2.j(q2Var)).m().a, 16, (nf3.i) null, (kotlin.jvm.functions.Function2) null, d3.a.d(337610920, new xy1.a1(9, j, c2Var), nVar), nVar, 12607488);
            nVar2 = nVar;
            int g = c2Var.g();
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        if (g != 3) {
                            if (g != 4) {
                                nVar2.Z(-1659627954);
                                z2 = false;
                                h4.a1 d = m1.n.d(j3.qux.a, false);
                                long j3 = nVar2.T;
                                int i6 = (int) (j3 ^ (j3 >>> 32));
                                v2.e1 l2 = nVar2.l();
                                j3.q c2 = j3.bar.c(j3.n.a, nVar2);
                                nVar2.d0();
                                if (nVar2.S) {
                                    nVar2.k(cVar);
                                } else {
                                    nVar2.n0();
                                }
                                v2.f.A(d, bVar, nVar2);
                                v2.f.A(l2, bVar2, nVar2);
                                h0.b.Y(i6, nVar2, bVar3, nVar2, aVar);
                                v2.f.A(c2, bVar4, nVar2);
                                nVar2.p(true);
                                nVar2.p(false);
                                kotlin.Unit unit = kotlin.Unit.a;
                                p2Var = p2Var4;
                                p2Var2 = p2Var3;
                                obj = obj2;
                            } else {
                                z2 = false;
                                nVar2.Z(-1659637627);
                                java.lang.Object M4 = nVar2.M();
                                obj = obj2;
                                if (M4 == obj) {
                                    p2Var = p2Var4;
                                    p2Var2 = p2Var3;
                                    M4 = new hl2.d(p2Var2, p2Var, 4);
                                    nVar2.k0(M4);
                                } else {
                                    p2Var = p2Var4;
                                    p2Var2 = p2Var3;
                                }
                                z51.baz.a((kotlin.jvm.functions.Function2) M4, nVar2, 6);
                                nVar2.p(false);
                                kotlin.Unit unit2 = kotlin.Unit.a;
                            }
                        } else {
                            p2Var = p2Var4;
                            p2Var2 = p2Var3;
                            obj = obj2;
                            z2 = false;
                            nVar2.Z(-1659647452);
                            java.lang.Object M5 = nVar2.M();
                            if (M5 == obj) {
                                M5 = new hl2.d(p2Var2, p2Var, 3);
                                nVar2.k0(M5);
                            }
                            z51.baz.b((kotlin.jvm.functions.Function2) M5, nVar2, 6);
                            nVar2.p(false);
                            kotlin.Unit unit3 = kotlin.Unit.a;
                        }
                    } else {
                        p2Var = p2Var4;
                        p2Var2 = p2Var3;
                        obj = obj2;
                        z2 = false;
                        nVar2.Z(-1659657586);
                        java.lang.Object M6 = nVar2.M();
                        if (M6 == obj) {
                            M6 = new hl2.d(p2Var2, p2Var, 2);
                            nVar2.k0(M6);
                        }
                        z51.baz.d((kotlin.jvm.functions.Function2) M6, nVar2, 6);
                        nVar2.p(false);
                        kotlin.Unit unit4 = kotlin.Unit.a;
                    }
                } else {
                    p2Var = p2Var4;
                    p2Var2 = p2Var3;
                    obj = obj2;
                    z2 = false;
                    nVar2.Z(-1659667668);
                    java.lang.Object M7 = nVar2.M();
                    if (M7 == obj) {
                        M7 = new hl2.d(p2Var2, p2Var, 6);
                        nVar2.k0(M7);
                    }
                    z51.baz.c((kotlin.jvm.functions.Function2) M7, nVar2, 6);
                    nVar2.p(false);
                    kotlin.Unit unit5 = kotlin.Unit.a;
                }
            } else {
                p2Var = p2Var4;
                p2Var2 = p2Var3;
                obj = obj2;
                z2 = false;
                nVar2.Z(-1659677500);
                java.lang.Object M8 = nVar2.M();
                if (M8 == obj) {
                    M8 = new hl2.d(p2Var2, p2Var, 5);
                    nVar2.k0(M8);
                }
                z51.baz.f(null, (kotlin.jvm.functions.Function2) M8, nVar2, 48);
                nVar2.p(false);
                kotlin.Unit unit6 = kotlin.Unit.a;
            }
            nVar2.p(true);
            if (((java.lang.Boolean) p2Var2.getValue()).booleanValue()) {
                nVar2.Z(1464852814);
                z51.bar barVar = (z51.bar) p2Var.getValue();
                if (barVar == null) {
                    nVar2.Z(-1834203021);
                    nVar2.p(z2);
                    z3 = z2;
                } else {
                    nVar2.Z(-1834203020);
                    j51.m0 m0Var = j51.m0.a;
                    java.lang.String str = barVar.a;
                    java.lang.String str2 = barVar.b;
                    java.lang.Object M9 = nVar2.M();
                    if (M9 == obj) {
                        M9 = new xn2.v1(p2Var2, 6);
                        nVar2.k0(M9);
                    }
                    j51.l0 l0Var = new j51.l0("OK", z2, (kotlin.jvm.functions.Function0) M9);
                    java.lang.Object M10 = nVar2.M();
                    if (M10 == obj) {
                        M10 = new xn2.v1(p2Var2, 7);
                        nVar2.k0(M10);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) M10;
                    z3 = z2;
                    m0Var.e(function0, l0Var, null, 0L, str, str2, null, null, null, nVar2, 1572870, 396);
                    nVar2.p(z3);
                }
            } else {
                z3 = z2;
                nVar2.Z(-1840738192);
            }
            nVar2.p(z3);
        } else {
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new o90.d(this, o1Var, i, 27);
        }
    }
}
