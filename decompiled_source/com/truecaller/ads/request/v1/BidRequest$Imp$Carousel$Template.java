package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$Imp$Carousel$Template implements com.google.protobuf.Internal.EnumLite {
    Exposed(0),
    NonExposed(1),
    Grid(2),
    Tile(3),
    ExposedPromo(4),
    UNRECOGNIZED(-1);

    public static final int ExposedPromo_VALUE = 4;
    public static final int Exposed_VALUE = 0;
    public static final int Grid_VALUE = 2;
    public static final int NonExposed_VALUE = 1;
    public static final int Tile_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Imp$Carousel$Template> internalValueMap = new java.lang.Object();
    private final int value;

    BidRequest$Imp$Carousel$Template(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$Imp$Carousel$Template forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ExposedPromo;
                    }
                    return Tile;
                }
                return Grid;
            }
            return NonExposed;
        }
        return Exposed;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Imp$Carousel$Template> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.b0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$Imp$Carousel$Template valueOf(int i) {
        return forNumber(i);
    }
}
