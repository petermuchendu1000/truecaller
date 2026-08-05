package com.truecaller.api.services.promo.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RedeemPromoCodeResponse$FailureReason implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    INTERNAL(1),
    MALFORMED(2),
    NOT_FOUND(3),
    EXPIRED(4),
    ALREADY_REDEEMED(5),
    MAX_REDEMPTIONS_REACHED(6),
    NOT_SUPPORTED(7),
    UNRECOGNIZED(-1);

    public static final int ALREADY_REDEEMED_VALUE = 5;
    public static final int EXPIRED_VALUE = 4;
    public static final int INTERNAL_VALUE = 1;
    public static final int MALFORMED_VALUE = 2;
    public static final int MAX_REDEMPTIONS_REACHED_VALUE = 6;
    public static final int NOT_FOUND_VALUE = 3;
    public static final int NOT_SUPPORTED_VALUE = 7;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$FailureReason> internalValueMap = new java.lang.Object();
    private final int value;

    RedeemPromoCodeResponse$FailureReason(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$FailureReason forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INTERNAL;
            case 2:
                return MALFORMED;
            case 3:
                return NOT_FOUND;
            case 4:
                return EXPIRED;
            case 5:
                return ALREADY_REDEEMED;
            case 6:
                return MAX_REDEMPTIONS_REACHED;
            case 7:
                return NOT_SUPPORTED;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$FailureReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ye0.z.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$FailureReason valueOf(int i) {
        return forNumber(i);
    }
}
