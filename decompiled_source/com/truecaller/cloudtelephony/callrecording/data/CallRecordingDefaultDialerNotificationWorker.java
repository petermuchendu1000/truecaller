package com.truecaller.cloudtelephony.callrecording.data;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingDefaultDialerNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ls62/d;", "notificationManager", "Lu03/b0;", "resourceProvider", "Lu03/b;", "deviceInfoUtil", "Lqo1/f;", "featuresInventory", "Ls01/d;", "pendingIntentBuilder", "Lqz0/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ls62/d;Lu03/b0;Lu03/b;Lqo1/f;Ls01/d;Lqz0/bar;)V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDefaultDialerNotificationWorker extends androidx.work.CoroutineWorker {
    public final s62.d a;
    public final u03.b0 b;
    public final u03.b c;
    public final s01.d d;
    public final qz0.bar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRecordingDefaultDialerNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull u03.b0 b0Var, @org.jetbrains.annotations.NotNull u03.b bVar, @org.jetbrains.annotations.NotNull qo1.f fVar, @org.jetbrains.annotations.NotNull s01.d dVar2, @org.jetbrains.annotations.NotNull qz0.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "featuresInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "pendingIntentBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = dVar;
        this.b = b0Var;
        this.c = bVar;
        this.d = dVar2;
        this.e = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        rz0.baz bazVar;
        int i;
        f6.f0 f0Var;
        if (quxVar instanceof rz0.baz) {
            bazVar = (rz0.baz) quxVar;
            int i2 = bazVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.A = i2 - Integer.MIN_VALUE;
                rz0.baz bazVar2 = bazVar;
                java.lang.Object obj = bazVar2.y;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar2.A;
                s62.f fVar = this.a;
                if (i == 0) {
                    if (i == 1) {
                        f0Var = bazVar2.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bd.bar.u(((qz0.qux) this.e).a, "CallRecordingChangeDialerNotification", "CallRecordingPromo");
                    u03.g0 g0Var = this.b;
                    java.lang.String h = g0Var.h(2132020017, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                    java.lang.String h2 = g0Var.h(2132020016, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                    f6.f0 f0Var2 = new f6.f0(getApplicationContext(), fVar.o("ct_call_recording"));
                    f0Var2.e = f6.f0.e(h);
                    f0Var2.f = f6.f0.e(h2);
                    f0Var2.Q.icon = 2131232902;
                    f0Var2.D = getApplicationContext().getColor(2131102024);
                    f6.y yVar = new f6.y(0);
                    yVar.f = f6.f0.e(h2);
                    f0Var2.t(yVar);
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                    bazVar2.x = f0Var2;
                    bazVar2.A = 1;
                    obj = ((uj0.qux) this.d).q(applicationContext, pushNotificationSource, "CallRecordingPromo", true, bazVar2);
                    if (obj == barVar) {
                        return barVar;
                    }
                    f0Var = f0Var2;
                }
                f0Var.g = (android.app.PendingIntent) obj;
                f0Var.l(16, true);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                android.app.Notification d = f0Var.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                fVar.v(2131362772, d, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "CallRecordingPromo");
                return kotlin.Unit.a;
            }
        }
        bazVar = new rz0.baz(this, quxVar);
        rz0.baz bazVar22 = bazVar;
        java.lang.Object obj2 = bazVar22.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = bazVar22.A;
        s62.f fVar2 = this.a;
        if (i == 0) {
        }
        f0Var.g = (android.app.PendingIntent) obj2;
        f0Var.l(16, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
        android.app.Notification d2 = f0Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
        fVar2.v(2131362772, d2, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "CallRecordingPromo");
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        rz0.bar barVar2;
        int i;
        int b;
        int i2;
        long j;
        int i3;
        if (barVar instanceof rz0.bar) {
            barVar2 = (rz0.bar) barVar;
            int i4 = barVar2.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                barVar2.C = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.A;
                java.lang.Object obj2 = ef3.bar.a;
                i = barVar2.C;
                if (i == 0) {
                    if (i == 1) {
                        j = barVar2.z;
                        b = barVar2.y;
                        i2 = barVar2.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    int b2 = getInputData().b("frequency", 0);
                    b = getInputData().b("timesRan", 0);
                    long d = getInputData().d("duration", 0L);
                    if (!this.c.o()) {
                        barVar2.x = b2;
                        barVar2.y = b;
                        barVar2.z = d;
                        barVar2.C = 1;
                        if (a(barVar2) == obj2) {
                            return obj2;
                        }
                        i2 = b2;
                        j = d;
                    }
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
                i3 = b + 1;
                if (i3 < i2) {
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("frequency", "key");
                    linkedHashMap.put("frequency", java.lang.Integer.valueOf(i2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("timesRan", "key");
                    linkedHashMap.put("timesRan", java.lang.Integer.valueOf(i3));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("duration", "key");
                    linkedHashMap.put("duration", java.lang.Long.valueOf(j));
                    nd.g gVar = new nd.g(linkedHashMap);
                    mf0.o.K(gVar);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.cloudtelephony.callrecording.data.CallRecordingDefaultDialerNotificationWorker.class, "workerClass");
                    os0.bar.z(applicationContext, "context", applicationContext, "getInstance(...)").g("call_recording_dialer_notification", nd.l.a, new f6.v0(com.truecaller.cloudtelephony.callrecording.data.CallRecordingDefaultDialerNotificationWorker.class).y(gVar).b("call_recording_dialer_notification").x(j, java.util.concurrent.TimeUnit.HOURS).d());
                }
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        barVar2 = new rz0.bar(this, (ff3.qux) barVar);
        java.lang.Object obj3 = barVar2.A;
        java.lang.Object obj22 = ef3.bar.a;
        i = barVar2.C;
        if (i == 0) {
        }
        i3 = b + 1;
        if (i3 < i2) {
        }
        nd.s a22 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22, "success(...)");
        return a22;
    }
}
