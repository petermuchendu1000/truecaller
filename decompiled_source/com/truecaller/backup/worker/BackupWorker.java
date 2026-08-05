package com.truecaller.backup.worker;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/backup/worker/BackupWorker;", "Lcom/truecaller/background_work/TrackedCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqo1/m;", "platformFeaturesInventory", "Lnc0/bar;", "analytics", "Ljavax/inject/Provider;", "Landroid/content/Intent;", "backupSettingsIntent", "Ldg0/f;", "presenter", "Lqc3/bar;", "Ls62/d;", "notificationManager", "Ldg0/qux;", "backupWorkRequestCreator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqo1/m;Lnc0/bar;Ljavax/inject/Provider;Ldg0/f;Lqc3/bar;Ldg0/qux;)V", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BackupWorker extends com.truecaller.background_work.TrackedCoroutineWorker {
    public final android.content.Context a;
    public final qo1.m b;
    public final nc0.bar c;
    public final javax.inject.Provider d;
    public final dg0.f e;
    public final qc3.bar f;
    public final dg0.qux g;
    public final kotlin.Lazy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull nc0.bar barVar, @javax.inject.Named("backup_settings") @org.jetbrains.annotations.NotNull javax.inject.Provider<android.content.Intent> provider, @org.jetbrains.annotations.NotNull dg0.f fVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull dg0.qux quxVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "backupSettingsIntent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "presenter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "backupWorkRequestCreator");
        this.a = context;
        this.b = mVar;
        this.c = barVar;
        this.d = provider;
        this.e = fVar;
        this.f = barVar2;
        this.g = quxVar;
        this.h = kotlin.LazyKt.lazy(new cu0.h(this, 13));
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /* renamed from: a, reason: from getter */
    public final nc0.bar getA() {
        return this.c;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /* renamed from: b, reason: from getter */
    public final qo1.m getB() {
        return this.b;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    public final java.lang.Object c(df3.bar barVar) {
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x0058, B:17:0x006d, B:21:0x0078, B:22:0x007d, B:23:0x007e, B:24:0x0089, B:28:0x0038), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(df3.bar barVar) {
        dg0.d dVar;
        int i;
        com.truecaller.sdk.bar barVar2;
        int i2;
        java.lang.Object a;
        try {
            if (barVar instanceof dg0.d) {
                dVar = (dg0.d) barVar;
                int i3 = dVar.z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dVar.z = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = dVar.x;
                    java.lang.Object obj2 = ef3.bar.a;
                    i = dVar.z;
                    barVar2 = this.e;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        barVar2.a = this;
                        boolean a2 = getInputData().a("backupNow", false);
                        int runAttemptCount = getRunAttemptCount();
                        dVar.z = 1;
                        obj = ((dg0.l) barVar2).e2(runAttemptCount, dVar, a2);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    com.truecaller.backup.worker.BackupWorkResult backupWorkResult = (com.truecaller.backup.worker.BackupWorkResult) obj;
                    java.util.Objects.toString(backupWorkResult);
                    i2 = dg0.a.a[backupWorkResult.ordinal()];
                    if (i2 == 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                a = new nd.q();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "failure(...)");
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            a = new java.lang.Object();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "retry(...)");
                        }
                    } else {
                        a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    }
                    return a;
                }
            }
            if (i == 0) {
            }
            com.truecaller.backup.worker.BackupWorkResult backupWorkResult2 = (com.truecaller.backup.worker.BackupWorkResult) obj;
            java.util.Objects.toString(backupWorkResult2);
            i2 = dg0.a.a[backupWorkResult2.ordinal()];
            if (i2 == 1) {
            }
            return a;
        } finally {
            ((dg0.l) barVar2).m1();
        }
        dVar = new dg0.d(this, (ff3.qux) barVar);
        java.lang.Object obj3 = dVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = dVar.z;
        barVar2 = this.e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21)(1:26))|19))|29|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r2.setForeground((nd.m) r7, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(r7);
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(ff3.qux quxVar) {
        dg0.b bVar;
        int i;
        com.truecaller.backup.worker.BackupWorker backupWorker;
        if (quxVar instanceof dg0.b) {
            bVar = (dg0.b) quxVar;
            int i2 = bVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = bVar.A;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return java.lang.Boolean.valueOf(z);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    backupWorker = bVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bVar.x = this;
                    bVar.A = 1;
                    obj = getForegroundInfo(bVar);
                    if (obj != barVar) {
                        backupWorker = this;
                    } else {
                        return barVar;
                    }
                }
                bVar.x = null;
                bVar.A = 2;
            }
        }
        bVar = new dg0.b(this, quxVar);
        java.lang.Object obj2 = bVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = bVar.A;
        boolean z2 = true;
        if (i == 0) {
        }
        bVar.x = null;
        bVar.A = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object f(boolean z, ff3.qux quxVar) {
        dg0.c cVar;
        int i;
        if (quxVar instanceof dg0.c) {
            cVar = (dg0.c) quxVar;
            int i2 = cVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = cVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (z) {
                        cVar.z = 1;
                        obj = e(cVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    ((s62.d) this.f.get()).v(2131362401, (android.app.Notification) this.h.getValue(), com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationBackup");
                    return kotlin.Unit.a;
                }
            }
        }
        cVar = new dg0.c(this, quxVar);
        java.lang.Object obj3 = cVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = cVar.z;
        if (i == 0) {
        }
    }

    public final void g(int i) {
        android.content.Context context = this.a;
        int s = bi3.a.s(context, 2130970634);
        qc3.bar barVar = this.f;
        java.lang.Object obj = barVar.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        java.lang.Object obj2 = this.d.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        s62.f fVar = (s62.d) obj;
        android.app.PendingIntent k = fVar.k(pushNotificationSource.getType(), 0, 201326592, this.a, (android.content.Intent) obj2, "notificationBackup");
        f6.r b = new f6.q(2131232690, context.getString(2132019503), k).b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "build(...)");
        f6.f0 f0Var = new f6.f0(context, ((s62.d) barVar.get()).o("backup"));
        f0Var.D = s;
        f0Var.Q.icon = 2131232452;
        f0Var.e = f6.f0.e(context.getString(2132019504));
        f0Var.f = f6.f0.e(context.getString(i));
        f0Var.g = k;
        f0Var.b(b);
        f0Var.l(16, true);
        android.app.Notification d = f0Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
        ((s62.d) barVar.get()).v(2131362400, d, pushNotificationSource.getType(), "notificationBackup");
    }

    public final java.lang.Object getForegroundInfo(df3.bar barVar) {
        int i = android.os.Build.VERSION.SDK_INT;
        kotlin.Lazy lazy = this.h;
        if (i >= 29) {
            return new nd.m(2131362401, (android.app.Notification) lazy.getValue(), 1);
        }
        return new nd.m(2131362401, (android.app.Notification) lazy.getValue(), 0);
    }
}
