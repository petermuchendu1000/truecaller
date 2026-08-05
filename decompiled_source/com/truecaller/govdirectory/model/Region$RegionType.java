package com.truecaller.govdirectory.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum Region$RegionType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    STATE(1),
    UNION_TERRITORY(2),
    UNRECOGNIZED(-1);

    public static final int STATE_VALUE = 1;
    public static final int UNION_TERRITORY_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.govdirectory.model.Region$RegionType> internalValueMap = new java.lang.Object();
    private final int value;

    Region$RegionType(int i) {
        this.value = i;
    }

    public static com.truecaller.govdirectory.model.Region$RegionType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return UNION_TERRITORY;
            }
            return STATE;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.govdirectory.model.Region$RegionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return qq1.u.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.govdirectory.model.Region$RegionType valueOf(int i) {
        return forNumber(i);
    }
}
