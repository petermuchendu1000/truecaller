package com.truecaller.contactrequest.tabscontainer;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/contactrequest/tabscontainer/ContactRequestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "bf0/s2", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactRequestActivity extends com.truecaller.contactrequest.tabscontainer.Hilt_ContactRequestActivity {
    public static final /* synthetic */ int g0 = 0;
    public k71.e d0;
    public s62.d e0;
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 8));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.contactrequest.tabscontainer.Hilt_ContactRequestActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        k71.e eVar = this.d0;
        if (eVar != null) {
            eVar.b.c0("contact_request_is_inner_screen_shown", true);
            kotlin.Lazy lazy = this.f0;
            setContentView(((l71.bar) lazy.getValue()).a);
            androidx.appcompat.widget.Toolbar toolbar = ((l71.bar) lazy.getValue()).c;
            ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
            setVisible(true);
            setSupportActionBar(toolbar);
            i.baz supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.p(true);
                supportActionBar.s(true);
                supportActionBar.A(2132018466);
            }
            android.widget.FrameLayout frameLayout = ((l71.bar) lazy.getValue()).b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "fragmentContainer");
            ak.r0.i(frameLayout, com.truecaller.common.ui.insets.InsetType.NavigationBar);
            if (bundle == null) {
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
                java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
                if (stringExtra == null) {
                    stringExtra = "unknown";
                }
                java.lang.String stringExtra2 = getIntent().getStringExtra("INNER_DEEPLINK_KEY");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
                u71.a aVar = new u71.a();
                aVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("analytics_context", stringExtra), new kotlin.Pair("INNER_DEEPLINK_KEY", stringExtra2)}));
                j.g(2131364005, aVar, (java.lang.String) null);
                j.o();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("contactRequestManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        s62.d dVar = this.e0;
        if (dVar != null) {
            ((s62.f) dVar).a(2131363140, com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "ContactRequestNotification");
        } else {
            kotlin.jvm.internal.Intrinsics.n("notificationManagerWrapper");
            throw null;
        }
    }
}
