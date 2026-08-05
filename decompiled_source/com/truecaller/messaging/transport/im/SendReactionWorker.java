package com.truecaller.messaging.transport.im;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/messaging/transport/im/SendReactionWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lf42/o;", "imManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lf42/o;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SendReactionWorker extends androidx.work.Worker {
    public final f42.o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendReactionWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull f42.o oVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "imManager");
        this.a = oVar;
    }

    public final nd.t doWork() {
        int i;
        java.lang.String e = getInputData().e("raw_id");
        if (e == null) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        long d = getInputData().d("message_id", -1L);
        java.lang.String e2 = getInputData().e("from_peer_id");
        if (e2 == null) {
            nd.s a2 = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
            return a2;
        }
        com.truecaller.messaging.transport.im.SendResult sendResult = (com.truecaller.messaging.transport.im.SendResult) this.a.d(e, d, e2, getInputData().d("particpant_id", -1L), getInputData().e("to_group_id"), getInputData().e("emoji")).q();
        if (sendResult == null) {
            i = -1;
        } else {
            i = f42.e2.a[sendResult.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    if (getRunAttemptCount() < 3) {
                        return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                    }
                    nd.s a3 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                    return a3;
                }
            } else {
                nd.s a4 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "success(...)");
                return a4;
            }
        }
        nd.s a5 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a5, "success(...)");
        return a5;
    }
}
