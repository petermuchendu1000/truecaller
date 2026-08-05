package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum InviteWarning implements com.google.protobuf.Internal.EnumLite {
    INVITE_WARNING_UNKNOWN(0),
    INVITE_WARNING_NOT_USER(1),
    INVITE_WARNING_UNSUPPORTED_APP_VERSION(2),
    INVITE_WARNING_UNSUPPORTED_OS_VERSION(3),
    UNRECOGNIZED(-1);

    public static final int INVITE_WARNING_NOT_USER_VALUE = 1;
    public static final int INVITE_WARNING_UNKNOWN_VALUE = 0;
    public static final int INVITE_WARNING_UNSUPPORTED_APP_VERSION_VALUE = 2;
    public static final int INVITE_WARNING_UNSUPPORTED_OS_VERSION_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.InviteWarning> internalValueMap = new java.lang.Object();
    private final int value;

    InviteWarning(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.InviteWarning forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return INVITE_WARNING_UNSUPPORTED_OS_VERSION;
                }
                return INVITE_WARNING_UNSUPPORTED_APP_VERSION;
            }
            return INVITE_WARNING_NOT_USER;
        }
        return INVITE_WARNING_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.InviteWarning> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.c1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.InviteWarning valueOf(int i) {
        return forNumber(i);
    }
}
