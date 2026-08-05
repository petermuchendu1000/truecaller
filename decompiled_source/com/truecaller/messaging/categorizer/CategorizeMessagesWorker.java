package com.truecaller.messaging.categorizer;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/categorizer/CategorizeMessagesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "messaging-storage_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CategorizeMessagesWorker extends androidx.work.CoroutineWorker {
    public m02.g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorizeMessagesWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        m02.bar barVar2;
        java.lang.Object obj;
        int i;
        if (barVar instanceof m02.bar) {
            barVar2 = (m02.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                obj = barVar2.x;
                ef3.bar barVar3 = ef3.bar.a;
                i = barVar2.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    m02.g gVar = this.a;
                    if (gVar != null) {
                        if (!gVar.b()) {
                            nd.s a = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                            return a;
                        }
                        m02.g gVar2 = this.a;
                        if (gVar2 != null) {
                            barVar2.z = 1;
                            obj = gVar2.a(barVar2);
                            if (obj == barVar3) {
                                return barVar3;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("categorizer");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("categorizer");
                        throw null;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                return wi0.bar.u("failure(...)");
            }
        }
        barVar2 = new m02.bar(this, (ff3.qux) barVar);
        obj = barVar2.x;
        ef3.bar barVar32 = ef3.bar.a;
        i = barVar2.z;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
