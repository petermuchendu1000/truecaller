package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class Hilt_FeedbackFormActivity extends com.truecaller.ui.FragmentActivityBase {
    public boolean i0 = false;

    public Hilt_FeedbackFormActivity() {
        addOnContextAvailableListener(new com.truecaller.ui.z(this, 6));
    }

    @Override // com.truecaller.ui.Hilt_FragmentActivityBase
    public final void t0() {
        if (!this.i0) {
            this.i0 = true;
            com.truecaller.ui.FeedbackFormActivity feedbackFormActivity = (com.truecaller.ui.FeedbackFormActivity) this;
            tx.w wVar = ((com.truecaller.ui.m) X3()).f;
            feedbackFormActivity.e0 = (qw2.a0) wVar.x6.get();
            feedbackFormActivity.f0 = (qw2.d0) wVar.l5.get();
            feedbackFormActivity.g0 = (qo1.m) wVar.F2.get();
        }
    }
}
