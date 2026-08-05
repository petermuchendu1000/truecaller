package com.truecaller.premium.ui.dialogs.assistant.carrier;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/ui/dialogs/assistant/carrier/CarrierDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CarrierDialogActivity extends com.truecaller.premium.ui.dialogs.assistant.carrier.Hilt_CarrierDialogActivity {
    public static final /* synthetic */ int d0 = 0;

    public static final android.content.Intent t0(com.truecaller.qa.QMActivity qMActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qMActivity, "context");
        android.content.Intent putExtra = new android.content.Intent((android.content.Context) qMActivity, (java.lang.Class<?>) com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogActivity.class).putExtra("CarrierDialogFragment.ScreenType", com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType.CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS.name());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.dialogs.assistant.carrier.Hilt_CarrierDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, true);
        d.m.b(this, new d.k0(0, 0, 1, d.j0.l), 2);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            java.lang.String stringExtra = getIntent().getStringExtra("CarrierDialogFragment.ScreenType");
            ne2.baz bazVar = new ne2.baz();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("CarrierDialogFragment.ScreenType", stringExtra);
            bazVar.setArguments(bundle2);
            j.g(android.R.id.content, bazVar, (java.lang.String) null);
            j.l();
        }
    }
}
