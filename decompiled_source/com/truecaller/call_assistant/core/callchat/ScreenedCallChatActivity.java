package com.truecaller.call_assistant.core.callchat;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/core/callchat/ScreenedCallChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "o82/a", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallChatActivity extends com.truecaller.call_assistant.core.callchat.Hilt_ScreenedCallChatActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(in0.k.class), new in0.baz(this, 1), new in0.baz(this, 0), new in0.baz(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.core.callchat.Hilt_ScreenedCallChatActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.lifecycle.o1 o1Var = this.d0;
        if (bundle == null) {
            pe0.j.p(this, ((in0.k) o1Var.getValue()).c, new dr2.c(this, 27));
        }
        in0.k kVar = (in0.k) o1Var.getValue();
        kVar.getClass();
        m03.r.t(kVar, new bf2.qux(kVar, (df3.bar) null, 16));
    }
}
