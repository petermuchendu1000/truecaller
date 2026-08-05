package com.truecaller.call_decline_messages.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_decline_messages/settings/CallDeclineMessagesSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lc41/a;", "<init>", "()V", "call-decline-messages_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDeclineMessagesSettingsActivity extends com.truecaller.call_decline_messages.settings.Hilt_CallDeclineMessagesSettingsActivity implements c41.a {
    public static final /* synthetic */ int h0 = 0;
    public ut0.a d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(bu0.qux.class), new bu0.bar(this, 1), new bu0.bar(this, 0), new bu0.bar(this, 2));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 3));
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(new bf1.h(this, 6));

    public final void J4(zt0.qux quxVar) {
        com.truecaller.call_decline_messages.data.CallDeclineMessage callDeclineMessage;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        bu0.qux quxVar2 = (bu0.qux) this.e0.getValue();
        quxVar2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        if (quxVar == null) {
            quxVar = null;
        }
        if (quxVar != null && (callDeclineMessage = quxVar.a) != null && (str = callDeclineMessage.a) != null) {
            quxVar2.c.b(new ut0.baz(str, com.truecaller.call_decline_messages.CallDeclineContext.Settings));
            fg3.h0.J(androidx.lifecycle.g1.l(quxVar2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b42.h(quxVar2, (df3.bar) null, 24), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_decline_messages.settings.Hilt_CallDeclineMessagesSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.f0;
        setContentView(((wt0.bar) lazy.getValue()).a);
        androidx.appcompat.widget.Toolbar toolbar = ((wt0.bar) lazy.getValue()).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
        setSupportActionBar(((wt0.bar) lazy.getValue()).c);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        ((wt0.bar) lazy.getValue()).b.setAdapter((au0.a) this.g0.getValue());
        ig3.w1.F(new androidx.room.o(25, ((bu0.qux) this.e0.getValue()).e, new a63.u(this, (df3.bar) null, 29)), androidx.lifecycle.g1.j(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
