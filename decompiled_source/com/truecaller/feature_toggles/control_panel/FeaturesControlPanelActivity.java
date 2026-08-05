package com.truecaller.feature_toggles.control_panel;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/feature_toggles/control_panel/FeaturesControlPanelActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeaturesControlPanelActivity extends com.truecaller.feature_toggles.control_panel.Hilt_FeaturesControlPanelActivity {
    public static final /* synthetic */ int f0 = 0;
    public mo1.k d0;
    public mo1.i e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.feature_toggles.control_panel.Hilt_FeaturesControlPanelActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558475);
        android.view.View findViewById = findViewById(android.R.id.content);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ak.r0.i(findViewById, com.truecaller.common.ui.insets.InsetType.StatusBar);
        mo1.k t0 = t0();
        mo1.k t03 = t0();
        android.view.View findViewById2 = findViewById(android.R.id.content);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "getContainerView(...)");
        mo1.i iVar = this.e0;
        if (iVar != null) {
            t0.u0(new mo1.m(t03, findViewById2, iVar));
            mo1.k t04 = t0();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "router");
            t04.e = this;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("adapterPresenter");
        throw null;
    }

    @Override // com.truecaller.feature_toggles.control_panel.Hilt_FeaturesControlPanelActivity
    public final void onDestroy() {
        t0().m1();
        super.onDestroy();
    }

    public final mo1.k t0() {
        mo1.k kVar = this.d0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
