package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ui/ContactsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ContactsActivity extends com.truecaller.ui.Hilt_ContactsActivity {
    public s03.bar d0;
    public nc0.bar e0;
    public qc3.bar f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_ContactsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            nc0.a aVar = this.e0;
            if (aVar != null) {
                qx2.ba h = qx2.sd.h();
                h.k("contactShortcut");
                h.l("true");
                qx2.sd f = h.f();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "build(...)");
                aVar.c(f);
                z62.d.m("shortcutInstalled", true);
                s03.bar barVar = this.d0;
                if (barVar != null) {
                    android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.ui.ContactsActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(335544320);
                    setResult(-1, h6.e.Q(this, barVar.a(1, intent)));
                } else {
                    kotlin.jvm.internal.Intrinsics.n("shortcutHelper");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
        } else {
            qc3.bar barVar2 = this.f0;
            if (barVar2 != null) {
                java.lang.Object obj = barVar2.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                startActivity(wi0.bar.f((com.truecaller.ui.b0) obj, this, (com.truecaller.bottombar.BottomBarButtonType) null, "contactShortcut", com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.CONTACTS, 58));
            } else {
                kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                throw null;
            }
        }
        finish();
    }
}
