package com.truecaller.ads.config.external;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum UserConfig$ConfigType implements com.google.protobuf.Internal.EnumLite {
    JSON(0),
    BOOLEAN(1),
    UNRECOGNIZED(-1);

    public static final int BOOLEAN_VALUE = 1;
    public static final int JSON_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.external.UserConfig$ConfigType> internalValueMap = new java.lang.Object();
    private final int value;

    UserConfig$ConfigType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.external.UserConfig$ConfigType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BOOLEAN;
        }
        return JSON;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.external.UserConfig$ConfigType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return o40.e.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.external.UserConfig$ConfigType valueOf(int i) {
        return forNumber(i);
    }
}
