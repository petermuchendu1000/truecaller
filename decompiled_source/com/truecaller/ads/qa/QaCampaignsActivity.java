package com.truecaller.ads.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/qa/QaCampaignsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class QaCampaignsActivity extends com.truecaller.ads.qa.Hilt_QaCampaignsActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.qa.Hilt_QaCampaignsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        if (!m03.r.s(this)) {
            finish();
            return;
        }
        yy.qux.C(this, 3);
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setId(2131363169);
        setContentView(frameLayout);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(2131363169, new x90.p(), com.truecaller.ads.qa.QaCampaignsActivity.class.getName());
        barVar.l();
    }
}
