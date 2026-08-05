package com.truecaller.premium.engine.v1.shared.client.rules;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum LogicalOperator implements com.google.protobuf.Internal.EnumLite {
    AND(0),
    OR(1),
    UNRECOGNIZED(-1);

    public static final int AND_VALUE = 0;
    public static final int OR_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.LogicalOperator> internalValueMap = new java.lang.Object();
    private final int value;

    LogicalOperator(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.v1.shared.client.rules.LogicalOperator forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return OR;
        }
        return AND;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.LogicalOperator> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sa2.j.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.v1.shared.client.rules.LogicalOperator valueOf(int i) {
        return forNumber(i);
    }
}
