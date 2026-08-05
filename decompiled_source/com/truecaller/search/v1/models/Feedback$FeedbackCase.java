package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Feedback$FeedbackCase {
    COMMENTS(1),
    REVIEWS(2),
    FEEDBACK_NOT_SET(0);

    private final int value;

    Feedback$FeedbackCase(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.Feedback$FeedbackCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return REVIEWS;
            }
            return COMMENTS;
        }
        return FEEDBACK_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.Feedback$FeedbackCase valueOf(int i) {
        return forNumber(i);
    }
}
