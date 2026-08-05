package com.truecaller.callhero_assistant;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/callhero_assistant/AssistantTabActivity;", "Lcom/truecaller/ui/FragmentActivityBase;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantTabActivity extends com.truecaller.ui.FragmentActivityBase {
    public static final /* synthetic */ int i0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        setContentView(2131558443);
        androidx.appcompat.widget.Toolbar findViewById = findViewById(2131367108);
        if (findViewById != null) {
            setSupportActionBar(findViewById);
            qq.baz layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            layoutParams.a = 0;
        }
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.t(false);
        }
        getIntent().putExtra("tabs", false);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "beginTransaction(...)");
        barVar.g(2131363145, new zm0.bar(), (java.lang.String) null);
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
