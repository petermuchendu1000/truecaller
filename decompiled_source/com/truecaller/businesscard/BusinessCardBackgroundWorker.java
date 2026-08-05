package com.truecaller.businesscard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/truecaller/businesscard/BusinessCardBackgroundWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Lqo1/d;", "callingFeaturesInventory", "Lqk0/qux;", "businessCardManager", "Lmg2/bar;", "profileRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Lqo1/d;Lqk0/qux;Lmg2/bar;)V", "ff0/g", "businesscard_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BusinessCardBackgroundWorker extends androidx.work.CoroutineWorker {
    public final n11.l a;
    public final qo1.d b;
    public final qk0.qux c;
    public final mg2.bar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessCardBackgroundWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull qo1.d dVar, @org.jetbrains.annotations.NotNull qk0.qux quxVar, @org.jetbrains.annotations.NotNull mg2.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "callingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "businessCardManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "profileRepository");
        this.a = lVar;
        this.b = dVar;
        this.c = quxVar;
        this.d = barVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        qk0.bar barVar2;
        int i;
        if (barVar instanceof qk0.bar) {
            barVar2 = (qk0.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.x;
                ef3.bar barVar3 = ef3.bar.a;
                i = barVar2.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                return nd.t.a();
                            }
                            return new java.lang.Object();
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    barVar2.z = 1;
                    obj = this.d.f(barVar2);
                }
                pg2.m mVar = (pg2.m) obj;
                if (!this.a.j() && this.b.b.a("featurePushCallerIdV2", com.truecaller.featuretoggles.FeatureState.DISABLED) && mVar.k().length() != 0) {
                    barVar2.z = 2;
                    obj = ((qk0.b) this.c).a(barVar2);
                } else {
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
            }
        }
        barVar2 = new qk0.bar(this, (ff3.qux) barVar);
        java.lang.Object obj2 = barVar2.x;
        ef3.bar barVar32 = ef3.bar.a;
        i = barVar2.z;
        if (i == 0) {
        }
        pg2.m mVar2 = (pg2.m) obj2;
        if (!this.a.j()) {
        }
        nd.s a2 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
        return a2;
    }
}
