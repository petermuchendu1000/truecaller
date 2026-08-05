package com.truecaller.filters.sync;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/filters/sync/FilterUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Lej0/baz;", "filterManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Lej0/baz;)V", "ok3/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilterUploadWorker extends androidx.work.Worker {
    public final n11.l a;
    public final ej0.baz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterUploadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull ej0.baz bazVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "filterManager");
        this.a = lVar;
        this.b = bazVar;
    }

    public final nd.t doWork() {
        if (!this.a.j()) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        try {
            if (!((to1.f) this.b).f()) {
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        } catch (java.io.IOException | java.lang.RuntimeException unused) {
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.shouldNeverHappen(e, new java.lang.String[0]);
        }
        return wi0.bar.u("failure(...)");
    }
}
