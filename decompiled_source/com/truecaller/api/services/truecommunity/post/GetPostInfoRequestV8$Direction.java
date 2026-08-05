package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetPostInfoRequestV8$Direction implements com.google.protobuf.Internal.EnumLite {
    NEXT(0),
    PREVIOUS(1),
    UNRECOGNIZED(-1);

    public static final int NEXT_VALUE = 0;
    public static final int PREVIOUS_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetPostInfoRequestV8$Direction> internalValueMap = new java.lang.Object();
    private final int value;

    GetPostInfoRequestV8$Direction(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.GetPostInfoRequestV8$Direction forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PREVIOUS;
        }
        return NEXT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetPostInfoRequestV8$Direction> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.b0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.GetPostInfoRequestV8$Direction valueOf(int i) {
        return forNumber(i);
    }
}
