package com.truecaller.service.contact;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/truecaller/service/contact/RefreshContactIndexingWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sp1/baz", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RefreshContactIndexingWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshContactIndexingWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public final nd.t doWork() {
        try {
            boolean z = tx.a1.G;
            tx.a1 a = r11.bar.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getApp(...)");
            if (!a.d()) {
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
            java.lang.String e = getInputData().e("RefreshContactIndexingService.action");
            if (e == null) {
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
            if (e.equals("RefreshContactIndexingService.action.sync")) {
                boolean a4 = getInputData().a("RefreshContactIndexingService.extra.rebuild_all", false);
                android.content.ContentResolver contentResolver = getApplicationContext().getContentResolver();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                new eq2.baz(contentResolver, 0).a(a4);
            }
            nd.s a5 = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a5, "success(...)");
            return a5;
        } catch (java.lang.Throwable unused) {
            nd.s a6 = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a6, "success(...)");
            return a6;
        }
    }
}
