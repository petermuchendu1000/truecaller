package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Badge implements com.google.protobuf.Internal.EnumLite {
    BADGE_UNKNOWN(0),
    BADGE_VERIFIED(2),
    BADGE_PREMIUM(3),
    BADGE_GOLD(4),
    BADGE_USER(5),
    BADGE_PRIORITY(6),
    BADGE_VERIFIED_BUSINESS(7),
    BADGE_VERIFIED_LISTING(9),
    BADGE_KNOWN_SENDER(10),
    BADGE_SMALL_BUSINESS(11),
    UNRECOGNIZED(-1);

    public static final int BADGE_GOLD_VALUE = 4;
    public static final int BADGE_KNOWN_SENDER_VALUE = 10;
    public static final int BADGE_PREMIUM_VALUE = 3;
    public static final int BADGE_PRIORITY_VALUE = 6;
    public static final int BADGE_SMALL_BUSINESS_VALUE = 11;
    public static final int BADGE_UNKNOWN_VALUE = 0;
    public static final int BADGE_USER_VALUE = 5;
    public static final int BADGE_VERIFIED_BUSINESS_VALUE = 7;
    public static final int BADGE_VERIFIED_LISTING_VALUE = 9;
    public static final int BADGE_VERIFIED_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Badge> internalValueMap = new java.lang.Object();
    private final int value;

    Badge(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.Badge forNumber(int i) {
        switch (i) {
            case 0:
                return BADGE_UNKNOWN;
            case 1:
            case 8:
            default:
                return null;
            case 2:
                return BADGE_VERIFIED;
            case 3:
                return BADGE_PREMIUM;
            case 4:
                return BADGE_GOLD;
            case 5:
                return BADGE_USER;
            case 6:
                return BADGE_PRIORITY;
            case 7:
                return BADGE_VERIFIED_BUSINESS;
            case 9:
                return BADGE_VERIFIED_LISTING;
            case 10:
                return BADGE_KNOWN_SENDER;
            case 11:
                return BADGE_SMALL_BUSINESS;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Badge> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.d.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.Badge valueOf(int i) {
        return forNumber(i);
    }
}
