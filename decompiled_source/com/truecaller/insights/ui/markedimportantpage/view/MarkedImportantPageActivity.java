package com.truecaller.insights.ui.markedimportantpage.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/ui/markedimportantpage/view/MarkedImportantPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MarkedImportantPageActivity extends com.truecaller.insights.ui.markedimportantpage.view.Hilt_MarkedImportantPageActivity {
    public static final /* synthetic */ int h0 = 0;
    public dy1.bar d0;
    public tx.b e0;
    public final androidx.lifecycle.o1 f0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(dy1.a.class), new ey1.bar(this, 0), new e31.bar(this, 10), new ey1.bar(this, 1));
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 8));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.ui.markedimportantpage.view.Hilt_MarkedImportantPageActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        vy2.i.H(this);
        setContentView(t0().a);
        qx1.bar t0 = t0();
        dy1.bar barVar = this.d0;
        if (barVar != null) {
            dy1.a u0 = u0();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0, "importantMessageMarker");
            barVar.o = u0;
            androidx.recyclerview.widget.RecyclerView recyclerView = t0.d;
            if (recyclerView.getAdapter() == null) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
                dy1.bar barVar2 = this.d0;
                if (barVar2 != null) {
                    recyclerView.setAdapter(barVar2);
                    recyclerView.setLayoutManager(linearLayoutManager);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("listAdapter");
                    throw null;
                }
            }
            setSupportActionBar(t0().e);
            i.baz supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.p(true);
                supportActionBar.s(true);
            }
            androidx.lifecycle.q0 q0Var = u0().j;
            dy1.bar barVar3 = this.d0;
            if (barVar3 != null) {
                q0Var.e(this, new az1.qux(barVar3, 2));
                u0().k.e(this, new az1.qux(this, 3));
                dy1.a u03 = u0();
                androidx.lifecycle.t lifecycle = getLifecycle();
                u03.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                lifecycle.a(u03.d);
                lifecycle.a(u03);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("listAdapter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("listAdapter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        boolean z;
        android.view.MenuItem findItem;
        android.view.MenuItem findItem2;
        java.util.List list;
        cy1.d dVar = u0().i.a;
        if (dVar != null && (list = dVar.a) != null) {
            z = !list.isEmpty();
        } else {
            z = false;
        }
        if (z) {
            getMenuInflater().inflate(2131689507, menu);
        }
        if (menu != null && (findItem2 = menu.findItem(2131367309)) != null) {
            findItem2.setIcon(ze0.q.C(2131233663, this, 2130970931));
        }
        if (menu != null && (findItem = menu.findItem(2131365604)) != null) {
            findItem.setIcon(ze0.q.C(2131232947, this, 2130970935));
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131367309) {
            dy1.a u0 = u0();
            cy1.d dVar = u0.i.a;
            if (dVar != null) {
                java.util.List list = dVar.a;
                u0.r(kotlin.collections.CollectionsKt.I0(list), list, false);
            }
        } else if (itemId == 16908332) {
            finish();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final void onStart() {
        super.onStart();
        dy1.a u0 = u0();
        u0.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.presentation.disable.c(u0, (df3.bar) null, 27), 3);
    }

    public final qx1.bar t0() {
        return (qx1.bar) this.g0.getValue();
    }

    public final dy1.a u0() {
        return (dy1.a) this.f0.getValue();
    }
}
