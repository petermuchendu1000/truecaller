package com.truecaller.whosearchedforme;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/whosearchedforme/ExactSearchLoggerWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "whosearchedforme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ExactSearchLoggerWorker extends androidx.work.CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExactSearchLoggerWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        try {
            java.lang.String e = getInputData().e("ExtraSearchTerm");
            boolean a = getInputData().a("ExtraIsInPhonebookContact", false);
            if (e != null && e.length() != 0) {
                ((x63.bar) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.PROFILE_VIEW, x63.bar.class)).c(new com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto(java.lang.Long.parseLong(e), a)).H();
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
            nd.q qVar = new nd.q();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
            return qVar;
        } catch (java.lang.Exception e2) {
            if (!(e2 instanceof java.io.IOException) && !(e2 instanceof java.lang.RuntimeException)) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
            }
            return wi0.bar.u("failure(...)");
        }
    }
}
