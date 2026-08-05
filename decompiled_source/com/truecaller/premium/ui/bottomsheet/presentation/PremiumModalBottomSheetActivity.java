package com.truecaller.premium.ui.bottomsheet.presentation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/premium/ui/bottomsheet/presentation/PremiumModalBottomSheetActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lhe2/baz;", "config", "", "currentLaunchContext", "", "currentForceShow", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumModalBottomSheetActivity extends com.truecaller.premium.ui.bottomsheet.presentation.Hilt_PremiumModalBottomSheetActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.bottomsheet.presentation.Hilt_PremiumModalBottomSheetActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_launch_context");
        if (stringExtra == null) {
            finish();
        } else {
            e.d.a(this, new d3.qux(-1305325413, new ie2.t(this, stringExtra, getIntent().getBooleanExtra("extra_force_show", false), 0), true));
        }
    }
}
