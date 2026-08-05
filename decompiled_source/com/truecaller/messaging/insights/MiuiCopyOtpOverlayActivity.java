package com.truecaller.messaging.insights;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/insights/MiuiCopyOtpOverlayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MiuiCopyOtpOverlayActivity extends com.truecaller.messaging.insights.Hilt_MiuiCopyOtpOverlayActivity {
    public final void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.insights.Hilt_MiuiCopyOtpOverlayActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("OTP");
        if (stringExtra == null) {
            stringExtra = "";
        }
        setFinishOnTouchOutside(false);
        p40.l.z(this, stringExtra, "com.truecaller.OTP");
        finish();
    }
}
