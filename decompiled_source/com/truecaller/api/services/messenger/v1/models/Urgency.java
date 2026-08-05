package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Urgency implements com.google.protobuf.Internal.EnumLite {
    NORMAL(0),
    URGENT(1),
    UNRECOGNIZED(-1);

    public static final int NORMAL_VALUE = 0;
    public static final int URGENT_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.Urgency> internalValueMap = new java.lang.Object();
    private final int value;

    Urgency(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.Urgency forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return URGENT;
        }
        return NORMAL;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.Urgency> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.i4.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.Urgency valueOf(int i) {
        return forNumber(i);
    }
}
