package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.wizard.verification.l0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.truecaller.wizard.verification.l0 l0Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = l0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.wizard.verification.k0(this.z, barVar, 0);
            default:
                return new com.truecaller.wizard.verification.k0(this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.wizard.verification.l0 l0Var = this.z;
                    ig3.q1 q1Var = l0Var.d5().h0;
                    a32.e eVar = new a32.e(l0Var, 22);
                    this.y = 1;
                    if (q1Var.a.collect(eVar, this) == barVar) {
                        return barVar;
                    }
                }
                throw new java.lang.RuntimeException();
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.wizard.verification.l0 l0Var2 = this.z;
                    androidx.lifecycle.d0 viewLifecycleOwner = l0Var2.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.d;
                    com.truecaller.wizard.verification.k0 k0Var = new com.truecaller.wizard.verification.k0(l0Var2, null, 0);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner, sVar, k0Var, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
