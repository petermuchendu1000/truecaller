package com.truecaller.call_assistant.core.network;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/call_assistant/core/network/CallAssistantAuthTokenUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantAuthTokenUpdateWorker extends androidx.work.CoroutineWorker {
    public pr0.g0 a;
    public qo1.b b;
    public pr0.j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAssistantAuthTokenUpdateWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0054, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        eq0.qux quxVar;
        java.lang.Object obj;
        int i;
        if (barVar instanceof eq0.qux) {
            quxVar = (eq0.qux) barVar;
            int i2 = quxVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar.z = i2 - Integer.MIN_VALUE;
                obj = quxVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = quxVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            if (((java.lang.String) obj) == null) {
                                if (getRunAttemptCount() < 3) {
                                    return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                                }
                                nd.s a = nd.t.a();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                                return a;
                            }
                            nd.s a2 = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                            return a2;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    qo1.c cVar = this.b;
                    if (cVar != null) {
                        if (cVar.c()) {
                            pr0.g0 g0Var = this.a;
                            if (g0Var != null) {
                                quxVar.z = 1;
                                obj = g0Var.a(quxVar);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("callAssistantServiceStatusProvider");
                                throw null;
                            }
                        }
                        nd.s a3 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                        return a3;
                    }
                    kotlin.jvm.internal.Intrinsics.n("callAssistantFeaturesInventory");
                    throw null;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    pr0.j jVar = this.c;
                    if (jVar != null) {
                        quxVar.z = 2;
                        obj = jVar.c(quxVar);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callAssistantAccountManager");
                        throw null;
                    }
                }
                nd.s a32 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a32, "success(...)");
                return a32;
            }
        }
        quxVar = new eq0.qux(this, (ff3.qux) barVar);
        obj = quxVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = quxVar.z;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        nd.s a322 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a322, "success(...)");
        return a322;
    }
}
