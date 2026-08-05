package com.truecaller.messaging.rcs.worker;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/messaging/rcs/worker/RCSHistoricDataCorrectionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "ioContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RCSHistoricDataCorrectionWorker extends androidx.work.CoroutineWorker {
    public final kotlin.coroutines.CoroutineContext a;
    public xz1.q b;
    public y12.o0 c;
    public n32.bar d;
    public p32.baz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCSHistoricDataCorrectionWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        this.a = coroutineContext;
    }

    public final p32.baz a() {
        p32.baz bazVar = this.e;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("rcsMessageMediationHelper");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r7 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        q32.bar barVar2;
        ef3.bar barVar3;
        int i;
        java.lang.Object W;
        if (barVar instanceof q32.bar) {
            barVar2 = (q32.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.x;
                barVar3 = ef3.bar.a;
                i = barVar2.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            xz1.q qVar = this.b;
                            if (qVar != null) {
                                ((xz1.r) qVar).c0("rcsHistoricDataCorrectionExecuted", true);
                                nd.s a = nd.t.a();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                                return a;
                            }
                            kotlin.jvm.internal.Intrinsics.n("settings");
                            throw null;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    n32.bar barVar4 = this.d;
                    if (barVar4 != null) {
                        if (barVar4.e()) {
                            y12.o0 o0Var = this.c;
                            if (o0Var != null) {
                                barVar2.z = 1;
                                obj = o0Var.c(Integer.MAX_VALUE, barVar2);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("readMessageStorage");
                                throw null;
                            }
                        } else {
                            return wi0.bar.u("failure(...)");
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("rcsMessageHelper");
                        throw null;
                    }
                }
                barVar2.z = 2;
                W = fg3.h0.W(this.a, new fe.c((java.util.List) obj, this, (df3.bar) null), barVar2);
                if (W != barVar3) {
                    W = kotlin.Unit.a;
                }
            }
        }
        barVar2 = new q32.bar(this, (ff3.qux) barVar);
        java.lang.Object obj2 = barVar2.x;
        barVar3 = ef3.bar.a;
        i = barVar2.z;
        if (i == 0) {
        }
        barVar2.z = 2;
        W = fg3.h0.W(this.a, new fe.c((java.util.List) obj2, this, (df3.bar) null), barVar2);
        if (W != barVar3) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RCSHistoricDataCorrectionWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        this(context, workerParameters, fg3.r0.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }
}
