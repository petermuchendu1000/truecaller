package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum NamedContext implements com.google.protobuf.Internal.EnumLite {
    GLOBAL(0),
    UNRECOGNIZED(-1);

    public static final int GLOBAL_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.NamedContext> internalValueMap = new java.lang.Object();
    private final int value;

    NamedContext(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.NamedContext forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return GLOBAL;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.NamedContext> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.j2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.NamedContext valueOf(int i) {
        return forNumber(i);
    }
}
