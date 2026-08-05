package com.truecaller.call_assistant.presentation.downloadservice;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantDownloadService extends n21.a implements bd3.qux {
    public volatile yc3.g c;
    public final java.lang.Object d = new java.lang.Object();
    public boolean e = false;
    public qs0.bar f;
    public rs0.baz g;

    /* JADX WARN: Multi-variable type inference failed */
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
        return 2131362337;
    }

    public final com.google.android.gms.internal.ads.ej b() {
        rs0.baz bazVar = this.g;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("assistantNotificationManager");
        throw null;
    }

    public final n21.d c() {
        qs0.bar barVar = this.f;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("assistantServiceManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [uk2.t, java.lang.Object] */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.e) {
            this.e = true;
            tx.w wVar = ((tx.q) ((qs0.baz) X3())).b;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            tx.c0 c0Var = wVar.b;
            tx.w wVar2 = c0Var.a;
            kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) wVar2.P.get();
            uk2.h hVar = new uk2.h(wVar2.N3());
            okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) wVar2.Uj.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "ioContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "fileDelegate");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "httpClient");
            com.criteo.publisher.f fVar = new com.criteo.publisher.f(coroutineContext2, hVar, okHttpClient);
            hr0.o oVar = (hr0.o) wVar2.Oj.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "downloader");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "repository");
            ?? obj = new java.lang.Object();
            ((uk2.t) obj).a = fVar;
            ((uk2.t) obj).b = oVar;
            this.f = new qs0.bar(coroutineContext, obj);
            this.g = new rs0.baz((android.content.Context) wVar.I.get(), (s62.d) wVar.P2.get(), new a53.bar((android.content.Context) c0Var.a.I.get(), 6));
        }
        super.onCreate();
    }
}
