package com.truecaller.presence.domain.worker;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/truecaller/presence/domain/worker/RingerModeListenerWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lxf2/a;", "presenceManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxf2/a;)V", "gf0/e", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RingerModeListenerWorker extends androidx.work.Worker {
    public final xf2.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingerModeListenerWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull xf2.a aVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "presenceManager");
        this.a = aVar;
    }

    public final nd.t doWork() {
        try {
            ((ag2.q) this.a).h(com.truecaller.presence.api.model.AvailabilityTrigger.USER_ACTION, false);
            android.content.Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            gf0.e.v(applicationContext);
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        } catch (java.lang.Throwable th) {
            android.content.Context applicationContext2 = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            gf0.e.v(applicationContext2);
            throw th;
        }
    }
}
