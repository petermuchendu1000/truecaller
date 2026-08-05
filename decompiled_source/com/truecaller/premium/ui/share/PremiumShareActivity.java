package com.truecaller.premium.ui.share;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/ui/share/PremiumShareActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumShareActivity extends com.truecaller.premium.ui.share.Hilt_PremiumShareActivity {
    public static final /* synthetic */ int e0 = 0;
    public rq0.l d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.share.Hilt_PremiumShareActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        rq0.l lVar = this.d0;
        if (lVar != null) {
            lVar.Q();
            finish();
        } else {
            kotlin.jvm.internal.Intrinsics.n("premiumShareSheetHelper");
            throw null;
        }
    }
}
