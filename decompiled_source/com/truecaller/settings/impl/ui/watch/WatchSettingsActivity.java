package com.truecaller.settings.impl.ui.watch;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/watch/WatchSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WatchSettingsActivity extends com.truecaller.settings.impl.ui.watch.Hilt_WatchSettingsActivity {
    public s62.d d0;
    public d91.c e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.settings.impl.ui.watch.Hilt_WatchSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.B(this, true, ex2.a.a);
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558511, (android.view.ViewGroup) null, false);
        int i = 2131362267;
        if (df0.qux.o(2131362267, inflate) != null) {
            i = 2131363151;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131363151, inflate);
            if (frameLayout != null) {
                androidx.appcompat.widget.Toolbar o = df0.qux.o(2131367108, inflate);
                if (o != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                    d91.c cVar = new d91.c(constraintLayout, frameLayout, o, 17);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                    this.e0 = cVar;
                    setContentView(constraintLayout);
                    d91.c cVar2 = this.e0;
                    if (cVar2 != null) {
                        setSupportActionBar((androidx.appcompat.widget.Toolbar) cVar2.d);
                        i.baz supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.v(2131233387);
                            supportActionBar.p(true);
                            supportActionBar.t(true);
                            supportActionBar.A(2132021630);
                        }
                        d91.c cVar3 = this.e0;
                        if (cVar3 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = cVar3.b;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                            ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                            if (bundle != null) {
                                return;
                            }
                            java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
                            if (stringExtra == null) {
                                stringExtra = "unknown";
                            }
                            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsLaunchContext");
                            com.truecaller.settings.impl.ui.watch.WatchSettingsFragment watchSettingsFragment = new com.truecaller.settings.impl.ui.watch.WatchSettingsFragment();
                            watchSettingsFragment.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("analytics_context", stringExtra)}));
                            barVar.g(2131363151, watchSettingsFragment, com.truecaller.settings.impl.ui.watch.WatchSettingsFragment.class.getName());
                            barVar.l();
                            s62.f fVar = this.d0;
                            if (fVar != null) {
                                fVar.a(2131367580, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationWearableApp");
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("notificationManager");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                i = 2131367108;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        finish();
        return true;
    }
}
