package com.truecaller.settings.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SettingsActivity extends com.truecaller.settings.impl.ui.Hilt_SettingsActivity {
    public static final /* synthetic */ int f0 = 0;
    public ck2.bar d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.settings.impl.ui.o.class), new com.truecaller.settings.impl.ui.qux(this, 1), new com.truecaller.settings.impl.ui.qux(this, 0), new com.truecaller.settings.impl.ui.qux(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.settings.impl.ui.Hilt_SettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.coordinatorlayout.widget.CoordinatorLayout inflate = getLayoutInflater().inflate(2131558499, (android.view.ViewGroup) null, false);
        int i = 2131362267;
        if (df0.qux.o(2131362267, inflate) != null) {
            i = 2131365437;
            if (df0.qux.o(2131365437, inflate) != null) {
                i = 2131367108;
                androidx.appcompat.widget.Toolbar o = df0.qux.o(2131367108, inflate);
                if (o != null) {
                    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = inflate;
                    ck2.bar barVar = new ck2.bar((android.view.View) coordinatorLayout, 28, (java.lang.Object) o);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                    this.d0 = barVar;
                    setContentView(coordinatorLayout);
                    ck2.bar barVar2 = this.d0;
                    if (barVar2 != null) {
                        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) barVar2.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
                        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
                        ck2.bar barVar3 = this.d0;
                        if (barVar3 != null) {
                            setSupportActionBar((androidx.appcompat.widget.Toolbar) barVar3.c);
                            i.baz supportActionBar = getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.v(2131233387);
                                supportActionBar.p(true);
                                supportActionBar.t(true);
                                supportActionBar.A(2132021630);
                            }
                            ck2.bar barVar4 = this.d0;
                            if (barVar4 != null) {
                                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2 = barVar4.b;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "getRoot(...)");
                                ak.r0.i(coordinatorLayout2, com.truecaller.common.ui.insets.InsetType.NavigationBar);
                                pe0.j.p(this, ((com.truecaller.settings.impl.ui.o) this.e0.getValue()).g, new com.truecaller.settings.impl.ui.baz(this));
                                ge0.i.m(getOnBackPressedDispatcher(), this, new c2.a(this, 27), 2);
                                u0(getIntent());
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        u0(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        boolean z;
        if (sp1.baz.A(this)) {
            sp1.baz.t(this);
            return true;
        }
        rb.y h = t0().h();
        if (h != null && h.h == t0().j().l) {
            z = true;
        } else {
            z = false;
        }
        if (!((com.truecaller.settings.impl.ui.o) this.e0.getValue()).e.a.getFinishOnBackPress() && !z) {
            t0().r();
            return false;
        }
        finish();
        return true;
    }

    public final rb.e0 t0() {
        androidx.navigation.fragment.NavHostFragment F = getSupportFragmentManager().F(2131365437);
        kotlin.jvm.internal.Intrinsics.e(F, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return F.R4();
    }

    public final void u0(android.content.Intent intent) {
        com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig;
        com.truecaller.settings.api.SettingsCategory settingsCategory;
        com.truecaller.settings.api.SettingDeepLink settingDeepLink;
        java.lang.String stringExtra;
        com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig2;
        if (intent != null && (settingsLaunchConfig2 = (com.truecaller.settings.api.SettingsLaunchConfig) ((android.os.Parcelable) g6.b.g(intent, "extra_settings_launch_config", com.truecaller.settings.api.SettingsLaunchConfig.class))) != null) {
            settingsLaunchConfig = settingsLaunchConfig2;
        } else {
            settingsLaunchConfig = new com.truecaller.settings.api.SettingsLaunchConfig(null, null, null, false, false, false, 63, null);
        }
        if (intent == null || (settingsCategory = (com.truecaller.settings.api.SettingsCategory) ee0.l.t(intent, "extra_category", com.truecaller.settings.api.SettingsCategory.class)) == null) {
            settingsCategory = com.truecaller.settings.api.SettingsCategory.SETTINGS_MAIN;
        }
        com.truecaller.settings.api.SettingsCategory settingsCategory2 = settingsCategory;
        if (intent != null && (stringExtra = intent.getStringExtra("extra_setting")) != null) {
            com.truecaller.settings.api.SettingDeepLink.Companion.getClass();
            settingDeepLink = kq2.bar.a(stringExtra);
        } else {
            settingDeepLink = null;
        }
        com.truecaller.settings.impl.ui.o oVar = (com.truecaller.settings.impl.ui.o) this.e0.getValue();
        oVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLaunchConfig, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsCategory2, "category");
        fg3.h0.J(androidx.lifecycle.g1.l(oVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.settings.impl.ui.n(oVar, settingsLaunchConfig, settingsCategory2, settingDeepLink, null), 3);
    }
}
