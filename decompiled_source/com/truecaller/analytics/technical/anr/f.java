package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f extends android.os.HandlerThread {
    public final /* synthetic */ int a = 0;
    public final java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.truecaller.analytics.technical.anr.g gVar) {
        super("MainThreadBoggingReporter", -8);
        this.b = gVar;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        switch (this.a) {
            case 0:
                try {
                    if (!((qo1.m) ((com.truecaller.analytics.technical.anr.g) this.b).a.get()).b.a("featureMainThreadBoggingReporting", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                        quit();
                    } else {
                        com.truecaller.analytics.technical.anr.e eVar = new com.truecaller.analytics.technical.anr.e(new mp2.qux(new android.os.Handler(android.os.Looper.getMainLooper())), new mp2.qux(new android.os.Handler(getLooper())), new b93.b(22), new b93.b(23), new b93.b(24));
                        if (!eVar.d) {
                            eVar.d = true;
                            eVar.a();
                        }
                    }
                    return;
                } catch (java.lang.Exception e) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                    quit();
                    return;
                }
            case 1:
                super.onLooperPrepared();
                ((eg1.bar) this.b).d = new androidx.localbroadcastmanager.content.bar(this, getLooper(), 3);
                return;
            default:
                super.onLooperPrepared();
                com.truecaller.notifications.NotificationHandlerService notificationHandlerService = (com.truecaller.notifications.NotificationHandlerService) this.b;
                android.os.Looper looper = getLooper();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                notificationHandlerService.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
                java.lang.Thread.currentThread().getName();
                notificationHandlerService.d = looper;
                android.os.Looper looper2 = notificationHandlerService.d;
                kotlin.jvm.internal.Intrinsics.d(looper2);
                android.os.Handler handler = new android.os.Handler(looper2);
                notificationHandlerService.e = handler;
                if (notificationHandlerService.f) {
                    handler.post(new rr1.b0(notificationHandlerService, 12));
                    return;
                }
                return;
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.a) {
            case 1:
                eg1.bar barVar = (eg1.bar) this.b;
                try {
                    barVar.e = new android.media.ToneGenerator(8, 70);
                } catch (java.lang.Exception e) {
                    o82.a.B("Could not create tone generator", e);
                }
                try {
                    barVar.f = (android.os.Vibrator) barVar.a.getSystemService("vibrator");
                } catch (java.lang.Exception e2) {
                    o82.a.B("Could not create vibrator", e2);
                }
                super.run();
                android.media.ToneGenerator toneGenerator = barVar.e;
                if (toneGenerator != null) {
                    toneGenerator.stopTone();
                    barVar.e.release();
                    barVar.e = null;
                    return;
                }
                return;
            default:
                super.run();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(eg1.bar barVar) {
        super("feedback");
        this.b = barVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.truecaller.notifications.NotificationHandlerService notificationHandlerService) {
        super("NotificationHandlerService", 10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationHandlerService, "callback");
        this.b = notificationHandlerService;
    }
}
