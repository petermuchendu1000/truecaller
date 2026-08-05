package com.truecaller.messaging.defaultsms;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/messaging/defaultsms/DmaAdsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "", "dmaAdsManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;)V", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DmaAdsWorker extends androidx.work.CoroutineWorker {
    public final qc3.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DmaAdsWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "dmaAdsManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        com.truecaller.messaging.defaultsms.g gVar;
        int i;
        if (barVar instanceof com.truecaller.messaging.defaultsms.g) {
            gVar = (com.truecaller.messaging.defaultsms.g) barVar;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = gVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = gVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                java.lang.String e = getInputData().e("postBackUrl");
                if (e != null) {
                    if (e.length() <= 0) {
                        e = null;
                    }
                    if (e != null) {
                        if (this.a.get() == null) {
                            gVar.z = 1;
                            throw null;
                        }
                        throw new java.lang.ClassCastException();
                    }
                }
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        gVar = new com.truecaller.messaging.defaultsms.g(this, (ff3.qux) barVar);
        java.lang.Object obj2 = gVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = gVar.z;
        if (i == 0) {
        }
    }
}
