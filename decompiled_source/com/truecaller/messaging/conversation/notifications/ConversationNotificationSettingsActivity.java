package com.truecaller.messaging.conversation.notifications;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/conversation/notifications/ConversationNotificationSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationNotificationSettingsActivity extends com.truecaller.messaging.conversation.notifications.Hilt_ConversationNotificationSettingsActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.notifications.Hilt_ConversationNotificationSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("conversation");
            kotlin.jvm.internal.Intrinsics.d(parcelableExtra);
            com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) parcelableExtra;
            java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            n12.a.l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
            n12.a aVar = new n12.a();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("conversation", conversation);
            bundle2.putString("analytics_context", stringExtra);
            aVar.setArguments(bundle2);
            j.g(android.R.id.content, aVar, (java.lang.String) null);
            j.l();
        }
    }
}
