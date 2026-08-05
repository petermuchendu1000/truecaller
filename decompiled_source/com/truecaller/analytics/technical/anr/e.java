package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e {
    public static final java.lang.String[] h = {"android.app.ActivityThread", "android.app.Instrumentation", "android.app.LoadedApk", "android.os.Looper", "android.os.Handler", "android.os.MessageQueue", "java.lang.reflect.Method", "com.android.internal.os."};
    public final mp2.qux a;
    public final mp2.qux b;
    public volatile boolean c;
    public volatile boolean d;
    public final com.truecaller.analytics.technical.anr.d e;
    public final com.truecaller.analytics.technical.anr.d f;
    public final com.truecaller.analytics.technical.anr.d g;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.truecaller.analytics.technical.anr.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.truecaller.analytics.technical.anr.d] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.truecaller.analytics.technical.anr.d] */
    public e(mp2.qux quxVar, mp2.qux quxVar2, b93.b bVar, b93.b bVar2, b93.b bVar3) {
        java.lang.Object obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mainThreadDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "monitorThreadDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "stackTraceCapture");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "nonFatalReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar3, "foregroundCheck");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "config");
        this.a = quxVar;
        this.b = quxVar2;
        final int i = 0;
        this.e = new java.lang.Runnable(this) { // from class: com.truecaller.analytics.technical.anr.d
            public final /* synthetic */ com.truecaller.analytics.technical.anr.e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.c = false;
                        return;
                    case 1:
                        com.truecaller.analytics.technical.anr.e eVar = this.b;
                        if (!eVar.c) {
                            eVar.a();
                            return;
                        }
                        java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                        mp2.qux quxVar3 = eVar.b;
                        java.lang.Runnable bazVar = new com.amazon.aps.ads.util.adview.baz(17, eVar, stackTrace);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "runnable");
                        ((android.os.Handler) quxVar3.b).postDelayed(bazVar, 1000L);
                        return;
                    default:
                        this.b.a();
                        return;
                }
            }
        };
        final int i2 = 1;
        this.f = new java.lang.Runnable(this) { // from class: com.truecaller.analytics.technical.anr.d
            public final /* synthetic */ com.truecaller.analytics.technical.anr.e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.c = false;
                        return;
                    case 1:
                        com.truecaller.analytics.technical.anr.e eVar = this.b;
                        if (!eVar.c) {
                            eVar.a();
                            return;
                        }
                        java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                        mp2.qux quxVar3 = eVar.b;
                        java.lang.Runnable bazVar = new com.amazon.aps.ads.util.adview.baz(17, eVar, stackTrace);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "runnable");
                        ((android.os.Handler) quxVar3.b).postDelayed(bazVar, 1000L);
                        return;
                    default:
                        this.b.a();
                        return;
                }
            }
        };
        final int i3 = 2;
        this.g = new java.lang.Runnable(this) { // from class: com.truecaller.analytics.technical.anr.d
            public final /* synthetic */ com.truecaller.analytics.technical.anr.e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.c = false;
                        return;
                    case 1:
                        com.truecaller.analytics.technical.anr.e eVar = this.b;
                        if (!eVar.c) {
                            eVar.a();
                            return;
                        }
                        java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                        mp2.qux quxVar3 = eVar.b;
                        java.lang.Runnable bazVar = new com.amazon.aps.ads.util.adview.baz(17, eVar, stackTrace);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "runnable");
                        ((android.os.Handler) quxVar3.b).postDelayed(bazVar, 1000L);
                        return;
                    default:
                        this.b.a();
                        return;
                }
            }
        };
    }

    public final void a() {
        this.c = true;
        mp2.qux quxVar = this.a;
        com.truecaller.analytics.technical.anr.d dVar = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "runnable");
        ((android.os.Handler) quxVar.b).post(dVar);
        mp2.qux quxVar2 = this.b;
        com.truecaller.analytics.technical.anr.d dVar2 = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "runnable");
        ((android.os.Handler) quxVar2.b).postDelayed(dVar2, 1000L);
    }
}
