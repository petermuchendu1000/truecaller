package com.truecaller.cloudtelephony.callrecording.util;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/util/CallRecordingDeleteFromCallLogWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDeleteFromCallLogWorker extends androidx.work.CoroutineWorker {
    public s01.l a;
    public w01.qux b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRecordingDeleteFromCallLogWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r2.a(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        s01.b bVar;
        int i;
        java.lang.String str;
        if (barVar instanceof s01.b) {
            bVar = (s01.b) barVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            nd.s a = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                            return a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    s01.l lVar = this.a;
                    if (lVar != null) {
                        bVar.z = 1;
                        obj = lVar.c(bVar);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("settings");
                        throw null;
                    }
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    w01.qux quxVar = this.b;
                    if (quxVar != null) {
                        bVar.z = 2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callLogManager");
                        throw null;
                    }
                }
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        bVar = new s01.b(this, (ff3.qux) barVar);
        java.lang.Object obj2 = bVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.z;
        if (i == 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        nd.s a22 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22, "success(...)");
        return a22;
    }
}
