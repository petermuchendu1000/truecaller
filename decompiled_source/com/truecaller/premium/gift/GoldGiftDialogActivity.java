package com.truecaller.premium.gift;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/gift/GoldGiftDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "fe0/m", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GoldGiftDialogActivity extends com.truecaller.premium.gift.Hilt_GoldGiftDialogActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.gift.Hilt_GoldGiftDialogActivity
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
            boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_SKIP_INTRO", false);
            java.lang.String stringExtra = getIntent().getStringExtra("EXTRA_SENDER_NAME");
            java.lang.String stringExtra2 = getIntent().getStringExtra("EXTRA_SENDER_NUMBER");
            java.lang.String stringExtra3 = getIntent().getStringExtra("EXTRA_ANALYTICS_CONTEXT_TYPE");
            java.lang.String stringExtra4 = getIntent().getStringExtra("EXTRA_ANALYTICS_LAUNCH_CONTEXT");
            bb2.qux quxVar = new bb2.qux();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("EXTRA_SKIP_INTRO", booleanExtra);
            bundle2.putString("EXTRA_SENDER_NAME", stringExtra);
            bundle2.putString("EXTRA_SENDER_NUMBER", stringExtra2);
            bundle2.putString("EXTRA_ANALYTICS_CONTEXT_TYPE", stringExtra3);
            bundle2.putString("analytics_context", stringExtra4);
            quxVar.setArguments(bundle2);
            j.g(android.R.id.content, quxVar, (java.lang.String) null);
            j.l();
        }
    }
}
