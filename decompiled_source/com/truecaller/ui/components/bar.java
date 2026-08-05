package com.truecaller.ui.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class bar extends ey2.o {
    public com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState e;
    public final com.truecaller.ui.components.FeedbackItemView.DisplaySource f;

    public bar(com.truecaller.ui.components.FeedbackItemView.DisplaySource displaySource, com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState feedbackItemView$FeedbackItem$FeedbackItemState) {
        this.f = displaySource;
        this.e = feedbackItemView$FeedbackItem$FeedbackItemState;
    }

    public final void e() {
        int ordinal = this.e.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 6) {
                    if (ordinal != 12) {
                        if (ordinal != 8 && ordinal != 9) {
                            return;
                        }
                        this.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.SHARE_YES;
                        return;
                    }
                    this.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.INVITE_YES;
                    return;
                }
                this.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_YES_THANKS;
                return;
            }
            this.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.FEEDBACK_YES;
            return;
        }
        this.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_YES;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof com.truecaller.ui.components.bar) && this.e == ((com.truecaller.ui.components.bar) obj).e) {
            return true;
        }
        return false;
    }
}
