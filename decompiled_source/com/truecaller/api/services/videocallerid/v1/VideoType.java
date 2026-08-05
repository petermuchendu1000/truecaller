package com.truecaller.api.services.videocallerid.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum VideoType implements com.google.protobuf.Internal.EnumLite {
    VIDEO_TYPE_UNKNOWN(0),
    VIDEO_TYPE_PREDEFINED(1),
    VIDEO_TYPE_SELFIE(2),
    UNRECOGNIZED(-1);

    public static final int VIDEO_TYPE_PREDEFINED_VALUE = 1;
    public static final int VIDEO_TYPE_SELFIE_VALUE = 2;
    public static final int VIDEO_TYPE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.videocallerid.v1.VideoType> internalValueMap = new java.lang.Object();
    private final int value;

    VideoType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.videocallerid.v1.VideoType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VIDEO_TYPE_SELFIE;
            }
            return VIDEO_TYPE_PREDEFINED;
        }
        return VIDEO_TYPE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.videocallerid.v1.VideoType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nf0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.videocallerid.v1.VideoType valueOf(int i) {
        return forNumber(i);
    }
}
