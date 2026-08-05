package com.truecaller.tagger.impl.sync;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/tagger/impl/sync/TagInitWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "ioContext", "Lqc3/bar;", "Ljw2/bar;", "tagManager", "Ln11/l;", "truecallerAccountManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;Lqc3/bar;Lqc3/bar;)V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TagInitWorker extends androidx.work.CoroutineWorker {
    public final kotlin.coroutines.CoroutineContext a;
    public final qc3.bar b;
    public final qc3.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagInitWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "tagManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "truecallerAccountManager");
        this.a = coroutineContext;
        this.b = barVar;
        this.c = barVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        ow2.bar barVar2;
        int i;
        if (barVar instanceof ow2.bar) {
            barVar2 = (ow2.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.x;
                ef3.bar barVar3 = ef3.bar.a;
                i = barVar2.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    nm1.i2 i2Var = new nm1.i2(this, (df3.bar) null, 9);
                    barVar2.z = 1;
                    obj = fg3.h0.W(this.a, i2Var, barVar2);
                    if (obj == barVar3) {
                        return barVar3;
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        barVar2 = new ow2.bar(this, (ff3.qux) barVar);
        java.lang.Object obj2 = barVar2.x;
        ef3.bar barVar32 = ef3.bar.a;
        i = barVar2.z;
        if (i == 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
