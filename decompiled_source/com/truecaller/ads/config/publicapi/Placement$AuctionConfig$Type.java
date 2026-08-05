package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Placement$AuctionConfig$Type implements com.google.protobuf.Internal.EnumLite {
    FCFS(0),
    ECPM(1),
    PRIORITY(2),
    PRIORITY_GAM(3),
    PRIORITY_TAS(4),
    PRIORITY_PARTNER(5),
    PRIORITY_GAM_AND_TAS(6),
    PRIORITY_GAM_AND_PARTNER(7),
    PRIORITY_TAS_AND_PARTNER(8),
    PRIORITY_GAM_THEN_TAS(9),
    PRIORITY_GAM_THEN_PARTNER(10),
    PRIORITY_TAS_THEN_PARTNER(11),
    SERVER_AUCTION(12),
    UNRECOGNIZED(-1);

    public static final int ECPM_VALUE = 1;
    public static final int FCFS_VALUE = 0;
    public static final int PRIORITY_GAM_AND_PARTNER_VALUE = 7;
    public static final int PRIORITY_GAM_AND_TAS_VALUE = 6;
    public static final int PRIORITY_GAM_THEN_PARTNER_VALUE = 10;
    public static final int PRIORITY_GAM_THEN_TAS_VALUE = 9;
    public static final int PRIORITY_GAM_VALUE = 3;
    public static final int PRIORITY_PARTNER_VALUE = 5;
    public static final int PRIORITY_TAS_AND_PARTNER_VALUE = 8;
    public static final int PRIORITY_TAS_THEN_PARTNER_VALUE = 11;
    public static final int PRIORITY_TAS_VALUE = 4;
    public static final int PRIORITY_VALUE = 2;
    public static final int SERVER_AUCTION_VALUE = 12;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$Type> internalValueMap = new java.lang.Object();
    private final int value;

    Placement$AuctionConfig$Type(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$Type forNumber(int i) {
        switch (i) {
            case 0:
                return FCFS;
            case 1:
                return ECPM;
            case 2:
                return PRIORITY;
            case 3:
                return PRIORITY_GAM;
            case 4:
                return PRIORITY_TAS;
            case 5:
                return PRIORITY_PARTNER;
            case 6:
                return PRIORITY_GAM_AND_TAS;
            case 7:
                return PRIORITY_GAM_AND_PARTNER;
            case 8:
                return PRIORITY_TAS_AND_PARTNER;
            case 9:
                return PRIORITY_GAM_THEN_TAS;
            case 10:
                return PRIORITY_GAM_THEN_PARTNER;
            case 11:
                return PRIORITY_TAS_THEN_PARTNER;
            case 12:
                return SERVER_AUCTION;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$Type> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.u0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$Type valueOf(int i) {
        return forNumber(i);
    }
}
