package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class i {
    public static final d3.qux a = new d3.qux(-529733828, new aj0.g(19), false);
    public static final d3.qux b = new d3.qux(1370574181, new aj0.g(20), false);
    public static final d3.qux c = new d3.qux(-1917323357, new aj0.g(21), false);
    public static final d3.qux d = new d3.qux(-910253599, new aj0.g(22), false);
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;

    public static final void a(androidx.lifecycle.d0 d0Var, com.truecaller.call_assistant.presentation.onboarding.h hVar, kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        int i3;
        boolean z;
        androidx.lifecycle.d0 d0Var2;
        androidx.lifecycle.d0 d0Var3;
        int i4;
        java.lang.String str;
        boolean z2;
        androidx.lifecycle.d0 d0Var4;
        rb.e0 e0Var;
        rb.y yVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "finish");
        nVar.b0(1916266896);
        int i5 = i | 2;
        if (nVar.h(hVar)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i5 | i2;
        if (nVar.h(function0)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i7 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
                i4 = i7 & (-15);
                d0Var3 = d0Var;
            } else {
                d0Var3 = (androidx.lifecycle.d0) nVar.j(y8.c.a);
                i4 = i7 & (-15);
            }
            nVar.q();
            rb.e0 S = i9.c.S(new rb.r0[0], nVar);
            java.lang.Object M = nVar.M();
            java.lang.Object obj = v2.k.a;
            if (M == obj) {
                M = qb.qux.u(nVar);
            }
            r2.m6 m6Var = (r2.m6) M;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(S, "<this>");
            nVar.a0(-120375203);
            v2.t0 a2 = androidx.compose.runtime.a.a(S.E, (java.lang.Object) null, (kotlin.coroutines.CoroutineContext) null, nVar, 56, 2);
            nVar.p(false);
            rb.n nVar2 = (rb.n) a2.getValue();
            if (nVar2 != null && (yVar = nVar2.b) != null) {
                str = yVar.i;
            } else {
                str = null;
            }
            boolean b2 = kotlin.jvm.internal.Intrinsics.b(str, "onboarding_result/{isSuccess}");
            boolean b3 = kotlin.jvm.internal.Intrinsics.b(str, "onboarding_verification");
            float D0 = ((h5.qux) nVar.j(k4.g1.h)).D0(64);
            java.lang.Object M2 = nVar.M();
            if (M2 == obj) {
                M2 = androidx.compose.runtime.a.f(0.0f);
                nVar.k0(M2);
            }
            v2.a2 a2Var = (v2.a2) M2;
            java.lang.Object M3 = nVar.M();
            if (M3 == obj) {
                M3 = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar.k0(M3);
            }
            v2.t0 t0Var = (v2.t0) M3;
            java.lang.Object M4 = nVar.M();
            if (M4 == obj) {
                M4 = new com.truecaller.call_assistant.presentation.onboarding.d(t0Var, a2Var);
                nVar.k0(M4);
            }
            com.truecaller.call_assistant.presentation.onboarding.d dVar = (com.truecaller.call_assistant.presentation.onboarding.d) M4;
            float c2 = uf3.p.c(a2Var.g() / D0, 0.0f, 1.0f);
            java.lang.Object M5 = nVar.M();
            if (M5 == obj) {
                M5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(a2Var, t0Var, (df3.bar) null, 10);
                nVar.k0(M5);
            }
            v2.f.h(str, (kotlin.jvm.functions.Function2) M5, nVar);
            boolean h = nVar.h(hVar);
            java.lang.Object M6 = nVar.M();
            if (h || M6 == obj) {
                M6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(hVar, 16);
                nVar.k0(M6);
            }
            com.moloco.sdk.internal.publisher.b0.b(0, 1, (kotlin.jvm.functions.Function0) M6, nVar, false);
            boolean h2 = nVar.h(d0Var3) | nVar.h(hVar) | nVar.h(S);
            if ((i4 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2 | h2;
            java.lang.Object M7 = nVar.M();
            if (!z3 && M7 != obj) {
                e0Var = S;
                d0Var4 = d0Var3;
            } else {
                ag2.qux quxVar = new ag2.qux(d0Var3, hVar, S, function0, (df3.bar) null, 25);
                d0Var4 = d0Var3;
                e0Var = S;
                nVar.k0(quxVar);
                M7 = quxVar;
            }
            v2.f.h(d0Var4, (kotlin.jvm.functions.Function2) M7, nVar);
            j3.q d2 = u51.e.d(3, (java.lang.String) null);
            v2.q2 q2Var = y41.j.a;
            long j = ((y41.i) nVar.j(q2Var)).c().a().a;
            long j2 = ((y41.i) nVar.j(q2Var)).g().a;
            boolean e2 = nVar.e(j) | nVar.e(j2);
            java.lang.Object M8 = nVar.M();
            if (e2 || M8 == obj) {
                M8 = new q3.e0(kotlin.collections.y.j(new q3.r[]{new q3.r(j), new q3.r(j2)}), (java.util.ArrayList) null, 0L, 9187343241974906880L);
                nVar.k0(M8);
            }
            j3.q a3 = c4.c.a(e1.k.h(d2, (q3.n) M8, (q3.q0) null, 6), dVar, (c4.a) null);
            java.util.WeakHashMap weakHashMap = m1.p2.w;
            r2.n5.a(a3, d3.a.d(-325679028, new com.truecaller.blockinglevel.presentation.h(b2, b3, hVar, c2, t0Var), nVar), (kotlin.jvm.functions.Function2) null, d3.a.d(-112061942, new com.truecaller.call_assistant.presentation.onboarding.a(m6Var, 0), nVar), (kotlin.jvm.functions.Function2) null, 0, q3.r.k, 0L, m1.b.f(nVar).e, d3.a.d(649961761, new a32.b(5, e0Var, m6Var), nVar), nVar, 806882352, 180);
            d0Var2 = d0Var4;
        } else {
            nVar.S();
            d0Var2 = d0Var;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a2.j(d0Var2, hVar, function0, i, 17);
        }
    }

    public static final void b(final rb.e0 e0Var, java.lang.String str) {
        java.lang.String str2;
        android.os.Bundle bundle;
        rb.n g = e0Var.g();
        boolean z = false;
        if (g != null && (str2 = g.b.i) != null) {
            if (str2.equals(str)) {
                z = true;
            } else if (str2.equals("onboarding_result/{isSuccess}") && (bundle = g.c) != null) {
                z = kotlin.jvm.internal.Intrinsics.b(str, "onboarding_result/" + bundle.getBoolean("isSuccess"));
            }
        }
        if (z) {
            return;
        }
        final int i = 1;
        e0Var.n(str, new kotlin.jvm.functions.Function1() { // from class: com.truecaller.call_assistant.presentation.disable.a
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics.LaunchContext launchContext;
                switch (i) {
                    case 0:
                        rb.i0 i0Var = (rb.i0) obj;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var, "$this$navigate");
                        i0Var.a(((rb.y) e0Var.j()).h, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(4));
                        i0Var.b = true;
                        return kotlin.Unit.a;
                    case 1:
                        rb.i0 i0Var2 = (rb.i0) obj;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var2, "$this$navigate");
                        i0Var2.a(e0Var.j().l, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(5));
                        i0Var2.b = true;
                        return kotlin.Unit.a;
                    case 2:
                        java.lang.String str3 = (java.lang.String) obj;
                        rb.e0.q(e0Var, com.appsflyer.internal.e.j(str3, "phoneNumber", "changeSecondaryNumber/", str3), (rb.h0) null, 6);
                        return kotlin.Unit.a;
                    default:
                        com.truecaller.familyprotect.api.model.Family.MemberRole memberRole = (com.truecaller.familyprotect.api.model.Family.MemberRole) obj;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberRole, "role");
                        int i2 = jm1.qux.a[memberRole.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                launchContext = com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics.LaunchContext.FAMILY_PROTECT_REPORT_MEMBER_VIEW;
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            launchContext = com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics.LaunchContext.FAMILY_PROTECT_REPORT_ADMIN_VIEW;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchContext, "contextArg");
                        rb.e0.q(e0Var, "familyprotect/report/" + launchContext, (rb.h0) null, 6);
                        return kotlin.Unit.a;
                }
            }
        });
    }
}
