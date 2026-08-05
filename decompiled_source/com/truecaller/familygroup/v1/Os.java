package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum Os implements com.google.protobuf.Internal.EnumLite {
    OS_UNSPECIFIED(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);

    public static final int OS_ANDROID_VALUE = 1;
    public static final int OS_IOS_VALUE = 2;
    public static final int OS_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.Os> internalValueMap = new java.lang.Object();
    private final int value;

    Os(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.Os forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return OS_IOS;
            }
            return OS_ANDROID;
        }
        return OS_UNSPECIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.Os> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.a2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.Os valueOf(int i) {
        return forNumber(i);
    }
}
