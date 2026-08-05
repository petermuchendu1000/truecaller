package com.truecaller.search.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/search/qa/QaTopSpammersActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class QaTopSpammersActivity extends com.truecaller.search.qa.Hilt_QaTopSpammersActivity {
    public static final /* synthetic */ int g0 = 0;
    public d91.d e0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(qp2.h.class), new qp2.a(this, 1), new qp2.a(this, 0), new qp2.a(this, 2));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new pr2.bar(25));

    public static final void t0(com.truecaller.search.qa.QaTopSpammersActivity qaTopSpammersActivity, qp2.f fVar) {
        d91.d dVar = qaTopSpammersActivity.e0;
        if (dVar != null) {
            ((android.widget.TextView) dVar.d).setText(fVar.a);
            d91.d dVar2 = qaTopSpammersActivity.e0;
            if (dVar2 != null) {
                ((android.widget.TextView) dVar2.g).setText(fVar.b);
                qp2.d dVar3 = (qp2.d) qaTopSpammersActivity.f0.getValue();
                android.database.Cursor cursor = fVar.c;
                dVar3.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "newCursor");
                android.database.Cursor cursor2 = dVar3.m;
                if (cursor2 != null) {
                    cursor2.close();
                }
                dVar3.m = cursor;
                dVar3.notifyDataSetChanged();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.qa.Hilt_QaTopSpammersActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        int i = 1;
        df3.bar barVar = null;
        int i2 = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558508, (android.view.ViewGroup) null, false);
        int i3 = 2131364321;
        androidx.constraintlayout.widget.Group o = df0.qux.o(2131364321, inflate);
        if (o != null) {
            i3 = 2131366204;
            androidx.recyclerview.widget.RecyclerView o2 = df0.qux.o(2131366204, inflate);
            if (o2 != null) {
                i3 = 2131367108;
                androidx.appcompat.widget.Toolbar o3 = df0.qux.o(2131367108, inflate);
                if (o3 != null) {
                    i3 = 2131367205;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367205, inflate);
                    if (textView != null) {
                        i3 = 2131367234;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367234, inflate);
                        if (textView2 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                            d91.d dVar = new d91.d(constraintLayout, o, o2, o3, textView, textView2, 0);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                            this.e0 = dVar;
                            setContentView(constraintLayout);
                            d91.d dVar2 = this.e0;
                            if (dVar2 != null) {
                                setSupportActionBar(dVar2.f);
                                i.baz supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.B("");
                                }
                                d91.d dVar3 = this.e0;
                                if (dVar3 != null) {
                                    dVar3.c.setAdapter((qp2.d) this.f0.getValue());
                                    d91.d dVar4 = this.e0;
                                    if (dVar4 != null) {
                                        dVar4.c.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
                                        qp2.h hVar = (qp2.h) this.d0.getValue();
                                        hVar.getClass();
                                        fg3.h0.J(androidx.lifecycle.g1.l(hVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q8.n(hVar, (java.lang.Object) null, (df3.bar) null, 9), 3);
                                        androidx.lifecycle.g1.j(this).b(new qp2.baz(this, barVar, i2));
                                        androidx.lifecycle.g1.j(this).b(new qp2.baz(this, barVar, i));
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.MenuItem menuItem;
        getMenuInflater().inflate(2131689517, menu);
        android.view.View view = null;
        if (menu != null) {
            menuItem = menu.findItem(2131361961);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        if (menuItem != null) {
            view = menuItem.getActionView();
        }
        androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) view;
        if (searchView != null) {
            searchView.setOnQueryTextListener(new ns.k(this));
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }
}
