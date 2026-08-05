package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class a implements nf3.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ a(e1.f2 f2Var, v2.t0 t0Var, v2.t0 t0Var2, java.util.List list, v2.c2 c2Var) {
        this.a = 9;
        this.b = f2Var;
        this.d = t0Var;
        this.e = t0Var2;
        this.c = list;
        this.f = c2Var;
    }

    private final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        int i;
        o3.t tVar = (o3.t) this.b;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.c;
        v2.t0 t0Var = (v2.t0) this.d;
        v2.t0 t0Var2 = (v2.t0) this.e;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.f;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (nVar.g(booleanValue)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        boolean z2 = true;
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            if ((intValue & 14) != 4) {
                z2 = false;
            }
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            if (z2 || M == cVar) {
                M = new sm1.b(booleanValue, tVar, (df3.bar) null, 0);
                nVar.k0(M);
            }
            v2.f.h(bool, (kotlin.jvm.functions.Function2) M, nVar);
            if (booleanValue) {
                nVar.Z(-2013962506);
                java.lang.String str = (java.lang.String) t0Var.getValue();
                boolean f = nVar.f(function1);
                java.lang.Object M2 = nVar.M();
                if (f || M2 == cVar) {
                    M2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f0(function1, t0Var, 1);
                    nVar.k0(M2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) M2;
                boolean f2 = nVar.f(function1);
                java.lang.Object M3 = nVar.M();
                if (f2 || M3 == cVar) {
                    M3 = new ft0.b(function1, t0Var, 1);
                    nVar.k0(M3);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) M3;
                boolean f3 = nVar.f(function1);
                java.lang.Object M4 = nVar.M();
                if (f3 || M4 == cVar) {
                    M4 = new s1.c(t0Var2, function1, t0Var);
                    nVar.k0(M4);
                }
                sm1.bar.j(str, tVar, function12, function02, (kotlin.reflect.KFunction) M4, nVar, 48);
                nVar.p(false);
            } else {
                nVar.Z(-2013625164);
                d3.qux d = d3.a.d(-1739132570, new ky0.bar(25, function0), nVar);
                d3.qux d2 = d3.a.d(-104504035, new k02.a(t0Var2, 1), nVar);
                long j = q3.r.k;
                long j2 = q3.r.e;
                r2.r.d(sm1.bar.a, (j3.q) null, d, d2, 0.0f, (m1.o2) null, new r2.y8(j, j, j2, j2, j2, j2), (r2.c9) null, nVar, 3462, 178);
                nVar.p(false);
            }
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        v3.baz bazVar = (v3.baz) this.b;
        java.lang.String str = (java.lang.String) this.c;
        java.lang.String str2 = (java.lang.String) this.d;
        java.lang.String str3 = (java.lang.String) this.e;
        bx0.bar barVar = (bx0.bar) this.f;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            float f = 32;
            j3.q K = m1.c.K(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, f, 0.0f, 24, 5);
            m1.v a = m1.t.a(m1.h.c, j3.qux.n, nVar, 48);
            long j = nVar.T;
            int i = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(K, nVar);
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
            v2.f.t(nVar, java.lang.Integer.valueOf(i), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            e1.k.c(bazVar, (java.lang.String) null, m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), (j3.b) null, h4.m.d, 0.0f, (q3.j) null, nVar, 24632, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.API_FAILED_STATUS_CODE_VALUE);
            float f2 = 16;
            ye0.k.h(f2, nVar, 6);
            v2.q2 q2Var = y41.j.a;
            long j2 = ((y41.i) nVar.j(q2Var)).m().a;
            v2.q2 q2Var2 = i51.bar.a;
            r2.l8.b(str, (j3.q) null, j2, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, new f5.h(3), 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, ((i51.a) nVar.j(q2Var2)).m, nVar, 0, 0, 130042);
            ye0.k.h(8, nVar, 6);
            r2.l8.b(str2, m1.c.I(u51.e.d(3, (java.lang.String) null), f, 0.0f, 2), ((y41.i) nVar.j(q2Var)).m().b, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, new f5.h(3), 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, ((i51.a) nVar.j(q2Var2)).c, nVar, 0, 0, 130040);
            ye0.k.h(f2, nVar, 6);
            float f3 = 0;
            j51.b.e.v("button", (j3.q) null, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, com.truecaller.compose.ui.components.TrueButton.ButtonSize.SMALL, new m1.s1(f2, f3, f2, f3), false, str3, (v3.baz) null, (r2.n0) null, false, barVar, nVar, 27654, 0, 934);
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        int i;
        j3.q qVar = (j3.q) this.b;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.c;
        uq1.q qVar2 = (uq1.q) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.e;
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) this.f;
        m1.o1 o1Var = (m1.o1) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPadding");
        if ((intValue & 6) == 0) {
            if (nVar.f(o1Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i2 & 1, z)) {
            j3.q I = m1.c.I(m1.c.q(e1.k.i(m1.c2.d(qVar, 1.0f), ((y41.i) nVar.j(y41.j.a)).g().a, q3.a0.b), o1Var), 16, 0.0f, 2);
            boolean f = nVar.f(function0) | nVar.f(qVar2) | nVar.f(function1) | nVar.f(function12);
            java.lang.Object M = nVar.M();
            if (f || M == v2.k.a) {
                p1.q qVar3 = new p1.q(qVar2, function0, function1, function12, 11);
                nVar.k0(qVar3);
                M = qVar3;
            }
            i61.bar.f(I, (o1.r) null, o1Var, false, (m1.g) null, (j3.a) null, (i1.p1) null, false, (e1.f) null, (kotlin.jvm.functions.Function1) M, nVar, (i2 << 6) & 896, 506);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        boolean z2;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.b;
        java.lang.String str = (java.lang.String) this.c;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) this.e;
        java.lang.String str2 = (java.lang.String) this.f;
        v2.t0 t0Var = (v2.t0) this.d;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$DropdownMenu");
        boolean z3 = false;
        boolean z4 = true;
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            int i = 0;
            for (java.lang.Object obj4 : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    j3.q b = u51.e.b(j3.n.a, k9.d.q("dropdownMenuItem_", str), z4);
                    d3.qux d = d3.a.d(20672632, new zg2.qux((java.lang.String) obj4, 1), nVar);
                    boolean f = nVar.f(function2) | nVar.f(str2) | nVar.d(i);
                    java.lang.Object M = nVar.M();
                    if (f || M == v2.k.a) {
                        aa0.qux quxVar = new aa0.qux(function2, str2, i, t0Var, 4);
                        nVar.k0(quxVar);
                        M = quxVar;
                    }
                    boolean z5 = z4;
                    v2.n nVar2 = nVar;
                    r2.j.b(d, (kotlin.jvm.functions.Function0) M, b, (kotlin.jvm.functions.Function2) null, false, (r2.m3) null, (m1.o1) null, nVar2, 6, 504);
                    nVar = nVar2;
                    if (i < kotlin.collections.y.i(arrayList)) {
                        nVar.Z(-1033723240);
                        r2.h5.i((j3.q) null, z5 ? 1.0f : 0.0f, ((y41.i) nVar.j(y41.j.a)).g().d, nVar, 48, 1);
                        z2 = false;
                    } else {
                        z2 = false;
                        nVar.Z(-1037359974);
                    }
                    nVar.p(z2);
                    z4 = z5 ? 1 : 0;
                    z3 = z2;
                    i = i2;
                } else {
                    kotlin.collections.y.p();
                    throw null;
                }
            }
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.b;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.c;
        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) this.d;
        cl2.q qVar = (cl2.q) this.e;
        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) this.f;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((o1.qux) obj, "$this$item");
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            yk2.bar.e(function0, oj3.e.q(new j51.j1[]{new j51.j1(qk.b1.u(2132022651, nVar), function02, (java.lang.String) null, (java.lang.Integer) null, (q3.r) null, (java.lang.String) null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), new j51.j1(qk.b1.u(2132021595, nVar), function03, (java.lang.String) null, (java.lang.Integer) null, (q3.r) null, (java.lang.String) null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), new j51.j1(qk.b1.u(qVar.i.a, nVar), function04, (java.lang.String) null, (java.lang.Integer) null, (q3.r) null, (java.lang.String) null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)}), nVar, 0, 0);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        v2.n nVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        java.util.List list;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z14;
        float f;
        boolean z15;
        boolean z16;
        boolean z17;
        int i;
        kotlin.Unit unit;
        boolean z18;
        boolean z19;
        int i2 = this.a;
        int i3 = 4;
        java.lang.Object obj4 = v2.k.a;
        java.lang.Object obj5 = this.f;
        java.lang.Object obj6 = this.e;
        java.lang.Object obj7 = this.d;
        java.lang.Object obj8 = this.c;
        java.lang.Object obj9 = this.b;
        switch (i2) {
            case 0:
                e1.f2 f2Var = (e1.f2) obj9;
                final com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity = (com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity) obj8;
                v2.t0 t0Var = (v2.t0) obj7;
                final v2.t0 t0Var2 = (v2.t0) obj6;
                final v2.t0 t0Var3 = (v2.t0) obj5;
                m1.o1 o1Var = (m1.o1) obj;
                v2.n nVar2 = (v2.n) obj2;
                int intValue = ((java.lang.Integer) obj3).intValue();
                int i4 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPaddings");
                if ((intValue & 6) == 0) {
                    if (!nVar2.f(o1Var)) {
                        i3 = 2;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar2.P(intValue & 1, z)) {
                    j3.q I = m1.c.I(m1.c.F(e1.k.D(u51.e.d(3, (java.lang.String) null), f2Var, false, 14), o1Var), 16, 0.0f, 2);
                    m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
                    long j = nVar2.T;
                    int i5 = (int) (j ^ (j >>> 32));
                    v2.e1 l = nVar2.l();
                    j3.q c = j3.bar.c(I, nVar2);
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
                    v2.f.t(nVar2, java.lang.Integer.valueOf(i5), j4.d.j);
                    v2.f.x(j4.d.k, nVar2);
                    v2.f.A(c, j4.d.d, nVar2);
                    if (((com.truecaller.rewardprogram.impl.ui.qa.components.BonusTasksAlertDialogRequestKey) t0Var.getValue()) != null) {
                        nVar2.Z(-231553080);
                        com.truecaller.rewardprogram.impl.ui.qa.components.BonusTasksAlertDialogRequestKey bonusTasksAlertDialogRequestKey = (com.truecaller.rewardprogram.impl.ui.qa.components.BonusTasksAlertDialogRequestKey) t0Var.getValue();
                        kotlin.jvm.internal.Intrinsics.d(bonusTasksAlertDialogRequestKey);
                        boolean h = nVar2.h(rewardProgramQaActivity);
                        java.lang.Object M = nVar2.M();
                        if (h || M == obj4) {
                            M = new com.truecaller.rewardprogram.impl.ui.qa.baz(rewardProgramQaActivity, 2);
                            nVar2.k0(M);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) M;
                        java.lang.Object M2 = nVar2.M();
                        if (M2 == obj4) {
                            M2 = new a2.i(t0Var, 22);
                            nVar2.k0(M2);
                        }
                        hl2.b.a(bonusTasksAlertDialogRequestKey, function2, (kotlin.jvm.functions.Function0) M2, null, nVar2, 384);
                        nVar = nVar2;
                        z2 = false;
                    } else {
                        nVar = nVar2;
                        z2 = false;
                        nVar.Z(-235148956);
                    }
                    nVar.p(z2);
                    if (((java.lang.Boolean) t0Var2.getValue()).booleanValue()) {
                        nVar.Z(-230774515);
                        boolean h2 = nVar.h(rewardProgramQaActivity);
                        java.lang.Object M3 = nVar.M();
                        if (h2 || M3 == obj4) {
                            final int i6 = 0;
                            M3 = new kotlin.jvm.functions.Function2() { // from class: com.truecaller.rewardprogram.impl.ui.qa.b
                                public final java.lang.Object invoke(java.lang.Object obj10, java.lang.Object obj11) {
                                    int i7 = i6;
                                    v2.t0 t0Var4 = t0Var2;
                                    com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity2 = rewardProgramQaActivity;
                                    int intValue2 = ((java.lang.Integer) obj10).intValue();
                                    switch (i7) {
                                        case 0:
                                            com.truecaller.rewardprogram.impl.model.ContributionType contributionType = (com.truecaller.rewardprogram.impl.model.ContributionType) obj11;
                                            int i8 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contributionType, "contribution");
                                            com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity2.s0();
                                            s0.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contributionType, "contribution");
                                            s0.o("Claimed " + intValue2 + " " + contributionType + " contributions", new com.truecaller.rewardprogram.impl.ui.qa.h(intValue2, s0, contributionType, null, 0));
                                            t0Var4.setValue(java.lang.Boolean.FALSE);
                                            return kotlin.Unit.a;
                                        default:
                                            com.truecaller.rewardprogram.impl.data.model.RecurringTaskType recurringTaskType = (com.truecaller.rewardprogram.impl.data.model.RecurringTaskType) obj11;
                                            int i9 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringTaskType, "recurringTask");
                                            com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity2.s0();
                                            s02.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringTaskType, "recurringTask");
                                            s02.o("Collected " + intValue2 + " " + recurringTaskType + " daily tasks", new com.truecaller.rewardprogram.impl.ui.qa.h(intValue2, s02, recurringTaskType, null, 1));
                                            t0Var4.setValue(java.lang.Boolean.FALSE);
                                            return kotlin.Unit.a;
                                    }
                                }
                            };
                            nVar.k0(M3);
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) M3;
                        java.lang.Object M4 = nVar.M();
                        if (M4 == obj4) {
                            M4 = new a2.i(t0Var2, 23);
                            nVar.k0(M4);
                        }
                        hl2.b.c(48, null, (kotlin.jvm.functions.Function0) M4, function22, nVar);
                        z3 = false;
                    } else {
                        z3 = false;
                        nVar.Z(-235148956);
                    }
                    nVar.p(z3);
                    if (((java.lang.Boolean) t0Var3.getValue()).booleanValue()) {
                        nVar.Z(-230245562);
                        boolean h3 = nVar.h(rewardProgramQaActivity);
                        java.lang.Object M5 = nVar.M();
                        if (h3 || M5 == obj4) {
                            final int i7 = 1;
                            M5 = new kotlin.jvm.functions.Function2() { // from class: com.truecaller.rewardprogram.impl.ui.qa.b
                                public final java.lang.Object invoke(java.lang.Object obj10, java.lang.Object obj11) {
                                    int i72 = i7;
                                    v2.t0 t0Var4 = t0Var3;
                                    com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity2 = rewardProgramQaActivity;
                                    int intValue2 = ((java.lang.Integer) obj10).intValue();
                                    switch (i72) {
                                        case 0:
                                            com.truecaller.rewardprogram.impl.model.ContributionType contributionType = (com.truecaller.rewardprogram.impl.model.ContributionType) obj11;
                                            int i8 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contributionType, "contribution");
                                            com.truecaller.rewardprogram.impl.ui.qa.j s0 = rewardProgramQaActivity2.s0();
                                            s0.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contributionType, "contribution");
                                            s0.o("Claimed " + intValue2 + " " + contributionType + " contributions", new com.truecaller.rewardprogram.impl.ui.qa.h(intValue2, s0, contributionType, null, 0));
                                            t0Var4.setValue(java.lang.Boolean.FALSE);
                                            return kotlin.Unit.a;
                                        default:
                                            com.truecaller.rewardprogram.impl.data.model.RecurringTaskType recurringTaskType = (com.truecaller.rewardprogram.impl.data.model.RecurringTaskType) obj11;
                                            int i9 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringTaskType, "recurringTask");
                                            com.truecaller.rewardprogram.impl.ui.qa.j s02 = rewardProgramQaActivity2.s0();
                                            s02.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringTaskType, "recurringTask");
                                            s02.o("Collected " + intValue2 + " " + recurringTaskType + " daily tasks", new com.truecaller.rewardprogram.impl.ui.qa.h(intValue2, s02, recurringTaskType, null, 1));
                                            t0Var4.setValue(java.lang.Boolean.FALSE);
                                            return kotlin.Unit.a;
                                    }
                                }
                            };
                            nVar.k0(M5);
                        }
                        kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) M5;
                        java.lang.Object M6 = nVar.M();
                        if (M6 == obj4) {
                            M6 = new a2.i(t0Var3, 24);
                            nVar.k0(M6);
                        }
                        hl2.b.e(48, null, (kotlin.jvm.functions.Function0) M6, function23, nVar);
                        z4 = false;
                    } else {
                        z4 = false;
                        nVar.Z(-235148956);
                    }
                    nVar.p(z4);
                    hl2.b.f("Reset", null, d3.a.d(-1391155982, new com.truecaller.rewardprogram.impl.ui.qa.baz(rewardProgramQaActivity, 1), nVar), nVar, 390);
                    hl2.b.f("Claim points", null, d3.a.d(1017176091, new a32.i(rewardProgramQaActivity, t0Var, t0Var2, t0Var3, 10), nVar), nVar, 390);
                    nVar.p(true);
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
            case 1:
                ly0.a0 a0Var = (ly0.a0) obj9;
                ly0.w wVar = (ly0.w) obj8;
                uy0.p pVar = (uy0.p) obj7;
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj6;
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj5;
                cz0.i iVar = (cz0.i) obj;
                v2.n nVar3 = (v2.n) obj2;
                int intValue2 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "layoutDimensions");
                if ((intValue2 & 6) == 0) {
                    if (!nVar3.f(iVar)) {
                        i3 = 2;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (nVar3.P(intValue2 & 1, z5)) {
                    if (a0Var.a() == com.truecaller.callui.presentation.ui.ActiveBottomSheet.MORE_MENU) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    ok3.bar.b(z6, iVar.a, iVar.b, pVar, wVar instanceof ly0.i, function0, function02, nVar3, 0);
                } else {
                    nVar3.S();
                }
                return kotlin.Unit.a;
            case 2:
                java.util.List list2 = (java.util.List) obj9;
                java.util.List list3 = (java.util.List) obj8;
                v2.t0 t0Var4 = (v2.t0) obj7;
                v2.t0 t0Var5 = (v2.t0) obj6;
                v2.c2 c2Var = (v2.c2) obj5;
                v2.n nVar4 = (v2.n) obj2;
                int intValue3 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$DropdownMenu");
                if ((intValue3 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (nVar4.P(intValue3 & 1, z7)) {
                    int i8 = 0;
                    for (java.lang.Object obj10 : list2) {
                        int i9 = i8 + 1;
                        if (i8 >= 0) {
                            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                            float f2 = 16;
                            float f3 = 8;
                            m1.s1 s1Var = new m1.s1(f2, f3, f2, f3);
                            d3.qux d = d3.a.d(-483421104, new an1.j(i8, (java.lang.String) obj10, 2, (byte) 0), nVar4);
                            boolean h4 = nVar4.h(list3) | nVar4.d(i8);
                            java.lang.Object M7 = nVar4.M();
                            if (!h4 && M7 != obj4) {
                                list = list3;
                            } else {
                                list = list3;
                                M7 = new ee2.baz(list, i8, t0Var4, t0Var5, c2Var, 0);
                                nVar4.k0(M7);
                            }
                            r2.j.b(d, (kotlin.jvm.functions.Function0) M7, e, (kotlin.jvm.functions.Function2) null, false, (r2.m3) null, s1Var, nVar4, 12582918, 376);
                            i8 = i9;
                            list3 = list;
                        } else {
                            kotlin.collections.y.p();
                            throw null;
                        }
                    }
                } else {
                    nVar4.S();
                }
                return kotlin.Unit.a;
            case 3:
                h5.qux quxVar = (h5.qux) obj9;
                android.content.Context context = (android.content.Context) obj8;
                p23.f fVar = (p23.f) obj7;
                v2.c2 c2Var2 = (v2.c2) obj6;
                v2.c2 c2Var3 = (v2.c2) obj5;
                m1.s sVar = (m1.s) obj;
                v2.n nVar5 = (v2.n) obj2;
                int intValue4 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "$this$BoxWithConstraints");
                if ((intValue4 & 6) == 0) {
                    if (!nVar5.f(sVar)) {
                        i3 = 2;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & 19) != 18) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (nVar5.P(intValue4 & 1, z8)) {
                    kotlin.Pair n = ns.o.n(quxVar.m0(sVar.d()), quxVar.m0(sVar.c()), c2Var2.g(), c2Var3.g(), 1, true);
                    java.lang.Object obj11 = n.b;
                    java.lang.Number number = (java.lang.Number) n.a;
                    c2Var2.i(number.intValue());
                    java.lang.Number number2 = (java.lang.Number) obj11;
                    c2Var3.i(number2.intValue());
                    float floatValue = number.floatValue() / quxVar.d();
                    float floatValue2 = number2.floatValue() / quxVar.d();
                    boolean h5 = nVar5.h(context) | nVar5.h(fVar);
                    java.lang.Object M8 = nVar5.M();
                    if (h5 || M8 == obj4) {
                        M8 = new ei0.a(context, fVar, 0);
                        nVar5.k0(M8);
                    }
                    k5.g.b((kotlin.jvm.functions.Function1) M8, m1.c2.f(m1.c2.t(u51.e.d(3, (java.lang.String) null), floatValue), floatValue2), (kotlin.jvm.functions.Function1) null, nVar5, 0, 4);
                } else {
                    nVar5.S();
                }
                return kotlin.Unit.a;
            case 4:
                gh1.e eVar = (gh1.e) obj9;
                android.content.Context context2 = (android.content.Context) obj8;
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) obj7;
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) obj6;
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) obj5;
                m1.o1 o1Var2 = (m1.o1) obj;
                v2.n nVar6 = (v2.n) obj2;
                int intValue5 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var2, "padding");
                if ((intValue5 & 6) == 0) {
                    if (!nVar6.f(o1Var2)) {
                        i3 = 2;
                    }
                    intValue5 |= i3;
                }
                if ((intValue5 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (nVar6.P(intValue5 & 1, z9)) {
                    j3.q F = m1.c.F(u51.e.d(1, (java.lang.String) null), o1Var2);
                    v2.q2 q2Var = y41.j.a;
                    j3.q i10 = e1.k.i(F, ((y41.i) nVar6.j(q2Var)).g().a, q3.a0.b);
                    m1.v a2 = m1.t.a(m1.h.c, j3.qux.m, nVar6, 0);
                    long j2 = nVar6.T;
                    int i11 = (int) (j2 ^ (j2 >>> 32));
                    v2.e1 l2 = nVar6.l();
                    j3.q c2 = j3.bar.c(i10, nVar6);
                    j4.e.K9.getClass();
                    j4.c cVar2 = j4.d.b;
                    nVar6.d0();
                    if (nVar6.S) {
                        nVar6.k(cVar2);
                    } else {
                        nVar6.n0();
                    }
                    v2.f.A(a2, j4.d.g, nVar6);
                    v2.f.A(l2, j4.d.f, nVar6);
                    v2.f.t(nVar6, java.lang.Integer.valueOf(i11), j4.d.j);
                    v2.f.x(j4.d.k, nVar6);
                    v2.f.A(c2, j4.d.d, nVar6);
                    java.lang.Integer num = eVar.b;
                    boolean f4 = nVar6.f(eVar) | nVar6.h(context2) | nVar6.f(function03);
                    java.lang.Object M9 = nVar6.M();
                    if (f4 || M9 == obj4) {
                        f42.i1 i1Var = new f42.i1(eVar, context2, function03, (df3.bar) null, 7);
                        nVar6.k0(i1Var);
                        M9 = i1Var;
                    }
                    v2.f.h(num, (kotlin.jvm.functions.Function2) M9, nVar6);
                    j3.q d2 = u51.e.d(3, (java.lang.String) null);
                    if (1.0f <= 0.0d) {
                        n1.bar.a("invalid weight; must be greater than zero");
                    }
                    hh1.baz.c(2130969619, kotlin.collections.y.j(new hh1.bar[]{new hh1.bar(ye0.e0.N(2132020737, "Please be aware of the following when changing your phone number:", nVar6), ((y41.i) nVar6.j(q2Var)).b().b, 2131233553, kotlin.collections.y.j(new java.lang.String[]{ye0.e0.N(2132020735, "You will need to set up your Truecaller profile again with your new number.", nVar6), ye0.e0.N(2132020736, "You will need to re-verify your new number to maintain your Truecaller Premium or Gold status, if subscribed.", nVar6)})), new hh1.bar(ye0.e0.N(2132020731, "Before proceeding:", nVar6), ((y41.i) nVar6.j(q2Var)).m().a, 2131233361, kotlin.collections.y.j(new java.lang.String[]{ye0.e0.N(2132020729, "Ensure you back up any important data from Truecaller that you wish to keep.", nVar6), ye0.e0.N(2132020730, "Confirm that you can receive SMS or calls on your new number for the verification process.", nVar6)}))}), eVar.c, function1, os0.bar.s(1.0f, d2, true), nVar6, 0);
                    j51.b.e.v("button-confirm", m1.c.G(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), 16), (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, eVar.c, ye0.e0.N(2132020732, "Confirm", nVar6), (v3.baz) null, (r2.n0) null, false, function04, nVar6, 6, 0, 924);
                    nVar6.p(true);
                } else {
                    nVar6.S();
                }
                return kotlin.Unit.a;
            case 5:
                ie1.qux quxVar2 = (ie1.qux) obj9;
                kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) obj8;
                kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) obj7;
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) obj6;
                j3.q qVar = (j3.q) obj5;
                v2.n nVar7 = (v2.n) obj2;
                int intValue6 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$ModalBottomSheet");
                if ((intValue6 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar7.P(intValue6 & 1, z10)) {
                    kk3.m.s(quxVar2, function24, function25, function05, qVar, nVar7, 0);
                } else {
                    nVar7.S();
                }
                return kotlin.Unit.a;
            case 6:
                v2.t0 t0Var6 = (v2.t0) obj7;
                r2.k0 k0Var = (r2.k0) obj9;
                r2.d6 d6Var = k0Var.a;
                fg3.e0 e0Var = (fg3.e0) obj8;
                ie2.m mVar = ie2.m.a;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) obj6;
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) obj5;
                v2.n nVar8 = (v2.n) obj2;
                int intValue7 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$BottomSheetScaffold");
                if ((intValue7 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar8.P(intValue7 & 1, z11)) {
                    java.lang.Object value = t0Var6.getValue();
                    if (value == null) {
                        nVar8.Z(1460348315);
                        nVar8.p(false);
                    } else {
                        nVar8.Z(1460348316);
                        j3.q d3 = u51.e.d(3, (java.lang.String) null);
                        if (d6Var.c() == r2.e6.c) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean h6 = nVar8.h(e0Var) | nVar8.f(k0Var);
                        java.lang.Object M10 = nVar8.M();
                        if (h6 || M10 == obj4) {
                            M10 = new i7.qux(5, e0Var, k0Var);
                            nVar8.k0(M10);
                        }
                        j3.q q = e1.k.q(d3, z12, (java.lang.String) null, (r4.g) null, (kotlin.jvm.functions.Function0) M10, 14);
                        h4.a1 d4 = m1.n.d(j3.qux.a, false);
                        long j3 = nVar8.T;
                        int i12 = (int) (j3 ^ (j3 >>> 32));
                        v2.e1 l3 = nVar8.l();
                        j3.q c3 = j3.bar.c(q, nVar8);
                        j4.e.K9.getClass();
                        j4.c cVar3 = j4.d.b;
                        nVar8.d0();
                        if (nVar8.S) {
                            nVar8.k(cVar3);
                        } else {
                            nVar8.n0();
                        }
                        v2.f.A(d4, j4.d.g, nVar8);
                        v2.f.A(l3, j4.d.f, nVar8);
                        v2.f.t(nVar8, java.lang.Integer.valueOf(i12), j4.d.j);
                        v2.f.x(j4.d.k, nVar8);
                        v2.f.A(c3, j4.d.d, nVar8);
                        mVar.c((he2.baz) value, d6Var.c(), function12, function13, nVar8, 0);
                        nVar8.p(true);
                        nVar8.p(false);
                    }
                } else {
                    nVar8.S();
                }
                return kotlin.Unit.a;
            case 7:
                v3.baz bazVar = (v3.baz) obj9;
                java.lang.String str = (java.lang.String) obj8;
                java.lang.String str2 = (java.lang.String) obj7;
                com.truecaller.compose.ui.components.TrueButton.ButtonSize buttonSize = (com.truecaller.compose.ui.components.TrueButton.ButtonSize) obj6;
                u4.v0 v0Var = (u4.v0) obj5;
                v2.n nVar9 = (v2.n) obj2;
                int intValue8 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.z1) obj, "$this$BaseButton");
                if ((intValue8 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (nVar9.P(intValue8 & 1, z14)) {
                    if (bazVar == null) {
                        nVar9.Z(-373833077);
                        z15 = false;
                    } else {
                        nVar9.Z(-373833076);
                        j3.q d5 = u51.e.d(3, (java.lang.String) null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonSize, "size");
                        int i14 = j51.b0.a[buttonSize.ordinal()];
                        if (i14 == 1 || i14 == 2) {
                            f = 16;
                        } else {
                            if (i14 != 3) {
                                throw new java.lang.RuntimeException();
                            }
                            f = 24;
                        }
                        r2.d3.a(bazVar, str2, m1.c.G(m1.c2.o(d5, f), 1), 0L, nVar9, 8, 8);
                        if (!kotlin.text.StringsKt.X(str2)) {
                            nVar9.Z(794621837);
                            m1.c.h(m1.c2.t(u51.e.d(3, (java.lang.String) null), 8), nVar9);
                            z15 = false;
                        } else {
                            z15 = false;
                            nVar9.Z(782267128);
                        }
                        nVar9.p(z15);
                    }
                    nVar9.p(z15);
                    j51.b.e.i(3072, str, str2, j51.d.k(buttonSize, nVar9).f(v0Var), nVar9);
                } else {
                    nVar9.S();
                }
                return kotlin.Unit.a;
            case 8:
                r2.d6 d6Var2 = (r2.d6) obj9;
                jt0.c cVar4 = (jt0.c) obj8;
                o3.t tVar = (o3.t) obj7;
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) obj6;
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) obj5;
                v2.n nVar10 = (v2.n) obj2;
                int intValue9 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$ModalBottomSheet");
                if ((intValue9 & 17) != 16) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (nVar10.P(intValue9 & 1, z16)) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d6Var2.e());
                    boolean f5 = nVar10.f(d6Var2);
                    java.lang.Object M11 = nVar10.M();
                    if (f5 || M11 == obj4) {
                        M11 = new ft0.c(d6Var2, tVar, (df3.bar) null, 1);
                        nVar10.k0(M11);
                    }
                    v2.f.h(valueOf, (kotlin.jvm.functions.Function2) M11, nVar10);
                    jt0.bar.c(cVar4, tVar, function06, function14, nVar10, 48, 0);
                } else {
                    nVar10.S();
                }
                return kotlin.Unit.a;
            case 9:
                e1.f2 f2Var2 = (e1.f2) obj9;
                v2.t0 t0Var7 = (v2.t0) obj7;
                v2.t0 t0Var8 = (v2.t0) obj6;
                java.util.List list4 = (java.util.List) obj8;
                v2.c2 c2Var4 = (v2.c2) obj5;
                m1.o1 o1Var3 = (m1.o1) obj;
                v2.n nVar11 = (v2.n) obj2;
                int intValue10 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var3, "innerPaddings");
                if ((intValue10 & 6) == 0) {
                    if (!nVar11.f(o1Var3)) {
                        i3 = 2;
                    }
                    intValue10 |= i3;
                }
                if ((intValue10 & 19) != 18) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (nVar11.P(intValue10 & 1, z17)) {
                    j3.q F2 = m1.c.F(e1.k.D(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), f2Var2, false, 14), o1Var3);
                    j3.e eVar2 = j3.qux.n;
                    m1.b bVar = m1.h.c;
                    m1.v a3 = m1.t.a(bVar, eVar2, nVar11, 48);
                    long j4 = nVar11.T;
                    int i15 = (int) (j4 ^ (j4 >>> 32));
                    v2.e1 l4 = nVar11.l();
                    j3.q c4 = j3.bar.c(F2, nVar11);
                    j4.e.K9.getClass();
                    j4.c cVar5 = j4.d.b;
                    nVar11.d0();
                    if (nVar11.S) {
                        nVar11.k(cVar5);
                    } else {
                        nVar11.n0();
                    }
                    j4.b bVar2 = j4.d.g;
                    v2.f.A(a3, bVar2, nVar11);
                    j4.b bVar3 = j4.d.f;
                    v2.f.A(l4, bVar3, nVar11);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i15);
                    j4.b bVar4 = j4.d.j;
                    v2.f.t(nVar11, valueOf2, bVar4);
                    j4.a aVar = j4.d.k;
                    v2.f.x(aVar, nVar11);
                    j4.b bVar5 = j4.d.d;
                    v2.f.A(c4, bVar5, nVar11);
                    float f6 = 16;
                    m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f6), nVar11);
                    j3.e eVar3 = j3.qux.m;
                    m1.v a4 = m1.t.a(bVar, eVar3, nVar11, 0);
                    long j5 = nVar11.T;
                    int i16 = (int) (j5 ^ (j5 >>> 32));
                    v2.e1 l5 = nVar11.l();
                    j3.q c5 = j3.bar.c(j3.n.a, nVar11);
                    nVar11.d0();
                    if (nVar11.S) {
                        nVar11.k(cVar5);
                    } else {
                        nVar11.n0();
                    }
                    v2.f.A(a4, bVar2, nVar11);
                    v2.f.A(l5, bVar3, nVar11);
                    h0.b.Y(i16, nVar11, bVar4, nVar11, aVar);
                    v2.f.A(c5, bVar5, nVar11);
                    j3.q I2 = m1.c.I(m1.c2.e(u51.e.c(3, (java.lang.String) null, u51.e.d(3, (java.lang.String) null)), 1.0f), f6, 0.0f, 2);
                    java.lang.Object M12 = nVar11.M();
                    if (M12 == obj4) {
                        M12 = new p92.d(t0Var7, 1);
                        nVar11.k0(M12);
                    }
                    j3.q q2 = e1.k.q(I2, false, (java.lang.String) null, (r4.g) null, (kotlin.jvm.functions.Function0) M12, 15);
                    m1.v a5 = m1.t.a(bVar, eVar3, nVar11, 0);
                    long j6 = nVar11.T;
                    int i17 = (int) (j6 ^ (j6 >>> 32));
                    v2.e1 l6 = nVar11.l();
                    j3.q c6 = j3.bar.c(q2, nVar11);
                    nVar11.d0();
                    if (nVar11.S) {
                        nVar11.k(cVar5);
                    } else {
                        nVar11.n0();
                    }
                    v2.f.A(a5, bVar2, nVar11);
                    v2.f.A(l6, bVar3, nVar11);
                    h0.b.Y(i17, nVar11, bVar4, nVar11, aVar);
                    v2.f.A(c6, bVar5, nVar11);
                    j3.q e2 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    java.lang.String str3 = (java.lang.String) t0Var8.getValue();
                    if (str3 == null) {
                        str3 = "Select a Launch Context";
                    }
                    java.lang.String str4 = str3;
                    java.lang.Object M13 = nVar11.M();
                    if (M13 == obj4) {
                        M13 = new p02.e0(29);
                        nVar11.k0(M13);
                    }
                    r2.u4.a(str4, (kotlin.jvm.functions.Function1) M13, e2, false, true, (u4.v0) null, pf2.baz.b, (kotlin.jvm.functions.Function2) null, pf2.baz.c, (kotlin.jvm.functions.Function2) null, (y42.m) null, (v1.r0) null, (v1.q0) null, false, 0, 0, (q3.q0) null, (r2.v7) null, nVar11, 806906928, 0, 8388000);
                    nVar11.p(true);
                    boolean booleanValue = ((java.lang.Boolean) t0Var7.getValue()).booleanValue();
                    java.lang.Object M14 = nVar11.M();
                    if (M14 == obj4) {
                        i = 2;
                        M14 = new p92.d(t0Var7, 2);
                        nVar11.k0(M14);
                    } else {
                        i = 2;
                    }
                    r2.j.a(booleanValue, (kotlin.jvm.functions.Function0) M14, m1.c.I(m1.c2.e(u51.e.d(3, (java.lang.String) null), 0.9f), f6, 0.0f, i), 0L, (e1.f2) null, (l5.z) null, (q3.q0) null, 0L, 0.0f, 0.0f, d3.a.d(-1689848619, new com.truecaller.voicemail.presentation.deactivate.i(list4, t0Var8, t0Var7, c2Var4, 15), nVar11), nVar11, 48, 2040);
                    nVar11.p(true);
                    float f7 = 32;
                    m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f7), nVar11);
                    j51.b bVar6 = j51.b.q;
                    v2.q2 q2Var2 = i51.bar.a;
                    u4.v0 v0Var2 = ((i51.a) nVar11.j(q2Var2)).i;
                    v2.q2 q2Var3 = y41.j.a;
                    bVar6.E("CatalogPreviewTitle", (j3.q) null, "Catalog Preview", v0Var2, ((y41.i) nVar11.j(q2Var3)).m().a, (f5.i) null, 2, 0, 0, (f5.h) null, 0L, nVar11, 1573254, 0, 4002);
                    m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f6), nVar11);
                    java.lang.String str5 = (java.lang.String) t0Var8.getValue();
                    if (str5 == null) {
                        nVar11.Z(191941164);
                        nVar11.p(false);
                        unit = null;
                    } else {
                        nVar11.Z(191941165);
                        nVar11.W(724632465, java.lang.Integer.valueOf(c2Var4.g()));
                        od.p.e(new m82.i(str5), m1.c.I(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f6, 0.0f, 2), (kotlin.jvm.functions.Function1) null, false, false, nVar11, 0, 28);
                        nVar11.p(false);
                        kotlin.Unit unit2 = kotlin.Unit.a;
                        nVar11.p(false);
                        unit = kotlin.Unit.a;
                    }
                    if (unit == null) {
                        nVar11.Z(192360812);
                        bVar6.E("SelectPrompt", (j3.q) null, "Please select a launch context to preview the catalog", ((i51.a) nVar11.j(q2Var2)).e, ((y41.i) nVar11.j(q2Var3)).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar11, 390, 0, 4066);
                        kotlin.Unit unit3 = kotlin.Unit.a;
                        nVar11.p(false);
                    } else {
                        nVar11.Z(-1517829354);
                        nVar11.p(false);
                    }
                    m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f7), nVar11);
                    nVar11.p(true);
                } else {
                    nVar11.S();
                }
                return kotlin.Unit.a;
            case 10:
                nv0.bar barVar = (nv0.bar) obj9;
                com.truecaller.abtest.confidence.Variant variant = (com.truecaller.abtest.confidence.Variant) obj8;
                kotlin.jvm.functions.Function2 function26 = (kotlin.jvm.functions.Function2) obj7;
                kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) obj6;
                kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) obj5;
                v2.n nVar12 = (v2.n) obj2;
                int intValue11 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$ModalBottomSheet");
                if ((intValue11 & 17) != 16) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (nVar12.P(intValue11 & 1, z18)) {
                    nVar12.Z(1708827425);
                    int i18 = pv0.c.a[variant.ordinal()];
                    if (i18 != 1) {
                        if (i18 != 2) {
                            nVar12.Z(1710000248);
                            nVar12.p(false);
                        } else {
                            nVar12.Z(1709441907);
                            boolean f8 = nVar12.f(function26) | nVar12.h(barVar);
                            java.lang.Object M15 = nVar12.M();
                            if (f8 || M15 == obj4) {
                                M15 = new pv0.baz(function26, barVar, 0);
                                nVar12.k0(M15);
                            }
                            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) M15;
                            boolean f9 = nVar12.f(function15) | nVar12.h(barVar);
                            java.lang.Object M16 = nVar12.M();
                            if (f9 || M16 == obj4) {
                                M16 = new pv0.qux(function15, barVar, 0);
                                nVar12.k0(M16);
                            }
                            zv0.bar.b(function08, (kotlin.jvm.functions.Function0) M16, function07, nVar12, 0);
                            nVar12.p(false);
                        }
                    } else {
                        nVar12.Z(1708860657);
                        boolean f10 = nVar12.f(function26) | nVar12.h(barVar);
                        java.lang.Object M17 = nVar12.M();
                        if (f10 || M17 == obj4) {
                            M17 = new pv0.baz(function26, barVar, 1);
                            nVar12.k0(M17);
                        }
                        kotlin.jvm.functions.Function0 function09 = (kotlin.jvm.functions.Function0) M17;
                        boolean f11 = nVar12.f(function15) | nVar12.h(barVar);
                        java.lang.Object M18 = nVar12.M();
                        if (f11 || M18 == obj4) {
                            M18 = new pv0.qux(function15, barVar, 1);
                            nVar12.k0(M18);
                        }
                        zv0.bar.c(function09, (kotlin.jvm.functions.Function0) M18, function07, nVar12, 0);
                        nVar12.p(false);
                    }
                    nVar12.p(false);
                } else {
                    nVar12.S();
                }
                return kotlin.Unit.a;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                zf3.baz bazVar2 = (zf3.baz) obj9;
                go2.r rVar = (go2.r) obj8;
                kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) obj7;
                fg3.e0 e0Var2 = (fg3.e0) obj6;
                r2.d6 d6Var3 = (r2.d6) obj5;
                v2.n nVar13 = (v2.n) obj2;
                int intValue12 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$CommonBottomSheet");
                if ((intValue12 & 17) != 16) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (nVar13.P(intValue12 & 1, z19)) {
                    int Y = kotlin.collections.CollectionsKt.Y(rVar.j, bazVar2);
                    if (Y < 0) {
                        Y = 0;
                    }
                    boolean f12 = nVar13.f(bazVar2);
                    java.lang.Object M19 = nVar13.M();
                    if (f12 || M19 == obj4) {
                        M19 = new do2.i(4, bazVar2);
                        nVar13.k0(M19);
                    }
                    r1.baz b = r1.x.b(Y, 0, 2, (kotlin.jvm.functions.Function0) M19, nVar13);
                    boolean f14 = nVar13.f(function16) | nVar13.f(bazVar2) | nVar13.f(b);
                    java.lang.Object M20 = nVar13.M();
                    if (f14 || M20 == obj4) {
                        M20 = new rd.a(function16, bazVar2, b, 16);
                        nVar13.k0(M20);
                    }
                    ao2.bar.e(null, rVar.u, d3.a.d(-1885696376, new ps0.bar(rVar, e0Var2, d6Var3, androidx.compose.runtime.a.m((kotlin.jvm.functions.Function0) M20, nVar13), 14), nVar13), null, null, null, 0, 0L, 0L, d3.a.d(-1383555886, new ve2.i(4, b, bazVar2), nVar13), nVar13, 805306752, 505);
                } else {
                    nVar13.S();
                }
                return kotlin.Unit.a;
            case 14:
                return c(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            default:
                ((java.lang.Integer) obj3).getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
                zm1.bar.b((java.lang.String) obj9, (java.lang.String) obj8, (java.lang.String) obj7, (kotlin.jvm.functions.Function0) obj6, (j3.q) null, (java.lang.String) obj5, (v2.n) obj2, 0);
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ a(java.util.ArrayList arrayList, java.lang.String str, kotlin.jvm.functions.Function2 function2, java.lang.String str2, v2.t0 t0Var) {
        this.a = 15;
        this.b = arrayList;
        this.c = str;
        this.e = function2;
        this.f = str2;
        this.d = t0Var;
    }

    public /* synthetic */ a(v2.t0 t0Var, r2.k0 k0Var, fg3.e0 e0Var, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        this.a = 6;
        this.d = t0Var;
        this.b = k0Var;
        this.c = e0Var;
        this.e = function1;
        this.f = function12;
    }
}
