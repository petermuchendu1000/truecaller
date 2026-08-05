package com.truecaller.impact;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/impact/ImpactNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lgr1/bar;", "impactNotificationWorkerManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgr1/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ImpactNotificationWorker extends androidx.work.CoroutineWorker {
    public final gr1.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImpactNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull gr1.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "impactNotificationWorkerManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        gr1.b bVar;
        int i;
        java.lang.Object obj;
        if (barVar instanceof gr1.b) {
            bVar = (gr1.b) barVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                gr1.b bVar2 = bVar;
                java.lang.Object obj2 = bVar2.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar2.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj2);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj2);
                    com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
                    java.lang.String e = getInputData().e("EXTRA_NOTIFICATION_TITLE");
                    java.lang.String e2 = getInputData().e("EXTRA_NOTIFICATION_TEXTS");
                    java.lang.String e3 = getInputData().e("EXTRA_NOTIFICATION_NUMBER");
                    java.lang.String e4 = getInputData().e("EXTRA_NOTIFICATION_IMAGE_URL");
                    java.lang.String e5 = getInputData().e("EXTRA_IMPACT_NOTIFICATION_TYPE");
                    bVar2.z = 1;
                    if (gr1.a.a[valueOf.ordinal()] == 1) {
                        obj = this.a.p0(e, e2, e3, e4, e5, bVar2);
                        if (obj != barVar2) {
                            obj = kotlin.Unit.a;
                        }
                    } else {
                        obj = kotlin.Unit.a;
                    }
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                nd.s a = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                return a;
            }
        }
        bVar = new gr1.b(this, (ff3.qux) barVar);
        gr1.b bVar22 = bVar;
        java.lang.Object obj22 = bVar22.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar22.z;
        if (i == 0) {
        }
        nd.s a2 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
        return a2;
    }
}
