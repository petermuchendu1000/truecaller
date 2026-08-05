package com.truecaller.calling.speeddial;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/calling/speeddial/SpeedDialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SpeedDialActivity extends com.truecaller.calling.speeddial.Hilt_SpeedDialActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 14));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.calling.speeddial.Hilt_SpeedDialActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((xe1.baz) lazy.getValue()).a);
        com.google.android.material.appbar.AppBarLayout appBarLayout = ((xe1.baz) lazy.getValue()).b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBar");
        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
        setSupportActionBar(((xe1.baz) lazy.getValue()).c);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.t(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (16908332 == menuItem.getItemId()) {
            finish();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
