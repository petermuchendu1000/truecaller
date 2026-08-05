package com.truecaller.deactivation.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/AccountDeactivationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AccountDeactivationActivity extends com.truecaller.deactivation.impl.ui.Hilt_AccountDeactivationActivity {
    public d91.c d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.deactivation.impl.ui.Hilt_AccountDeactivationActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.coordinatorlayout.widget.CoordinatorLayout inflate = getLayoutInflater().inflate(2131558432, (android.view.ViewGroup) null, false);
        int i = 2131362267;
        com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362267, inflate);
        if (o != null) {
            i = 2131364009;
            if (df0.qux.o(2131364009, inflate) != null) {
                i = 2131367108;
                androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                if (o2 != null) {
                    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = inflate;
                    d91.c cVar = new d91.c(coordinatorLayout, o, o2, 9);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                    this.d0 = cVar;
                    setContentView(coordinatorLayout);
                    d91.c cVar2 = this.d0;
                    if (cVar2 != null) {
                        com.google.android.material.appbar.AppBarLayout appBarLayout = cVar2.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBar");
                        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
                        d91.c cVar3 = this.d0;
                        if (cVar3 != null) {
                            setSupportActionBar((androidx.appcompat.widget.Toolbar) cVar3.d);
                            i.baz supportActionBar = getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.v(2131233387);
                                supportActionBar.p(true);
                                supportActionBar.t(true);
                                supportActionBar.A(2132019274);
                            }
                            d91.c cVar4 = this.d0;
                            if (cVar4 != null) {
                                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2 = cVar4.b;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "getRoot(...)");
                                ak.r0.i(coordinatorLayout2, com.truecaller.common.ui.insets.InsetType.NavigationBar);
                                getOnBackPressedDispatcher().a(this, new ah.h0(this, 13));
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        rb.y h = t0().h();
        if (h != null && h.h == t0().j().l) {
            finish();
            return true;
        }
        if (sp1.baz.A(this)) {
            sp1.baz.t(this);
            return false;
        }
        t0().r();
        return false;
    }

    public final rb.e0 t0() {
        androidx.navigation.fragment.NavHostFragment F = getSupportFragmentManager().F(2131364009);
        kotlin.jvm.internal.Intrinsics.e(F, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return F.R4();
    }
}
