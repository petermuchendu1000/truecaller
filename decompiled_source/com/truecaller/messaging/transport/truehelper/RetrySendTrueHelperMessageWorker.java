package com.truecaller.messaging.transport.truehelper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/messaging/transport/truehelper/RetrySendTrueHelperMessageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Lqc3/bar;", "Lxd0/qux;", "Ly12/v;", "messagesStorage", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Lqc3/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RetrySendTrueHelperMessageWorker extends androidx.work.Worker {
    public final n11.l a;
    public final qc3.bar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrySendTrueHelperMessageWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messagesStorage");
        this.a = lVar;
        this.b = barVar;
    }

    public final nd.t doWork() {
        if (!this.a.j()) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        long d = getInputData().d("to_date", 0L);
        if (d == 0) {
            return wi0.bar.u("failure(...)");
        }
        ((y12.v) ((xd0.qux) this.b.get()).a()).v(9, new org.joda.time.DateTime(d));
        nd.s a2 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
        return a2;
    }
}
