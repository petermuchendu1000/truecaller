package com.truecaller.network.softthrottle;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/network/softthrottle/SoftThrottleTrampolineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SoftThrottleTrampolineActivity extends com.truecaller.network.softthrottle.Hilt_SoftThrottleTrampolineActivity {
    public p.c3 d0;
    public rp2.c e0;
    public s62.d f0;
    public u03.b g0;
    public qc3.bar h0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.network.softthrottle.Hilt_SoftThrottleTrampolineActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("soft_throttle_token");
        } else {
            str = null;
        }
        if (str == null) {
            finish();
            return;
        }
        s62.d dVar = this.f0;
        if (dVar != null) {
            ((s62.f) dVar).a(2131366544, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationSoftThrottled");
            p.c3 c3Var = this.d0;
            if (c3Var != null) {
                c3Var.I(this, com.truecaller.search.softthrottle.SoftThrottleSource.NOTIFICATION, str, "notification");
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new d62.qux(this, null, 1), 3);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("softThrottleRouter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
        throw null;
    }
}
