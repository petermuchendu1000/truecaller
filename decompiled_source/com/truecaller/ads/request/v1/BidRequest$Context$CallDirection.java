package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$Context$CallDirection implements com.google.protobuf.Internal.EnumLite {
    INCOMING(0),
    OUTGOING(1),
    UNRECOGNIZED(-1);

    public static final int INCOMING_VALUE = 0;
    public static final int OUTGOING_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Context$CallDirection> internalValueMap = new java.lang.Object();
    private final int value;

    BidRequest$Context$CallDirection(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$Context$CallDirection forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return OUTGOING;
        }
        return INCOMING;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Context$CallDirection> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.d.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$Context$CallDirection valueOf(int i) {
        return forNumber(i);
    }
}
