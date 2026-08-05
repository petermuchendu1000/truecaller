package com.truecaller.voicemail.presentation.downloadservice.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailDownloadService extends n21.a implements bd3.qux {
    public volatile yc3.g c;
    public a53.baz f;
    public z43.bar g;
    public final java.lang.Object d = new java.lang.Object();
    public boolean e = false;
    public final int h = 2131367578;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.c.X3();
    }

    public final int a() {
        return this.h;
    }

    public final com.google.android.gms.internal.ads.ej b() {
        z43.bar barVar = this.g;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("voicemailNotificationManager");
        throw null;
    }

    public final n21.d c() {
        a53.baz bazVar = this.f;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("voicemailManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, v2.x0] */
    /* JADX WARN: Type inference failed for: r16v0, types: [y.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.firebase.messaging.o] */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.e) {
            this.e = true;
            tx.w wVar = ((a53.qux) X3()).b;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            tx.c0 c0Var = wVar.b;
            tx.w wVar2 = c0Var.a;
            tx.w wVar3 = c0Var.a;
            g43.a p4 = wVar2.p4();
            v33.a0 a0Var = (v33.a0) wVar2.Xj.get();
            q53.baz bazVar = (q53.baz) c0Var.Hc.get();
            r43.baz bazVar2 = new r43.baz((su0.b) wVar2.Qh.get(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "downloader");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "voicemailRepository");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "voicemailCallerInfoRepository");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "voicemailCallHistoryManagerDelegate");
            ?? obj = new java.lang.Object();
            ((com.google.firebase.messaging.o) obj).a = p4;
            ((com.google.firebase.messaging.o) obj).b = a0Var;
            ((com.google.firebase.messaging.o) obj).c = bazVar;
            ((com.google.firebase.messaging.o) obj).d = bazVar2;
            this.f = new a53.baz(coroutineContext, obj);
            android.content.Context context = (android.content.Context) wVar.I.get();
            s62.d dVar = (s62.d) wVar.P2.get();
            b53.bar barVar = (b53.bar) c0Var.R6.get();
            s62.d dVar2 = (s62.d) wVar3.P2.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "navigator");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "notificationManager");
            ?? obj2 = new java.lang.Object();
            ((v2.x0) obj2).a = barVar;
            ((v2.x0) obj2).b = dVar2;
            this.g = new z43.bar(context, dVar, obj2, new java.lang.Object(), new a53.bar((android.content.Context) wVar3.I.get(), 6));
        }
        super.onCreate();
    }
}
