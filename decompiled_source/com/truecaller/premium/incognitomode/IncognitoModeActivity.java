package com.truecaller.premium.incognitomode;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/incognitomode/IncognitoModeActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class IncognitoModeActivity extends com.truecaller.ui.FragmentActivityBase {
    public static final /* synthetic */ int j0 = 0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 6));

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.i0;
        setContentView(((d91.b) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((d91.b) lazy.getValue()).d;
        setSupportActionBar(toolbar);
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.A(2132018512);
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.content.Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("ANALYTICS_LAUNCH_CONTEXT")) == null) {
            str = "unknown";
        }
        bundle2.putString("ANALYTICS_LAUNCH_CONTEXT", str);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "beginTransaction(...)");
        eb2.baz bazVar = new eb2.baz();
        bazVar.setArguments(bundle2);
        kotlin.Unit unit = kotlin.Unit.a;
        barVar.g(2131363145, bazVar, (java.lang.String) null);
        ((androidx.fragment.app.q1) barVar).f = 0;
        barVar.m(true, true);
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
