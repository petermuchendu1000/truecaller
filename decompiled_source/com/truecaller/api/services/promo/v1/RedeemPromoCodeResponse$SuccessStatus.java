package com.truecaller.api.services.promo.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RedeemPromoCodeResponse$SuccessStatus implements com.google.protobuf.Internal.EnumLite {
    REDEEMED(0),
    UNRECOGNIZED(-1);

    public static final int REDEEMED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$SuccessStatus> internalValueMap = new java.lang.Object();
    private final int value;

    RedeemPromoCodeResponse$SuccessStatus(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$SuccessStatus forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return REDEEMED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$SuccessStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ye0.b0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$SuccessStatus valueOf(int i) {
        return forNumber(i);
    }
}
