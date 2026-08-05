package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum StatsType implements com.google.protobuf.Internal.EnumLite {
    USER_LEADERBOARD(0),
    TOP_QUIZZES(1),
    MOST_LIKED_POSTS(2),
    WEEKLY_HIGHLIGHTS(3),
    UNRECOGNIZED(-1);

    public static final int MOST_LIKED_POSTS_VALUE = 2;
    public static final int TOP_QUIZZES_VALUE = 1;
    public static final int USER_LEADERBOARD_VALUE = 0;
    public static final int WEEKLY_HIGHLIGHTS_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.StatsType> internalValueMap = new java.lang.Object();
    private final int value;

    StatsType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.StatsType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return WEEKLY_HIGHLIGHTS;
                }
                return MOST_LIKED_POSTS;
            }
            return TOP_QUIZZES;
        }
        return USER_LEADERBOARD;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.StatsType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.r3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.StatsType valueOf(int i) {
        return forNumber(i);
    }
}
