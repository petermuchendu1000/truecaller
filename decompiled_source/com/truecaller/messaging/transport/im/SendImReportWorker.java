package com.truecaller.messaging.transport.im;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/truecaller/messaging/transport/im/SendImReportWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lf42/o;", "imManager", "Lqc3/bar;", "Lvx/bar;", "enableMIDReadReport", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lf42/o;Lqc3/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SendImReportWorker extends androidx.work.Worker {
    public final f42.o a;
    public final qc3.bar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendImReportWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull f42.o oVar, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "imManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "enableMIDReadReport");
        this.a = oVar;
        this.b = barVar;
    }

    public final nd.t doWork() {
        int runAttemptCount;
        int i;
        com.truecaller.api.services.messenger.v1.models.input.InputReportType forNumber = com.truecaller.api.services.messenger.v1.models.input.InputReportType.forNumber(getInputData().b("report_type", 0));
        long d = getInputData().d("message_id", -1L);
        if (forNumber != null) {
            com.truecaller.api.services.messenger.v1.models.input.InputReportType[] inputReportTypeArr = {com.truecaller.api.services.messenger.v1.models.input.InputReportType.RECEIVED, com.truecaller.api.services.messenger.v1.models.input.InputReportType.READ, com.truecaller.api.services.messenger.v1.models.input.InputReportType.MID_DISMISSED, com.truecaller.api.services.messenger.v1.models.input.InputReportType.READ_AFTER_MID_DISMISSED};
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputReportTypeArr, "elements");
            if (kotlin.collections.v.l0(inputReportTypeArr).contains(forNumber) && d != -1) {
                int b = getInputData().b("retry_count", 3);
                if (((vx.bar) this.b.get()).c()) {
                    runAttemptCount = getRunAttemptCount() + 1;
                } else {
                    runAttemptCount = getRunAttemptCount();
                }
                com.truecaller.messaging.transport.im.SendResult sendResult = (com.truecaller.messaging.transport.im.SendResult) this.a.c(forNumber, d, runAttemptCount).q();
                if (sendResult == null) {
                    i = -1;
                } else {
                    i = f42.d2.a[sendResult.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            if (getRunAttemptCount() < b) {
                                return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                            }
                            nd.s a = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                            return a;
                        }
                    } else {
                        nd.s a2 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                        return a2;
                    }
                }
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
        }
        nd.s a4 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "success(...)");
        return a4;
    }
}
