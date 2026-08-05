package com.truecaller.messaging.securedTab.passcode.setup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/securedTab/passcode/setup/PasscodeSetupActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "vy2/i", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PasscodeSetupActivity extends com.truecaller.messaging.securedTab.passcode.setup.Hilt_PasscodeSetupActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.securedTab.passcode.setup.Hilt_PasscodeSetupActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            u32.qux.l.getClass();
            u32.qux quxVar = new u32.qux();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("analytics_context", stringExtra);
            quxVar.setArguments(bundle2);
            j.g(android.R.id.content, quxVar, (java.lang.String) null);
            j.l();
        }
    }
}
