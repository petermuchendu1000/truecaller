package com.truecaller.incallui.callui.phoneAccount;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/incallui/callui/phoneAccount/PhoneAccountsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lmr1/a;", "Landroid/content/DialogInterface$OnDismissListener;", "<init>", "()V", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PhoneAccountsActivity extends com.truecaller.incallui.callui.phoneAccount.Hilt_PhoneAccountsActivity implements mr1.a, android.content.DialogInterface.OnDismissListener {
    public static final /* synthetic */ int f0 = 0;
    public dw2.qux d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(hv0.m.class), new mr1.baz(this, 1), new mr1.baz(this, 0), new mr1.baz(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.incallui.callui.phoneAccount.Hilt_PhoneAccountsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        t0().u0(this);
        ((hv0.m) this.e0.getValue()).c.e(this, new az1.qux(new l10.baz(this, 17)));
    }

    @Override // com.truecaller.incallui.callui.phoneAccount.Hilt_PhoneAccountsActivity
    public final void onDestroy() {
        t0().m1();
        super.onDestroy();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ro0.f.u((rr1.n) t0().f, 2);
    }

    public final void onPause() {
        dw2.qux t0 = t0();
        fg3.h0.J(t0, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hz0.qux(t0, (df3.bar) null, 25), 3);
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
    }

    public final dw2.qux t0() {
        dw2.qux quxVar = this.d0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
