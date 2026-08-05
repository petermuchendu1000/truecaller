package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetReviews$Response$Review$RequestorVoteCase {
    UPVOTED(11),
    DOWNVOTED(12),
    REQUESTORVOTE_NOT_SET(0);

    private final int value;

    GetReviews$Response$Review$RequestorVoteCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.GetReviews$Response$Review$RequestorVoteCase forNumber(int i) {
        if (i != 0) {
            if (i != 11) {
                if (i != 12) {
                    return null;
                }
                return DOWNVOTED;
            }
            return UPVOTED;
        }
        return REQUESTORVOTE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.GetReviews$Response$Review$RequestorVoteCase valueOf(int i) {
        return forNumber(i);
    }
}
