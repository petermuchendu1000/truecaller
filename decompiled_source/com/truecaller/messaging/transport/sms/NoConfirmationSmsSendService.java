package com.truecaller.messaging.transport.sms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NoConfirmationSmsSendService extends android.app.Service implements bd3.qux {
    public static final /* synthetic */ int k = 0;
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public kotlin.coroutines.CoroutineContext d;
    public qc3.bar e;
    public qc3.bar f;
    public qc3.bar g;
    public qc3.bar h;
    public qc3.bar i;
    public qc3.bar j;

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

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((m42.baz) X3()).b;
            this.d = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            this.e = cd3.baz.a(wVar.h1);
            this.f = cd3.baz.a(wVar.A1);
            this.g = cd3.baz.a(wVar.y3);
            this.h = cd3.baz.a(wVar.r9);
            this.i = cd3.baz.a(wVar.Mg);
            this.j = cd3.baz.a(wVar.m9);
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, final int i2) {
        if (intent == null) {
            return super.onStartCommand(intent, i, i2);
        }
        if (!"android.intent.action.RESPOND_VIA_MESSAGE".equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        android.net.Uri data = intent.getData();
        if (data == null) {
            intent.toString();
            return super.onStartCommand(intent, i, i2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (intent.hasExtra("android.intent.extra.SUBJECT")) {
            sb.append(intent.getStringExtra("android.intent.extra.SUBJECT"));
            if (intent.hasExtra("android.intent.extra.TEXT")) {
                sb.append('\n');
            }
        }
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        sb.append(stringExtra);
        if (sb.length() == 0) {
            return super.onStartCommand(intent, i, i2);
        }
        qc3.bar barVar = this.e;
        if (barVar != null) {
            java.lang.String q = ((y42.f) barVar.get()).q(intent);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(q, "getSimTokenFromRespondViaMessageIntent(...)");
            if ("-1".equals(q)) {
                qc3.bar barVar2 = this.e;
                if (barVar2 != null) {
                    q = ((y42.f) barVar2.get()).h();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(q, "getDefaultSimToken(...)");
                } else {
                    kotlin.jvm.internal.Intrinsics.n("multiSimManager");
                    throw null;
                }
            }
            qc3.bar barVar3 = this.f;
            if (barVar3 != null) {
                com.truecaller.data.entity.messaging.Participant[] c = com.truecaller.data.entity.messaging.Participant.c(data, (t41.t) barVar3.get(), q);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "buildFromDataUri(...)");
                if (c.length == 0) {
                    intent.toString();
                    return super.onStartCommand(intent, i, i2);
                }
                c22.b bVar = new c22.b();
                for (com.truecaller.data.entity.messaging.Participant participant : c) {
                    kotlin.jvm.internal.Intrinsics.d(participant);
                    bVar.c.add(participant);
                }
                bVar.d = sb.toString();
                com.truecaller.messaging.data.types.Draft draft = new com.truecaller.messaging.data.types.Draft(bVar);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(draft, "build(...)");
                com.truecaller.messaging.data.types.Message a = draft.a(q, "inCall");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "buildMessage(...)");
                qc3.bar barVar4 = this.g;
                if (barVar4 != null) {
                    e42.w wVar = (e42.w) ((e42.s) barVar4.get());
                    wVar.getClass();
                    wVar.p(a, new com.truecaller.data.entity.messaging.Participant[]{a.c}, false, false).E(new xd0.s() { // from class: m42.bar
                        public final void onResult(java.lang.Object obj) {
                            int i3 = com.truecaller.messaging.transport.sms.NoConfirmationSmsSendService.k;
                            com.truecaller.messaging.transport.sms.NoConfirmationSmsSendService.this.stopSelf(i2);
                        }
                    });
                    kotlin.coroutines.CoroutineContext coroutineContext = this.d;
                    if (coroutineContext != null) {
                        fg3.h0.J(fg3.f1.a, coroutineContext, (fg3.f0) null, new lj0.baz(this, c, (df3.bar) null, 27), 2);
                        return super.onStartCommand(intent, i, i2);
                    }
                    kotlin.jvm.internal.Intrinsics.n("uiCoroutineContext");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("transportManager");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("phoneNumberHelper");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("multiSimManager");
        throw null;
    }
}
