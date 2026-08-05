package com.truecaller.dialer.ui.setting.callhistory;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/dialer/ui/setting/callhistory/CallHistoryTapSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallHistoryTapSettingsActivity extends com.truecaller.dialer.ui.setting.callhistory.Hilt_CallHistoryTapSettingsActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 12));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.dialer.ui.setting.callhistory.Hilt_CallHistoryTapSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(null);
        kotlin.Lazy lazy = this.d0;
        setContentView(((xe1.bar) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((xe1.bar) lazy.getValue()).b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        setSupportActionBar(((xe1.bar) lazy.getValue()).b);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.v(2131233387);
            supportActionBar.p(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
