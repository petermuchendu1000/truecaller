package com.truecaller.cloudtelephony.callrecording.ui.downloadservice;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDownloadService extends androidx.lifecycle.g0 implements g01.baz, bd3.qux {
    public volatile yc3.g b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public g01.c e;
    public boolean f;

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
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.d) {
            this.d = true;
            tx.c0 c0Var = ((tx.q) ((g01.d) X3())).b.b;
            tx.w wVar = c0Var.a;
            this.e = new g01.c((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (android.content.Context) wVar.I.get(), (o01.baz) c0Var.K7.get(), (rz0.f) c0Var.ad.get());
        }
        super.onCreate();
    }

    public final void onDestroy() {
        g01.c cVar = this.e;
        if (cVar != null) {
            cVar.m1();
            super.onDestroy();
            this.f = false;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.app.Service, com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.app.Service, com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService] */
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        g01.c cVar = this.e;
        if (cVar != null) {
            ((com.truecaller.sdk.bar) cVar).a = this;
            if (cVar != null) {
                o01.baz bazVar = cVar.f;
                int i3 = cVar.l;
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 228884754) {
                        if (hashCode != 498380371) {
                            if (hashCode == 1259523214 && str.equals("CALL_RECORDING_DOWNLOAD_REQUEST_ACTION")) {
                                java.lang.String stringExtra2 = intent.getStringExtra("CREATED_AT");
                                if (stringExtra2 != null && (stringExtra = intent.getStringExtra("RECORDING_ID")) != null) {
                                    cVar.n = intent.getStringExtra("RECORDING_READY_PUSH_BODY");
                                    cVar.m = intent.getStringExtra("RECORDING_READY_PUSH_TITLE");
                                    java.util.LinkedHashMap linkedHashMap = cVar.h;
                                    cVar.i = false;
                                    g01.baz bazVar2 = (g01.baz) ((com.truecaller.sdk.bar) cVar).a;
                                    if (bazVar2 != null) {
                                        ?? r9 = (com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService) bazVar2;
                                        if (!r9.f) {
                                            android.content.Context context = bazVar.a;
                                            f6.f0 f0Var = new f6.f0(context, bazVar.e.o("backup"));
                                            f0Var.e = f6.f0.e(context.getString(2132017583));
                                            f0Var.l(8, true);
                                            f0Var.q(100, 0, false);
                                            f0Var.Q.icon = 2131232902;
                                            f0Var.l = -1;
                                            android.app.Notification d = f0Var.d();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "notification");
                                            if (android.os.Build.VERSION.SDK_INT < 34) {
                                                r9.startForeground(i3, d);
                                            } else {
                                                df.f.x((com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService) r9, i3, d);
                                            }
                                            r9.f = true;
                                        }
                                    }
                                    fg3.k2 k2Var = cVar.j;
                                    df3.bar barVar = null;
                                    if (k2Var != null) {
                                        k2Var.cancel((java.util.concurrent.CancellationException) null);
                                    }
                                    cVar.j = fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new g01.b(cVar, barVar, 2), 3);
                                    if (linkedHashMap.get(stringExtra) == null) {
                                        linkedHashMap.put(stringExtra, new g01.qux(stringExtra2, new rz0.n0(0)));
                                        cVar.d2();
                                    }
                                }
                            }
                        } else if (str.equals("WAITING_FOR_PUSH_ACTION")) {
                            cVar.i = true;
                            g01.baz bazVar3 = (g01.baz) ((com.truecaller.sdk.bar) cVar).a;
                            if (bazVar3 != null) {
                                ?? r4 = (com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService) bazVar3;
                                if (!r4.f) {
                                    android.content.Context context2 = bazVar.a;
                                    f6.f0 f0Var2 = new f6.f0(context2, bazVar.e.o("backup"));
                                    f0Var2.e = f6.f0.e(context2.getString(2132017615));
                                    f0Var2.l(8, true);
                                    f0Var2.q(0, 0, true);
                                    f0Var2.Q.icon = 2131232902;
                                    f0Var2.l = -1;
                                    android.app.Notification d2 = f0Var2.d();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d2, "notification");
                                    if (android.os.Build.VERSION.SDK_INT < 34) {
                                        r4.startForeground(i3, d2);
                                    } else {
                                        df.f.x((com.truecaller.cloudtelephony.callrecording.ui.downloadservice.CallRecordingDownloadService) r4, i3, d2);
                                    }
                                    r4.f = true;
                                }
                            }
                            fg3.k2 k2Var2 = cVar.j;
                            df3.bar barVar2 = null;
                            if (k2Var2 != null) {
                                k2Var2.cancel((java.util.concurrent.CancellationException) null);
                            }
                            cVar.j = fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new g01.b(cVar, barVar2, 2), 3);
                            fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new g01.b(cVar, barVar2, 0), 3);
                        }
                    } else if (str.equals("DOWNLOAD_RECORDING_RETRY_ACTION")) {
                        cVar.d2();
                    }
                    return super/*android.app.Service*/.onStartCommand(intent, i, i2);
                }
                if (intent != null) {
                    str2 = intent.getAction();
                } else {
                    str2 = null;
                }
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("action " + str2 + " unknown to service ");
                return super/*android.app.Service*/.onStartCommand(intent, i, i2);
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTimeout(int i, int i2) {
        fc.bar.v(this);
        stopSelf();
    }
}
