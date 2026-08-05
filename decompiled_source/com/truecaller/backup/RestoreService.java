package com.truecaller.backup;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RestoreService extends r42.baz implements yf0.u4 {
    public yf0.y4 e;
    public s62.d f;

    public RestoreService() {
        super(1);
    }

    public final s62.d b() {
        s62.d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "channelId");
        android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.backup.RestoreService.class);
        s62.f b = b();
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        f6.r b2 = new f6.q(2131232690, getString(2132019059), b.s(this, intent, pushNotificationSource.getType(), "notificationBackup")).b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b2, "build(...)");
        f6.f0 f0Var = new f6.f0(this, str);
        f0Var.D = getColor(2131099683);
        f0Var.Q.icon = 2131232452;
        f0Var.e = f6.f0.e(getString(2132019512));
        f0Var.f = f6.f0.e(getString(2132019499));
        f0Var.b(b2);
        f0Var.l(16, true);
        android.app.Notification d = f0Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
        b().w((java.lang.String) null, 2131366148, d, pushNotificationSource.getType(), "notificationBackup");
    }

    public final /* bridge */ /* synthetic */ android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        super.onCreate();
        yf0.y4 y4Var = this.e;
        if (y4Var != null) {
            ((com.truecaller.sdk.bar) y4Var).a = this;
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*android.app.Service*/.onDestroy();
        yf0.y4 y4Var = this.e;
        if (y4Var != null) {
            y4Var.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context, android.app.Service, com.truecaller.backup.RestoreService] */
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        yf0.y4 y4Var = this.e;
        if (y4Var != null) {
            java.lang.String o = y4Var.l.o("backup");
            yf0.u4 u4Var = (yf0.u4) ((com.truecaller.sdk.bar) y4Var).a;
            if (u4Var != null) {
                ((com.truecaller.backup.RestoreService) u4Var).b().a(2131366148, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationBackup");
            }
            yf0.u4 u4Var2 = (yf0.u4) ((com.truecaller.sdk.bar) y4Var).a;
            if (u4Var2 != null) {
                ?? r0 = (com.truecaller.backup.RestoreService) u4Var2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o, "channelId");
                f6.f0 f0Var = new f6.f0((android.content.Context) r0, o);
                f0Var.D = r0.getColor(2131099683);
                f0Var.Q.icon = android.R.drawable.stat_sys_download;
                f0Var.e = f6.f0.e(r0.getString(2132022542));
                f0Var.l(2, true);
                f0Var.q(0, 0, true);
                android.app.Notification d = f0Var.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                r0.startForeground(2131366149, d);
                o82.a.D("[RestoreService] startForeground called");
                r0.b().w((java.lang.String) null, 2131366149, d, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationBackup");
            }
            r42.baz bazVar = (yf0.u4) ((com.truecaller.sdk.bar) y4Var).a;
            if (bazVar != null) {
                android.widget.Toast.makeText((android.content.Context) bazVar, 2132022542, 1).show();
                kotlin.Unit unit = kotlin.Unit.a;
            }
            fg3.h0.J(y4Var, y4Var.d, (fg3.f0) null, new xr1.d(y4Var, (df3.bar) null, 24), 2);
            return 2;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context, android.app.Service, com.truecaller.backup.RestoreService] */
    public final void onTimeout(int i, int i2) {
        super/*android.app.Service*/.onTimeout(i, i2);
        yf0.y4 y4Var = this.e;
        if (y4Var != null) {
            yf0.u4 u4Var = (yf0.u4) ((com.truecaller.sdk.bar) y4Var).a;
            if (u4Var != null) {
                ?? r6 = (com.truecaller.backup.RestoreService) u4Var;
                androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance((android.content.Context) r6);
                android.content.Intent intent = new android.content.Intent("com.truecaller.action.RESTORE_COMPLETED");
                intent.putExtra("com.truecaller.extra.RESTORE_SUCCESSFUL", false);
                localBroadcastManager.sendBroadcast(intent);
                r6.c(y4Var.l.o("backup"));
                xg1.baz.q((com.truecaller.backup.RestoreService) r6);
                r6.stopSelf();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
