package com.truecaller.messaging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/MessagesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessagesActivity extends com.truecaller.messaging.Hilt_MessagesActivity {
    public s03.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.Hilt_MessagesActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            z62.d.m("messagesShortcutInstalled", true);
            s03.bar barVar = this.d0;
            if (barVar != null) {
                android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.messaging.MessagesActivity.class);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addFlags(335544320);
                setResult(-1, h6.e.Q(this, barVar.a(3, intent)));
            } else {
                kotlin.jvm.internal.Intrinsics.n("shortcutHelper");
                throw null;
            }
        } else {
            startActivity(y90.m6.o(this, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "homescreenShortcut", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120));
        }
        finish();
    }
}
