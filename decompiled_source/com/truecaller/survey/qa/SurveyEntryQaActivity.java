package com.truecaller.survey.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/survey/qa/SurveyEntryQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SurveyEntryQaActivity extends com.truecaller.survey.qa.Hilt_SurveyEntryQaActivity {
    public static final /* synthetic */ int f0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(xt2.l.class), new xt2.b(this, 1), new xt2.b(this, 0), new xt2.b(this, 2));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(new xn2.k2(10));

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.content.Intent t0(com.truecaller.qa.QMActivity qMActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qMActivity, "context");
        return new android.content.Intent((android.content.Context) qMActivity, (java.lang.Class<?>) com.truecaller.survey.qa.SurveyEntryQaActivity.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.survey.qa.Hilt_SurveyEntryQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        final int i = 1;
        final int i2 = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558503, (android.view.ViewGroup) null, false);
        int i3 = 2131362277;
        if (df0.qux.o(2131362277, inflate) != null) {
            i3 = 2131363686;
            android.widget.EditText editText = (android.widget.EditText) df0.qux.o(2131363686, inflate);
            if (editText != null) {
                i3 = 2131364694;
                android.widget.Button button = (android.widget.Button) df0.qux.o(2131364694, inflate);
                if (button != null) {
                    i3 = 2131365641;
                    android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131365641, inflate);
                    if (button2 != null) {
                        i3 = 2131365874;
                        android.view.View o = df0.qux.o(2131365874, inflate);
                        if (o != null) {
                            d91.v0 a = d91.v0.a(o);
                            androidx.recyclerview.widget.RecyclerView recyclerView = a.j;
                            androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                            if (o2 != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                final d91.c cVar = new d91.c(constraintLayout, editText, button, button2, a, o2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                                setContentView(constraintLayout);
                                setSupportActionBar(o2);
                                i.baz supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.v(2131233387);
                                }
                                i.baz supportActionBar2 = getSupportActionBar();
                                if (supportActionBar2 != null) {
                                    supportActionBar2.p(true);
                                }
                                i.baz supportActionBar3 = getSupportActionBar();
                                if (supportActionBar3 != null) {
                                    supportActionBar3.B("Survey Entry");
                                }
                                androidx.lifecycle.x j = androidx.lifecycle.g1.j(this);
                                x71.baz bazVar = new x71.baz(this, cVar, (df3.bar) null, 29);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "block");
                                fg3.h0.J(j, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a32.d(j, bazVar, (df3.bar) null, 19), 3);
                                recyclerView.setAdapter((yt2.c) this.e0.getValue());
                                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(constraintLayout.getContext()));
                                button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: xt2.a
                                    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, java.lang.Object, com.truecaller.survey.qa.SurveyEntryQaActivity] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        int i4 = i2;
                                        ?? r1 = this;
                                        d91.c cVar2 = cVar;
                                        switch (i4) {
                                            case 0:
                                                int i5 = com.truecaller.survey.qa.SurveyEntryQaActivity.f0;
                                                java.lang.String obj = ((android.widget.EditText) cVar2.c).getText().toString();
                                                xt2.l lVar = (xt2.l) r1.d0.getValue();
                                                x22.qux quxVar = new x22.qux((java.lang.Object) r1, 23);
                                                lVar.getClass();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "surveyJson");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "onError");
                                                fg3.h0.J(androidx.lifecycle.g1.l(lVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new wa2.c(10, (df3.bar) null, lVar, quxVar, obj), 3);
                                                return;
                                            default:
                                                int i6 = com.truecaller.survey.qa.SurveyEntryQaActivity.f0;
                                                try {
                                                    d91.v0 v0Var = (d91.v0) cVar2.d;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0Var, "qaSurveyDetails");
                                                    com.truecaller.surveys.data.local.SurveyEntity c = xt2.qux.c(v0Var, (yt2.c) r1.e0.getValue());
                                                    xt2.l lVar2 = (xt2.l) r1.d0.getValue();
                                                    lVar2.getClass();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "survey");
                                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar2), fg3.r0.b, (fg3.f0) null, new xt2.k(lVar2, c, (df3.bar) null, 0), 2);
                                                    android.widget.Toast.makeText(r1.getApplicationContext(), "Successfully inserted survey", 0).show();
                                                    return;
                                                } catch (java.lang.Exception e) {
                                                    e.printStackTrace();
                                                    e.getMessage();
                                                    android.widget.Toast.makeText(r1.getApplicationContext(), "Failed to insert survey", 0).show();
                                                    return;
                                                }
                                        }
                                    }
                                });
                                button.setOnClickListener(new android.view.View.OnClickListener() { // from class: xt2.a
                                    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, java.lang.Object, com.truecaller.survey.qa.SurveyEntryQaActivity] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        int i4 = i;
                                        ?? r1 = this;
                                        d91.c cVar2 = cVar;
                                        switch (i4) {
                                            case 0:
                                                int i5 = com.truecaller.survey.qa.SurveyEntryQaActivity.f0;
                                                java.lang.String obj = ((android.widget.EditText) cVar2.c).getText().toString();
                                                xt2.l lVar = (xt2.l) r1.d0.getValue();
                                                x22.qux quxVar = new x22.qux((java.lang.Object) r1, 23);
                                                lVar.getClass();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "surveyJson");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "onError");
                                                fg3.h0.J(androidx.lifecycle.g1.l(lVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new wa2.c(10, (df3.bar) null, lVar, quxVar, obj), 3);
                                                return;
                                            default:
                                                int i6 = com.truecaller.survey.qa.SurveyEntryQaActivity.f0;
                                                try {
                                                    d91.v0 v0Var = (d91.v0) cVar2.d;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0Var, "qaSurveyDetails");
                                                    com.truecaller.surveys.data.local.SurveyEntity c = xt2.qux.c(v0Var, (yt2.c) r1.e0.getValue());
                                                    xt2.l lVar2 = (xt2.l) r1.d0.getValue();
                                                    lVar2.getClass();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "survey");
                                                    fg3.h0.J(androidx.lifecycle.g1.l(lVar2), fg3.r0.b, (fg3.f0) null, new xt2.k(lVar2, c, (df3.bar) null, 0), 2);
                                                    android.widget.Toast.makeText(r1.getApplicationContext(), "Successfully inserted survey", 0).show();
                                                    return;
                                                } catch (java.lang.Exception e) {
                                                    e.printStackTrace();
                                                    e.getMessage();
                                                    android.widget.Toast.makeText(r1.getApplicationContext(), "Failed to insert survey", 0).show();
                                                    return;
                                                }
                                        }
                                    }
                                });
                                a.b.setOnClickListener(new uo1.bar(this, 16));
                                return;
                            }
                            i3 = 2131367108;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
