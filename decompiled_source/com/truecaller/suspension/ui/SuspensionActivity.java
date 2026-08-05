package com.truecaller.suspension.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/suspension/ui/SuspensionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SuspensionActivity extends com.truecaller.suspension.ui.Hilt_SuspensionActivity {
    public static final /* synthetic */ int e0 = 0;
    public nc0.r1 d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.suspension.ui.Hilt_SuspensionActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        androidx.lifecycle.t lifecycle = getLifecycle();
        nc0.r1 r1Var = this.d0;
        if (r1Var != null) {
            lifecycle.a(r1Var);
            if (bundle == null) {
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
                aw2.e.m.getClass();
                j.g(android.R.id.content, new aw2.e(), (java.lang.String) null);
                j.l();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("unauthenticatedEventsUploadObserver");
        throw null;
    }
}
