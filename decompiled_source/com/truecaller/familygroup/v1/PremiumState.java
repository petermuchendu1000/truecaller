package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum PremiumState implements com.google.protobuf.Internal.EnumLite {
    PREMIUM_STATE_UNKNOWN(0),
    PREMIUM_STATE_PENDING(1),
    PREMIUM_STATE_CONFIRMED(2),
    UNRECOGNIZED(-1);

    public static final int PREMIUM_STATE_CONFIRMED_VALUE = 2;
    public static final int PREMIUM_STATE_PENDING_VALUE = 1;
    public static final int PREMIUM_STATE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.PremiumState> internalValueMap = new java.lang.Object();
    private final int value;

    PremiumState(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.PremiumState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PREMIUM_STATE_CONFIRMED;
            }
            return PREMIUM_STATE_PENDING;
        }
        return PREMIUM_STATE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.PremiumState> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.c2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.PremiumState valueOf(int i) {
        return forNumber(i);
    }
}
