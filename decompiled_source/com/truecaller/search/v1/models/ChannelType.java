package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum ChannelType implements com.google.protobuf.Internal.EnumLite {
    CHANNEL_TYPE_UNSPECIFIED(0),
    CHANNEL_TYPE_TRUECALLER_IM(1),
    UNRECOGNIZED(-1);

    public static final int CHANNEL_TYPE_TRUECALLER_IM_VALUE = 1;
    public static final int CHANNEL_TYPE_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.ChannelType> internalValueMap = new java.lang.Object();
    private final int value;

    ChannelType(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.ChannelType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return CHANNEL_TYPE_TRUECALLER_IM;
        }
        return CHANNEL_TYPE_UNSPECIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.ChannelType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.d0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.ChannelType valueOf(int i) {
        return forNumber(i);
    }
}
