package com.truecaller.api.services.profile.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AvatarState implements com.google.protobuf.Internal.EnumLite {
    Fine(0),
    Blocked(1),
    UNRECOGNIZED(-1);

    public static final int Blocked_VALUE = 1;
    public static final int Fine_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.profile.model.AvatarState> internalValueMap = new java.lang.Object();
    private final int value;

    AvatarState(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.profile.model.AvatarState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Blocked;
        }
        return Fine;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.profile.model.AvatarState> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return xe0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.profile.model.AvatarState valueOf(int i) {
        return forNumber(i);
    }
}
