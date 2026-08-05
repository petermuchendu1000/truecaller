package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$LocationType implements com.google.protobuf.Internal.EnumLite {
    LocationTypeUnused(0),
    GPS_LOCATION(1),
    IP(2),
    USER_PROVIDED(3),
    UNRECOGNIZED(-1);

    public static final int GPS_LOCATION_VALUE = 1;
    public static final int IP_VALUE = 2;
    public static final int LocationTypeUnused_VALUE = 0;
    public static final int USER_PROVIDED_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$LocationType> internalValueMap = new java.lang.Object();
    private final int value;

    BidRequest$LocationType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$LocationType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return USER_PROVIDED;
                }
                return IP;
            }
            return GPS_LOCATION;
        }
        return LocationTypeUnused;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$LocationType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.k1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$LocationType valueOf(int i) {
        return forNumber(i);
    }
}
