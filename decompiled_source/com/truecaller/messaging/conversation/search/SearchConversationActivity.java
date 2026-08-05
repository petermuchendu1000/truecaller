package com.truecaller.messaging.conversation.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/conversation/search/SearchConversationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SearchConversationActivity extends com.truecaller.messaging.conversation.search.Hilt_SearchConversationActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.search.Hilt_SearchConversationActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) getIntent().getParcelableExtra("conversation");
        if (conversation == null) {
            return;
        }
        int intExtra = getIntent().getIntExtra("conversation_filter", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
            r12.g gVar = new r12.g();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("conversation", conversation);
            bundle2.putInt("conversation_filter", intExtra);
            bundle2.putString("analytics_context", stringExtra);
            gVar.setArguments(bundle2);
            barVar.g(android.R.id.content, gVar, (java.lang.String) null);
            barVar.l();
        }
    }
}
