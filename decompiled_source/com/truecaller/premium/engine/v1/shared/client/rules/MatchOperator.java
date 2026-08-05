package com.truecaller.premium.engine.v1.shared.client.rules;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum MatchOperator implements com.google.protobuf.Internal.EnumLite {
    EQUALS(0),
    NOT_EQUALS(1),
    GT(2),
    GTE(3),
    LT(4),
    LTE(5),
    CONTAINS_SUBSTR(6),
    NOT_CONTAINS_SUBSTR(7),
    IN(8),
    NOT_IN(9),
    UNRECOGNIZED(-1);

    public static final int CONTAINS_SUBSTR_VALUE = 6;
    public static final int EQUALS_VALUE = 0;
    public static final int GTE_VALUE = 3;
    public static final int GT_VALUE = 2;
    public static final int IN_VALUE = 8;
    public static final int LTE_VALUE = 5;
    public static final int LT_VALUE = 4;
    public static final int NOT_CONTAINS_SUBSTR_VALUE = 7;
    public static final int NOT_EQUALS_VALUE = 1;
    public static final int NOT_IN_VALUE = 9;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.MatchOperator> internalValueMap = new java.lang.Object();
    private final int value;

    MatchOperator(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.v1.shared.client.rules.MatchOperator forNumber(int i) {
        switch (i) {
            case 0:
                return EQUALS;
            case 1:
                return NOT_EQUALS;
            case 2:
                return GT;
            case 3:
                return GTE;
            case 4:
                return LT;
            case 5:
                return LTE;
            case 6:
                return CONTAINS_SUBSTR;
            case 7:
                return NOT_CONTAINS_SUBSTR;
            case 8:
                return IN;
            case 9:
                return NOT_IN;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.v1.shared.client.rules.MatchOperator> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sa2.l.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.v1.shared.client.rules.MatchOperator valueOf(int i) {
        return forNumber(i);
    }
}
