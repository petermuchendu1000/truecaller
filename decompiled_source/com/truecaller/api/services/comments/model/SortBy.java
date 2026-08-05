package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SortBy implements com.google.protobuf.Internal.EnumLite {
    POST_TIME(0),
    SCORE(1),
    VOTES(2),
    UNRECOGNIZED(-1);

    public static final int POST_TIME_VALUE = 0;
    public static final int SCORE_VALUE = 1;
    public static final int VOTES_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.SortBy> internalValueMap = new java.lang.Object();
    private final int value;

    SortBy(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.SortBy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VOTES;
            }
            return SCORE;
        }
        return POST_TIME;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.SortBy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.z0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.SortBy valueOf(int i) {
        return forNumber(i);
    }
}
