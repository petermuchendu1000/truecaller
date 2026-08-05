package com.truecaller.call_assistant.core.service;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCallUIService extends androidx.lifecycle.g0 implements jr0.qux {
    public static boolean l;
    public cn0.a b;
    public a71.a c;
    public vn0.bar d;
    public nu0.a e;
    public a71.a f;
    public le2.v g;
    public h0.k h;
    public s62.d i;
    public fg3.k2 j;
    public final co.t k = new co.t(this, 18);

    public final void a(java.lang.String str, java.lang.String str2, com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatar");
        fg3.k2 k2Var = this.j;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        this.j = fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new jr0.baz(this, i, str, str2, avatarXConfig, z, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        super.onCreate();
        rn0.b0 b0Var = (rn0.b0) mk.m.w(this).a;
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) b0Var.c.get();
        rn0.bar barVar = (rn0.bar) b0Var.C.get();
        lu0.baz bazVar = (lu0.baz) b0Var.d.get();
        tx.w wVar = (tx.w) b0Var.a;
        b91.a aVar = new b91.a(28);
        q81.b bVar = (q81.b) wVar.S5.get();
        es.baz.k(bVar);
        this.b = new cn0.a(coroutineContext, barVar, bazVar, aVar, bVar, (rn0.s) b0Var.l.get(), (rn0.m) b0Var.r.get());
        android.content.Context a = wVar.a();
        es.baz.k(a);
        android.content.Context a2 = wVar.a();
        es.baz.k(a2);
        kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) wVar.H0.get();
        es.baz.k(coroutineContext2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "cpuContext");
        k41.baz bazVar2 = new k41.baz(yy.qux.v(a2, true), coroutineContext2, android.R.dimen.notification_large_icon_height);
        tx.w wVar2 = wVar.H;
        dq1.d dVar = new dq1.d(1, (kotlin.coroutines.CoroutineContext) wVar2.b.a.P.get());
        tx.w wVar3 = wVar2.b.a;
        le2.v vVar = new le2.v((android.content.Context) wVar3.I.get(), (qo1.b) wVar3.p8.get());
        s62.d d4 = wVar.d4();
        es.baz.k(d4);
        this.c = new a71.a(a, bazVar2, dVar, vVar, d4);
        android.content.Context a3 = wVar.a();
        es.baz.k(a3);
        kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) b0Var.c.get();
        rn0.bar barVar2 = (rn0.bar) b0Var.C.get();
        lu0.baz bazVar3 = (lu0.baz) b0Var.d.get();
        b91.a aVar2 = new b91.a(28);
        u03.b0 b0Var2 = (u03.b0) wVar.v4.get();
        es.baz.k(b0Var2);
        fb1.c cVar = new fb1.c(coroutineContext3, barVar2, bazVar3, aVar2, b0Var2, (rn0.m) b0Var.r.get());
        wi.qux R2 = wVar2.b.R2();
        u03.b0 b0Var3 = (u03.b0) wVar.v4.get();
        es.baz.k(b0Var3);
        u03.baz bazVar4 = (u03.baz) wVar.W.get();
        es.baz.k(bazVar4);
        tx.w wVar4 = wVar2.b.a;
        le2.v vVar2 = new le2.v((android.content.Context) wVar4.I.get(), (qo1.b) wVar4.p8.get());
        s62.d d42 = wVar.d4();
        es.baz.k(d42);
        this.d = new vn0.bar(a3, cVar, R2, b0Var3, bazVar4, vVar2, d42);
        this.e = new nu0.a((su0.b) wVar2.b.a.Qh.get());
        this.f = wVar.G();
        tx.w wVar5 = wVar2.b.a;
        this.g = new le2.v((android.content.Context) wVar5.I.get(), (qo1.b) wVar5.p8.get());
        this.h = new h0.k(28);
        s62.d d43 = wVar.d4();
        es.baz.k(d43);
        this.i = d43;
        l = true;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        registerReceiver(this.k, intentFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n62.c, java.lang.Object] */
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.k);
        vn0.bar barVar = this.d;
        if (barVar != null) {
            barVar.b.m1();
            ?? r2 = barVar.h;
            if (r2 != 0) {
                r2.destroy();
            }
            barVar.h = null;
            barVar.g = null;
            l = false;
            cn0.a aVar = this.b;
            if (aVar != null) {
                aVar.m1();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("ongoingCallNotification");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        android.content.Intent intent2;
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        if (intent != null) {
            if (intent.getBooleanExtra("is_ongoing_push", false)) {
                intent2 = intent;
            } else {
                intent2 = null;
            }
            if (intent2 != null && (stringExtra = intent2.getStringExtra("notification_title")) != null && (stringExtra2 = intent2.getStringExtra("notification_body")) != null) {
                boolean booleanExtra = intent2.getBooleanExtra("is_assistant_v2_enabled", false);
                cn0.a aVar = this.b;
                if (aVar != null) {
                    aVar.g2(stringExtra, stringExtra2, booleanExtra);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("presenter");
                    throw null;
                }
            }
        }
        cn0.a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.u0(this);
            return super/*android.app.Service*/.onStartCommand(intent, i, i2);
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
