package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.search.global.i1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(com.truecaller.search.global.i1 i1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = i1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.search.global.h1(this.z, barVar, 0);
            default:
                return new com.truecaller.search.global.h1(this.z, barVar, 1);
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
        switch (this.x) {
            case 0:
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
                    com.truecaller.search.global.i1 i1Var = this.z;
                    ig3.q1 q1Var = ((sw2.b) i1Var.e.getValue()).g;
                    com.truecaller.search.global.g1 g1Var = new com.truecaller.search.global.g1(i1Var, null, 0);
                    this.y = 1;
                    if (ig3.w1.m(q1Var, g1Var, this) == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
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
                    com.truecaller.search.global.i1 i1Var2 = this.z;
                    ig3.q1 q1Var2 = ((sw2.b) i1Var2.b.getValue()).g;
                    com.truecaller.search.global.g1 g1Var2 = new com.truecaller.search.global.g1(i1Var2, null, 1);
                    this.y = 1;
                    if (ig3.w1.m(q1Var2, g1Var2, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
