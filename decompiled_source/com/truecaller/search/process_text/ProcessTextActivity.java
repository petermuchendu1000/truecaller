package com.truecaller.search.process_text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/search/process_text/ProcessTextActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ProcessTextActivity extends com.truecaller.search.process_text.Hilt_ProcessTextActivity {
    public t41.t d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.process_text.Hilt_ProcessTextActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        java.lang.CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
        if (charSequenceExtra != null) {
            java.lang.String obj = kotlin.text.StringsKt.u0(charSequenceExtra.toString()).toString();
            if (this.d0 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "number");
                if (!t41.i0.d(obj)) {
                    android.widget.Toast.makeText((android.content.Context) this, 2132021620, 0).show();
                    finish();
                    return;
                }
                try {
                    b91.c.o(this, obj, (java.lang.String) null, true, com.truecaller.search.global.SearchResultOrder.ORDER_CGMT, false, (android.view.View) null, com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.ACTION_PROCESS_TEXT);
                } catch (java.lang.Exception unused) {
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("phoneNumberHelper");
                throw null;
            }
        }
        finish();
    }
}
