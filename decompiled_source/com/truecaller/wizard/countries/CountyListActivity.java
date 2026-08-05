package com.truecaller.wizard.countries;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/wizard/countries/CountyListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lo83/f;", "<init>", "()V", "h72/a", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CountyListActivity extends com.truecaller.wizard.countries.Hilt_CountyListActivity implements o83.f {
    public static final /* synthetic */ int g0 = 0;
    public final kotlin.Lazy d0;
    public final kotlin.Lazy e0;
    public final kotlin.Lazy f0;

    public CountyListActivity() {
        final int i = 0;
        this.d0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: o83.m
            public final /* synthetic */ com.truecaller.wizard.countries.CountyListActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        android.content.Intent intent = appCompatActivity.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        return (com.truecaller.wizard.countries.WizardCountryData) ((android.os.Parcelable) g6.b.g(intent, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY, com.truecaller.wizard.countries.WizardCountryData.class));
                    case 1:
                        int i4 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showSuggestedCountries", true));
                    default:
                        int i5 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showNoCountryItem", false));
                }
            }
        });
        final int i2 = 1;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: o83.m
            public final /* synthetic */ com.truecaller.wizard.countries.CountyListActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        android.content.Intent intent = appCompatActivity.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        return (com.truecaller.wizard.countries.WizardCountryData) ((android.os.Parcelable) g6.b.g(intent, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY, com.truecaller.wizard.countries.WizardCountryData.class));
                    case 1:
                        int i4 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showSuggestedCountries", true));
                    default:
                        int i5 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showNoCountryItem", false));
                }
            }
        });
        final int i3 = 2;
        this.f0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: o83.m
            public final /* synthetic */ com.truecaller.wizard.countries.CountyListActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i3;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        android.content.Intent intent = appCompatActivity.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        return (com.truecaller.wizard.countries.WizardCountryData) ((android.os.Parcelable) g6.b.g(intent, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY, com.truecaller.wizard.countries.WizardCountryData.class));
                    case 1:
                        int i4 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showSuggestedCountries", true));
                    default:
                        int i5 = com.truecaller.wizard.countries.CountyListActivity.g0;
                        return java.lang.Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("showNoCountryItem", false));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.wizard.countries.Hilt_CountyListActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.s(this, ex2.a.a);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        if (bundle == null) {
            com.truecaller.wizard.countries.WizardCountryData wizardCountryData = (com.truecaller.wizard.countries.WizardCountryData) this.d0.getValue();
            java.lang.Boolean bool = (java.lang.Boolean) this.e0.getValue();
            bool.getClass();
            java.lang.Boolean bool2 = (java.lang.Boolean) this.f0.getValue();
            bool2.getClass();
            o83.d dVar = new o83.d();
            dVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair(com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY, wizardCountryData), new kotlin.Pair("showSuggestedCountries", bool), new kotlin.Pair("showNoCountryItem", bool2)}));
            dVar.show(getSupportFragmentManager(), (java.lang.String) null);
        }
    }
}
