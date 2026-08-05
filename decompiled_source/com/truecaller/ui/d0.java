package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class d0 extends com.truecaller.ui.v {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V4(ey2.m mVar) {
        com.truecaller.ui.components.bar barVar;
        com.truecaller.ui.components.FeedbackItemView.DisplaySource displaySource = com.truecaller.ui.components.FeedbackItemView.DisplaySource.GLOBAL_SEARCH_HISTORY;
        if (mVar != null && displaySource != null && mVar.o == null && mVar.getItemCount() >= 0) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            int i = com.truecaller.ui.components.FeedbackItemView.r;
            if (activity != null) {
                if (displaySource.shouldShowInviteFriends()) {
                    barVar = new com.truecaller.ui.components.bar(displaySource, displaySource.getInitialInviteState());
                } else if (displaySource.shouldShowShare()) {
                    barVar = new com.truecaller.ui.components.bar(displaySource, displaySource.getInitialShareState());
                } else if (displaySource.shouldShowFeedback(activity)) {
                    barVar = new com.truecaller.ui.components.bar(displaySource, displaySource.getInitialFeedbackState());
                }
                if (barVar == null) {
                    if (barVar.e.shouldClose()) {
                        mVar.a(null);
                        return;
                    }
                    if (barVar.e.isInviteState()) {
                        z62.d.o("INVITE_LAST_ASKED");
                    } else {
                        z62.d.o("GOOGLE_REVIEW_ASK_TIMESTAMP");
                    }
                    mVar.a(barVar);
                    return;
                }
                return;
            }
            barVar = null;
            if (barVar == null) {
            }
        }
    }
}
