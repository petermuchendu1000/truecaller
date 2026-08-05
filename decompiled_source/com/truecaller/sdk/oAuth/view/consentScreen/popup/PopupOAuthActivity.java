package com.truecaller.sdk.oAuth.view.consentScreen.popup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/sdk/oAuth/view/consentScreen/popup/PopupOAuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PopupOAuthActivity extends com.truecaller.sdk.oAuth.view.consentScreen.popup.Hilt_PopupOAuthActivity {
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 22));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.oAuth.view.consentScreen.popup.Hilt_PopupOAuthActivity
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        int i2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        com.truecaller.android.sdk.oAuth.clients.PartnerInformationV2 parcelableExtra = getIntent().getParcelableExtra("truesdk_partner_info");
        if (parcelableExtra != null) {
            i = parcelableExtra.getTheme();
        } else {
            i = 0;
        }
        if (i == 1) {
            i2 = 2132084078;
        } else {
            i2 = 2132084079;
        }
        setTheme(i2);
        setContentView(((mo2.a) this.d0.getValue()).a);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            zo2.baz.m.getClass();
            j.f(2131364006, new zo2.baz(), kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(zo2.baz.class).getSimpleName(), 1);
            j.l();
        }
    }
}
