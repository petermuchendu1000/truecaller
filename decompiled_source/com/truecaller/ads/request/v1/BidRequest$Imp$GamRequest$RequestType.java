package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$Imp$GamRequest$RequestType implements com.google.protobuf.Internal.EnumLite {
    PREFETCH(0),
    CACHED(1),
    LIVE(2),
    UNRECOGNIZED(-1);

    public static final int CACHED_VALUE = 1;
    public static final int LIVE_VALUE = 2;
    public static final int PREFETCH_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Imp$GamRequest$RequestType> internalValueMap = new java.lang.Object();
    private final int value;

    BidRequest$Imp$GamRequest$RequestType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$Imp$GamRequest$RequestType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return LIVE;
            }
            return CACHED;
        }
        return PREFETCH;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Imp$GamRequest$RequestType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.n0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$Imp$GamRequest$RequestType valueOf(int i) {
        return forNumber(i);
    }
}
