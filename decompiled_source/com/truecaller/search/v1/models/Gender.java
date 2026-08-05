package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Gender implements com.google.protobuf.Internal.EnumLite {
    GENDER_UNKNOWN(0),
    GENDER_MALE(1),
    GENDER_FEMALE(2),
    GENDER_PREFER_NOT_TO_SAY(3),
    UNRECOGNIZED(-1);

    public static final int GENDER_FEMALE_VALUE = 2;
    public static final int GENDER_MALE_VALUE = 1;
    public static final int GENDER_PREFER_NOT_TO_SAY_VALUE = 3;
    public static final int GENDER_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Gender> internalValueMap = new java.lang.Object();
    private final int value;

    Gender(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.Gender forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return GENDER_PREFER_NOT_TO_SAY;
                }
                return GENDER_FEMALE;
            }
            return GENDER_MALE;
        }
        return GENDER_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.Gender> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.o1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.Gender valueOf(int i) {
        return forNumber(i);
    }
}
