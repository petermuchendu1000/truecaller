package com.truecaller.nationalidverification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum Gender implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    UNRECOGNIZED(-1);

    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.nationalidverification.Gender> internalValueMap = new java.lang.Object();
    private final int value;

    Gender(int i) {
        this.value = i;
    }

    public static com.truecaller.nationalidverification.Gender forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FEMALE;
            }
            return MALE;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.nationalidverification.Gender> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return j52.n.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.nationalidverification.Gender valueOf(int i) {
        return forNumber(i);
    }
}
