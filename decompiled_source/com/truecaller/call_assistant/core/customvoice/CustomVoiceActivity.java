package com.truecaller.call_assistant.core.customvoice;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/core/customvoice/CustomVoiceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lqp0/d;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomVoiceActivity extends com.truecaller.call_assistant.core.customvoice.Hilt_CustomVoiceActivity implements qp0.d {
    public static final /* synthetic */ int g0 = 0;
    public tx.qux d0;
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(new q10.bar(this, 22));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.customvoice.Hilt_CustomVoiceActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        setContentView(((xp0.b) this.f0.getValue()).a);
        ((qp0.e) this.e0.getValue()).u0(this);
    }

    @Override // com.truecaller.call_assistant.core.customvoice.Hilt_CustomVoiceActivity
    public final void onDestroy() {
        super.onDestroy();
        ((qp0.e) this.e0.getValue()).m1();
    }
}
