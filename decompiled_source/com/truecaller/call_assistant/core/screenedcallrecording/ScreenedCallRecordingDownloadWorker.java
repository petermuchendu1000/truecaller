package com.truecaller.call_assistant.core.screenedcallrecording;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/call_assistant/core/screenedcallrecording/ScreenedCallRecordingDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallRecordingDownloadWorker extends androidx.work.CoroutineWorker {
    public hr0.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenedCallRecordingDownloadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        hr0.c cVar;
        int i;
        java.lang.String str;
        java.lang.Object obj;
        boolean z;
        if (barVar instanceof hr0.c) {
            cVar = (hr0.c) barVar;
            int i2 = cVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = cVar.y;
                ef3.bar barVar2 = ef3.bar.a;
                i = cVar.A;
                if (i == 0) {
                    if (i == 1) {
                        str = cVar.x;
                        od.p.E(obj2);
                        obj = ((kotlin.q) obj2).a;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj2);
                    java.lang.String e = getInputData().e("callId");
                    if (e != null) {
                        hr0.b bVar = this.a;
                        if (bVar != null) {
                            cVar.x = e;
                            cVar.A = 1;
                            java.lang.Object c = bVar.c(e, cVar);
                            if (c == barVar2) {
                                return barVar2;
                            }
                            str = e;
                            obj = c;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("screenedCallRecordingDownloadManager");
                            throw null;
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Call ID not set");
                    }
                }
                kotlin.o oVar = kotlin.q.b;
                z = obj instanceof kotlin.p;
                boolean z2 = !z;
                if (!z) {
                    java.lang.Throwable a = kotlin.q.a(obj);
                    if (a != null) {
                        o82.a.B("Screened call recording download failed for callId=" + str, a);
                    }
                    if (getRunAttemptCount() < 3) {
                        return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                    }
                    return wi0.bar.u("failure(...)");
                }
                if (z2) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                throw new java.lang.RuntimeException();
            }
        }
        cVar = new hr0.c(this, (ff3.qux) barVar);
        java.lang.Object obj22 = cVar.y;
        ef3.bar barVar22 = ef3.bar.a;
        i = cVar.A;
        if (i == 0) {
        }
        kotlin.o oVar2 = kotlin.q.b;
        z = obj instanceof kotlin.p;
        boolean z22 = !z;
        if (!z) {
        }
    }
}
