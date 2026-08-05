package com.truecaller.telecom_operator_data.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/telecom_operator_data/qa/TelecomOperatorContactEntryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "telecom-operator-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TelecomOperatorContactEntryActivity extends com.truecaller.telecom_operator_data.qa.Hilt_TelecomOperatorContactEntryActivity {
    public static final /* synthetic */ int f0 = 0;
    public ax2.qux d0;
    public y42.f e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.telecom_operator_data.qa.Hilt_TelecomOperatorContactEntryActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        setContentView(2131558464);
        y42.f fVar = this.e0;
        if (fVar != null) {
            java.util.List c = fVar.c();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getAllSimInfos(...)");
            java.util.List list = c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.truecaller.multisim.SimInfo) it.next()).b);
            }
            android.widget.Spinner spinner = (android.widget.Spinner) findViewById(2131366475);
            spinner.setAdapter((android.widget.SpinnerAdapter) new android.widget.ArrayAdapter((android.content.Context) this, android.R.layout.simple_spinner_item, (java.util.List) arrayList));
            ((android.widget.Button) findViewById(2131364692)).setOnClickListener(new ah1.bar(14, this, spinner));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("multiSimManager");
        throw null;
    }
}
