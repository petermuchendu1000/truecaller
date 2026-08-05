package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum State implements com.google.protobuf.Internal.EnumLite {
    STATE_UNKNOWN(0),
    STATE_PENDING(1),
    STATE_CONFIRMED(2),
    UNRECOGNIZED(-1);

    public static final int STATE_CONFIRMED_VALUE = 2;
    public static final int STATE_PENDING_VALUE = 1;
    public static final int STATE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.State> internalValueMap = new java.lang.Object();
    private final int value;

    State(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.State forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return STATE_CONFIRMED;
            }
            return STATE_PENDING;
        }
        return STATE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.State> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.a3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.State valueOf(int i) {
        return forNumber(i);
    }
}
