package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Models$Device$Os implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    UNRECOGNIZED(-1);

    public static final int ANDROID_VALUE = 1;
    public static final int IOS_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Device$Os> internalValueMap = new java.lang.Object();
    private final int value;

    Models$Device$Os(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Models$Device$Os forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return IOS;
            }
            return ANDROID;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Device$Os> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return yy.h0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Models$Device$Os valueOf(int i) {
        return forNumber(i);
    }
}
