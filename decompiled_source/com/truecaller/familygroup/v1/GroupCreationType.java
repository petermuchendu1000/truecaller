package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum GroupCreationType implements com.google.protobuf.Internal.EnumLite {
    CREATION_TYPE_UNKNOWN(0),
    PROTECTION(1),
    PREMIUM(2),
    UNRECOGNIZED(-1);

    public static final int CREATION_TYPE_UNKNOWN_VALUE = 0;
    public static final int PREMIUM_VALUE = 2;
    public static final int PROTECTION_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.GroupCreationType> internalValueMap = new java.lang.Object();
    private final int value;

    GroupCreationType(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.GroupCreationType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PREMIUM;
            }
            return PROTECTION;
        }
        return CREATION_TYPE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.GroupCreationType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.n0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.GroupCreationType valueOf(int i) {
        return forNumber(i);
    }
}
