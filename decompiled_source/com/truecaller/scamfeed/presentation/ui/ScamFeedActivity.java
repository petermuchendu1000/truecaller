package com.truecaller.scamfeed.presentation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/scamfeed/presentation/ui/ScamFeedActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ScamFeedActivity extends com.truecaller.scamfeed.presentation.ui.Hilt_ScamFeedActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.scamfeed.presentation.ui.Hilt_ScamFeedActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, new xn2.s0(), (java.lang.String) null);
            j.l();
        }
    }
}
