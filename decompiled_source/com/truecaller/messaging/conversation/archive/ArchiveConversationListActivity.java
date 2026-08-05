package com.truecaller.messaging.conversation.archive;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/conversation/archive/ArchiveConversationListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ArchiveConversationListActivity extends com.truecaller.messaging.conversation.archive.Hilt_ArchiveConversationListActivity {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.archive.Hilt_ArchiveConversationListActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            v02.a.p.getClass();
            v02.a aVar = new v02.a();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("analytics_context", stringExtra);
            aVar.setArguments(bundle2);
            j.g(android.R.id.content, aVar, (java.lang.String) null);
            j.l();
        }
    }
}
