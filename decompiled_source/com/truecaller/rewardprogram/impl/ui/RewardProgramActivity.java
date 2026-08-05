package com.truecaller.rewardprogram.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/rewardprogram/impl/ui/RewardProgramActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lxk2/f;", "uiState", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramActivity extends com.truecaller.rewardprogram.impl.ui.Hilt_RewardProgramActivity {
    public static final /* synthetic */ int l0 = 0;
    public vd.b d0;
    public uq2.baz e0;
    public i.d0 f0;
    public com.truecaller.google_login.g g0;
    public s62.d h0;
    public z90.bar i0;
    public p22.bar j0;
    public final androidx.lifecycle.o1 k0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(xk2.h.class), new xk2.b(this, 1), new xk2.b(this, 0), new xk2.b(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.rewardprogram.impl.ui.Hilt_RewardProgramActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.rewardprogram.api.RewardProgramSource rewardProgramSource = (com.truecaller.rewardprogram.api.RewardProgramSource) g6.b.h(intent, "extra_source", com.truecaller.rewardprogram.api.RewardProgramSource.class);
        if (rewardProgramSource != null) {
            int intExtra = getIntent().getIntExtra("extra_notification_id", -1);
            if (intExtra != -1) {
                s62.f fVar = this.h0;
                if (fVar != null) {
                    fVar.a(intExtra, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "RewardsEarnedNotification");
                } else {
                    kotlin.jvm.internal.Intrinsics.n("notificationManager");
                    throw null;
                }
            }
            e.d.a(this, new d3.qux(1120489119, new v2.o(15, this, rewardProgramSource), true));
            return;
        }
        throw new java.lang.IllegalStateException("Missing source!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*android.app.Activity*/.onResume();
        s0().o(null);
    }

    public final xk2.h s0() {
        return (xk2.h) this.k0.getValue();
    }
}
