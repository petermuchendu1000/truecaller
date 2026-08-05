package com.truecaller.premium.insurance.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/InsuranceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsuranceActivity extends com.truecaller.premium.insurance.ui.Hilt_InsuranceActivity {
    public static final /* synthetic */ int f0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ib2.m.class), new ib2.qux(this, 1), new ib2.qux(this, 0), new ib2.qux(this, 2));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 16));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.insurance.ui.Hilt_InsuranceActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        setContentView(t0().a);
        setSupportActionBar(t0().d);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        androidx.lifecycle.o1 o1Var = this.d0;
        pe0.j.p(this, ((ib2.m) o1Var.getValue()).i, new ib2.baz(this, 0));
        pe0.j.r(this, ((ib2.m) o1Var.getValue()).g, new ib2.baz(this, 1));
        ge0.i.m(getOnBackPressedDispatcher(), this, new ib2.bar(this, 0), 2);
        ib2.m mVar = (ib2.m) o1Var.getValue();
        mVar.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(mVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hu0.qux(mVar, (df3.bar) null, 10), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        java.lang.Integer num;
        java.lang.Integer[] numArr = {java.lang.Integer.valueOf(u0().j().l), 2131366033, 2131365504, 2131362091, 2131366030};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numArr, "elements");
        java.util.Set l0 = kotlin.collections.v.l0(numArr);
        rb.y h = u0().h();
        if (h != null) {
            num = java.lang.Integer.valueOf(h.h);
        } else {
            num = null;
        }
        if (kotlin.collections.CollectionsKt.N(l0, num)) {
            finish();
            return true;
        }
        u0().s();
        return false;
    }

    public final l92.bar t0() {
        return (l92.bar) this.e0.getValue();
    }

    public final rb.e0 u0() {
        androidx.navigation.fragment.NavHostFragment F = getSupportFragmentManager().F(2131365437);
        kotlin.jvm.internal.Intrinsics.e(F, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return F.R4();
    }
}
