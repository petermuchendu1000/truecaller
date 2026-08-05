package com.truecaller.call_assistant.core.screenedcallrecording;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/call_assistant/core/screenedcallrecording/ScreenedCallRecordingMultiDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqc3/bar;", "Lhr0/b;", "downloadManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;)V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallRecordingMultiDownloadWorker extends androidx.work.CoroutineWorker {
    public final qc3.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenedCallRecordingMultiDownloadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "downloadManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        hr0.e eVar;
        int i;
        java.lang.Object b;
        if (barVar instanceof hr0.e) {
            eVar = (hr0.e) barVar;
            int i2 = eVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = eVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        b = ((kotlin.q) obj).a;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    hr0.b bVar = (hr0.b) this.a.get();
                    eVar.z = 1;
                    b = bVar.b(eVar);
                    if (b == barVar2) {
                        return barVar2;
                    }
                }
                kotlin.o oVar = kotlin.q.b;
                if (!(b instanceof kotlin.p)) {
                    if (getRunAttemptCount() < 3) {
                        return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                    }
                    return wi0.bar.u("failure(...)");
                }
                nd.s a = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                return a;
            }
        }
        eVar = new hr0.e(this, (ff3.qux) barVar);
        java.lang.Object obj2 = eVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = eVar.z;
        if (i == 0) {
        }
        kotlin.o oVar2 = kotlin.q.b;
        if (!(b instanceof kotlin.p)) {
        }
    }
}
