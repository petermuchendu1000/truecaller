package com.truecaller.call_assistant.presentation.disable;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class b {
    public static final d3.qux a = new d3.qux(-321513246, new aj0.g(17), false);
    public static final d3.qux b = new d3.qux(-667684263, new aj0.g(18), false);
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final void a(androidx.lifecycle.d0 d0Var, com.truecaller.call_assistant.presentation.disable.g gVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        com.truecaller.call_assistant.presentation.disable.g gVar2;
        androidx.lifecycle.d0 d0Var2;
        androidx.lifecycle.d0 d0Var3;
        int i5;
        boolean z2;
        rb.e0 e0Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "finish");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "finishWithSuccess");
        nVar.b0(-581614834);
        int i6 = i | 2;
        if (nVar.h(gVar)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i7 = i6 | i2;
        if (nVar.h(function0)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if (nVar.h(function02)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        boolean z3 = false;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i9 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
                i5 = i9 & (-15);
                d0Var3 = d0Var;
            } else {
                d0Var3 = (androidx.lifecycle.d0) nVar.j(y8.c.a);
                i5 = i9 & (-15);
            }
            nVar.q();
            rb.e0 S = i9.c.S(new rb.r0[0], nVar);
            r2.x4 e = r2.z8.e(nVar);
            boolean h = nVar.h(gVar);
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            if (h || M == cVar) {
                M = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(gVar, 15);
                nVar.k0(M);
            }
            com.moloco.sdk.internal.publisher.b0.b(0, 1, (kotlin.jvm.functions.Function0) M, nVar, false);
            boolean h2 = nVar.h(d0Var3) | nVar.h(gVar) | nVar.h(S);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | h2;
            if ((i5 & 7168) == 2048) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            java.lang.Object M2 = nVar.M();
            if (!z5 && M2 != cVar) {
                gVar2 = gVar;
                e0Var = S;
            } else {
                e0Var = S;
                a63.w wVar = new a63.w(d0Var3, gVar, e0Var, function0, function02, (df3.bar) null, 15);
                gVar2 = gVar;
                nVar.k0(wVar);
                M2 = wVar;
            }
            v2.f.h(d0Var3, (kotlin.jvm.functions.Function2) M2, nVar);
            r2.n5.a((j3.q) null, d3.a.d(1751548370, new ce1.a(8, gVar2, e), nVar), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, ((y41.i) nVar.j(y41.j.a)).g().a, 0L, (m1.o2) null, d3.a.d(1276550173, new a32.b(4, e0Var, e), nVar), nVar, 805306416, 445);
            d0Var2 = d0Var3;
        } else {
            gVar2 = gVar;
            nVar.S();
            d0Var2 = d0Var;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a32.i(d0Var2, gVar2, function0, function02, i, 8);
        }
    }

    public static final void b(kotlin.jvm.functions.Function0 function0, r2.c9 c9Var, v2.n nVar, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBack");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c9Var, "scrollBehavior");
        nVar.b0(1506188981);
        if (nVar.h(function0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.f(c9Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i6 & 1, z)) {
            float f = r2.z8.a;
            v2.q2 q2Var = y41.j.a;
            i4 = i;
            r2.r.d(d3.a.d(94517617, new a2.r(c9Var, 18), nVar), (j3.q) null, d3.a.d(-828649809, new a03.f(7, function0), nVar), (nf3.i) null, 0.0f, (m1.o2) null, r2.z8.g(((y41.i) nVar.j(q2Var)).g().a, ((y41.i) nVar.j(q2Var)).g().a, 0L, 0L, 0L, nVar, 60), c9Var, nVar, ((i6 << 18) & 29360128) | 390, 58);
        } else {
            i4 = i;
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new ce1.a(function0, c9Var, i4, 9);
        }
    }
}
