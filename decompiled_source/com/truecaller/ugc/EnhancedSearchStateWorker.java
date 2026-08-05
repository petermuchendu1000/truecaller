package com.truecaller.ugc;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/ugc/EnhancedSearchStateWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Lcom/truecaller/ugc/c;", "ugcSettings", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Lcom/truecaller/ugc/c;)V", "qk3/p", "ugc_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class EnhancedSearchStateWorker extends androidx.work.Worker {
    public final n11.l a;
    public final com.truecaller.ugc.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnhancedSearchStateWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull com.truecaller.ugc.c cVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "ugcSettings");
        this.a = lVar;
        this.b = cVar;
    }

    public final nd.t doWork() {
        com.truecaller.ugc.baz backupService;
        if (!this.a.j()) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        boolean z = false;
        boolean a2 = getInputData().a("enhanced_search_value", false);
        try {
            com.truecaller.ugc.qux quxVar = (com.truecaller.ugc.qux) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.PHONEBOOK, com.truecaller.ugc.qux.class);
            okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.Companion;
            okhttp3.MediaType mediaType = p31.b.a;
            companion.getClass();
            wj3.k0 H = quxVar.a(a2, okhttp3.RequestBody.Companion.b("{}", mediaType)).H();
            if (H.a.k()) {
                com.truecaller.ugc.bar barVar = (com.truecaller.ugc.bar) H.b;
                if (barVar != null && (backupService = barVar.getBackupService()) != null) {
                    z = backupService.a();
                }
                ((cl2.m) this.b).c0("backup", z);
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
        } catch (java.io.IOException unused) {
        } catch (java.lang.RuntimeException e) {
            o82.a.C(e);
        }
        return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
    }
}
