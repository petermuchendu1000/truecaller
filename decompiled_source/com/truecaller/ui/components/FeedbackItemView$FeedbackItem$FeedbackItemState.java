package com.truecaller.ui.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum FeedbackItemView$FeedbackItem$FeedbackItemState {
    QUESTION_ENJOYING_BLOCKED(2132018000, 2131233084),
    QUESTION_RATE(2132018003, 2131233084),
    QUESTION_GIVE_FEEDBACK(2132018001, 2131232739),
    FEEDBACK_NO,
    RATE_NO,
    FEEDBACK_YES,
    RATE_YES(false),
    RATE_YES_THANKS(2132018005, 2131233620),
    QUESTION_SHARE(2132021631, -1, 2130968775, 2132021588, 2132021601, 2132021640, false),
    QUESTION_SHARE_BLOCKED(2132018004, 2131233245),
    SHARE_NO,
    SHARE_YES,
    QUESTION_INVITE_FRIENDS(2132018164, 2132018002, 2130968775, 2132017999, -1, 2132017998, false),
    INVITE_YES,
    INVITE_NO,
    DUMMY_FINAL;

    private final int mDismissId;
    private final boolean mFinalState;
    private final int mIconId;
    private final int mMessageId;
    private final int mNegativeId;
    private final int mPositiveId;
    private final int mTitleId;

    FeedbackItemView$FeedbackItem$FeedbackItemState(int i, int i2) {
        this(i, i2, 2132017997, 2132019047, 2132019079, false);
    }

    public int getDismissId() {
        return this.mDismissId;
    }

    public int getIconId() {
        return this.mIconId;
    }

    public int getMessageId() {
        return this.mMessageId;
    }

    public int getNegativeId() {
        return this.mNegativeId;
    }

    public int getPositiveId() {
        return this.mPositiveId;
    }

    public int getTitleId() {
        return this.mTitleId;
    }

    public boolean isInviteState() {
        if (this != QUESTION_INVITE_FRIENDS && this != INVITE_YES && this != INVITE_NO) {
            return false;
        }
        return true;
    }

    public boolean isShareState() {
        if (this != QUESTION_SHARE && this != QUESTION_SHARE_BLOCKED && this != SHARE_NO && this != SHARE_YES) {
            return false;
        }
        return true;
    }

    public boolean shouldClose() {
        return this.mFinalState;
    }

    public boolean shouldGiveFeedback() {
        if (this == FEEDBACK_YES) {
            return true;
        }
        return false;
    }

    public boolean shouldInvite() {
        if (this == INVITE_YES) {
            return true;
        }
        return false;
    }

    public boolean shouldRate() {
        if (this == RATE_YES) {
            return true;
        }
        return false;
    }

    public boolean shouldShare() {
        if (this == SHARE_YES) {
            return true;
        }
        return false;
    }

    FeedbackItemView$FeedbackItem$FeedbackItemState() {
        this(true);
    }

    FeedbackItemView$FeedbackItem$FeedbackItemState(boolean z) {
        this(-1, -1, -1, -1, -1, z);
    }

    FeedbackItemView$FeedbackItem$FeedbackItemState(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(-1, i, i2, i3, i4, i5, z);
    }

    FeedbackItemView$FeedbackItem$FeedbackItemState(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.mTitleId = i;
        this.mMessageId = i2;
        this.mIconId = i3;
        this.mDismissId = i4;
        this.mNegativeId = i5;
        this.mPositiveId = i6;
        this.mFinalState = z;
    }
}
