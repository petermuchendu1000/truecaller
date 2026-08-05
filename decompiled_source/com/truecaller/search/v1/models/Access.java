package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Access implements com.google.protobuf.Internal.EnumLite {
    ACCESS_UNKNOWN(0),
    ACCESS_PUBLIC(1),
    ACCESS_NETWORK(2),
    ACCESS_PRIVATE(3),
    UNRECOGNIZED(-1);

    public static final int ACCESS_NETWORK_VALUE = 2;
    public static final int ACCESS_PRIVATE_VALUE = 3;
    public static final int ACCESS_PUBLIC_VALUE = 1;
    public static final int ACCESS_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Access> internalValueMap = new java.lang.Object();
    private final int value;

    Access(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.Access forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ACCESS_PRIVATE;
                }
                return ACCESS_NETWORK;
            }
            return ACCESS_PUBLIC;
        }
        return ACCESS_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Access> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.Access valueOf(int i) {
        return forNumber(i);
    }
}
