package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a1 extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ java.lang.Object A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(java.lang.Object obj, long j, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.A = obj;
        this.z = j;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.wizard.verification.a1((com.truecaller.wizard.verification.s1) this.A, this.z, barVar, 0);
            default:
                return new com.truecaller.wizard.verification.a1((java.lang.String) this.A, this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) this.A;
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    s1Var.c0 = false;
                    this.y = 1;
                    if (fg3.h0.r(this.z, this) == barVar) {
                        return barVar;
                    }
                }
                this.y = 2;
                java.lang.Object W = fg3.h0.W(s1Var.b, new com.truecaller.wizard.verification.b1(s1Var, null, 3), this);
                if (W != barVar) {
                    W = kotlin.Unit.a;
                }
                if (W == barVar) {
                    return barVar;
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                com.truecaller.account.network.DeactivateAccountRequest deactivateAccountRequest = new com.truecaller.account.network.DeactivateAccountRequest(true, (java.lang.String) this.A, this.z);
                this.y = 1;
                java.lang.Object b = com.truecaller.account.network.b.a.b(deactivateAccountRequest, this);
                if (b == barVar2) {
                    return barVar2;
                }
                return b;
        }
    }
}
