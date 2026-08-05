package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ProtectionState implements com.google.protobuf.Internal.EnumLite {
    PROTECTION_STATE_UNKNOWN(0),
    PROTECTION_STATE_PENDING(1),
    PROTECTION_STATE_CONFIRMED(2),
    UNRECOGNIZED(-1);

    public static final int PROTECTION_STATE_CONFIRMED_VALUE = 2;
    public static final int PROTECTION_STATE_PENDING_VALUE = 1;
    public static final int PROTECTION_STATE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.ProtectionState> internalValueMap = new java.lang.Object();
    private final int value;

    ProtectionState(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.ProtectionState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PROTECTION_STATE_CONFIRMED;
            }
            return PROTECTION_STATE_PENDING;
        }
        return PROTECTION_STATE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.ProtectionState> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.e2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.ProtectionState valueOf(int i) {
        return forNumber(i);
    }
}
