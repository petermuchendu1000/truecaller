package com.truecaller.rewardprogram;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B=\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/rewardprogram/RewardProgramNotificationOneTimeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lfk2/baz;", "missedPermissionNotificationUseCase", "Lfk2/qux;", "pausedPermissionNotificationUseCase", "Lfk2/c;", "uncompletedActionNotificationUseCase", "Lfk2/bar;", "claimDailyPointsNotificationUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lfk2/baz;Lfk2/qux;Lfk2/c;Lfk2/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramNotificationOneTimeWorker extends androidx.work.CoroutineWorker {
    public final fk2.baz a;
    public final fk2.qux b;
    public final fk2.c c;
    public final fk2.bar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardProgramNotificationOneTimeWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull fk2.baz bazVar, @org.jetbrains.annotations.NotNull fk2.qux quxVar, @org.jetbrains.annotations.NotNull fk2.c cVar, @org.jetbrains.annotations.NotNull fk2.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "missedPermissionNotificationUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "pausedPermissionNotificationUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "uncompletedActionNotificationUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "claimDailyPointsNotificationUseCase");
        this.a = bazVar;
        this.b = quxVar;
        this.c = cVar;
        this.d = barVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (((wk2.qux) r7.d).M(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (((wk2.qux) r7.c).M(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (((wk2.qux) r7.b).M(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (((wk2.qux) r7.a).M(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        ak2.e eVar;
        int i;
        if (barVar instanceof ak2.e) {
            eVar = (ak2.e) barVar;
            int i2 = eVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = eVar.z;
                if (i == 0) {
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String e = getInputData().e("notificationType");
                    if (e != null) {
                        int i3 = ak2.d.a[com.truecaller.rewardprogram.RewardProgramNotificationType.valueOf(e).ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        eVar.z = 4;
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    eVar.z = 3;
                                }
                            } else {
                                eVar.z = 2;
                            }
                        } else {
                            eVar.z = 1;
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("The notification type must not be null");
                    }
                }
                nd.s a = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                return a;
            }
        }
        eVar = new ak2.e(this, (ff3.qux) barVar);
        java.lang.Object obj2 = eVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = eVar.z;
        if (i == 0) {
        }
        nd.s a2 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
        return a2;
    }
}
