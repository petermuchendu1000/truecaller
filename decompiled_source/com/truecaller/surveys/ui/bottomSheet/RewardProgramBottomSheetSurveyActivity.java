package com.truecaller.surveys.ui.bottomSheet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/surveys/ui/bottomSheet/RewardProgramBottomSheetSurveyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramBottomSheetSurveyActivity extends com.truecaller.surveys.ui.bottomSheet.Hilt_RewardProgramBottomSheetSurveyActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(rv2.x.class), new nu2.h(this, 1), new nu2.h(this, 0), new nu2.h(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.surveys.ui.bottomSheet.Hilt_RewardProgramBottomSheetSurveyActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getColor(android.R.color.transparent)));
        androidx.lifecycle.o1 o1Var = this.d0;
        pe0.j.p(this, ((rv2.x) o1Var.getValue()).e, new nu2.e(this, 1));
        rv2.x xVar = (rv2.x) o1Var.getValue();
        xVar.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(xVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qd1.b(xVar, (df3.bar) null, 24), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
    }
}
