package com.truecaller.featuretoggles.qm;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/featuretoggles/qm/QmInventoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "feature-toggles_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QmInventoryActivity extends com.truecaller.featuretoggles.qm.Hilt_QmInventoryActivity {
    public static final /* synthetic */ int g0 = 0;
    public ho2.d d0;
    public q6.baz e0;
    public final androidx.lifecycle.o1 f0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ro1.h.class), new ro1.b(this, 1), new ro1.b(this, 0), new ro1.b(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.featuretoggles.qm.Hilt_QmInventoryActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = q7.qux.a;
        setContentView(2131558497);
        boolean z = false;
        q7.e a = q7.qux.a((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, 2131558497);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "setContentView(...)");
        po1.bar barVar = (po1.bar) a;
        android.view.View view = ((q7.e) barVar).d;
        final java.lang.Object[] objArr = 0 == true ? 1 : 0;
        view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: ro1.qux
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                switch (objArr) {
                    case 0:
                        int i = com.truecaller.featuretoggles.qm.QmInventoryActivity.g0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "insets");
                        u6.z1 h = u6.z1.h(windowInsets, (android.view.View) null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "toWindowInsetsCompat(...)");
                        u6.w1 w1Var = h.a;
                        view2.setPadding(view2.getPaddingLeft(), w1Var.g(1).b, view2.getPaddingRight(), w1Var.g(2).d);
                        return windowInsets;
                    case 1:
                        int i2 = com.truecaller.remoteconfig.qm.QmConfigInventoryActivity.g0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "insets");
                        u6.z1 h2 = u6.z1.h(windowInsets, (android.view.View) null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "toWindowInsetsCompat(...)");
                        u6.w1 w1Var2 = h2.a;
                        view2.setPadding(view2.getPaddingLeft(), w1Var2.g(1).b, view2.getPaddingRight(), w1Var2.g(2).d);
                        return windowInsets;
                    default:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "v");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "insets");
                        u6.z1 h3 = u6.z1.h(windowInsets, (android.view.View) null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "toWindowInsetsCompat(...)");
                        u6.w1 w1Var3 = h3.a;
                        view2.setPadding(view2.getPaddingLeft(), w1Var3.g(1).b, view2.getPaddingRight(), w1Var3.g(2).d);
                        return windowInsets;
                }
            }
        });
        barVar.k(this);
        po1.qux quxVar = (po1.qux) barVar;
        quxVar.r = t0();
        synchronized (quxVar) {
            quxVar.v |= 8;
        }
        quxVar.a(10);
        quxVar.j();
        androidx.appcompat.widget.Toolbar findViewById = findViewById(2131367108);
        findViewById.setTitle("");
        findViewById.setNavigationOnClickListener(new pn0.a(this, 15));
        setSupportActionBar(findViewById);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        dx2.bar barVar2 = dx2.bar.a;
        if ((dx2.bar.a() instanceof dx2.qux) || (dx2.bar.a() instanceof dx2.b)) {
            z = true;
        }
        q6.baz bazVar = new q6.baz(getWindow().getDecorView(), getWindow());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bazVar, "getInsetsController(...)");
        this.e0 = bazVar;
        bazVar.v(z);
        q6.baz bazVar2 = this.e0;
        if (bazVar2 != null) {
            bazVar2.u(z);
            androidx.appcompat.widget.AppCompatSpinner findViewById2 = findViewById(2131364737);
            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(findViewById2.getContext(), android.R.layout.simple_spinner_item);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            findViewById2.setAdapter(arrayAdapter);
            androidx.appcompat.widget.AppCompatSpinner findViewById3 = findViewById(2131367304);
            android.widget.ArrayAdapter arrayAdapter2 = new android.widget.ArrayAdapter(findViewById3.getContext(), android.R.layout.simple_spinner_item);
            arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            findViewById3.setAdapter(arrayAdapter2);
            this.d0 = new ho2.d(t0());
            androidx.recyclerview.widget.RecyclerView findViewById4 = findViewById(2131363855);
            findViewById4.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(findViewById4.getContext()));
            ho2.d dVar = this.d0;
            if (dVar != null) {
                findViewById4.setAdapter(dVar);
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ro1.a(this, null, 1), 3);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("featureListAdapter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("windowInsetsControllerCompat");
        throw null;
    }

    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(2131689515, menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131362055) {
            ro1.h t0 = t0();
            ((ro1.bar) t0.e.get()).a().edit().clear().apply();
            t0.o();
            return true;
        }
        android.content.ComponentName componentName = null;
        if (itemId == 2131362056) {
            android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                componentName = launchIntentForPackage.getComponent();
            }
            android.content.Intent makeRestartActivityTask = android.content.Intent.makeRestartActivityTask(componentName);
            finishAffinity();
            startActivity(makeRestartActivityTask);
            java.lang.System.exit(0);
            throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        if (itemId == 2131362018) {
            ro1.h t03 = t0();
            t03.getClass();
            fg3.h0.J(androidx.lifecycle.g1.l(t03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qd1.b(t03, (df3.bar) null, 17), 3);
            return true;
        }
        if (itemId == 2131362016) {
            ro1.h t04 = t0();
            ((vj2.a) t04.h.get()).fetch();
            t04.o();
            return true;
        }
        if (itemId == 16908332) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final ro1.h t0() {
        return (ro1.h) this.f0.getValue();
    }
}
