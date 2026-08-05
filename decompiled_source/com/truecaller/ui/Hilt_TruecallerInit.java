package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class Hilt_TruecallerInit extends com.truecaller.ui.FragmentActivityBase {
    public boolean i0 = false;

    public Hilt_TruecallerInit() {
        addOnContextAvailableListener(new com.truecaller.ui.z(this, 8));
    }

    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, ah.n] */
    /* JADX WARN: Type inference failed for: r5v68, types: [hc.bar, java.lang.Object] */
    @Override // com.truecaller.ui.Hilt_FragmentActivityBase
    public final void t0() {
        if (!this.i0) {
            this.i0 = true;
            com.truecaller.ui.TruecallerInit truecallerInit = (com.truecaller.ui.TruecallerInit) this;
            tx.e eVar = (com.truecaller.ui.u2) X3();
            tx.w wVar = eVar.f;
            truecallerInit.e0 = (qw2.a0) wVar.x6.get();
            truecallerInit.f0 = (qw2.d0) wVar.l5.get();
            truecallerInit.g0 = (qo1.m) wVar.F2.get();
            tx.c0 c0Var = wVar.b;
            truecallerInit.j0 = cd3.baz.a(c0Var.q6);
            cd3.baz.a(c0Var.j6);
            truecallerInit.k0 = cd3.baz.a(eVar.P0);
            truecallerInit.l0 = cd3.baz.a(eVar.Q0);
            truecallerInit.m0 = cd3.baz.a(eVar.R0);
            truecallerInit.n0 = wVar.V2;
            cd3.baz.a(wVar.o0);
            truecallerInit.o0 = cd3.baz.a(c0Var.m4);
            truecallerInit.p0 = cd3.baz.a(wVar.Y);
            truecallerInit.q0 = cd3.baz.a(wVar.q1);
            cd3.baz.a(wVar.q4);
            truecallerInit.r0 = cd3.baz.a(wVar.B1);
            truecallerInit.s0 = wVar.s7;
            truecallerInit.t0 = wVar.L0;
            truecallerInit.u0 = wVar.R9;
            truecallerInit.v0 = wVar.pa;
            truecallerInit.w0 = wVar.t3;
            truecallerInit.x0 = wVar.Ub;
            truecallerInit.y0 = wVar.M1;
            truecallerInit.z0 = wVar.s1;
            truecallerInit.A0 = wVar.e0;
            truecallerInit.B0 = cd3.baz.a(eVar.S0);
            truecallerInit.C0 = cd3.baz.a(wVar.v0);
            truecallerInit.D0 = cd3.baz.a(c0Var.Q6);
            truecallerInit.E0 = cd3.baz.a(wVar.Bk);
            truecallerInit.F0 = cd3.baz.a(wVar.O2);
            truecallerInit.G0 = cd3.baz.a(wVar.ao);
            truecallerInit.H0 = cd3.baz.a(wVar.Xb);
            truecallerInit.I0 = cd3.baz.a(c0Var.R6);
            truecallerInit.J0 = cd3.baz.a(c0Var.e0);
            truecallerInit.K0 = cd3.baz.a(eVar.T0);
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) eVar.t.get();
            qc3.bar a = cd3.baz.a(wVar.o0);
            qc3.bar a2 = cd3.baz.a(wVar.x6);
            qc3.bar a3 = cd3.baz.a(wVar.l5);
            qc3.bar a4 = cd3.baz.a(c0Var.q6);
            qc3.bar a5 = cd3.baz.a(c0Var.L6);
            qc3.bar a6 = cd3.baz.a(wVar.u7);
            qc3.bar a7 = cd3.baz.a(wVar.Sb);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "accountManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "permissionUtil");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "tcPermissionsView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a4, "truecallerAppUpdateManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a5, "consentRefresh");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a6, "wizard");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a7, "wizardLauncher");
            ?? obj = new java.lang.Object();
            ((ah.n) obj).b = fragmentActivity;
            ((ah.n) obj).a = a;
            ((ah.n) obj).c = a2;
            ((ah.n) obj).d = a3;
            ((ah.n) obj).e = a4;
            ((ah.n) obj).f = a5;
            ((ah.n) obj).g = a6;
            ((ah.n) obj).h = a7;
            truecallerInit.L0 = obj;
            android.content.Context context = (android.content.Context) eVar.i.a;
            qc3.bar a8 = cd3.baz.a(eVar.U0);
            qc3.bar a9 = cd3.baz.a(eVar.W0);
            qc3.bar a10 = cd3.baz.a(eVar.X0);
            cd3.b bVar = wVar.M2;
            cd3.b bVar2 = wVar.p9;
            qc3.bar a11 = cd3.baz.a(c0Var.S6);
            qc3.bar a12 = cd3.baz.a(c0Var.e0);
            qc3.bar a14 = cd3.baz.a(eVar.Y0);
            qo1.h hVar = (qo1.h) wVar.f4.get();
            qc3.bar a15 = cd3.baz.a(wVar.I4);
            androidx.activity.ComponentActivity componentActivity = (android.app.Activity) eVar.i.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
            truecallerInit.M0 = new ah.f(context, a8, a9, a10, bVar, bVar2, a11, a12, a14, hVar, a15, androidx.lifecycle.g1.j(componentActivity));
            truecallerInit.N0 = com.google.common.collect.ImmutableSet.of(new com.truecaller.ui.e(cd3.baz.a(eVar.m0), cd3.baz.a(eVar.R0)), new com.truecaller.ui.g0((android.content.Context) wVar.I.get(), cd3.baz.a(wVar.F8), cd3.baz.a(wVar.P2), cd3.baz.a(wVar.K8), cd3.baz.a(wVar.Lf)), new com.truecaller.ui.e((android.content.Context) eVar.i.a, cd3.baz.a(c0Var.a7)));
            truecallerInit.O0 = cd3.baz.a(c0Var.b7);
            truecallerInit.P0 = cd3.baz.a(wVar.e4);
            truecallerInit.Q0 = cd3.baz.a(wVar.I4);
            truecallerInit.R0 = eVar.m0;
            truecallerInit.S0 = eVar.Z0;
            truecallerInit.U0 = cd3.baz.a(wVar.l5);
            truecallerInit.V0 = new java.lang.Object();
            truecallerInit.W0 = (if1.bar) wVar.Zb.get();
            truecallerInit.X0 = (b81.z) c0Var.c7.get();
            truecallerInit.Y0 = cd3.baz.a(eVar.a1);
            truecallerInit.Z0 = cd3.baz.a(c0Var.a7);
            truecallerInit.a1 = cd3.baz.a(c0Var.Z6);
            truecallerInit.b1 = cd3.baz.a(eVar.j0);
            truecallerInit.c1 = cd3.baz.a(c0Var.h4);
            cd3.baz.a(wVar.o1);
            truecallerInit.d1 = cd3.baz.a(wVar.W8);
            truecallerInit.e1 = (jw0.bar) c0Var.D.get();
            truecallerInit.f1 = cd3.baz.a(eVar.N);
        }
    }
}
