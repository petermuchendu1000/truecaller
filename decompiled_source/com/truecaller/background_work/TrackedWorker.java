package com.truecaller.background_work;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/background_work/TrackedWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.a
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class TrackedWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackedWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public abstract nc0.bar a();

    public abstract qo1.m b();

    public abstract boolean c();

    public abstract nd.t d();

    public final nd.t doWork() {
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        try {
            if (!c()) {
                java.lang.String str = "Worker " + simpleName + " was not run";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                w91.a.a(new java.lang.Object[]{str});
                nd.s a = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                return a;
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            nd.t d = d();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.String str2 = "Worker " + simpleName + " finished with result " + f40.d0.i(d) + " after " + elapsedRealtime2 + " ms";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            w91.a.a(new java.lang.Object[]{str2});
            if (b().a.a("featureWorkManagerLog_38345", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                nc0.u1.e(new uf0.n(simpleName, f40.d0.i(d), elapsedRealtime2), a());
            }
            return d;
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new c73.d1("Failure in ".concat(simpleName), e));
            throw e;
        }
    }
}
