package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class x extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ com.truecaller.remoteconfig.experiment.y y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.truecaller.remoteconfig.experiment.y yVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = yVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.remoteconfig.experiment.x(this.y, barVar, 0);
            default:
                return new com.truecaller.remoteconfig.experiment.x(this.y, barVar, 1);
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
        long j;
        long j2 = 0;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                this.y.d = 0L;
                return java.lang.Boolean.valueOf(com.bumptech.glide.qux.K(this.y.b()));
            default:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                if (this.y.d > 0) {
                    j = this.y.d;
                } else {
                    if (this.y.b().exists()) {
                        com.truecaller.remoteconfig.experiment.y yVar = this.y;
                        yVar.d = yVar.b().lastModified();
                        j = this.y.d;
                    }
                    return new java.lang.Long(j2);
                }
                j2 = j;
                return new java.lang.Long(j2);
        }
    }
}
