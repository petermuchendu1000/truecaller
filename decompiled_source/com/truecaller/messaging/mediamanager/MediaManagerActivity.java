package com.truecaller.messaging.mediamanager;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/mediamanager/MediaManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "p22/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MediaManagerActivity extends com.truecaller.messaging.mediamanager.Hilt_MediaManagerActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.mediamanager.Hilt_MediaManagerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) getIntent().getParcelableExtra("conversation");
        if (conversation == null) {
            return;
        }
        p22.b bVar = p22.c.n;
        java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
        if (stringExtra == null) {
            stringExtra = "unknown";
        }
        boolean booleanExtra = getIntent().getBooleanExtra("is_delete_mode", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("is_link_tab_visible", false);
        bVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
        p22.c cVar = new p22.c();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("conversation", conversation);
        bundle2.putString("analytics_context", stringExtra);
        bundle2.putBoolean("is_delete_mode", booleanExtra);
        bundle2.putBoolean("is_link_tab_visible", booleanExtra2);
        cVar.setArguments(bundle2);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(android.R.id.content, cVar, (java.lang.String) null);
        barVar.l();
    }
}
