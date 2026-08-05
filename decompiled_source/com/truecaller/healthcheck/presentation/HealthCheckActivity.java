package com.truecaller.healthcheck.presentation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/healthcheck/presentation/HealthCheckActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class HealthCheckActivity extends com.truecaller.healthcheck.presentation.Hilt_HealthCheckActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.healthcheck.presentation.Hilt_HealthCheckActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        d.m.b(this, (d.k0) null, 3);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(-1868809200, new uq1.c(this, 0), true));
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void s0(uq1.l lVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        uq1.l lVar2;
        a9.qux quxVar;
        final ?? r15;
        v2.n nVar2;
        uq1.l lVar3;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        v2.n nVar3;
        kotlin.Unit unit;
        final uq1.l lVar4;
        v2.n nVar4 = nVar;
        nVar4.b0(-2002567376);
        int i7 = i | 2;
        if (nVar4.h(function0)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i8 = i7 | i2;
        if (nVar4.h(function02)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i9 = i8 | i3;
        if (nVar4.h(function03)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (nVar4.h(function04)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (nVar4.P(i11 & 1, z)) {
            nVar4.U();
            if ((i & 1) != 0 && !nVar4.z()) {
                nVar4.S();
                i6 = i11 & (-15);
                r15 = 0;
                nVar2 = nVar4;
                lVar3 = lVar;
            } else {
                nVar4.a0(1890788296);
                androidx.lifecycle.n a = b9.bar.a(nVar4);
                if (a != null) {
                    xc3.c t = com.bumptech.glide.qux.t(a, nVar4);
                    nVar4.a0(1729797275);
                    if (a instanceof androidx.lifecycle.n) {
                        quxVar = a.getDefaultViewModelCreationExtras();
                    } else {
                        quxVar = a9.bar.b;
                    }
                    r15 = 0;
                    androidx.lifecycle.n1 K = df0.qux.K(uq1.l.class, a, (java.lang.String) null, t, quxVar, nVar4);
                    nVar2 = nVar4;
                    nVar2.p(false);
                    nVar2.p(false);
                    lVar3 = (uq1.l) K;
                    i6 = i11 & (-15);
                } else {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            nVar2.q();
            ig3.q1 q1Var = lVar3.m;
            androidx.lifecycle.s sVar = androidx.lifecycle.s.a;
            final int i13 = 5;
            v2.t0 r = mf0.o.r(q1Var, nVar2, 384, 5);
            kotlin.Unit unit2 = kotlin.Unit.a;
            boolean h = nVar2.h(lVar3);
            if ((i6 & 112) == 32) {
                z2 = true;
            } else {
                z2 = r15;
            }
            boolean z6 = h | z2;
            if ((i6 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = r15;
            }
            boolean z7 = z6 | z3;
            if ((57344 & i6) == 16384) {
                z4 = true;
            } else {
                z4 = r15;
            }
            boolean z8 = z7 | z4;
            if ((i6 & 896) == 256) {
                z5 = true;
            } else {
                z5 = r15;
            }
            boolean z9 = z5 | z8;
            java.lang.Object M = nVar2.M();
            v2.c cVar = v2.k.a;
            if (!z9 && M != cVar) {
                nVar3 = nVar2;
                lVar4 = lVar3;
                unit = unit2;
            } else {
                nVar3 = nVar;
                unit = unit2;
                s42.d0 d0Var = new s42.d0(lVar3, function0, function03, function04, function02, null, 9);
                lVar4 = lVar3;
                nVar3.k0(d0Var);
                M = d0Var;
            }
            v2.f.h(unit, (kotlin.jvm.functions.Function2) M, nVar3);
            boolean h2 = nVar3.h(lVar4);
            java.lang.Object M2 = nVar3.M();
            if (h2 || M2 == cVar) {
                final int i14 = 7;
                M2 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                    public final java.lang.Object invoke() {
                        java.lang.Object value;
                        java.lang.Object value2;
                        java.lang.Object value3;
                        int i15 = i14;
                        uq1.l lVar5 = lVar4;
                        switch (i15) {
                            case 0:
                                int i16 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                return kotlin.Unit.a;
                            case 1:
                                int i17 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                ig3.h2 h2Var = lVar5.i;
                                do {
                                    value = h2Var.getValue();
                                } while (!h2Var.n(value, (java.lang.Object) null));
                                return kotlin.Unit.a;
                            case 2:
                                int i18 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                return kotlin.Unit.a;
                            case 3:
                                int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                return kotlin.Unit.a;
                            case 4:
                                int i20 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                ig3.h2 h2Var2 = lVar5.i;
                                do {
                                    value2 = h2Var2.getValue();
                                } while (!h2Var2.n(value2, (java.lang.Object) null));
                                return kotlin.Unit.a;
                            case 5:
                                int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                ig3.h2 h2Var3 = lVar5.i;
                                do {
                                    value3 = h2Var3.getValue();
                                } while (!h2Var3.n(value3, (java.lang.Object) null));
                                return kotlin.Unit.a;
                            case 6:
                                int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                return kotlin.Unit.a;
                            case 7:
                                int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                return kotlin.Unit.a;
                            default:
                                int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                return kotlin.Unit.a;
                        }
                    }
                };
                nVar3.k0(M2);
            }
            final int i15 = 6;
            com.moloco.sdk.internal.publisher.b0.b(6, (int) r15, (kotlin.jvm.functions.Function0) M2, nVar3, true);
            uq1.s sVar2 = (uq1.s) r.getValue();
            if (sVar2 instanceof uq1.q) {
                nVar3.Z(-1387875725);
                uq1.q qVar = (uq1.q) sVar2;
                boolean h3 = nVar3.h(lVar4);
                java.lang.Object M3 = nVar3.M();
                if (h3 || M3 == cVar) {
                    final int i16 = 1;
                    M3 = new kotlin.jvm.functions.Function1() { // from class: uq1.d
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            int i17 = i16;
                            uq1.l lVar5 = lVar4;
                            uq1.b bVar = (uq1.b) obj;
                            switch (i17) {
                                case 0:
                                    int i18 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "it");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "checklistItem");
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), lVar5.c, (fg3.f0) null, new uq1.h(bVar, lVar5, null, 1), 2);
                                    return kotlin.Unit.a;
                                default:
                                    int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "it");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "checklistItem");
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.h(bVar, lVar5, null, 0), 3);
                                    return kotlin.Unit.a;
                            }
                        }
                    };
                    nVar3.k0(M3);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) M3;
                boolean h4 = nVar3.h(lVar4);
                java.lang.Object M4 = nVar3.M();
                if (h4 || M4 == cVar) {
                    M4 = new kotlin.jvm.functions.Function1() { // from class: uq1.d
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            int i17 = r15;
                            uq1.l lVar5 = lVar4;
                            uq1.b bVar = (uq1.b) obj;
                            switch (i17) {
                                case 0:
                                    int i18 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "it");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "checklistItem");
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), lVar5.c, (fg3.f0) null, new uq1.h(bVar, lVar5, null, 1), 2);
                                    return kotlin.Unit.a;
                                default:
                                    int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "it");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "checklistItem");
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.h(bVar, lVar5, null, 0), 3);
                                    return kotlin.Unit.a;
                            }
                        }
                    };
                    nVar3.k0(M4);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) M4;
                boolean h5 = nVar3.h(lVar4);
                java.lang.Object M5 = nVar3.M();
                if (h5 || M5 == cVar) {
                    M5 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                        public final java.lang.Object invoke() {
                            java.lang.Object value;
                            java.lang.Object value2;
                            java.lang.Object value3;
                            int i152 = r15;
                            uq1.l lVar5 = lVar4;
                            switch (i152) {
                                case 0:
                                    int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                    return kotlin.Unit.a;
                                case 1:
                                    int i17 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    ig3.h2 h2Var = lVar5.i;
                                    do {
                                        value = h2Var.getValue();
                                    } while (!h2Var.n(value, (java.lang.Object) null));
                                    return kotlin.Unit.a;
                                case 2:
                                    int i18 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                    return kotlin.Unit.a;
                                case 3:
                                    int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                    return kotlin.Unit.a;
                                case 4:
                                    int i20 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    ig3.h2 h2Var2 = lVar5.i;
                                    do {
                                        value2 = h2Var2.getValue();
                                    } while (!h2Var2.n(value2, (java.lang.Object) null));
                                    return kotlin.Unit.a;
                                case 5:
                                    int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    ig3.h2 h2Var3 = lVar5.i;
                                    do {
                                        value3 = h2Var3.getValue();
                                    } while (!h2Var3.n(value3, (java.lang.Object) null));
                                    return kotlin.Unit.a;
                                case 6:
                                    int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                    return kotlin.Unit.a;
                                case 7:
                                    int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                    return kotlin.Unit.a;
                                default:
                                    int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                    return kotlin.Unit.a;
                            }
                        }
                    };
                    nVar3.k0(M5);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) M5;
                nVar4 = nVar;
                xq1.qux.b(qVar, null, function1, function12, function05, nVar4, 0);
                uq1.p pVar = qVar.b;
                if (kotlin.jvm.internal.Intrinsics.b(pVar, uq1.o.c)) {
                    nVar4.Z(-1387459643);
                    boolean h6 = nVar4.h(lVar4);
                    java.lang.Object M6 = nVar4.M();
                    if (h6 || M6 == cVar) {
                        final int i17 = 1;
                        M6 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i17;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i18 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i20 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M6);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) M6;
                    boolean h7 = nVar4.h(lVar4);
                    java.lang.Object M7 = nVar4.M();
                    if (h7 || M7 == cVar) {
                        final int i18 = 2;
                        M7 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i18;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i19 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i20 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M7);
                    }
                    xq1.qux.j(r15, null, function06, (kotlin.jvm.functions.Function0) M7, nVar4);
                    nVar4.p((boolean) r15);
                } else if (kotlin.jvm.internal.Intrinsics.b(pVar, uq1.o.a)) {
                    nVar4.Z(-1387124657);
                    boolean h8 = nVar4.h(lVar4);
                    java.lang.Object M8 = nVar4.M();
                    if (h8 || M8 == cVar) {
                        final int i19 = 3;
                        M8 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i19;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i192 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i20 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M8);
                    }
                    kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) M8;
                    boolean h9 = nVar4.h(lVar4);
                    java.lang.Object M9 = nVar4.M();
                    if (h9 || M9 == cVar) {
                        final int i20 = 4;
                        M9 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i20;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i192 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i202 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M9);
                    }
                    xq1.qux.c(function07, (kotlin.jvm.functions.Function0) M9, nVar4, r15);
                    nVar4.p((boolean) r15);
                } else if (kotlin.jvm.internal.Intrinsics.b(pVar, uq1.o.b)) {
                    nVar4.Z(-1386791779);
                    boolean h10 = nVar4.h(lVar4);
                    java.lang.Object M10 = nVar4.M();
                    if (h10 || M10 == cVar) {
                        M10 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i13;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i192 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i202 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M10);
                    }
                    kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) M10;
                    boolean h11 = nVar4.h(lVar4);
                    java.lang.Object M11 = nVar4.M();
                    if (h11 || M11 == cVar) {
                        M11 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i15;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i192 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i202 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i21 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M11);
                    }
                    xq1.qux.h(null, function08, (kotlin.jvm.functions.Function0) M11, nVar, 0, 1);
                    nVar4 = nVar;
                    nVar4.p((boolean) r15);
                } else if (pVar == null) {
                    nVar4.Z(-321820332);
                    nVar4.p((boolean) r15);
                } else {
                    throw ro0.f.G(-321853889, nVar4, (boolean) r15);
                }
                nVar4.p((boolean) r15);
            } else {
                nVar4 = nVar3;
                if (kotlin.jvm.internal.Intrinsics.b(sVar2, uq1.r.a)) {
                    nVar4.Z(-321817134);
                    boolean h13 = nVar4.h(lVar4);
                    java.lang.Object M12 = nVar4.M();
                    if (h13 || M12 == cVar) {
                        final int i21 = 8;
                        M12 = new kotlin.jvm.functions.Function0() { // from class: uq1.e
                            public final java.lang.Object invoke() {
                                java.lang.Object value;
                                java.lang.Object value2;
                                java.lang.Object value3;
                                int i152 = i21;
                                uq1.l lVar5 = lVar4;
                                switch (i152) {
                                    case 0:
                                        int i162 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    case 1:
                                        int i172 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var = lVar5.i;
                                        do {
                                            value = h2Var.getValue();
                                        } while (!h2Var.n(value, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 2:
                                        int i182 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 3), 3);
                                        return kotlin.Unit.a;
                                    case 3:
                                        int i192 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                    case 4:
                                        int i202 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var2 = lVar5.i;
                                        do {
                                            value2 = h2Var2.getValue();
                                        } while (!h2Var2.n(value2, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 5:
                                        int i212 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        ig3.h2 h2Var3 = lVar5.i;
                                        do {
                                            value3 = h2Var3.getValue();
                                        } while (!h2Var3.n(value3, (java.lang.Object) null));
                                        return kotlin.Unit.a;
                                    case 6:
                                        int i22 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 2), 3);
                                        return kotlin.Unit.a;
                                    case 7:
                                        int i23 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 1), 3);
                                        return kotlin.Unit.a;
                                    default:
                                        int i24 = com.truecaller.healthcheck.presentation.HealthCheckActivity.d0;
                                        fg3.h0.J(androidx.lifecycle.g1.l(lVar5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uq1.i(lVar5, null, 0), 3);
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        nVar4.k0(M12);
                    }
                    xq1.qux.i((kotlin.jvm.functions.Function0) M12, nVar4, r15);
                    nVar4.p((boolean) r15);
                } else {
                    throw ro0.f.G(-321866941, nVar4, (boolean) r15);
                }
            }
            lVar2 = lVar4;
        } else {
            nVar4.S();
            lVar2 = lVar;
        }
        v2.h1 r2 = nVar4.r();
        if (r2 != null) {
            r2.d = new c12.c(this, lVar2, function0, function02, function03, function04, i, 21);
        }
    }
}
