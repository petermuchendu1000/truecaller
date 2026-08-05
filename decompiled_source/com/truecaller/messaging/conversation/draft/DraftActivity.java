package com.truecaller.messaging.conversation.draft;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/DraftActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "y90/m6", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DraftActivity extends com.truecaller.messaging.conversation.draft.Hilt_DraftActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.draft.Hilt_DraftActivity
    public final void onCreate(android.os.Bundle bundle) {
        android.graphics.drawable.Drawable mutate;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, true);
        super.onCreate(bundle);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        android.graphics.drawable.Drawable drawable = getDrawable(2131233429);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setTint(-1);
            i.baz supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.w(mutate);
            }
        }
        com.truecaller.messaging.conversation.draft.DraftArguments draftArguments = (com.truecaller.messaging.conversation.draft.DraftArguments) getIntent().getParcelableExtra("draft_arguments");
        if (draftArguments == null) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
        if (stringExtra == null) {
            stringExtra = "undefined";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draftArguments, "draftArguments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
        y02.e eVar = new y02.e();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("draft_arguments", draftArguments);
        bundle2.putString("analytics_context", stringExtra);
        eVar.setArguments(bundle2);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(android.R.id.content, eVar, (java.lang.String) null);
        barVar.l();
    }
}
