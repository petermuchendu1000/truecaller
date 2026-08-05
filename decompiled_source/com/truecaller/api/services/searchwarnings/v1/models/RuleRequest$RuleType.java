package com.truecaller.api.services.searchwarnings.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RuleRequest$RuleType implements com.google.protobuf.Internal.EnumLite {
    UNDEFINED(0),
    SEARCH_CONTEXT(1),
    CLASSIFIER(2),
    UNRECOGNIZED(-1);

    public static final int CLASSIFIER_VALUE = 2;
    public static final int SEARCH_CONTEXT_VALUE = 1;
    public static final int UNDEFINED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.models.RuleRequest$RuleType> internalValueMap = new java.lang.Object();
    private final int value;

    RuleRequest$RuleType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.models.RuleRequest$RuleType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CLASSIFIER;
            }
            return SEARCH_CONTEXT;
        }
        return UNDEFINED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.models.RuleRequest$RuleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return af0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.models.RuleRequest$RuleType valueOf(int i) {
        return forNumber(i);
    }
}
