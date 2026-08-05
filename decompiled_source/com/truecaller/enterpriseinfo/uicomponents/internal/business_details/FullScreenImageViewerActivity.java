package com.truecaller.enterpriseinfo.uicomponents.internal.business_details;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/enterpriseinfo/uicomponents/internal/business_details/FullScreenImageViewerActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FullScreenImageViewerActivity extends androidx.activity.ComponentActivity {
    public static final /* synthetic */ int a0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("images");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        e.d.a(this, new d3.qux(1135170123, new ij1.qux(stringArrayListExtra, getIntent().getIntExtra("start_index", 0), this, 0), true));
    }
}
