package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Models$ExtVerificationAppInstalled implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    WA(1),
    UNRECOGNIZED(-1);

    public static final int UNKNOWN_VALUE = 0;
    public static final int WA_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$ExtVerificationAppInstalled> internalValueMap = new java.lang.Object();
    private final int value;

    Models$ExtVerificationAppInstalled(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Models$ExtVerificationAppInstalled forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return WA;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$ExtVerificationAppInstalled> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return yy.w0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Models$ExtVerificationAppInstalled valueOf(int i) {
        return forNumber(i);
    }
}
