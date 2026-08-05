package com.truecaller.premium.premiumsupport;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/premiumsupport/PremiumSupportActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "Lub2/baz;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumSupportActivity extends com.truecaller.premium.premiumsupport.Hilt_PremiumSupportActivity implements ub2.baz {
    public static final /* synthetic */ int l0 = 0;
    public ab1.qux j0;
    public final kotlin.Lazy k0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 9));

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.k0;
        setContentView(((d91.a) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ((d91.a) lazy.getValue()).b.c;
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        setSupportActionBar(toolbar);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.A(2132018349);
        }
        ab1.qux quxVar = this.j0;
        if (quxVar != null) {
            quxVar.u0(this);
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    public final void onDestroy() {
        ab1.qux quxVar = this.j0;
        if (quxVar != null) {
            quxVar.m1();
            super.onDestroy();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }
}
