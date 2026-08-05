package com.truecaller.remoteconfig.qm;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/remoteconfig/qm/QmConfigInventoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class QmConfigInventoryActivity extends com.truecaller.remoteconfig.qm.Hilt_QmConfigInventoryActivity {
    public static final /* synthetic */ int g0 = 0;
    public ho2.d d0;
    public q6.baz e0;
    public final androidx.lifecycle.o1 f0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(yj2.k.class), new yj2.a(this, 1), new yj2.a(this, 0), new yj2.a(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.remoteconfig.qm.Hilt_QmConfigInventoryActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        boolean z = true;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = q7.qux.a;
        setContentView(2131558496);
        d31.baz a = q7.qux.a((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, 2131558496);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "setContentView(...)");
        d31.baz bazVar = (d31.bar) a;
        ((q7.e) bazVar).d.setOnApplyWindowInsetsListener(new ro1.qux(1));
        bazVar.k(this);
        d31.baz bazVar2 = bazVar;
        ((d31.bar) bazVar2).r = t0();
        synchronized (bazVar2) {
            bazVar2.v |= 8;
        }
        bazVar2.a(10);
        bazVar2.j();
        androidx.appcompat.widget.Toolbar findViewById = findViewById(2131367108);
        findViewById.setTitle("");
        findViewById.setNavigationOnClickListener(new uo1.bar(this, 25));
        setSupportActionBar(findViewById);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        dx2.bar barVar = dx2.bar.a;
        if (!(dx2.bar.a() instanceof dx2.qux) && !(dx2.bar.a() instanceof dx2.b)) {
            z = false;
        }
        q6.baz bazVar3 = new q6.baz(getWindow().getDecorView(), getWindow());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bazVar3, "getInsetsController(...)");
        this.e0 = bazVar3;
        bazVar3.v(z);
        q6.baz bazVar4 = this.e0;
        df3.bar barVar2 = null;
        if (bazVar4 != null) {
            bazVar4.u(z);
            androidx.appcompat.widget.AppCompatSpinner findViewById2 = findViewById(2131364737);
            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(findViewById2.getContext(), android.R.layout.simple_spinner_item);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            findViewById2.setAdapter(arrayAdapter);
            androidx.appcompat.widget.AppCompatSpinner findViewById3 = findViewById(2131367304);
            android.widget.ArrayAdapter arrayAdapter2 = new android.widget.ArrayAdapter(findViewById3.getContext(), android.R.layout.simple_spinner_item);
            arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            findViewById3.setAdapter(arrayAdapter2);
            this.d0 = new ho2.d(this);
            androidx.recyclerview.widget.RecyclerView findViewById4 = findViewById(2131363855);
            findViewById4.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(findViewById4.getContext()));
            ho2.d dVar = this.d0;
            if (dVar != null) {
                findViewById4.setAdapter(dVar);
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new yj2.qux(this, barVar2, 2), 3);
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
        getMenuInflater().inflate(2131689476, menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        int itemId = menuItem.getItemId();
        int i = 1;
        android.content.ComponentName componentName = null;
        if (itemId == 2131362055) {
            yj2.k t0 = t0();
            ((yj2.m) t0.b.get()).a().edit().clear().apply();
            ig3.h2 h2Var = t0.l;
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, valueOf);
        } else {
            int i2 = 0;
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
            if (itemId == 2131362014) {
                yj2.k t02 = t0();
                t02.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(t02), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new yj2.j(t02, componentName, i2), 3);
            } else if (itemId == 2131362015) {
                yj2.k t04 = t0();
                t04.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(t04), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new yj2.j(t04, componentName, i), 3);
            } else if (itemId == 2131362017) {
                yj2.k t05 = t0();
                t05.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(t05), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new yj2.j(t05, componentName, 2), 3);
            } else if (itemId == 16908332) {
                finish();
            } else {
                return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
            }
        }
        return true;
    }

    public final yj2.k t0() {
        return (yj2.k) this.f0.getValue();
    }
}
