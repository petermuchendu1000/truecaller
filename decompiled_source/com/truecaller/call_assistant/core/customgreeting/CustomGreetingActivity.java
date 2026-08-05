package com.truecaller.call_assistant.core.customgreeting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/core/customgreeting/CustomGreetingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomGreetingActivity extends com.truecaller.call_assistant.core.customgreeting.Hilt_CustomGreetingActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 25));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.customgreeting.Hilt_CustomGreetingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((xp0.a) lazy.getValue()).a);
        setSupportActionBar(((xp0.a) lazy.getValue()).b);
        setTitle(2132017347);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        ((xp0.a) lazy.getValue()).b.setNavigationOnClickListener(new lb1.b(this, 24));
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            ((androidx.fragment.app.q1) barVar).p = true;
            barVar.g(2131364005, new np0.qux(), (java.lang.String) null);
            barVar.l();
        }
    }
}
