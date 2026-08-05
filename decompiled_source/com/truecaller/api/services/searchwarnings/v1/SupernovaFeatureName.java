package com.truecaller.api.services.searchwarnings.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SupernovaFeatureName implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_SUPERNOVA_FEATURE(0),
    DIRECT_CONNECTIONS(1),
    MUTUAL_CONNECTION_COUNT(2),
    MUTUAL_CONNECTIONS(3),
    CONNECTION_STRENGTH(4),
    CONNECTIONS_REPORTED_NUMBER_AS_SPAMMER(5),
    IC_MUTUAL_CONNECTION_COUNT(6),
    UNRECOGNIZED(-1);

    public static final int CONNECTIONS_REPORTED_NUMBER_AS_SPAMMER_VALUE = 5;
    public static final int CONNECTION_STRENGTH_VALUE = 4;
    public static final int DIRECT_CONNECTIONS_VALUE = 1;
    public static final int IC_MUTUAL_CONNECTION_COUNT_VALUE = 6;
    public static final int MUTUAL_CONNECTIONS_VALUE = 3;
    public static final int MUTUAL_CONNECTION_COUNT_VALUE = 2;
    public static final int UNKNOWN_SUPERNOVA_FEATURE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.SupernovaFeatureName> internalValueMap = new java.lang.Object();
    private final int value;

    SupernovaFeatureName(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.SupernovaFeatureName forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SUPERNOVA_FEATURE;
            case 1:
                return DIRECT_CONNECTIONS;
            case 2:
                return MUTUAL_CONNECTION_COUNT;
            case 3:
                return MUTUAL_CONNECTIONS;
            case 4:
                return CONNECTION_STRENGTH;
            case 5:
                return CONNECTIONS_REPORTED_NUMBER_AS_SPAMMER;
            case 6:
                return IC_MUTUAL_CONNECTION_COUNT;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.SupernovaFeatureName> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ze0.a0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.SupernovaFeatureName valueOf(int i) {
        return forNumber(i);
    }
}
