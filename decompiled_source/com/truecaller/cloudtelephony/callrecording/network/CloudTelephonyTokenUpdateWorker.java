package com.truecaller.cloudtelephony.callrecording.network;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/network/CloudTelephonyTokenUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CloudTelephonyTokenUpdateWorker extends androidx.work.CoroutineWorker {
    public s01.i a;
    public qo1.f b;
    public s01.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudTelephonyTokenUpdateWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        vz0.b bVar;
        java.lang.Object obj;
        int i;
        if (barVar instanceof vz0.b) {
            bVar = (vz0.b) barVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                obj = bVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    qo1.g gVar = this.b;
                    if (gVar != null) {
                        if (gVar.b()) {
                            s01.i iVar = this.a;
                            if (iVar != null) {
                                if (iVar.a()) {
                                    s01.bar barVar3 = this.c;
                                    if (barVar3 != null) {
                                        bVar.z = 1;
                                        obj = barVar3.a.b(new rm2.e(barVar3, (df3.bar) null, 19), bVar);
                                        if (obj == barVar2) {
                                            return barVar2;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("callRecordingAccountManager");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("callRecordingSubscriptionStatusProvider");
                                throw null;
                            }
                        }
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    kotlin.jvm.internal.Intrinsics.n("cloudTelephonyFeaturesInventory");
                    throw null;
                }
                if (((java.lang.String) obj) != null) {
                    if (getRunAttemptCount() < 3) {
                        return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                    }
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
        }
        bVar = new vz0.b(this, (ff3.qux) barVar);
        obj = bVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.z;
        if (i == 0) {
        }
        if (((java.lang.String) obj) != null) {
        }
    }
}
