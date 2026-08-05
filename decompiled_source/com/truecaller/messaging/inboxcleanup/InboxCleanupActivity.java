package com.truecaller.messaging.inboxcleanup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/InboxCleanupActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "h0/k", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InboxCleanupActivity extends com.truecaller.messaging.inboxcleanup.Hilt_InboxCleanupActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.inboxcleanup.Hilt_InboxCleanupActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            com.truecaller.messaging.inboxcleanup.CleanupResult cleanupResult = (com.truecaller.messaging.inboxcleanup.CleanupResult) getIntent().getParcelableExtra("cleanup_result");
            java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
            int intExtra = getIntent().getIntExtra("action", 0);
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            m22.y.o.getClass();
            m22.y yVar = new m22.y();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("cleanup_result", cleanupResult);
            bundle2.putString("analytics_context", stringExtra);
            bundle2.putInt("action", intExtra);
            yVar.setArguments(bundle2);
            j.g(android.R.id.content, yVar, (java.lang.String) null);
            j.l();
        }
    }
}
