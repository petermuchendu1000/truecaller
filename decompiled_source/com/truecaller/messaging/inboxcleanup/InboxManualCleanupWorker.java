package com.truecaller.messaging.inboxcleanup;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B]\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/InboxManualCleanupWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Lxz1/q;", "messageSettings", "Lm22/k;", "inboxCleaner", "Lm22/r;", "notificationHelper", "Lu03/b;", "deviceInfoUtil", "Lqw2/a0;", "tcPermissionUtil", "Lqo1/k;", "messagingFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Lxz1/q;Lm22/k;Lm22/r;Lu03/b;Lqw2/a0;Lqo1/k;)V", "m22/v0", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InboxManualCleanupWorker extends com.truecaller.background_work.TrackedWorker {
    public static final m22.v0 j = new m22.v0(0);
    public static boolean k;
    public final android.content.Context a;
    public final nc0.bar b;
    public final qo1.m c;
    public final xz1.q d;
    public final m22.k e;
    public final m22.r f;
    public final u03.b g;
    public final qw2.a0 h;
    public final qo1.k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxManualCleanupWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull xz1.q qVar, @org.jetbrains.annotations.NotNull m22.k kVar, @org.jetbrains.annotations.NotNull m22.r rVar, @org.jetbrains.annotations.NotNull u03.b bVar, @org.jetbrains.annotations.NotNull qw2.a0 a0Var, @org.jetbrains.annotations.NotNull qo1.k kVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "messageSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "inboxCleaner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "notificationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "tcPermissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar2, "messagingFeaturesInventory");
        this.a = context;
        this.b = barVar;
        this.c = mVar;
        this.d = qVar;
        this.e = kVar;
        this.f = rVar;
        this.g = bVar;
        this.h = a0Var;
        this.i = kVar2;
        k = false;
    }

    public static final void e(com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker, f6.f0 f0Var, int i, int i2) {
        nd.m mVar;
        inboxManualCleanupWorker.getClass();
        f0Var.i(i + "/" + i2);
        f0Var.q(100, (int) ((((double) i) / ((double) i2)) * ((double) 100)), false);
        android.app.Notification d = f0Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            mVar = new nd.m(2131364630, d, 1);
        } else {
            mVar = new nd.m(2131364630, d, 0);
        }
        inboxManualCleanupWorker.setForegroundAsync(mVar).get();
    }

    public static java.lang.String f(int i) {
        if (i != -1) {
            if (i != 7) {
                if (i != 15) {
                    if (i != 30) {
                        return "none";
                    }
                    return "30 days";
                }
                return "15 days";
            }
            return "7 days";
        }
        return "all";
    }

    /* renamed from: a, reason: from getter */
    public final nc0.bar getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final qo1.m getC() {
        return this.c;
    }

    public final boolean c() {
        return ((com.truecaller.messaging.inboxcleanup.a) this.e).e();
    }

    public final nd.t d() {
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.a).sendBroadcast(new android.content.Intent("com.truecaller.inboxcleanup.CLEANUP_IN_PROGRESS"));
        fg3.h0.P(new com.truecaller.messaging.inboxcleanup.d(this, null));
        nd.s a = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
        return a;
    }
}
