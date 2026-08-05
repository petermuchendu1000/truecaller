package com.truecaller.api.services.previews.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MediaType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    GENERAL(1),
    AUDIO(2),
    VIDEO(3),
    UNRECOGNIZED(-1);

    public static final int AUDIO_VALUE = 2;
    public static final int GENERAL_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.previews.v1.models.MediaType> internalValueMap = new java.lang.Object();
    private final int value;

    MediaType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.previews.v1.models.MediaType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VIDEO;
                }
                return AUDIO;
            }
            return GENERAL;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.previews.v1.models.MediaType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ve0.j.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.previews.v1.models.MediaType valueOf(int i) {
        return forNumber(i);
    }
}
