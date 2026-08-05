package com.truecaller.api.services.truecommunity.comment;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum UserPermissionComment implements com.google.protobuf.Internal.EnumLite {
    REPORT(0),
    DELETE(1),
    BANUSER(2),
    UNRECOGNIZED(-1);

    public static final int BANUSER_VALUE = 2;
    public static final int DELETE_VALUE = 1;
    public static final int REPORT_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.comment.UserPermissionComment> internalValueMap = new java.lang.Object();
    private final int value;

    UserPermissionComment(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.comment.UserPermissionComment forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BANUSER;
            }
            return DELETE;
        }
        return REPORT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.comment.UserPermissionComment> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ff0.h1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.comment.UserPermissionComment valueOf(int i) {
        return forNumber(i);
    }
}
