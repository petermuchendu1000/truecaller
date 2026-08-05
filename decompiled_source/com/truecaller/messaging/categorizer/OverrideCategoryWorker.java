package com.truecaller.messaging.categorizer;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/truecaller/messaging/categorizer/OverrideCategoryWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ap1/d", "messaging-storage_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OverrideCategoryWorker extends androidx.work.CoroutineWorker {
    public m02.q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverrideCategoryWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r8.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r8.b(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        m02.r rVar;
        int i;
        if (barVar instanceof m02.r) {
            rVar = (m02.r) barVar;
            int i2 = rVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = rVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = rVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            nd.s a = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                            return a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                od.p.E(obj);
                int b = getInputData().b("selected_messaging_level", -1);
                if (b != 1) {
                    if (b != 2 && b != 3) {
                        return wi0.bar.u("failure(...)");
                    }
                    m02.q qVar = this.a;
                    if (qVar != null) {
                        rVar.z = 2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("overrideCategorizer");
                        throw null;
                    }
                } else {
                    m02.q qVar2 = this.a;
                    if (qVar2 != null) {
                        rVar.z = 1;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("overrideCategorizer");
                        throw null;
                    }
                }
                return barVar2;
            }
        }
        rVar = new m02.r(this, (ff3.qux) barVar);
        java.lang.Object obj2 = rVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = rVar.z;
        if (i == 0) {
        }
    }
}
