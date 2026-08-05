package com.truecaller.consentrefresh;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/consentrefresh/ConsentRefreshActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lc61/n;", "Lc61/c;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class ConsentRefreshActivity extends com.truecaller.consentrefresh.Hilt_ConsentRefreshActivity implements c61.n, c61.c {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.consentrefresh.Hilt_ConsentRefreshActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.Boolean bool;
        android.os.Bundle extras;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.C(this, 2);
        android.content.Intent intent = getIntent();
        com.truecaller.adschoices.Source source = null;
        if (intent != null) {
            bool = java.lang.Boolean.valueOf(intent.hasExtra("SettingsAdsChoices"));
        } else {
            bool = null;
        }
        if (yp.d0.D(bool)) {
            android.content.Intent intent2 = getIntent();
            if (intent2 != null && (extras = intent2.getExtras()) != null) {
                source = (com.truecaller.adschoices.Source) t80.g.v(extras, "AnalyticsSource", com.truecaller.adschoices.Source.class);
            }
            t0(new c61.bar(com.truecaller.consentrefresh.AdsChoicesFragmentConfig.SETTINGS, source));
            return;
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
        j.f(android.R.id.content, new c61.j(), (java.lang.String) null, 1);
        j.e();
        j.l();
    }

    public final void t0(c61.bar barVar) {
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "arguments");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("config", barVar.a.getValue());
        bundle.putSerializable("AnalyticsSource", barVar.b);
        c61.baz bazVar = new c61.baz();
        bazVar.setArguments(bundle);
        barVar2.f(android.R.id.content, bazVar, (java.lang.String) null, 1);
        barVar2.l();
    }
}
