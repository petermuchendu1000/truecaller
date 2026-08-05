package com.truecaller.whatsapp_caller_id.internal.callerid;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhatsAppCallerIdService extends android.app.Service implements bd3.qux {
    public static final /* synthetic */ int l = 0;
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public fe3.bar d;
    public m63.f e;
    public s62.d f;
    public kotlin.coroutines.CoroutineContext g;
    public x62.baz h;
    public dq1.h i;
    public g63.bar j;
    public e00.p k;

    @Override // bd3.baz
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

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, dq1.h] */
    public final void a() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.q qVar = (l63.a) X3();
            this.e = (m63.f) qVar.g.get();
            tx.w wVar = qVar.b;
            this.f = (s62.d) wVar.P2.get();
            this.g = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            this.h = (x62.baz) qVar.h.get();
            com.truecaller.acs.AfterCallScreen afterCallScreen = (com.truecaller.acs.AfterCallScreen) wVar.xq.get();
            u03.baz bazVar = (u03.baz) wVar.W.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterCallScreen, "afterCallScreen");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
            ?? obj = new java.lang.Object();
            ((dq1.h) obj).a = afterCallScreen;
            ((dq1.h) obj).b = bazVar;
            this.i = obj;
            this.j = (g63.bar) wVar.b.xd.get();
            this.k = (e00.p) wVar.Hq.get();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        a();
        fg3.m2 e = fg3.h0.e();
        kotlin.coroutines.CoroutineContext coroutineContext = this.g;
        if (coroutineContext != null) {
            fe3.bar b = fg3.h0.b(kotlin.coroutines.b.d(e, coroutineContext));
            this.d = b;
            fg3.h0.J(b, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new jp2.b(this, null, 24), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("context");
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        s62.f fVar = this.f;
        if (fVar != null) {
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
            fVar.a(2131362802, pushNotificationSource.getType(), "callerId");
            s62.f fVar2 = this.f;
            if (fVar2 != null) {
                if (fVar2.u(2131362802)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("WhatsCallerIdService notification channel exists, despite service stopped with notification removal. Retrying...", "msg");
                    s62.f fVar3 = this.f;
                    if (fVar3 != null) {
                        fVar3.a(2131362802, pushNotificationSource.getType(), "callerId");
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                        throw null;
                    }
                }
                fe3.bar barVar = this.d;
                if (barVar != null) {
                    fg3.h0.k(barVar, (java.util.concurrent.CancellationException) null);
                    super.onDestroy();
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("serviceScope");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        super.onStartCommand(intent, i, i2);
        s62.f fVar = this.f;
        if (fVar != null) {
            f6.f0 f0Var = new f6.f0(this, fVar.o("caller_id"));
            f0Var.Q.icon = 2131232902;
            f0Var.e = f6.f0.e(getString(2132023896));
            f0Var.D = getColor(2131102024);
            android.app.Notification d = f0Var.d();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
            startForeground(2131362802, d);
            if (intent != null) {
                str = intent.getStringExtra("KEY_NUMBER");
            } else {
                str = null;
            }
            if (str != null) {
                m63.qux quxVar = new m63.qux(str, intent.getIntExtra("KEY_NOTIFICATION_ACTIONS_SIZE", 0));
                fe3.bar barVar = this.d;
                if (barVar != null) {
                    fg3.h0.J(barVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new k5.l(this, quxVar, (df3.bar) null, 26), 3);
                    return 2;
                }
                kotlin.jvm.internal.Intrinsics.n("serviceScope");
                throw null;
            }
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
        throw null;
    }
}
