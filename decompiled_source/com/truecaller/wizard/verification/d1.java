package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ com.truecaller.wizard.verification.q0 y;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(com.truecaller.wizard.verification.q0 q0Var, com.truecaller.wizard.verification.s1 s1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = q0Var;
        this.z = s1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.wizard.verification.d1(this.y, this.z, barVar, 0);
            default:
                return new com.truecaller.wizard.verification.d1(this.y, this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ev1.g0 g0Var;
        ev1.g0 g0Var2;
        int i = this.x;
        com.truecaller.wizard.verification.s1 s1Var = this.z;
        com.truecaller.wizard.verification.o0 o0Var = com.truecaller.wizard.verification.o0.a;
        com.truecaller.wizard.verification.q0 q0Var = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                boolean b = kotlin.jvm.internal.Intrinsics.b(q0Var, o0Var);
                q83.u0 u0Var = (q83.u0) s1Var.z.c;
                if (b) {
                    g0Var = q83.e0.c;
                } else {
                    k93.g.r.getClass();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("playAnimation", true);
                    bundle.putBoolean("verificationSkipped", false);
                    g0Var = new ev1.g0(bundle);
                }
                u0Var.x(g0Var);
                if (s1Var.a == null) {
                    s1Var.g2();
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                boolean b2 = kotlin.jvm.internal.Intrinsics.b(q0Var, o0Var);
                q83.u0 u0Var2 = (q83.u0) s1Var.z.c;
                if (b2) {
                    g0Var2 = q83.e0.c;
                } else {
                    k93.g.r.getClass();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putBoolean("playAnimation", true);
                    bundle2.putBoolean("verificationSkipped", false);
                    g0Var2 = new ev1.g0(bundle2);
                }
                u0Var2.x(g0Var2);
                if (s1Var.a == null) {
                    s1Var.g2();
                }
                return kotlin.Unit.a;
        }
    }
}
