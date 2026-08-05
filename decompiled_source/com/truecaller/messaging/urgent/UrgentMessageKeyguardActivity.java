package com.truecaller.messaging.urgent;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/urgent/UrgentMessageKeyguardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UrgentMessageKeyguardActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int g0 = 0;
    public r42.d a0;
    public final android.os.Handler b0 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final o83.b c0 = new o83.b(this, 10);
    public final androidx.room.r d0 = new androidx.room.r(this, 4);
    public final co.t e0 = new co.t(this, 25);
    public final p42.b f0 = new p42.b(this);

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        getWindow().setFlags(2621440, 2621440);
        findViewById(android.R.id.content).setBackgroundColor(getColor(2131102033));
        bindService(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.messaging.urgent.service.UrgentMessageService.class), this.d0, 0);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).registerReceiver(this.e0, new android.content.IntentFilter("com.truecaller.messaging.urgent.ACTION_FINISH_UM_KEYGUARD_ACTIVITY"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super.onDestroy();
        this.b0.removeCallbacks(this.c0);
        unbindService(this.d0);
        t0();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(this.e0);
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        if (!s0()) {
            android.os.Handler handler = this.b0;
            o83.b bVar = this.c0;
            handler.removeCallbacks(bVar);
            handler.postDelayed(bVar, 100L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s0() {
        java.lang.Object systemService = getSystemService("keyguard");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        if (!((android.app.KeyguardManager) systemService).isKeyguardLocked() && !isDestroyed() && !isFinishing()) {
            finish();
            return true;
        }
        return false;
    }

    public final void t0() {
        r42.d dVar = this.a0;
        if (dVar != null) {
            this.a0 = null;
            p42.b bVar = this.f0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "listener");
            r42.f fVar = (r42.f) dVar.a.get();
            if (fVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "listener");
                fVar.n.remove(bVar);
            }
        }
    }
}
