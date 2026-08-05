package com.truecaller.premium.premiumusertab.featureinnerscreen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/premiumusertab/featureinnerscreen/FeatureInnerScreenActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeatureInnerScreenActivity extends com.truecaller.ui.FragmentActivityBase {
    public static final /* synthetic */ int j0 = 0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 10));

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.i0;
        setContentView(((d91.b) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((d91.b) lazy.getValue()).d;
        setSupportActionBar(toolbar);
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.A(2132018497);
        }
        if (bundle == null) {
            android.content.Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("AnalyticsContext");
            } else {
                str = null;
            }
            android.content.Intent intent2 = getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("ExtraOriginalPremiumFeature");
            } else {
                str2 = null;
            }
            android.content.Intent intent3 = getIntent();
            if (intent3 != null && (stringExtra = intent3.getStringExtra("ExtraFeatureName")) != null) {
                android.os.Bundle c = com.appsflyer.internal.e.c("FeatureNameBundleKey", stringExtra, "AnalyticsContext", str);
                c.putString("ExtraOriginalPremiumFeature", str2);
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "beginTransaction(...)");
                fc2.qux quxVar = new fc2.qux();
                quxVar.setArguments(c);
                kotlin.Unit unit = kotlin.Unit.a;
                barVar.g(2131363145, quxVar, (java.lang.String) null);
                ((androidx.fragment.app.q1) barVar).f = 0;
                barVar.m(true, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }
}
