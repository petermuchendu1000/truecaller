package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Models$Device$MobileService implements com.google.protobuf.Internal.EnumLite {
    NONE(0),
    GMS(1),
    HMS(2),
    DCS(3),
    UNRECOGNIZED(-1);

    public static final int DCS_VALUE = 3;
    public static final int GMS_VALUE = 1;
    public static final int HMS_VALUE = 2;
    public static final int NONE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Device$MobileService> internalValueMap = new java.lang.Object();
    private final int value;

    Models$Device$MobileService(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Models$Device$MobileService forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DCS;
                }
                return HMS;
            }
            return GMS;
        }
        return NONE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.accountonboarding.v1.Models$Device$MobileService> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return yy.f0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Models$Device$MobileService valueOf(int i) {
        return forNumber(i);
    }
}
