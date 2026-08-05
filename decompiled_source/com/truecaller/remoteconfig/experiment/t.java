package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class t extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int A;
    public int B;
    public long C;
    public int D;
    public final /* synthetic */ com.truecaller.remoteconfig.experiment.w E;
    public final /* synthetic */ boolean F;
    public pg3.bar x;
    public com.truecaller.remoteconfig.experiment.w y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.truecaller.remoteconfig.experiment.w wVar, boolean z, df3.bar barVar) {
        super(2, barVar);
        this.E = wVar;
        this.F = z;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.remoteconfig.experiment.t(this.E, this.F, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (com.truecaller.remoteconfig.experiment.w.a(r10, r16) != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [pg3.bar] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        com.truecaller.remoteconfig.experiment.w wVar;
        pg3.bar barVar;
        int i;
        java.lang.Object W;
        pg3.bar barVar2;
        int i2;
        long j;
        ef3.bar barVar3 = ef3.bar.a;
        pg3.bar barVar4 = this.D;
        int i3 = 0;
        try {
            if (barVar4 != 0) {
                if (barVar4 != 1) {
                    if (barVar4 != 2) {
                        if (barVar4 == 3) {
                            pg3.bar barVar5 = this.x;
                            od.p.E(obj);
                            barVar4 = barVar5;
                            kotlin.Unit unit = kotlin.Unit.a;
                            barVar4.h((java.lang.Object) null);
                            return java.lang.Boolean.TRUE;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.C;
                    int i4 = this.B;
                    int i5 = this.A;
                    com.truecaller.remoteconfig.experiment.w wVar2 = this.y;
                    barVar2 = this.x;
                    try {
                        od.p.E(obj);
                        wVar = wVar2;
                        i = i5;
                        i2 = i4;
                        W = obj;
                        if (j >= ((java.lang.Number) W).longValue() + java.util.concurrent.TimeUnit.HOURS.toMillis(6L)) {
                            barVar4 = barVar2;
                            kotlin.Unit unit2 = kotlin.Unit.a;
                            barVar4.h((java.lang.Object) null);
                            return java.lang.Boolean.TRUE;
                        }
                        i3 = i2;
                        barVar = barVar2;
                        this.x = barVar;
                        this.y = null;
                        this.A = i;
                        this.B = i3;
                        this.D = 3;
                        barVar4 = barVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        barVar4 = barVar2;
                        barVar4.h((java.lang.Object) null);
                        throw th;
                    }
                } else {
                    int i6 = this.A;
                    boolean z2 = this.z;
                    com.truecaller.remoteconfig.experiment.w wVar3 = this.y;
                    pg3.bar barVar6 = this.x;
                    od.p.E(obj);
                    i = i6;
                    barVar = barVar6;
                    wVar = wVar3;
                    z = z2;
                }
            } else {
                od.p.E(obj);
                com.truecaller.remoteconfig.experiment.w wVar4 = this.E;
                pg3.bar barVar7 = wVar4.l;
                this.x = barVar7;
                this.y = wVar4;
                z = this.F;
                this.z = z;
                this.A = 0;
                this.D = 1;
                if (barVar7.d(this) != barVar3) {
                    wVar = wVar4;
                    barVar = barVar7;
                    i = 0;
                }
                return barVar3;
            }
            if (!z) {
                ((lo1.qux) wVar.e.get()).getClass();
                ((u03.qux) wVar.g).getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.truecaller.remoteconfig.experiment.y yVar = (com.truecaller.remoteconfig.experiment.y) wVar.c.get();
                this.x = barVar;
                this.y = wVar;
                this.A = i;
                this.B = 0;
                this.C = currentTimeMillis;
                this.D = 2;
                W = fg3.h0.W(yVar.b, new com.truecaller.remoteconfig.experiment.x(yVar, null, 1), this);
                if (W != barVar3) {
                    barVar2 = barVar;
                    i2 = 0;
                    j = currentTimeMillis;
                    if (j >= ((java.lang.Number) W).longValue() + java.util.concurrent.TimeUnit.HOURS.toMillis(6L)) {
                    }
                }
                return barVar3;
            }
            this.x = barVar;
            this.y = null;
            this.A = i;
            this.B = i3;
            this.D = 3;
            barVar4 = barVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }
}
