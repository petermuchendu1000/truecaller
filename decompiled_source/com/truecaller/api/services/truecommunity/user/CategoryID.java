package com.truecaller.api.services.truecommunity.user;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum CategoryID implements com.google.protobuf.Internal.EnumLite {
    LIKESONPOSTS(0),
    COMMENTSONPOSTS(1),
    LIKESONCOMMENTS(2),
    REPLIESONCOMMENTS(3),
    UNRECOGNIZED(-1);

    public static final int COMMENTSONPOSTS_VALUE = 1;
    public static final int LIKESONCOMMENTS_VALUE = 2;
    public static final int LIKESONPOSTS_VALUE = 0;
    public static final int REPLIESONCOMMENTS_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.user.CategoryID> internalValueMap = new java.lang.Object();
    private final int value;

    CategoryID(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.user.CategoryID forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return REPLIESONCOMMENTS;
                }
                return LIKESONCOMMENTS;
            }
            return COMMENTSONPOSTS;
        }
        return LIKESONPOSTS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.user.CategoryID> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return lf0.b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.user.CategoryID valueOf(int i) {
        return forNumber(i);
    }
}
