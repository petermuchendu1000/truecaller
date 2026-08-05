package com.truecaller.messaging.transport.im;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ImSubscriptionService extends android.app.Service implements bd3.qux {
    public static final /* synthetic */ int i = 0;
    public volatile yc3.g a;
    public co.t e;
    public f42.n0 h;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public final e7.bar d = new android.os.Binder();
    public final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper());
    public final ea.i g = new ea.i(this, 10);

    public final java.lang.Object X3() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.a.X3();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ab.baz] */
    public final void a() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((f42.o0) X3()).b;
            tx.w wVar2 = wVar.b.a;
            this.h = new f42.n0((u03.baz) wVar2.W.get(), new java.lang.Object(), (f42.l0) wVar2.Tq.get(), wVar2.J0());
        }
        super.onCreate();
    }

    public final void b() {
        this.f.removeCallbacks(this.g);
        try {
            startService(new android.content.Intent(this, (java.lang.Class<?>) com.truecaller.messaging.transport.im.ImSubscriptionService.class));
        } catch (java.lang.IllegalStateException e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        b();
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        a();
        co.t tVar = new co.t(this, 12);
        this.e = tVar;
        g6.b.k(this, tVar, new android.content.IntentFilter("im_subscription_completed"), 4);
        f42.n0 n0Var = this.h;
        if (n0Var != null) {
            n0Var.c();
        } else {
            kotlin.jvm.internal.Intrinsics.n("subscriptionManager");
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        unregisterReceiver(this.e);
        f42.n0 n0Var = this.h;
        if (n0Var != null) {
            com.truecaller.messaging.notifications.baz bazVar = n0Var.g;
            if (bazVar != null) {
                bazVar.post(new f42.m0(n0Var, 0));
            }
            super.onDestroy();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("subscriptionManager");
        throw null;
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        b();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i2, int i3) {
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        this.f.postDelayed(this.g, 10000L);
        return true;
    }
}
