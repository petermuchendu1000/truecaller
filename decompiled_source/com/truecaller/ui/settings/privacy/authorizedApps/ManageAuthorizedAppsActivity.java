package com.truecaller.ui.settings.privacy.authorizedApps;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ui/settings/privacy/authorizedApps/ManageAuthorizedAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Loy2/d;", "Loy2/a;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ManageAuthorizedAppsActivity extends com.truecaller.ui.settings.privacy.authorizedApps.Hilt_ManageAuthorizedAppsActivity implements oy2.d, oy2.a {
    public static final /* synthetic */ int j0 = 0;
    public d41.a d0;
    public m03.p e0;
    public u03.f0 f0;
    public ka1.qux g0;
    public oy2.qux h0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(new oy2.b(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        ak.r0.k0(this, 0, str, 0, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.content.Context, java.lang.Object, com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity] */
    @Override // com.truecaller.ui.settings.privacy.authorizedApps.Hilt_ManageAuthorizedAppsActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.os.Bundle extras;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558484, (android.view.ViewGroup) null, false);
        int i = 2131362585;
        com.google.android.material.button.MaterialButton o = df0.qux.o(2131362585, inflate);
        if (o != null) {
            i = 2131363240;
            com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates customRecyclerViewWithStates = (com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) df0.qux.o(2131363240, inflate);
            if (customRecyclerViewWithStates != null) {
                i = 2131367108;
                androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                if (o2 != null) {
                    d41.a aVar = new d41.a(inflate, o, customRecyclerViewWithStates, o2, 3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<set-?>");
                    this.d0 = aVar;
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = u0().b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
                    setContentView(u0().b);
                    android.content.Intent intent = getIntent();
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        str = extras.getString("context");
                    } else {
                        str = null;
                    }
                    com.truecaller.sdk.bar v0 = v0();
                    v0.a = this;
                    if (str == null) {
                        str = "privacy_center";
                    }
                    ((ka1.qux) v0).j = str;
                    oy2.d dVar = (oy2.d) v0.a;
                    if (dVar != null) {
                        com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity manageAuthorizedAppsActivity = (com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity) dVar;
                        manageAuthorizedAppsActivity.setSupportActionBar(manageAuthorizedAppsActivity.u0().e);
                        i.baz supportActionBar = manageAuthorizedAppsActivity.getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.p(true);
                        }
                    }
                    oy2.d dVar2 = (oy2.d) v0.a;
                    if (dVar2 != null) {
                        ?? r0 = (com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity) dVar2;
                        m03.p pVar = r0.e0;
                        if (pVar != null) {
                            com.bumptech.glide.j jVar = (com.bumptech.glide.j) r0.i0.getValue();
                            u03.f0 f0Var = r0.f0;
                            if (f0Var != null) {
                                oy2.qux quxVar = new oy2.qux(r0, pVar, jVar, f0Var);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                r0.h0 = quxVar;
                                ((com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) r0.u0().d).getRecyclerView().setAdapter(r0.t0());
                                androidx.recyclerview.widget.RecyclerView recyclerView = ((com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) r0.u0().d).getRecyclerView();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r0, "<this>");
                                recyclerView.addItemDecoration(new lc2.e(ak.r0.r(150, (android.content.Context) r0)));
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("themeResourceProvider");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("dateHelper");
                            throw null;
                        }
                    }
                    oy2.d dVar3 = (oy2.d) v0.a;
                    if (dVar3 != null) {
                        com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity manageAuthorizedAppsActivity2 = (com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity) dVar3;
                        ((com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) manageAuthorizedAppsActivity2.u0().d).setOnRetryClickListener(new oy2.b(manageAuthorizedAppsActivity2, 1));
                    }
                    oy2.d dVar4 = (oy2.d) v0.a;
                    if (dVar4 != null) {
                        com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity manageAuthorizedAppsActivity3 = (com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity) dVar4;
                        manageAuthorizedAppsActivity3.u0().c.setOnClickListener(new op0.baz(manageAuthorizedAppsActivity3, 14));
                    }
                    oy2.d dVar5 = (oy2.d) v0.a;
                    if (dVar5 != null) {
                        ((com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity) dVar5).y0();
                    }
                    fg3.h0.J(v0, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new oy2.e(v0, null, 1), 3);
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.truecaller.ui.settings.privacy.authorizedApps.Hilt_ManageAuthorizedAppsActivity
    public final void onDestroy() {
        super.onDestroy();
        v0().m1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final oy2.qux t0() {
        oy2.qux quxVar = this.h0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("adapter");
        throw null;
    }

    public final d41.a u0() {
        d41.a aVar = this.d0;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final ka1.qux v0() {
        ka1.qux quxVar = this.g0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void w0() {
        com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates customRecyclerViewWithStates = (com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) u0().d;
        gj.m.j0(customRecyclerViewWithStates.getRecyclerView());
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) customRecyclerViewWithStates.v.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        gj.m.f0(linearLayout);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) customRecyclerViewWithStates.t.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
        gj.m.f0(linearLayout2);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) customRecyclerViewWithStates.u.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
        gj.m.f0(linearLayout3);
    }

    public final void x0() {
        com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates customRecyclerViewWithStates = (com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) u0().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customRecyclerViewWithStates, "customRecyclerView");
        int i = com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates.A;
        customRecyclerViewWithStates.setEmptyText(customRecyclerViewWithStates.x);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) customRecyclerViewWithStates.v.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        gj.m.f0(linearLayout);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) customRecyclerViewWithStates.t.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
        gj.m.f0(linearLayout2);
        gj.m.f0(customRecyclerViewWithStates.getRecyclerView());
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) customRecyclerViewWithStates.u.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
        gj.m.j0(linearLayout3);
    }

    public final void y0() {
        com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates customRecyclerViewWithStates = (com.truecaller.ui.settings.privacy.authorizedApps.CustomRecyclerViewWithStates) u0().d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) customRecyclerViewWithStates.u.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        gj.m.f0(linearLayout);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) customRecyclerViewWithStates.t.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
        gj.m.f0(linearLayout2);
        gj.m.f0(customRecyclerViewWithStates.getRecyclerView());
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) customRecyclerViewWithStates.v.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
        gj.m.j0(linearLayout3);
    }

    public final void z0(boolean z) {
        if (z) {
            com.google.android.material.button.MaterialButton materialButton = u0().c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialButton, "btnRevokeAllApps");
            gj.m.j0(materialButton);
        } else {
            com.google.android.material.button.MaterialButton materialButton2 = u0().c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialButton2, "btnRevokeAllApps");
            gj.m.f0(materialButton2);
        }
    }
}
