package com.truecaller.messaging.groupinfo;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/groupinfo/GroupInfoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "a/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GroupInfoActivity extends com.truecaller.messaging.groupinfo.Hilt_GroupInfoActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.groupinfo.Hilt_GroupInfoActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.messaging.data.types.Conversation conversation;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle != null || (conversation = (com.truecaller.messaging.data.types.Conversation) getIntent().getParcelableExtra("conversation")) == null) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
        if (stringExtra == null) {
            stringExtra = "undefined";
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
        k22.a.p.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
        k22.a aVar = new k22.a();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("conversation", conversation);
        bundle2.putString("analytics_context", stringExtra);
        aVar.setArguments(bundle2);
        j.g(android.R.id.content, aVar, (java.lang.String) null);
        j.l();
    }
}
