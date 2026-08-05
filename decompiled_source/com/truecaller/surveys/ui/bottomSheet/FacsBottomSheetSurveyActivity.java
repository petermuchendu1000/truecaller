package com.truecaller.surveys.ui.bottomSheet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/surveys/ui/bottomSheet/FacsBottomSheetSurveyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FacsBottomSheetSurveyActivity extends com.truecaller.surveys.ui.bottomSheet.Hilt_FacsBottomSheetSurveyActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.surveys.ui.bottomSheet.Hilt_FacsBottomSheetSurveyActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        dx2.bar barVar = dx2.bar.a;
        dx2.a aVar = dx2.bar.f;
        if (aVar != null) {
            setTheme(aVar.d);
            super.onCreate(bundle);
            android.content.res.Resources.Theme theme = getTheme();
            dx2.a aVar2 = dx2.bar.f;
            if (aVar2 != null) {
                theme.applyStyle(aVar2.d, false);
                getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getColor(android.R.color.transparent)));
                nu2.b.m.getClass();
                nu2.b bVar = new nu2.b();
                yp.d0.w(bVar, true);
                bVar.show(getSupportFragmentManager(), nu2.b.class.getCanonicalName());
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("darkTheme");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("darkTheme");
        throw null;
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
