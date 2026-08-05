package com.truecaller.premium.ui.bottomsheet.qa;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/premium/ui/bottomsheet/qa/PremiumBottomSheetQaActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "shouldShowExternalModalBS", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumBottomSheetQaActivity extends com.truecaller.premium.ui.bottomsheet.qa.Hilt_PremiumBottomSheetQaActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.bottomsheet.qa.Hilt_PremiumBottomSheetQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(10873181, new je2.baz(this, 0), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0264, code lost:
    
        if (r2 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final nf3.i iVar, v2.n nVar, int i) {
        int i2;
        boolean z;
        nf3.i iVar2;
        v2.t0 t0Var;
        boolean z2;
        java.lang.Object obj;
        boolean z3;
        java.lang.Object M;
        boolean h;
        java.lang.Object obj2;
        boolean z4;
        java.lang.Object M2;
        int i3;
        int i4;
        final com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity premiumBottomSheetQaActivity = this;
        v2.n nVar2 = nVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "launchBottomSheet");
        nVar2.b0(468243497);
        if ((i & 6) == 0) {
            if (nVar2.h(iVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (nVar2.h(premiumBottomSheetQaActivity)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i5 & 1, z)) {
            java.lang.Object M3 = nVar2.M();
            java.lang.Object obj3 = v2.k.a;
            if (M3 == obj3) {
                M3 = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar2.k0(M3);
            }
            v2.t0 t0Var2 = (v2.t0) M3;
            j3.q H = m1.c.H(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), 40, 100);
            m1.v a = m1.t.a(m1.h.g(20), j3.qux.n, nVar2, 54);
            long j = nVar2.T;
            int i6 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c = j3.bar.c(H, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(a, j4.d.g, nVar2);
            v2.f.A(l, j4.d.f, nVar2);
            v2.f.t(nVar2, java.lang.Integer.valueOf(i6), j4.d.j);
            v2.f.x(j4.d.k, nVar2);
            v2.f.A(c, j4.d.d, nVar2);
            j51.b bVar = j51.b.e;
            com.truecaller.compose.ui.components.TrueButton.ButtonStyleSecondary buttonStyleSecondary = com.truecaller.compose.ui.components.TrueButton.ButtonStyleSecondary.SECONDARY_FILLED;
            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            boolean h2 = nVar2.h(premiumBottomSheetQaActivity);
            java.lang.Object M4 = nVar2.M();
            if (h2 || M4 == obj3) {
                final int i7 = 0;
                M4 = new kotlin.jvm.functions.Function0(premiumBottomSheetQaActivity) { // from class: je2.qux
                    public final /* synthetic */ com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity b;

                    {
                        this.b = premiumBottomSheetQaActivity;
                    }

                    public final java.lang.Object invoke() {
                        int i8 = i7;
                        androidx.activity.ComponentActivity componentActivity = this.b;
                        switch (i8) {
                            case 0:
                                int i9 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                android.widget.Toast.makeText(componentActivity.getApplicationContext(), "Heelloo", 0).show();
                                return kotlin.Unit.a;
                            default:
                                int i10 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                ie2.bar.c(componentActivity, i82.r.w8.getName(), new hl2.f(22));
                                return kotlin.Unit.a;
                        }
                    }
                };
                nVar2.k0(M4);
            }
            bVar.A("BottomSheetQATestInteraction", e, buttonStyleSecondary, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Test interaction", false, (v3.baz) null, (u4.v0) null, (kotlin.jvm.functions.Function0) M4, nVar2, 1573248, 0, 1976);
            j3.q e2 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            java.lang.Object M5 = nVar2.M();
            if (M5 == obj3) {
                t0Var = t0Var2;
                M5 = new fj1.f(t0Var, 10);
                nVar2.k0(M5);
            } else {
                t0Var = t0Var2;
            }
            v2.t0 t0Var3 = t0Var;
            bVar.A("BottomSheetQALaunchExternalModalBS", e2, buttonStyleSecondary, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "Launch external modal bottom sheet", false, (v3.baz) null, (u4.v0) null, (kotlin.jvm.functions.Function0) M5, nVar2, 1573248, 48, 1976);
            j51.b bVar2 = j51.b.q;
            bVar2.E("BottomSheetQACollapsibleAndNonCollapsibleSection", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), "Collapsible and non-collapsible screens", (u4.v0) null, 0L, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 384, 0, 4088);
            j3.q e3 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            int i8 = i5 & 14;
            if (i8 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            java.lang.Object M6 = nVar.M();
            if (!z2) {
                obj = obj3;
                if (M6 != obj) {
                    java.lang.Object obj4 = obj;
                    bVar.v("BottomSheetQAPREMIUM_TAB_INTERSTITIAL", e3, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "PREMIUM_TAB_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M6, nVar, 1572864, 0, 956);
                    j3.q e4 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    if (i8 != 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    M = nVar.M();
                    if (!z3 || M == obj4) {
                        final int i9 = 1;
                        M = new kotlin.jvm.functions.Function0() { // from class: je2.a
                            public final java.lang.Object invoke() {
                                int i10 = i9;
                                nf3.i iVar3 = iVar;
                                switch (i10) {
                                    case 0:
                                        int i11 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                        iVar3.invoke(i82.r.Z8.getName(), new jd.j0(28), java.lang.Boolean.FALSE);
                                        return kotlin.Unit.a;
                                    default:
                                        int i13 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                        iVar3.invoke(i82.r.A9.getName(), new jd.j0(29), java.lang.Boolean.FALSE);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar.k0(M);
                    }
                    bVar.v("BottomSheetQAWHO_VIEWED_ME_INTERSTITIAL", e4, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "WHO_VIEWED_ME_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M, nVar, 1572864, 0, 956);
                    bVar2.E("BottomSheetQAModal-only Section", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), "Modal-only screens", (u4.v0) null, 0L, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 384, 0, 4088);
                    nVar2 = nVar;
                    j3.q e5 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    premiumBottomSheetQaActivity = this;
                    h = nVar2.h(premiumBottomSheetQaActivity);
                    java.lang.Object M7 = nVar2.M();
                    if (h) {
                        obj2 = obj4;
                    } else {
                        obj2 = obj4;
                    }
                    final int i10 = 1;
                    M7 = new kotlin.jvm.functions.Function0(premiumBottomSheetQaActivity) { // from class: je2.qux
                        public final /* synthetic */ com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity b;

                        {
                            this.b = premiumBottomSheetQaActivity;
                        }

                        public final java.lang.Object invoke() {
                            int i82 = i10;
                            androidx.activity.ComponentActivity componentActivity = this.b;
                            switch (i82) {
                                case 0:
                                    int i93 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                    android.widget.Toast.makeText(componentActivity.getApplicationContext(), "Heelloo", 0).show();
                                    return kotlin.Unit.a;
                                default:
                                    int i102 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                                    ie2.bar.c(componentActivity, i82.r.w8.getName(), new hl2.f(22));
                                    return kotlin.Unit.a;
                            }
                        }
                    };
                    nVar2.k0(M7);
                    bVar.v("BottomSheetQACONTACT_REQUEST_INTERSTITIAL", e5, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "CONTACT_REQUEST_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M7, nVar2, 1572864, 0, 956);
                    nVar2.p(true);
                    if (!((java.lang.Boolean) t0Var3.getValue()).booleanValue()) {
                        nVar2.Z(-609043051);
                        java.lang.Object M8 = nVar2.M();
                        if (M8 == obj2) {
                            M8 = new fj1.f(t0Var3, 11);
                            nVar2.k0(M8);
                        }
                        r2.d4.a((kotlin.jvm.functions.Function0) M8, (j3.q) null, (r2.d6) null, 0.0f, false, (q3.q0) null, 0L, 0L, 0.0f, 0L, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (r2.e4) null, je2.bar.a, nVar, 6, 3072, 8190);
                        nVar2 = nVar;
                        z4 = false;
                    } else {
                        z4 = false;
                        nVar2.Z(-613971431);
                    }
                    nVar2.p(z4);
                    java.lang.String name = i82.r.A9.getName();
                    M2 = nVar2.M();
                    if (M2 == obj2) {
                        M2 = new jd.j0(27);
                        nVar2.k0(M2);
                    }
                    iVar2 = iVar;
                    iVar2.invoke(name, (kotlin.jvm.functions.Function0) M2, java.lang.Boolean.FALSE);
                }
            } else {
                obj = obj3;
            }
            final int i11 = 0;
            M6 = new kotlin.jvm.functions.Function0() { // from class: je2.a
                public final java.lang.Object invoke() {
                    int i102 = i11;
                    nf3.i iVar3 = iVar;
                    switch (i102) {
                        case 0:
                            int i112 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            iVar3.invoke(i82.r.Z8.getName(), new jd.j0(28), java.lang.Boolean.FALSE);
                            return kotlin.Unit.a;
                        default:
                            int i13 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            iVar3.invoke(i82.r.A9.getName(), new jd.j0(29), java.lang.Boolean.FALSE);
                            return kotlin.Unit.a;
                    }
                }
            };
            nVar.k0(M6);
            java.lang.Object obj42 = obj;
            bVar.v("BottomSheetQAPREMIUM_TAB_INTERSTITIAL", e3, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "PREMIUM_TAB_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M6, nVar, 1572864, 0, 956);
            j3.q e43 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            if (i8 != 4) {
            }
            M = nVar.M();
            if (!z3) {
            }
            final int i93 = 1;
            M = new kotlin.jvm.functions.Function0() { // from class: je2.a
                public final java.lang.Object invoke() {
                    int i102 = i93;
                    nf3.i iVar3 = iVar;
                    switch (i102) {
                        case 0:
                            int i112 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            iVar3.invoke(i82.r.Z8.getName(), new jd.j0(28), java.lang.Boolean.FALSE);
                            return kotlin.Unit.a;
                        default:
                            int i13 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            iVar3.invoke(i82.r.A9.getName(), new jd.j0(29), java.lang.Boolean.FALSE);
                            return kotlin.Unit.a;
                    }
                }
            };
            nVar.k0(M);
            bVar.v("BottomSheetQAWHO_VIEWED_ME_INTERSTITIAL", e43, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "WHO_VIEWED_ME_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M, nVar, 1572864, 0, 956);
            bVar2.E("BottomSheetQAModal-only Section", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), "Modal-only screens", (u4.v0) null, 0L, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 384, 0, 4088);
            nVar2 = nVar;
            j3.q e53 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            premiumBottomSheetQaActivity = this;
            h = nVar2.h(premiumBottomSheetQaActivity);
            java.lang.Object M72 = nVar2.M();
            if (h) {
            }
            final int i102 = 1;
            M72 = new kotlin.jvm.functions.Function0(premiumBottomSheetQaActivity) { // from class: je2.qux
                public final /* synthetic */ com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity b;

                {
                    this.b = premiumBottomSheetQaActivity;
                }

                public final java.lang.Object invoke() {
                    int i82 = i102;
                    androidx.activity.ComponentActivity componentActivity = this.b;
                    switch (i82) {
                        case 0:
                            int i932 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            android.widget.Toast.makeText(componentActivity.getApplicationContext(), "Heelloo", 0).show();
                            return kotlin.Unit.a;
                        default:
                            int i1022 = com.truecaller.premium.ui.bottomsheet.qa.PremiumBottomSheetQaActivity.d0;
                            ie2.bar.c(componentActivity, i82.r.w8.getName(), new hl2.f(22));
                            return kotlin.Unit.a;
                    }
                }
            };
            nVar2.k0(M72);
            bVar.v("BottomSheetQACONTACT_REQUEST_INTERSTITIAL", e53, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, "CONTACT_REQUEST_INTERSTITIAL", (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M72, nVar2, 1572864, 0, 956);
            nVar2.p(true);
            if (!((java.lang.Boolean) t0Var3.getValue()).booleanValue()) {
            }
            nVar2.p(z4);
            java.lang.String name2 = i82.r.A9.getName();
            M2 = nVar2.M();
            if (M2 == obj2) {
            }
            iVar2 = iVar;
            iVar2.invoke(name2, (kotlin.jvm.functions.Function0) M2, java.lang.Boolean.FALSE);
        } else {
            iVar2 = iVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new a03.qux(premiumBottomSheetQaActivity, iVar2, i, 21);
        }
    }
}
