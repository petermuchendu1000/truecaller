package com.truecaller.familyprotect.domain.status.worker;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/familyprotect/domain/status/worker/ActivityStatusWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Llk1/a;", "localDataSource", "Lqj1/baz;", "repository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llk1/a;Lqj1/baz;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActivityStatusWorker extends androidx.work.CoroutineWorker {
    public final lk1.a a;
    public final qj1.baz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStatusWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull lk1.a aVar, @org.jetbrains.annotations.NotNull qj1.baz bazVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "localDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "repository");
        this.a = aVar;
        this.b = bazVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        dm1.bar barVar2;
        int i;
        if (barVar instanceof dm1.bar) {
            barVar2 = (dm1.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.x;
                ef3.bar barVar3 = ef3.bar.a;
                i = barVar2.z;
                lk1.a aVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return nd.t.a();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            barVar2.z = 3;
                            java.lang.Object obj2 = ((lk1.n) aVar).a.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            java.lang.Object W = ef0.a.W((t7.e) obj2, lk1.n.p, true, barVar2);
                            if (W != barVar3) {
                                W = kotlin.Unit.a;
                            }
                        } else {
                            if (getRunAttemptCount() < 3) {
                                return new java.lang.Object();
                            }
                            return new nd.q();
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    barVar2.z = 1;
                    obj = ((lk1.n) aVar).h(barVar2);
                }
                barVar2.z = 2;
                obj = this.b.i((com.truecaller.familyprotect.api.status.activity.UserActivityType) obj, barVar2);
            }
        }
        barVar2 = new dm1.bar(this, (ff3.qux) barVar);
        java.lang.Object obj3 = barVar2.x;
        ef3.bar barVar32 = ef3.bar.a;
        i = barVar2.z;
        lk1.a aVar2 = this.a;
        if (i == 0) {
        }
        barVar2.z = 2;
        obj3 = this.b.i((com.truecaller.familyprotect.api.status.activity.UserActivityType) obj3, barVar2);
    }
}
