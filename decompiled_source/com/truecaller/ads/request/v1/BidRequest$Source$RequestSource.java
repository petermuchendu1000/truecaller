package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$Source$RequestSource implements com.google.protobuf.Internal.EnumLite {
    network(0),
    house(2),
    offline(3),
    UNRECOGNIZED(-1);

    public static final int house_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Source$RequestSource> internalValueMap = new java.lang.Object();
    public static final int network_VALUE = 0;
    public static final int offline_VALUE = 3;
    private final int value;

    BidRequest$Source$RequestSource(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$Source$RequestSource forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return offline;
            }
            return house;
        }
        return network;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Source$RequestSource> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.r1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$Source$RequestSource valueOf(int i) {
        return forNumber(i);
    }
}
