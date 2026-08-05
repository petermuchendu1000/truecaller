package com.truecaller.survey.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/survey/qa/SurveyListQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "xt2/h", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SurveyListQaActivity extends com.truecaller.survey.qa.Hilt_SurveyListQaActivity {
    public static final /* synthetic */ int g0 = 0;
    public d41.a e0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(xt2.l.class), new xt2.i(this, 1), new xt2.i(this, 0), new xt2.i(this, 2));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new x22.qux(this, 24));

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.content.Intent t0(com.truecaller.qa.QMActivity qMActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qMActivity, "context");
        return new android.content.Intent((android.content.Context) qMActivity, (java.lang.Class<?>) com.truecaller.survey.qa.SurveyListQaActivity.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.survey.qa.Hilt_SurveyListQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558504, (android.view.ViewGroup) null, false);
        int i = 2131362277;
        com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362277, inflate);
        if (o != null) {
            i = 2131366735;
            androidx.viewpager2.widget.ViewPager2 o2 = df0.qux.o(2131366735, inflate);
            if (o2 != null) {
                i = 2131367108;
                androidx.appcompat.widget.Toolbar o3 = df0.qux.o(2131367108, inflate);
                if (o3 != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                    d41.a aVar = new d41.a(constraintLayout, o, o2, o3, 4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.e0 = aVar;
                    setContentView(constraintLayout);
                    d41.a aVar2 = this.e0;
                    if (aVar2 != null) {
                        com.google.android.material.appbar.AppBarLayout appBarLayout = aVar2.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appbar");
                        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
                        d41.a aVar3 = this.e0;
                        if (aVar3 != null) {
                            setSupportActionBar(aVar3.e);
                            i.baz supportActionBar = getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.v(2131233387);
                            }
                            i.baz supportActionBar2 = getSupportActionBar();
                            if (supportActionBar2 != null) {
                                supportActionBar2.p(true);
                            }
                            d41.a aVar4 = this.e0;
                            if (aVar4 != null) {
                                ((androidx.viewpager2.widget.ViewPager2) aVar4.d).setAdapter(u0());
                                d41.a aVar5 = this.e0;
                                if (aVar5 != null) {
                                    ((androidx.viewpager2.widget.ViewPager2) aVar5.d).c(new com.truecaller.cloudtelephony.callrecording.ui.details.b(this, 5));
                                    pe0.j.p(this, v0().h, new wo1.l(this, 7));
                                    return;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689519, menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131363190) {
            java.lang.Object systemService = getSystemService("clipboard");
            kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
            xt2.h u0 = u0();
            d41.a aVar = this.e0;
            if (aVar != null) {
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("survey", new com.google.gson.Gson().toJson(bu2.d.d(bu2.d.e((com.truecaller.surveys.data.local.SurveyEntity) u0.a().get(((androidx.viewpager2.widget.ViewPager2) aVar.d).getCurrentItem())), null))));
                return true;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        if (itemId == 2131363601) {
            xt2.h u02 = u0();
            u02.p.setValue(u02, xt2.h.r[1], java.lang.Boolean.valueOf(!u0().b()));
            return true;
        }
        if (itemId == 2131363188) {
            java.lang.Object systemService2 = getSystemService("clipboard");
            kotlin.jvm.internal.Intrinsics.e(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
            android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) systemService2;
            xt2.h u04 = u0();
            d41.a aVar2 = this.e0;
            if (aVar2 != null) {
                clipboardManager2.setPrimaryClip(android.content.ClipData.newPlainText("surveyId", bu2.d.d(bu2.d.e((com.truecaller.surveys.data.local.SurveyEntity) u04.a().get(((androidx.viewpager2.widget.ViewPager2) aVar2.d).getCurrentItem())), null).a));
                return true;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        if (itemId == 16908332) {
            finish();
        }
        return true;
    }

    public final xt2.h u0() {
        return (xt2.h) this.f0.getValue();
    }

    public final xt2.l v0() {
        return (xt2.l) this.d0.getValue();
    }
}
