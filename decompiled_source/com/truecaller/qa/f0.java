package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class f0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ ac1.e A;
    public final /* synthetic */ int x;
    public int y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(ac1.e eVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = eVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.qa.f0 f0Var = new com.truecaller.qa.f0(this.A, barVar, 0);
                f0Var.z = ((java.lang.Boolean) obj).booleanValue();
                return f0Var;
            case 1:
                com.truecaller.qa.f0 f0Var2 = new com.truecaller.qa.f0(this.A, barVar, 1);
                f0Var2.z = ((java.lang.Boolean) obj).booleanValue();
                return f0Var2;
            default:
                com.truecaller.qa.f0 f0Var3 = new com.truecaller.qa.f0(this.A, barVar, 2);
                f0Var3.z = ((java.lang.Boolean) obj).booleanValue();
                return f0Var3;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.x;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        df3.bar barVar = (df3.bar) obj2;
        switch (i) {
            case 0:
                return ((com.truecaller.qa.f0) create(bool, barVar)).invokeSuspend(kotlin.Unit.a);
            case 1:
                return ((com.truecaller.qa.f0) create(bool, barVar)).invokeSuspend(kotlin.Unit.a);
            default:
                return ((com.truecaller.qa.f0) create(bool, barVar)).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                boolean z = this.z;
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    v23.bar barVar2 = (v23.bar) this.A.d;
                    this.z = z;
                    this.y = 1;
                    java.lang.Object W = ef0.a.W(((v33.i) barVar2).b(), v33.i.p, z, this);
                    if (W != barVar) {
                        W = kotlin.Unit.a;
                    }
                    if (W == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                boolean z2 = this.z;
                ef3.bar barVar3 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    v23.bar barVar4 = (v23.bar) this.A.d;
                    this.z = z2;
                    this.y = 1;
                    java.lang.Object W2 = ef0.a.W(((v33.i) barVar4).b(), v33.i.o, z2, this);
                    if (W2 != barVar3) {
                        W2 = kotlin.Unit.a;
                    }
                    if (W2 == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            default:
                boolean z3 = this.z;
                ef3.bar barVar5 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    v23.bar barVar6 = (v23.bar) this.A.d;
                    this.z = z3;
                    this.y = 1;
                    java.lang.Object W3 = ef0.a.W(((v33.i) barVar6).b(), v33.i.n, z3, this);
                    if (W3 != barVar5) {
                        W3 = kotlin.Unit.a;
                    }
                    if (W3 == barVar5) {
                        return barVar5;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
