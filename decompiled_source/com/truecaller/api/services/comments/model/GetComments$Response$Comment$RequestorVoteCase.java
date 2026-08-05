package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetComments$Response$Comment$RequestorVoteCase {
    UPVOTED(10),
    DOWNVOTED(11),
    REQUESTORVOTE_NOT_SET(0);

    private final int value;

    GetComments$Response$Comment$RequestorVoteCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.GetComments$Response$Comment$RequestorVoteCase forNumber(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 11) {
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
    public static com.truecaller.api.services.comments.model.GetComments$Response$Comment$RequestorVoteCase valueOf(int i) {
        return forNumber(i);
    }
}
