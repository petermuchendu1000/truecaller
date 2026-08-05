package com.truecaller.wizard.premium;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/wizard/premium/TestInterstitialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TestInterstitialActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int a0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        d.m.b(this, (d.k0) null, 3);
        setContentView(2131558507);
        android.view.View findViewById = findViewById(2131365038);
        final int i = 0;
        b93.b bVar = new b93.b(0);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(findViewById, bVar);
        ((android.widget.Button) findViewById(2131362583)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: b93.c
            public final /* synthetic */ com.truecaller.wizard.premium.TestInterstitialActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.wizard.premium.TestInterstitialActivity.a0;
                        appCompatActivity.setResult(-1);
                        appCompatActivity.finish();
                        return;
                    default:
                        int i4 = com.truecaller.wizard.premium.TestInterstitialActivity.a0;
                        appCompatActivity.setResult(0);
                        appCompatActivity.finish();
                        return;
                }
            }
        });
        final int i2 = 1;
        ((android.widget.Button) findViewById(2131362547)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: b93.c
            public final /* synthetic */ com.truecaller.wizard.premium.TestInterstitialActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.wizard.premium.TestInterstitialActivity.a0;
                        appCompatActivity.setResult(-1);
                        appCompatActivity.finish();
                        return;
                    default:
                        int i4 = com.truecaller.wizard.premium.TestInterstitialActivity.a0;
                        appCompatActivity.setResult(0);
                        appCompatActivity.finish();
                        return;
                }
            }
        });
    }
}
