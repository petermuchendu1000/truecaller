package com.truecaller.api.services.searchwarnings.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SupernovaStatus implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_STATUS(0),
    OPTED_OUT(1),
    OPTED_IN(2),
    UNRECOGNIZED(-1);

    public static final int OPTED_IN_VALUE = 2;
    public static final int OPTED_OUT_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.models.SupernovaStatus> internalValueMap = new java.lang.Object();
    private final int value;

    SupernovaStatus(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.models.SupernovaStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return OPTED_IN;
            }
            return OPTED_OUT;
        }
        return UNKNOWN_STATUS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.models.SupernovaStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return af0.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.models.SupernovaStatus valueOf(int i) {
        return forNumber(i);
    }
}
