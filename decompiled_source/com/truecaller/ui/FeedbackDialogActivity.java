package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class FeedbackDialogActivity extends com.truecaller.ui.Hilt_FeedbackDialogActivity implements ey2.i {
    public static final /* synthetic */ int g0 = 0;
    public com.truecaller.ui.components.FeedbackItemView d0;
    public fy2.d e0;
    public nc0.bar f0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        fy2.d dVar = this.e0;
        if (dVar != null) {
            com.truecaller.ui.components.FeedbackItemView feedbackItemView = (com.truecaller.ui.components.FeedbackItemView) dVar.d;
            if (feedbackItemView != null && (!feedbackItemView.f.e.shouldShare() || !feedbackItemView.p)) {
                return;
            }
            this.e0.a();
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_FeedbackDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        yy.qux.m(getTheme());
        new android.os.Handler(getMainLooper()).postDelayed(new com.mbridge.msdk.config.component.common.network.connect.socket.bar(this, 12), 2000L);
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        com.truecaller.ui.components.FeedbackItemView feedbackItemView = this.d0;
        if (feedbackItemView != null) {
            feedbackItemView.e();
            this.d0 = null;
        }
    }
}
