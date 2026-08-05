package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RequestSource$RequestSourceType implements com.google.protobuf.Internal.EnumLite {
    PRE_FETCH(0),
    LIVE(1),
    POST_FETCH(2),
    UNRECOGNIZED(-1);

    public static final int LIVE_VALUE = 1;
    public static final int POST_FETCH_VALUE = 2;
    public static final int PRE_FETCH_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.RequestSource$RequestSourceType> internalValueMap = new java.lang.Object();
    private final int value;

    RequestSource$RequestSourceType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.RequestSource$RequestSourceType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return POST_FETCH;
            }
            return LIVE;
        }
        return PRE_FETCH;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.RequestSource$RequestSourceType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.b1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.RequestSource$RequestSourceType valueOf(int i) {
        return forNumber(i);
    }
}
