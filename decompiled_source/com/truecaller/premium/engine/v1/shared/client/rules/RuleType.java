package com.truecaller.premium.engine.v1.shared.client.rules;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum RuleType implements com.google.protobuf.Internal.EnumLite {
    EVENT(0),
    UNRECOGNIZED(-1);

    public static final int EVENT_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.RuleType> internalValueMap = new java.lang.Object();
    private final int value;

    RuleType(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.v1.shared.client.rules.RuleType forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return EVENT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.RuleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sa2.w.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.v1.shared.client.rules.RuleType valueOf(int i) {
        return forNumber(i);
    }
}
