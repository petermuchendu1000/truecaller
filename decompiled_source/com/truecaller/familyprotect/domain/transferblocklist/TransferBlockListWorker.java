package com.truecaller.familyprotect.domain.transferblocklist;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/familyprotect/domain/transferblocklist/TransferBlockListWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lzj1/bar;", "familyGroupConfigApi", "Lwj1/a;", "resultProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lzj1/bar;Lwj1/a;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TransferBlockListWorker extends androidx.work.CoroutineWorker {
    public final zj1.bar a;
    public final wj1.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferBlockListWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull zj1.bar barVar, @org.jetbrains.annotations.NotNull wj1.a aVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "familyGroupConfigApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "resultProvider");
        this.a = barVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:10:0x0029, B:11:0x0049, B:13:0x0051, B:16:0x005e, B:21:0x003a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:10:0x0029, B:11:0x0049, B:13:0x0051, B:16:0x005e, B:21:0x003a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        em1.qux quxVar;
        java.lang.Object obj;
        int i;
        wj1.bar barVar2;
        wj1.a aVar;
        try {
            if (barVar instanceof em1.qux) {
                quxVar = (em1.qux) barVar;
                int i2 = quxVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    quxVar.z = i2 - Integer.MIN_VALUE;
                    obj = quxVar.x;
                    ef3.bar barVar3 = ef3.bar.a;
                    i = quxVar.z;
                    barVar2 = wj1.bar.a;
                    aVar = this.b;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        zj1.bar barVar4 = this.a;
                        com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy transferFiltersOnErrorStrategy = com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy.IGNORE;
                        quxVar.z = 1;
                        obj = ((gl1.t0) barVar4).u(transferFiltersOnErrorStrategy, quxVar);
                        if (obj == barVar3) {
                            return barVar3;
                        }
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        ((em1.baz) aVar).b(wj1.baz.a);
                        return nd.t.a();
                    }
                    ((em1.baz) aVar).b(barVar2);
                    return new nd.q();
                }
            }
            if (i == 0) {
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            ((em1.baz) aVar).b(barVar2);
            return new nd.q();
        }
        quxVar = new em1.qux(this, (ff3.qux) barVar);
        obj = quxVar.x;
        ef3.bar barVar32 = ef3.bar.a;
        i = quxVar.z;
        barVar2 = wj1.bar.a;
        aVar = this.b;
    }
}
