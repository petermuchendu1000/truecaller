package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class e {
    public static final long a = java.util.concurrent.TimeUnit.DAYS.toMillis(3);

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v2, types: [df3.bar, com.truecaller.remoteconfig.experiment.d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(t7.e eVar, kotlin.jvm.functions.Function2 function2, ff3.qux quxVar) {
        ?? r0;
        int i;
        if (quxVar instanceof com.truecaller.remoteconfig.experiment.d) {
            com.truecaller.remoteconfig.experiment.d dVar = (com.truecaller.remoteconfig.experiment.d) quxVar;
            int i2 = dVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.y = i2 - Integer.MIN_VALUE;
                r0 = dVar;
                java.lang.Object obj = r0.x;
                ef3.bar barVar = ef3.bar.a;
                i = r0.y;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    r0.y = 1;
                    if (eVar.a(function2, (df3.bar) r0) == barVar) {
                        return barVar;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        r0 = new ff3.qux(quxVar);
        java.lang.Object obj2 = r0.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = r0.y;
        boolean z2 = true;
        if (i == 0) {
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
