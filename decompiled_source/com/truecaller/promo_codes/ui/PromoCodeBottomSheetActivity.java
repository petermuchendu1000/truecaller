package com.truecaller.promo_codes.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/promo_codes/ui/PromoCodeBottomSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "promo-codes_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PromoCodeBottomSheetActivity extends com.truecaller.promo_codes.ui.Hilt_PromoCodeBottomSheetActivity {
    public static final /* synthetic */ int e0 = 0;
    public final th2.bar d0 = new th2.bar(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.promo_codes.ui.Hilt_PromoCodeBottomSheetActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getColor(android.R.color.transparent)));
        androidx.fragment.app.j0 j0Var = getSupportFragmentManager().p;
        j0Var.getClass();
        th2.bar barVar = this.d0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "cb");
        ((java.util.concurrent.CopyOnWriteArrayList) j0Var.b).add(new androidx.fragment.app.r0(barVar));
        if (bundle == null) {
            java.lang.String stringExtra = getIntent().getStringExtra("extra_analytics_context");
            if (stringExtra == null) {
                stringExtra = "";
            }
            p02.u3 u3Var = th2.d.l;
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            u3Var.getClass();
            p02.u3.g(supportFragmentManager, stringExtra);
        }
    }

    @Override // com.truecaller.promo_codes.ui.Hilt_PromoCodeBottomSheetActivity
    public final void onDestroy() {
        getSupportFragmentManager().n0(this.d0);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            q3.v.C(this);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            q3.v.x(this);
        } else {
            overridePendingTransition(0, 0);
        }
    }
}
