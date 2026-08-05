package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputMessageContent$TextFormat implements com.google.protobuf.Internal.EnumLite {
    PLAIN(0),
    RICH(1),
    UNRECOGNIZED(-1);

    public static final int PLAIN_VALUE = 0;
    public static final int RICH_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$TextFormat> internalValueMap = new java.lang.Object();
    private final int value;

    InputMessageContent$TextFormat(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$TextFormat forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return RICH;
        }
        return PLAIN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$TextFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return te0.n0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$TextFormat valueOf(int i) {
        return forNumber(i);
    }
}
