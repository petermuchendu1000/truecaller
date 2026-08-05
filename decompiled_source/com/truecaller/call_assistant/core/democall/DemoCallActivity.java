package com.truecaller.call_assistant.core.democall;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/core/democall/DemoCallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DemoCallActivity extends com.truecaller.call_assistant.core.democall.Hilt_DemoCallActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 23));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.democall.Hilt_DemoCallActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((xp0.c) lazy.getValue()).a);
        setSupportActionBar(((xp0.c) lazy.getValue()).b);
        setTitle("");
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        i.baz supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(true);
        }
        android.widget.LinearLayout linearLayout = ((xp0.c) lazy.getValue()).a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        ak.r0.i(linearLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
        ((xp0.c) lazy.getValue()).b.setNavigationOnClickListener(new yt2.a(this, 5));
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            ((androidx.fragment.app.q1) barVar).p = true;
            java.lang.String stringExtra = getIntent().getStringExtra("PARAM_LAUNCH_SOURCE");
            if (stringExtra != null) {
                zp0.baz.l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
                zp0.baz bazVar = new zp0.baz();
                bazVar.setArguments(ue0.i.t(new kotlin.Pair("ARG_ANALYTICS_CONTEXT", stringExtra)));
                barVar.g(2131364005, bazVar, (java.lang.String) null);
            }
            barVar.l();
        }
    }
}
