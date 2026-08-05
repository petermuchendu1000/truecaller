package com.truecaller.presence.domain.worker;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/presence/domain/worker/PostPresenceWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lxf2/a;", "presenceManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostPresenceWorker extends androidx.work.CoroutineWorker {
    public final qc3.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPresenceWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "presenceManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        gg2.baz bazVar;
        java.lang.Object obj;
        int i;
        if (barVar instanceof gg2.baz) {
            bazVar = (gg2.baz) barVar;
            int i2 = bazVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i2 - Integer.MIN_VALUE;
                obj = bazVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bazVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    xf2.a aVar = (xf2.a) this.a.get();
                    com.truecaller.presence.api.model.AvailabilityTrigger availabilityTrigger = com.truecaller.presence.api.model.AvailabilityTrigger.RECURRING_TASK;
                    bazVar.z = 1;
                    ag2.q qVar = (ag2.q) aVar;
                    qVar.getClass();
                    obj = qVar.m("Report Presence", new ag2.i(qVar, availabilityTrigger, false, null, 1), bazVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
                return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
            }
        }
        bazVar = new gg2.baz(this, (ff3.qux) barVar);
        obj = bazVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bazVar.z;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
