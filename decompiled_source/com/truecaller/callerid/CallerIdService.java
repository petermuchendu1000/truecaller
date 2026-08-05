package com.truecaller.callerid;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallerIdService extends androidx.lifecycle.g0 implements fg3.e0, bd3.qux {
    public static final cu0.t0 n = new java.lang.Object();
    public static j72.d o;
    public volatile yc3.g b;
    public cu0.j0 e;
    public s62.d f;
    public u03.w g;
    public cu0.e1 h;
    public kotlin.coroutines.CoroutineContext i;
    public boolean k;
    public boolean l;
    public boolean m;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public final kotlin.Lazy j = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(25));

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        this.b = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.b.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.app.Notification a() {
        s62.f fVar = this.f;
        if (fVar != null) {
            f6.f0 f0Var = new f6.f0(this, fVar.o("caller_id"));
            f0Var.Q.icon = 2131233338;
            f0Var.e = f6.f0.e(getString(2132017662));
            f0Var.D = getColor(2131102024);
            android.app.Notification d = f0Var.d();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
            return d;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                com.huawei.hms.framework.common.bar.u(this, a());
                return true;
            } catch (android.app.ForegroundServiceStartNotAllowedException e) {
                o82.a.C(e);
                return false;
            }
        }
        startForeground(2131362802, a());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.mbridge.msdk.config.component.common.express.operator.baz.u(this);
        } else {
            stopForeground(true);
        }
        s62.f fVar = this.f;
        if (fVar != null) {
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
            fVar.a(2131362802, pushNotificationSource.getType(), "callerId");
            s62.f fVar2 = this.f;
            if (fVar2 != null) {
                if (fVar2.u(2131362802)) {
                    o82.a.D("CallerIdService notification channel exists, despite service stopped with notification removal.");
                    s62.f fVar3 = this.f;
                    if (fVar3 != null) {
                        fVar3.a(2131362802, pushNotificationSource.getType(), "callerId");
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("notificationManager");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationManager");
        throw null;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.i;
        if (coroutineContext != null) {
            return coroutineContext.plus((fg3.o1) this.j.getValue());
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super.onBind(intent);
        cu0.t0.a("[CallerIdService] onBind: Stopping foreground");
        this.l = true;
        c();
        return new android.os.Binder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super/*android.app.Service*/.onConfigurationChanged(configuration);
        cu0.e1 e1Var = this.h;
        if (e1Var != null) {
            hu0.q0 q0Var = e1Var.l;
            if (q0Var != null) {
                android.view.ContextThemeWrapper contextThemeWrapper = q0Var.a;
                android.util.DisplayMetrics displayMetrics = contextThemeWrapper.getResources().getDisplayMetrics();
                q0Var.j = displayMetrics.widthPixels;
                q0Var.k = displayMetrics.heightPixels - m03.v.f(contextThemeWrapper.getResources());
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("callerIdWindowHolder");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.d) {
            this.d = true;
            tx.w wVar = ((tx.q) ((cu0.z0) X3())).b;
            tx.c0 c0Var = wVar.b;
            this.e = (cu0.j0) c0Var.P3.get();
            this.f = (s62.d) wVar.P2.get();
            this.g = (u03.w) wVar.n1.get();
            this.h = (cu0.e1) c0Var.D3.get();
            this.i = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
        }
        super.onCreate();
    }

    public final void onDestroy() {
        cu0.j0 j0Var = this.e;
        if (j0Var != null) {
            j0Var.H.stop();
            j0Var.k0 = null;
            hi3.e eVar = new hi3.e(qx2.s4.f, qx2.s4.g);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eVar, "newBuilder(...)");
            j0Var.j0 = eVar;
            o = null;
            cu0.e1 e1Var = this.h;
            if (e1Var != null) {
                fg3.r1 r1Var = e1Var.j;
                if (r1Var.isActive()) {
                    fg3.h0.o(r1Var);
                }
                e1Var.k = null;
                e1Var.l = null;
                ((fg3.o1) this.j.getValue()).cancel((java.util.concurrent.CancellationException) null);
                super.onDestroy();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("callerIdWindowHolder");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("callerIdManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        super/*android.app.Service*/.onStartCommand(intent, i, i2);
        boolean b = b();
        df3.bar barVar = null;
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cu0.u0(2, 0, barVar), 3);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = "";
        }
        o82.a.D("[CallerIdService] onStartCommand called with intent : " + intent + " action: " + str + " startId: " + i2);
        if (!this.m) {
            this.m = true;
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cu0.w0(this, barVar, 1), 3);
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cu0.w0(this, barVar, 3), 3);
        }
        if (!b && !this.l) {
            cu0.t0.a("[CallerIdService] onStartCommand: Start foreground fail. Stopping service.");
            this.k = true;
            stopSelf(i2);
            return 2;
        }
        if (b) {
            cu0.t0.a("[CallerIdService] onStartCommand: Start foreground success.");
        }
        if (this.l && b) {
            c();
            cu0.t0.a("[CallerIdService] onStartCommand: Stopped foreground. Service is bound.");
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onUnbind(android.content.Intent intent) {
        this.l = false;
        if (!this.k) {
            cu0.t0.a("[CallerIdService] onUnbind: Starting foreground");
            b();
        }
        return super/*android.app.Service*/.onUnbind(intent);
    }
}
