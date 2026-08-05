package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ui/FeedbackFormActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "<init>", "()V", "ue0/i", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FeedbackFormActivity extends com.truecaller.ui.Hilt_FeedbackFormActivity {
    public static final /* synthetic */ int k0 = 0;
    public final kotlin.Lazy j0 = kotlin.LazyKt.lazy(kotlin.k.c, new com.truecaller.ui.l(this));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.FragmentActivityBase, com.truecaller.ui.Hilt_FragmentActivityBase
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.j0;
        setContentView(((d91.baz) lazy.getValue()).a);
        com.google.android.material.appbar.AppBarLayout appBarLayout = ((d91.baz) lazy.getValue()).b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBar");
        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
        setSupportActionBar(((d91.baz) lazy.getValue()).c);
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
