package com.truecaller.premium.familysharing.editfamily;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/familysharing/editfamily/FamilySharingActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "<init>", "()V", "ap1/d", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingActivity extends com.truecaller.ui.FragmentActivityBase {
    public static final /* synthetic */ int j0 = 0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 16));

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.i0;
        setContentView(((d91.b) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((d91.b) lazy.getValue()).d;
        setSupportActionBar(toolbar);
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.A(2132018497);
        }
        androidx.core.widget.NestedScrollView nestedScrollView = ((d91.b) lazy.getValue()).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nestedScrollView, "scrollView");
        ak.r0.i(nestedScrollView, com.truecaller.common.ui.insets.InsetType.NavigationBar);
        android.content.Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("EXTRA_ANALYTICS_LAUNCH_CONTEXT")) == null) {
            str = "unknown";
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra = intent2.getStringExtra("EXTRA_PAGE_TYPE")) != null) {
            android.os.Bundle c = com.appsflyer.internal.e.c("PageTypeBundleKey", stringExtra, "AnalyticsLaunchContext", str);
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "beginTransaction(...)");
            xa2.qux quxVar = new xa2.qux();
            quxVar.setArguments(c);
            kotlin.Unit unit = kotlin.Unit.a;
            barVar.g(2131363145, quxVar, (java.lang.String) null);
            ((androidx.fragment.app.q1) barVar).f = 0;
            barVar.m(true, true);
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
