package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g2 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ if1.baz A;
    public final /* synthetic */ int x = 1;
    public int y;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.truecaller.ui.TruecallerInit truecallerInit, if1.baz bazVar, df3.bar barVar) {
        super(2, barVar);
        this.z = truecallerInit;
        this.A = bazVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.g2(this.A, this.z, barVar);
            default:
                return new com.truecaller.ui.g2(this.z, this.A, barVar);
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
                    throw d4.t.r(obj);
                }
                od.p.E(obj);
                if1.baz bazVar = this.A;
                ig3.v1 v1Var = bazVar.h;
                ag2.e eVar = new ag2.e(13, this.z, bazVar);
                this.y = 1;
                v1Var.collect(eVar, this);
                return barVar;
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
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.d;
                    if1.baz bazVar2 = this.A;
                    com.truecaller.ui.TruecallerInit truecallerInit = this.z;
                    com.truecaller.ui.g2 g2Var = new com.truecaller.ui.g2(bazVar2, truecallerInit, (df3.bar) null);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(truecallerInit, sVar, g2Var, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(if1.baz bazVar, com.truecaller.ui.TruecallerInit truecallerInit, df3.bar barVar) {
        super(2, barVar);
        this.A = bazVar;
        this.z = truecallerInit;
    }
}
