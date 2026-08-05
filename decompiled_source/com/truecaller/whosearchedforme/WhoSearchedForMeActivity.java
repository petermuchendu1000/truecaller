package com.truecaller.whosearchedforme;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/whosearchedforme/WhoSearchedForMeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lr82/j0;", "<init>", "()V", "ee0/l", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoSearchedForMeActivity extends com.truecaller.whosearchedforme.Hilt_WhoSearchedForMeActivity implements r82.j0 {
    public static final /* synthetic */ int h0 = 0;
    public u62.l d0;
    public qo1.o e0;
    public mk.e f0;
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 5));

    public final void f(mk.e eVar) {
        this.f0 = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.whosearchedforme.Hilt_WhoSearchedForMeActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        androidx.fragment.app.Fragment dVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.g0;
        setContentView(((d91.h) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((d91.h) lazy.getValue()).b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        android.widget.FrameLayout frameLayout = ((d91.h) lazy.getValue()).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "whoSearchedMeFragment");
        ak.r0.i(frameLayout, com.truecaller.common.ui.insets.InsetType.NavigationBar);
        setSupportActionBar(((d91.h) lazy.getValue()).b);
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
            supportActionBar3.A(2132019181);
        }
        android.content.Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("analyticsContext")) == null) {
            str = "unknown";
        }
        qo1.p pVar = this.e0;
        if (pVar != null) {
            if (pVar.b.a("featureWSFMComposeMigration", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                dVar = new v63.baz();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("analyticsContext", str);
                dVar.setArguments(bundle2);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                dVar = new s63.d();
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("analyticsContext", str);
                dVar.setArguments(bundle3);
            }
            if (bundle == null) {
                u62.l lVar = this.d0;
                if (lVar != null) {
                    lVar.a(2131367597, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal, "notificationWhoSearchedForMe");
                    androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                    barVar.g(2131367598, dVar, (java.lang.String) null);
                    barVar.l();
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("notificationManager");
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumFeaturesInventory");
        throw null;
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
        mk.e eVar = this.f0;
        if (eVar != null) {
            eVar.l(i);
        }
    }

    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.f0;
        if (eVar != null) {
            eVar.k(paymentData);
        }
    }
}
