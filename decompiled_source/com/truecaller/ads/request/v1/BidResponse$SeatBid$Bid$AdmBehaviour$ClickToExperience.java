package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience implements com.google.protobuf.Internal.EnumLite {
    Standard(0),
    LeadGen(1),
    Article(2),
    Video(3),
    NonClickable(4),
    Tap(5),
    UNRECOGNIZED(-1);

    public static final int Article_VALUE = 2;
    public static final int LeadGen_VALUE = 1;
    public static final int NonClickable_VALUE = 4;
    public static final int Standard_VALUE = 0;
    public static final int Tap_VALUE = 5;
    public static final int Video_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return Tap;
                        }
                        return NonClickable;
                    }
                    return Video;
                }
                return Article;
            }
            return LeadGen;
        }
        return Standard;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.e2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$ClickToExperience valueOf(int i) {
        return forNumber(i);
    }
}
