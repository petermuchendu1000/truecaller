package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum SpamType implements com.google.protobuf.Internal.EnumLite {
    SPAM_TYPE_UNKNOWN(0),
    SPAM_TYPE_TOP_SPAMMER(1),
    SPAM_TYPE_SPAMMER(2),
    UNRECOGNIZED(-1);

    public static final int SPAM_TYPE_SPAMMER_VALUE = 2;
    public static final int SPAM_TYPE_TOP_SPAMMER_VALUE = 1;
    public static final int SPAM_TYPE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.SpamType> internalValueMap = new java.lang.Object();
    private final int value;

    SpamType(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.SpamType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SPAM_TYPE_SPAMMER;
            }
            return SPAM_TYPE_TOP_SPAMMER;
        }
        return SPAM_TYPE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.SpamType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.z2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.SpamType valueOf(int i) {
        return forNumber(i);
    }
}
