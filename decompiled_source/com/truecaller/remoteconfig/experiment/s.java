package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.remoteconfig.experiment.w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.truecaller.remoteconfig.experiment.w wVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = wVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.remoteconfig.experiment.s(this.z, barVar, 0);
            default:
                return new com.truecaller.remoteconfig.experiment.s(this.z, barVar, 1);
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
                com.truecaller.remoteconfig.experiment.w wVar = this.z;
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
                    com.truecaller.remoteconfig.experiment.y yVar = (com.truecaller.remoteconfig.experiment.y) wVar.c.get();
                    this.y = 1;
                    if (fg3.h0.W(yVar.b, new com.truecaller.remoteconfig.experiment.x(yVar, null, 0), this) == barVar) {
                        return barVar;
                    }
                }
                this.y = 2;
                if (wVar.c(true, this) == barVar) {
                    return barVar;
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
                    this.y = 1;
                    if (this.z.c(false, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
