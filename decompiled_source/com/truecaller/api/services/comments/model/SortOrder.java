package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SortOrder implements com.google.protobuf.Internal.EnumLite {
    DESC(0),
    ASC(1),
    UNRECOGNIZED(-1);

    public static final int ASC_VALUE = 1;
    public static final int DESC_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.SortOrder> internalValueMap = new java.lang.Object();
    private final int value;

    SortOrder(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.SortOrder forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ASC;
        }
        return DESC;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.SortOrder> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.b1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.SortOrder valueOf(int i) {
        return forNumber(i);
    }
}
