package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Models$Push$Provider implements com.google.protobuf.Internal.EnumLite {
    NONE(0),
    GOOGLE(1),
    HUAWEI(13),
    UNRECOGNIZED(-1);

    public static final int GOOGLE_VALUE = 1;
    public static final int HUAWEI_VALUE = 13;
    public static final int NONE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Push$Provider> internalValueMap = new java.lang.Object();
    private final int value;

    Models$Push$Provider(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Models$Push$Provider forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 13) {
                    return null;
                }
                return HUAWEI;
            }
            return GOOGLE;
        }
        return NONE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Push$Provider> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return yy.j1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Models$Push$Provider valueOf(int i) {
        return forNumber(i);
    }
}
