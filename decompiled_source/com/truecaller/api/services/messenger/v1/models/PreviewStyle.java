package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum PreviewStyle implements com.google.protobuf.Internal.EnumLite {
    DAY(0),
    NIGHT(1),
    UNRECOGNIZED(-1);

    public static final int DAY_VALUE = 0;
    public static final int NIGHT_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.PreviewStyle> internalValueMap = new java.lang.Object();
    private final int value;

    PreviewStyle(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.PreviewStyle forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return NIGHT;
        }
        return DAY;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.PreviewStyle> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.n3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.PreviewStyle valueOf(int i) {
        return forNumber(i);
    }
}
