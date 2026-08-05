package com.truecaller.premium.ui.choice;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/ui/choice/BasicChoiceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BasicChoiceActivity extends com.truecaller.premium.ui.choice.Hilt_BasicChoiceActivity {
    public static final /* synthetic */ int f0 = 0;
    public qc3.bar d0;
    public nc0.bar e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.choice.Hilt_BasicChoiceActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(this, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(k4.r1.c);
        composeView.setContent(new d3.qux(-258911693, new ke2.bar(this, 0), true));
        setContentView(composeView);
    }

    public final void t0(boolean z) {
        java.lang.String str;
        qx2.w2 h = qx2.he.h();
        h.B("BasicProtectionBottomSheet");
        h.r("CallsTab");
        if (z) {
            str = "ExplorePremium";
        } else {
            str = "Done";
        }
        h.m(str);
        qx2.he h2 = h.h();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
        nc0.bar barVar = this.e0;
        if (barVar != null) {
            j71.g.K(h2, barVar);
        } else {
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }
}
