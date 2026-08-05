package com.truecaller.premium;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/premium/FullScreenPaywallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lr82/j0;", "Lq92/bar;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public class FullScreenPaywallActivity extends com.truecaller.premium.Hilt_FullScreenPaywallActivity implements r82.j0, q92.bar {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f4548h0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(i82.f.class), new i82.baz(this, 1), new i82.baz(this, 0), new i82.baz(this, 2));

    /* renamed from: e0, reason: collision with root package name */
    public final kotlin.Lazy f4549e0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 15));

    /* renamed from: f0, reason: collision with root package name */
    public mk.e f4550f0;

    /* renamed from: g0, reason: collision with root package name */
    public qc3.bar f4551g0;

    public static final void u0(com.truecaller.premium.FullScreenPaywallActivity fullScreenPaywallActivity, boolean z10) {
        com.google.android.material.appbar.MaterialToolbar materialToolbar = ((d91.qux) fullScreenPaywallActivity.f4549e0.getValue()).d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialToolbar, "toolbar");
        gj.m.k0(materialToolbar, z10);
    }

    public final void f(mk.e eVar) {
        this.f4550f0 = eVar;
    }

    @Override // com.truecaller.premium.Hilt_FullScreenPaywallActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        kotlin.Lazy lazy = this.f4549e0;
        setContentView(((d91.qux) lazy.getValue()).a);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        yy.qux.k(window, true);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
        com.google.android.material.appbar.MaterialToolbar materialToolbar = ((d91.qux) lazy.getValue()).d;
        ev.d dVar = new ev.d(13);
        java.util.WeakHashMap weakHashMap = u6.t0.f18614a;
        u6.k0.m(materialToolbar, dVar);
        com.google.android.material.appbar.MaterialToolbar materialToolbar2 = ((d91.qux) lazy.getValue()).d;
        materialToolbar2.setNavigationIcon(2131234197);
        android.graphics.drawable.Drawable navigationIcon = materialToolbar2.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(null);
        }
        setSupportActionBar(materialToolbar2);
        materialToolbar2.setNavigationOnClickListener(new gr2.bar(this, 13));
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
            supportActionBar3.t(false);
        }
        androidx.lifecycle.o1 o1Var = this.d0;
        pe0.j.p(this, ((i82.f) o1Var.getValue()).f8630e, new dr2.c(this, 22));
        i82.f fVar = (i82.f) o1Var.getValue();
        i82.r w0 = w0();
        fVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(w0, "premiumLaunchContext");
        i82.r rVar = fVar.f8631f;
        if (rVar != null && rVar.equals(w0)) {
            return;
        }
        fVar.f8631f = w0;
        fg3.h0.J(androidx.lifecycle.g1.l(fVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new i43.bar(fVar, w0, (df3.bar) null, 2), 3);
    }

    public final void onPaymentError(int i10, java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.f4550f0;
        if (eVar != null) {
            eVar.l(i10);
        }
    }

    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.f4550f0;
        if (eVar != null) {
            eVar.k(paymentData);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        qc3.bar barVar = this.f4551g0;
        if (barVar != null) {
            qf0.bar barVar2 = (qf0.bar) barVar.get();
            if (barVar2.b != com.truecaller.attribution.AppsFlyerCompletionState.PERMISSION_ASKED && barVar2.b != com.truecaller.attribution.AppsFlyerCompletionState.WIZARD_ONBOARDING_COMPLETED) {
                return;
            }
            barVar2.b = com.truecaller.attribution.AppsFlyerCompletionState.STARTUP_PREMIUM_SCREEN_SHOWN;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("appsFlyerEventsTracker");
        throw null;
    }

    public final i82.r u1() {
        return w0();
    }

    public final java.lang.String v0() {
        java.lang.String str;
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String str2 = null;
        if (extras != null) {
            str = extras.getString("premiumLockedFeature", null);
        } else {
            str = null;
        }
        if (str != null && kotlin.jvm.internal.Intrinsics.b(w0(), i82.r.f8685t9)) {
            java.lang.String e02 = z42.bar.e0(w0());
            android.os.Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                str2 = extras2.getString("premiumLockedFeature", null);
            }
            return h8.s0.q(e02, "_", str2);
        }
        return z42.bar.e0(w0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i82.r w0() {
        java.lang.String str;
        com.truecaller.premium.PremiumLaunchContext$Static premiumLaunchContext$Static = i82.r.A7;
        android.os.Bundle extras = getIntent().getExtras();
        i82.r rVar = null;
        if (extras != null) {
            str = extras.getString("launchContext");
        } else {
            str = null;
        }
        if (str != null && !kotlin.text.StringsKt.X(str)) {
            com.truecaller.premium.PremiumLaunchContext$Static.Companion.getClass();
            java.util.Iterator it = com.truecaller.premium.PremiumLaunchContext$Static.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.text.y.p(((com.truecaller.premium.PremiumLaunchContext$Static) next).name(), str, true)) {
                    rVar = next;
                    break;
                }
            }
            rVar = (com.truecaller.premium.PremiumLaunchContext$Static) rVar;
            if (rVar == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
                rVar = new i82.p(str);
            }
        }
        if (rVar == null) {
            return i82.r.X8;
        }
        return rVar;
    }

    public final com.truecaller.premium.data.SubscriptionPromoEventMetaData x0() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return (android.os.Parcelable) t80.g.q(extras, "analyticsMetadata", com.truecaller.premium.data.SubscriptionPromoEventMetaData.class);
        }
        return null;
    }

    public final void y0(boolean z10) {
        android.widget.ProgressBar progressBar = ((d91.qux) this.f4549e0.getValue()).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, androidx.core.app.NotificationCompat.CATEGORY_PROGRESS);
        gj.m.k0(progressBar, z10);
    }

    public final void z0(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(2131364005);
        if (F != null && F.getClass().equals(fragment.getClass())) {
            return;
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(2131364005, fragment, null);
        barVar.o();
    }
}
