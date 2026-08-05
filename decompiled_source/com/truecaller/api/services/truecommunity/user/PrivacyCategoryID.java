package com.truecaller.api.services.truecommunity.user;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum PrivacyCategoryID implements com.google.protobuf.Internal.EnumLite {
    LEADERBOARD_VISIBILITY(0),
    UNRECOGNIZED(-1);

    public static final int LEADERBOARD_VISIBILITY_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.user.PrivacyCategoryID> internalValueMap = new java.lang.Object();
    private final int value;

    PrivacyCategoryID(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.user.PrivacyCategoryID forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return LEADERBOARD_VISIBILITY;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.user.PrivacyCategoryID> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return lf0.s.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.user.PrivacyCategoryID valueOf(int i) {
        return forNumber(i);
    }
}
