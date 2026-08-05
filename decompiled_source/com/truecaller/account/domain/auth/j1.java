package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class j1 {
    public static final gd3.c1 a;

    static {
        gd3.b1 b1Var = gd3.k1.d;
        java.util.BitSet bitSet = gd3.g1.d;
        a = new gd3.c1("Authorization", b1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [cy.c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [gd3.k1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [gd3.k1, java.lang.Object] */
    public static final void a(id3.i3 i3Var, java.lang.String str, boolean z, boolean z2, boolean z3, nc0.bar barVar, ea.c cVar, boolean z4) {
        cy.d dVar;
        if (str != null) {
            ?? obj = new java.lang.Object();
            obj.f(a, str);
            i3Var.a((gd3.k1) obj);
        } else {
            if (z) {
                i3Var.a((gd3.k1) new java.lang.Object());
                return;
            }
            if (z3) {
                dVar = new cy.c();
            } else {
                dVar = new cy.d("gRPC call failed, no auth token available", z2);
            }
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(dVar);
            if (z4) {
                nc0.u1.e(new ky.bar(dVar.d(), z2, com.truecaller.account.domain.auth.analytics.NetworkType.GRPC, ((gd3.n1) cVar.b).c), barVar);
            }
            i3Var.b(gd3.g2.k.h("No auth token available"));
        }
    }
}
