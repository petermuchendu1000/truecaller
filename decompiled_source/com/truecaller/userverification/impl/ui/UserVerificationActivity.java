package com.truecaller.userverification.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/userverification/impl/ui/UserVerificationActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lj03/c0;", "uiState", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UserVerificationActivity extends com.truecaller.userverification.impl.ui.Hilt_UserVerificationActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(j03.h0.class), new j03.d(this, 1), new j03.d(this, 0), new j03.d(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.userverification.impl.ui.Hilt_UserVerificationActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(-130426212, new ie3.h(this, 6), true));
    }

    public final j03.h0 s0() {
        return (j03.h0) this.d0.getValue();
    }
}
