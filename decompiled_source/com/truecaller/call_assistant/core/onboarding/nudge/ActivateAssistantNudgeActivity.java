package com.truecaller.call_assistant.core.onboarding.nudge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/nudge/ActivateAssistantNudgeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "p40/l", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActivateAssistantNudgeActivity extends com.truecaller.call_assistant.core.onboarding.nudge.Hilt_ActivateAssistantNudgeActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 23));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.onboarding.nudge.Hilt_ActivateAssistantNudgeActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.B(this, true, ex2.a.a);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("analyticsContext");
        } else {
            str = null;
        }
        kotlin.Lazy lazy = this.d0;
        setContentView(((xp0.bar) lazy.getValue()).a);
        getSupportFragmentManager().h0("nudgeScreenCloseAction", this, new jc3.bar(this, 24));
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            android.os.Bundle m = k9.d.m("analyticsContext", str);
            ((androidx.fragment.app.q1) barVar).p = true;
            int id = ((xp0.bar) lazy.getValue()).b.getId();
            mq0.a aVar = new mq0.a();
            aVar.setArguments(m);
            kotlin.Unit unit = kotlin.Unit.a;
            barVar.g(id, aVar, (java.lang.String) null);
            barVar.l();
        }
    }
}
