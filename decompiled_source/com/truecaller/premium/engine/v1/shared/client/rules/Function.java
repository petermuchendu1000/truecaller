package com.truecaller.premium.engine.v1.shared.client.rules;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum Function implements com.google.protobuf.Internal.EnumLite {
    COUNT(0),
    UNRECOGNIZED(-1);

    public static final int COUNT_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.Function> internalValueMap = new java.lang.Object();
    private final int value;

    Function(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.v1.shared.client.rules.Function forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return COUNT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.Function> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sa2.h.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.v1.shared.client.rules.Function valueOf(int i) {
        return forNumber(i);
    }
}
