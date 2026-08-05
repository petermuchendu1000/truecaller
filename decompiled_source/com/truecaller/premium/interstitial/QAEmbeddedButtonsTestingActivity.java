package com.truecaller.premium.interstitial;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/interstitial/QAEmbeddedButtonsTestingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QAEmbeddedButtonsTestingActivity extends com.truecaller.premium.interstitial.Hilt_QAEmbeddedButtonsTestingActivity {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.interstitial.Hilt_QAEmbeddedButtonsTestingActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        setContentView(2131558477);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString("launchContextKey");
        } else {
            str = null;
        }
        qb2.w wVar = new qb2.w();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("launchContextKey", str);
        wVar.setArguments(bundle2);
        barVar.g(2131364005, wVar, (java.lang.String) null);
        barVar.o();
    }
}
