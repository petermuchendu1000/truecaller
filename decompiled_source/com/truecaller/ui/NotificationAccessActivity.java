package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ui/NotificationAccessActivity;", "Lcom/truecaller/ui/BaseNotificationAccessActivity;", "<init>", "()V", "yb0/i", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class NotificationAccessActivity extends com.truecaller.ui.Hilt_NotificationAccessActivity {
    public static final /* synthetic */ int k0 = 0;

    @Override // com.truecaller.ui.BaseNotificationAccessActivity
    public final void onResume() {
        super.onResume();
        if (!this.e0) {
            this.e0 = true;
            t0();
        }
    }
}
