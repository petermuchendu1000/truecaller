package com.truecaller.background_work;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/background_work/JointActionsWorker;", "Lcom/truecaller/background_work/TrackedCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lu03/baz;", "clock", "Lqc3/bar;", "Lnc0/bar;", "lazyAnalytics", "Lqo1/m;", "platformFeaturesInventory", "Luf0/p;", "factory", "Lcom/truecaller/background_work/persistence/WorkActionDatabase;", "resultsDatabase", "Lvf0/f;", "jointWorkersAnalytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lu03/baz;Lqc3/bar;Lqo1/m;Luf0/p;Lqc3/bar;Lqc3/bar;)V", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class JointActionsWorker extends com.truecaller.background_work.TrackedCoroutineWorker {
    public final qc3.bar a;
    public final qo1.m b;
    public final uf0.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointActionsWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull u03.baz bazVar, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull uf0.p pVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "lazyAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "resultsDatabase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "jointWorkersAnalytics");
        this.a = barVar;
        this.b = mVar;
        nd.g inputData = getInputData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
        int runAttemptCount = getRunAttemptCount();
        barVar = ((qo1.n) mVar).a.a("featureWorkManagerLog_38345", com.truecaller.featuretoggles.FeatureState.DISABLED) ? barVar : null;
        this.c = new uf0.d(inputData, runAttemptCount, barVar != null ? (nc0.bar) barVar.get() : null, pVar, bazVar, barVar2, barVar3);
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    public final nc0.bar a() {
        java.lang.Object obj = this.a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (nc0.bar) obj;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /* renamed from: b, reason: from getter */
    public final qo1.m getB() {
        return this.b;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    public final java.lang.Object c(df3.bar barVar) {
        this.c.getClass();
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(df3.bar barVar) {
        uf0.b bVar;
        int i;
        uf0.d dVar;
        try {
            if (barVar instanceof uf0.b) {
                bVar = (uf0.b) barVar;
                int i2 = bVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = bVar.x;
                    ef3.bar barVar2 = ef3.bar.a;
                    i = bVar.z;
                    dVar = this.c;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        bVar.z = 1;
                        obj = dVar.b(bVar);
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        dVar.a(getStopReason());
                    }
                    return obj;
                }
            }
            if (i == 0) {
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
            }
            return obj;
        } finally {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                dVar.a(getStopReason());
            }
        }
        bVar = new uf0.b(this, (ff3.qux) barVar);
        java.lang.Object obj2 = bVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.z;
        dVar = this.c;
    }
}
