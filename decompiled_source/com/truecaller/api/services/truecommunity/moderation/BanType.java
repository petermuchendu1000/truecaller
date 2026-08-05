package com.truecaller.api.services.truecommunity.moderation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BanType implements com.google.protobuf.Internal.EnumLite {
    WARNING(0),
    LITE(1),
    MAX(2),
    PERMA(3),
    UNRECOGNIZED(-1);

    public static final int LITE_VALUE = 1;
    public static final int MAX_VALUE = 2;
    public static final int PERMA_VALUE = 3;
    public static final int WARNING_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.moderation.BanType> internalValueMap = new java.lang.Object();
    private final int value;

    BanType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.moderation.BanType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PERMA;
                }
                return MAX;
            }
            return LITE;
        }
        return WARNING;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.moderation.BanType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return hf0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.moderation.BanType valueOf(int i) {
        return forNumber(i);
    }
}
