package com.truecaller.premium.api.v1.partner;

/* loaded from: /home/user/tc_decoded/classes.dex */
public enum EligibilityStatus implements com.google.protobuf.Internal.EnumLite {
    ELIGIBLE(0),
    NOT_ELIGIBLE(1),
    INVALID_PARTNER(2),
    UNRECOGNIZED(-1);

    public static final int ELIGIBLE_VALUE = 0;
    public static final int INVALID_PARTNER_VALUE = 2;
    public static final int NOT_ELIGIBLE_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.api.v1.partner.EligibilityStatus> internalValueMap = new java.lang.Object();
    private final int value;

    EligibilityStatus(int i10) {
        this.value = i10;
    }

    public static com.truecaller.premium.api.v1.partner.EligibilityStatus forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return INVALID_PARTNER;
            }
            return NOT_ELIGIBLE;
        }
        return ELIGIBLE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.api.v1.partner.EligibilityStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p82.baz.f13218a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.api.v1.partner.EligibilityStatus valueOf(int i10) {
        return forNumber(i10);
    }
}
