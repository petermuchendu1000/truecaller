package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetReviews$Request$Sorting implements com.google.protobuf.Internal.EnumLite {
    SORTING_UNKNOWN(0),
    SORTING_POST_TIME(1),
    SORTING_SCORE(2),
    SORTING_RATING(3),
    UNRECOGNIZED(-1);

    public static final int SORTING_POST_TIME_VALUE = 1;
    public static final int SORTING_RATING_VALUE = 3;
    public static final int SORTING_SCORE_VALUE = 2;
    public static final int SORTING_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.GetReviews$Request$Sorting> internalValueMap = new java.lang.Object();
    private final int value;

    GetReviews$Request$Sorting(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.GetReviews$Request$Sorting forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SORTING_RATING;
                }
                return SORTING_SCORE;
            }
            return SORTING_POST_TIME;
        }
        return SORTING_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.GetReviews$Request$Sorting> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.u.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.GetReviews$Request$Sorting valueOf(int i) {
        return forNumber(i);
    }
}
