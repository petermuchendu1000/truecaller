package com.truecaller.api.services.truecommunity.activity;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ActivityType implements com.google.protobuf.Internal.EnumLite {
    COMMENT(0),
    POST_REMOVED(1),
    POST_IMAGES_REMOVED(2),
    UNRECOGNIZED(-1);

    public static final int COMMENT_VALUE = 0;
    public static final int POST_IMAGES_REMOVED_VALUE = 2;
    public static final int POST_REMOVED_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.activity.ActivityType> internalValueMap = new java.lang.Object();
    private final int value;

    ActivityType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.activity.ActivityType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return POST_IMAGES_REMOVED;
            }
            return POST_REMOVED;
        }
        return COMMENT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.activity.ActivityType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return df0.b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.activity.ActivityType valueOf(int i) {
        return forNumber(i);
    }
}
