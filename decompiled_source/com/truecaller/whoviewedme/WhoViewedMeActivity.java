package com.truecaller.whoviewedme;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/whoviewedme/WhoViewedMeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lr82/j0;", "<init>", "()V", "a/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoViewedMeActivity extends com.truecaller.whoviewedme.Hilt_WhoViewedMeActivity implements r82.j0 {
    public static final /* synthetic */ int g0 = 0;
    public mk.e d0;
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 4));
    public qo1.o f0;

    public final void f(mk.e eVar) {
        this.d0 = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.whoviewedme.Hilt_WhoViewedMeActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.whoviewedme.WhoViewedMeLaunchContext whoViewedMeLaunchContext;
        androidx.fragment.app.Fragment a0Var;
        com.truecaller.whoviewedme.WhoViewedMeLaunchContext whoViewedMeLaunchContext2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.e0;
        setContentView(((d91.i) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((d91.i) lazy.getValue()).b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        android.widget.FrameLayout frameLayout = ((d91.i) lazy.getValue()).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "whoViewedMeFragment");
        ak.r0.i(frameLayout, com.truecaller.common.ui.insets.InsetType.NavigationBar);
        setSupportActionBar(((d91.i) lazy.getValue()).b);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        i.baz supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(true);
        }
        i.baz supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.A(2132019191);
        }
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            qo1.p pVar = this.f0;
            if (pVar != null) {
                if (pVar.b.a("featureWVMComposeMigration", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                    android.content.Intent intent = getIntent();
                    if (intent == null || (whoViewedMeLaunchContext2 = (com.truecaller.whoviewedme.WhoViewedMeLaunchContext) g6.b.h(intent, "launch_context", com.truecaller.whoviewedme.WhoViewedMeLaunchContext.class)) == null) {
                        whoViewedMeLaunchContext2 = com.truecaller.whoviewedme.WhoViewedMeLaunchContext.UNKNOWN;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whoViewedMeLaunchContext2, "launchContext");
                    a0Var = new e73.k();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    a0Var.setArguments(bundle2);
                    bundle2.putSerializable("launch_context", whoViewedMeLaunchContext2);
                } else {
                    android.content.Intent intent2 = getIntent();
                    if (intent2 == null || (whoViewedMeLaunchContext = (com.truecaller.whoviewedme.WhoViewedMeLaunchContext) g6.b.h(intent2, "launch_context", com.truecaller.whoviewedme.WhoViewedMeLaunchContext.class)) == null) {
                        whoViewedMeLaunchContext = com.truecaller.whoviewedme.WhoViewedMeLaunchContext.UNKNOWN;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whoViewedMeLaunchContext, "launchContext");
                    a0Var = new c73.a0();
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    a0Var.setArguments(bundle3);
                    bundle3.putSerializable("launch_context", whoViewedMeLaunchContext);
                }
                j.g(2131367599, a0Var, (java.lang.String) null);
                j.l();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("premiumFeaturesInventory");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final void onPaymentError(int i, java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.d0;
        if (eVar != null) {
            eVar.l(i);
        }
    }

    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.d0;
        if (eVar != null) {
            eVar.k(paymentData);
        }
    }
}
