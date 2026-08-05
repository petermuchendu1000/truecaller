package com.truecaller.api.services.promo.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetPartnerPromoCodeResponse$FailureReason implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    INTERNAL(1),
    USER_NOT_ELIGIBLE(2),
    NOT_FOUND(3),
    VALIDATION_FAILED(4),
    UNRECOGNIZED(-1);

    public static final int INTERNAL_VALUE = 1;
    public static final int NOT_FOUND_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    public static final int USER_NOT_ELIGIBLE_VALUE = 2;
    public static final int VALIDATION_FAILED_VALUE = 4;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.GetPartnerPromoCodeResponse$FailureReason> internalValueMap = new java.lang.Object();
    private final int value;

    GetPartnerPromoCodeResponse$FailureReason(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.promo.v1.GetPartnerPromoCodeResponse$FailureReason forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VALIDATION_FAILED;
                    }
                    return NOT_FOUND;
                }
                return USER_NOT_ELIGIBLE;
            }
            return INTERNAL;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.promo.v1.GetPartnerPromoCodeResponse$FailureReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ye0.d.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.promo.v1.GetPartnerPromoCodeResponse$FailureReason valueOf(int i) {
        return forNumber(i);
    }
}
