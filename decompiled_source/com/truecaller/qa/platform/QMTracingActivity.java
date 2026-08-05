package com.truecaller.qa.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/qa/platform/QMTracingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class QMTracingActivity extends com.truecaller.qa.platform.Hilt_QMTracingActivity {
    public static final /* synthetic */ int g0 = 0;
    public s62.d d0;
    public kotlin.coroutines.CoroutineContext e0;
    public final java.text.SimpleDateFormat f0 = new java.text.SimpleDateFormat("yyyyMMdd-HHmmss", java.util.Locale.US);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.qa.platform.Hilt_QMTracingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("path");
        if (stringExtra != null) {
            android.os.Debug.stopMethodTracing();
            android.content.Context applicationContext = getApplicationContext();
            if (applicationContext != null) {
                kotlin.coroutines.CoroutineContext coroutineContext = this.e0;
                if (coroutineContext != null) {
                    fg3.h0.J(fg3.f1.a, coroutineContext, (fg3.f0) null, new jd3.qux(applicationContext, stringExtra, this, (df3.bar) null, 5), 2);
                    finish();
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("uiCoroutinesContext");
                throw null;
            }
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        setContentView(2131559034);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(2131366219);
        android.widget.EditText editText = (android.widget.EditText) findViewById(2131366220);
        checkBox.setOnCheckedChangeListener(new aq2.r(editText, 9));
        findViewById(2131366629).setOnClickListener(new ek3.g(this, checkBox, editText, 6));
    }
}
