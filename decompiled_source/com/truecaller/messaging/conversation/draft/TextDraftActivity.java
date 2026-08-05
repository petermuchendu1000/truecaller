package com.truecaller.messaging.conversation.draft;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/TextDraftActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TextDraftActivity extends com.truecaller.messaging.conversation.draft.Hilt_TextDraftActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.draft.Hilt_TextDraftActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments sharedTextDraftsArguments = (com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments) getIntent().getParcelableExtra("shared_text_drafts");
        if (sharedTextDraftsArguments == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedTextDraftsArguments, "sharedTextDraftsArguments");
        y02.y yVar = new y02.y();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("shared_text_drafts", sharedTextDraftsArguments);
        yVar.setArguments(bundle2);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(android.R.id.content, yVar, (java.lang.String) null);
        barVar.l();
    }
}
