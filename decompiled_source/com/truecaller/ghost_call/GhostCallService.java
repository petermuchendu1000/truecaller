package com.truecaller.ghost_call;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GhostCallService extends android.app.Service implements bd3.qux {
    public static final /* synthetic */ int m = 0;
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public op1.h d;
    public s62.d e;
    public op1.e f;
    public hy0.baz g;
    public android.media.MediaPlayer h;
    public android.os.Vibrator i;
    public java.lang.Integer j;
    public h10.x k;
    public java.util.Timer l;

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

    public final void a(boolean z) {
        int i;
        if (ak.r0.z(this).getRingerMode() == 1) {
            return;
        }
        if (z) {
            i = -100;
        } else {
            i = 100;
        }
        try {
            ak.r0.z(this).adjustStreamVolume(2, i, 0);
        } catch (java.lang.SecurityException e) {
            e.toString();
        }
    }

    public final void b() {
        try {
            android.media.MediaPlayer mediaPlayer = this.h;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            java.lang.Integer num = this.j;
            if (num != null) {
                ak.r0.z(this).setStreamVolume(3, num.intValue(), 0);
            }
            a(false);
            android.os.Vibrator vibrator = this.i;
            if (vibrator != null) {
                vibrator.cancel();
            }
            e();
        } catch (java.lang.Exception e) {
            e.toString();
        }
        stopForeground(true);
        stopSelf();
    }

    public final void c() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((op1.f) X3()).b;
            tx.c0 c0Var = wVar.b;
            this.d = (op1.h) c0Var.p4.get();
            this.e = (s62.d) wVar.P2.get();
            this.f = (op1.e) c0Var.r4.get();
            this.g = (hy0.baz) wVar.Ih.get();
        }
        super.onCreate();
    }

    public final void d() {
        a(false);
        android.media.MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        android.media.MediaPlayer mediaPlayer2 = new android.media.MediaPlayer();
        mediaPlayer2.setAudioAttributes(new android.media.AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer2.setDataSource(getApplicationContext(), android.provider.Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer2.setLooping(true);
        mediaPlayer2.prepare();
        mediaPlayer2.start();
        this.h = mediaPlayer2;
        this.j = java.lang.Integer.valueOf(ak.r0.z(this).getStreamVolume(3));
        int streamVolume = ak.r0.z(this).getStreamVolume(2);
        ak.r0.z(this).setStreamVolume(3, (ak.r0.z(this).getStreamMaxVolume(3) * streamVolume) / ak.r0.z(this).getStreamMaxVolume(2), 0);
    }

    public final void e() {
        h10.x xVar = this.k;
        if (xVar != null) {
            xVar.cancel();
        }
        java.util.Timer timer = this.l;
        if (timer != null) {
            timer.cancel();
        }
        this.k = null;
        this.l = null;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        c();
        s62.d dVar = this.e;
        if (dVar != null) {
            java.lang.String o = ((s62.f) dVar).o("caller_id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            android.content.Intent action = new android.content.Intent(this, (java.lang.Class<?>) com.truecaller.ghost_call.GhostCallService.class).setAction("com.truecaller.ACTION_END_CALL_FROM_NOTIFICATION");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
            s62.d dVar2 = this.e;
            if (dVar2 != null) {
                f6.r b = new f6.q((androidx.core.graphics.drawable.IconCompat) null, getResources().getString(2132018802), ((s62.f) dVar2).t(this, action, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "ghostCall", 1)).b();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "build(...)");
                f6.f0 f0Var = new f6.f0(getApplicationContext(), o);
                f0Var.Q.icon = 2131232902;
                f0Var.e = f6.f0.e(getResources().getString(2132018803));
                f0Var.b(b);
                f0Var.D = getColor(2131102024);
                android.app.Notification d = f0Var.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                startForeground(2131364272, d);
                java.lang.Object systemService = getSystemService("vibrator");
                kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                this.i = (android.os.Vibrator) systemService;
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationManager");
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -913222492:
                    if (str.equals("com.truecaller.ACTION_END_CALL_FROM_NOTIFICATION")) {
                        op1.e eVar = this.f;
                        if (eVar != null) {
                            eVar.h.a(com.truecaller.ghost_call.GhostCallState.ENDED);
                            fg3.k2 k2Var = eVar.o;
                            if (k2Var != null) {
                                k2Var.cancel((java.util.concurrent.CancellationException) null);
                            }
                            b();
                            break;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("ghostCallManager");
                            throw null;
                        }
                    }
                    break;
                case -780675453:
                    if (str.equals("com.truecaller.ACTION_END_CALL")) {
                        b();
                        break;
                    }
                    break;
                case 1607167772:
                    if (str.equals("com.truecaller.ACTION_START_CALL")) {
                        try {
                            d();
                            op1.h hVar = this.d;
                            if (hVar != null) {
                                if (!hVar.q0()) {
                                    a(true);
                                }
                                if (ak.r0.z(this).getRingerMode() == 1) {
                                    long[] jArr = {0, 1000, 1000};
                                    android.os.Vibrator vibrator = this.i;
                                    if (vibrator != null) {
                                        bx.q.q(vibrator, m03.n.l(jArr));
                                    }
                                }
                                e();
                                this.k = new h10.x(this, 1);
                                java.util.Timer timer = new java.util.Timer();
                                this.l = timer;
                                timer.schedule((java.util.TimerTask) this.k, java.util.concurrent.TimeUnit.MILLISECONDS.convert(60L, java.util.concurrent.TimeUnit.SECONDS));
                                hy0.baz bazVar = this.g;
                                if (bazVar != null) {
                                    android.content.Context applicationContext = getApplicationContext();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    startActivity(wi0.bar.l(bazVar, applicationContext, com.truecaller.callui.api.CallUISource.CONTEXT_GHOST_CALL, 2));
                                    break;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("callUI");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("ghostCallSettings");
                                throw null;
                            }
                        } catch (java.lang.Exception e) {
                            e.toString();
                            break;
                        }
                    }
                    break;
                case 1829679490:
                    if (str.equals("com.truecaller.ACTION_ON_CALL_PICKED")) {
                        android.media.MediaPlayer mediaPlayer = this.h;
                        if (mediaPlayer != null) {
                            mediaPlayer.stop();
                        }
                        android.os.Vibrator vibrator2 = this.i;
                        if (vibrator2 != null) {
                            vibrator2.cancel();
                        }
                        e();
                        break;
                    }
                    break;
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
