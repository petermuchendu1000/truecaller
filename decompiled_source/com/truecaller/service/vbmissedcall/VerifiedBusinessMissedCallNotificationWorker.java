package com.truecaller.service.vbmissedcall;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/service/vbmissedcall/VerifiedBusinessMissedCallNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "asyncIoCoroutineContext", "Lhq2/h;", "dataProvider", "Lhq2/s;", "contentBuilder", "Lhq2/m;", "notificationBuilder", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;Lhq2/h;Lhq2/s;Lhq2/m;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedBusinessMissedCallNotificationWorker extends androidx.work.CoroutineWorker {
    public final kotlin.coroutines.CoroutineContext a;
    public final hq2.h b;
    public final hq2.s c;
    public final hq2.m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifiedBusinessMissedCallNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull hq2.h hVar, @org.jetbrains.annotations.NotNull hq2.s sVar, @org.jetbrains.annotations.NotNull hq2.m mVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncIoCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "dataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "contentBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "notificationBuilder");
        this.a = coroutineContext;
        this.b = hVar;
        this.c = sVar;
        this.d = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        hq2.h0 h0Var;
        int i;
        if (barVar instanceof hq2.h0) {
            h0Var = (hq2.h0) barVar;
            int i2 = h0Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = h0Var.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = h0Var.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    f10.b bVar = new f10.b(this, (df3.bar) null);
                    h0Var.z = 1;
                    obj = fg3.h0.W(this.a, bVar, h0Var);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        h0Var = new hq2.h0(this, (ff3.qux) barVar);
        java.lang.Object obj2 = h0Var.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = h0Var.z;
        if (i == 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
