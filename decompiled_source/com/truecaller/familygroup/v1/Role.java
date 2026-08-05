package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum Role implements com.google.protobuf.Internal.EnumLite {
    ROLE_UNKNOWN(0),
    ROLE_ADMIN(1),
    ROLE_MEMBER(2),
    UNRECOGNIZED(-1);

    public static final int ROLE_ADMIN_VALUE = 1;
    public static final int ROLE_MEMBER_VALUE = 2;
    public static final int ROLE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.Role> internalValueMap = new java.lang.Object();
    private final int value;

    Role(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.Role forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ROLE_MEMBER;
            }
            return ROLE_ADMIN;
        }
        return ROLE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.familygroup.v1.Role> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return nj1.y2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.Role valueOf(int i) {
        return forNumber(i);
    }
}
