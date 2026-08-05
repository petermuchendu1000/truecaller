package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputRole implements com.google.protobuf.Internal.EnumLite {
    NO_ROLE(0),
    INVITEE(2),
    USER(8),
    ADMIN(536870912),
    SUPER_ADMIN(1073741824),
    UNRECOGNIZED(-1);

    public static final int ADMIN_VALUE = 536870912;
    public static final int INVITEE_VALUE = 2;
    public static final int NO_ROLE_VALUE = 0;
    public static final int SUPER_ADMIN_VALUE = 1073741824;
    public static final int USER_VALUE = 8;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputRole> internalValueMap = new java.lang.Object();
    private final int value;

    InputRole(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputRole forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 8) {
                    if (i != 536870912) {
                        if (i != 1073741824) {
                            return null;
                        }
                        return SUPER_ADMIN;
                    }
                    return ADMIN;
                }
                return USER;
            }
            return INVITEE;
        }
        return NO_ROLE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputRole> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return te0.n2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputRole valueOf(int i) {
        return forNumber(i);
    }
}
