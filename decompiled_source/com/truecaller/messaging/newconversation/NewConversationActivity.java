package com.truecaller.messaging.newconversation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/newconversation/NewConversationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "com/moloco/sdk/internal/publisher/b0", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NewConversationActivity extends com.truecaller.messaging.newconversation.Hilt_NewConversationActivity {
    public static final /* synthetic */ int e0 = 0;
    public s62.d d0;

    public final void onBackPressed() {
        int i;
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        int size = supportFragmentManager.d.size();
        if (supportFragmentManager.h != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (size + i > 0) {
            getSupportFragmentManager().U();
        } else {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.newconversation.Hilt_NewConversationActivity
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, new f32.e(), (java.lang.String) null);
            j.l();
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null && (i = extras.getInt("tc_notification_id", -1)) != -1) {
            s62.d dVar = this.d0;
            if (dVar != null) {
                ((s62.f) dVar).a(i, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationJoinedImUsers");
                ak.r0.l(this);
            } else {
                kotlin.jvm.internal.Intrinsics.n("notificationManager");
                throw null;
            }
        }
    }
}
