package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetReviews$Request$Ordering implements com.google.protobuf.Internal.EnumLite {
    ORDERING_UNKNOWN(0),
    ORDERING_DESC(1),
    ORDERING_ASC(2),
    UNRECOGNIZED(-1);

    public static final int ORDERING_ASC_VALUE = 2;
    public static final int ORDERING_DESC_VALUE = 1;
    public static final int ORDERING_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.GetReviews$Request$Ordering> internalValueMap = new java.lang.Object();
    private final int value;

    GetReviews$Request$Ordering(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.GetReviews$Request$Ordering forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ORDERING_ASC;
            }
            return ORDERING_DESC;
        }
        return ORDERING_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.GetReviews$Request$Ordering> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.s.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.GetReviews$Request$Ordering valueOf(int i) {
        return forNumber(i);
    }
}
