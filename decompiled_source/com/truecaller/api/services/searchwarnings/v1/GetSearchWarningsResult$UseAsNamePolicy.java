package com.truecaller.api.services.searchwarnings.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetSearchWarningsResult$UseAsNamePolicy implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    USE_AS_NAME_IF_EMPTY(1),
    USE_AS_PILL_ONLY(2),
    USE_AS_NAME_IF_EMPTY_AND_SHOW_PILL(3),
    OVERRIDE_NAME(4),
    OVERRIDE_NAME_AND_SHOW_PILL(5),
    REMOVE_NAME_AND_SHOW_PILL(6),
    UNRECOGNIZED(-1);

    public static final int OVERRIDE_NAME_AND_SHOW_PILL_VALUE = 5;
    public static final int OVERRIDE_NAME_VALUE = 4;
    public static final int REMOVE_NAME_AND_SHOW_PILL_VALUE = 6;
    public static final int UNKNOWN_VALUE = 0;
    public static final int USE_AS_NAME_IF_EMPTY_AND_SHOW_PILL_VALUE = 3;
    public static final int USE_AS_NAME_IF_EMPTY_VALUE = 1;
    public static final int USE_AS_PILL_ONLY_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.GetSearchWarningsResult$UseAsNamePolicy> internalValueMap = new java.lang.Object();
    private final int value;

    GetSearchWarningsResult$UseAsNamePolicy(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.GetSearchWarningsResult$UseAsNamePolicy forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return USE_AS_NAME_IF_EMPTY;
            case 2:
                return USE_AS_PILL_ONLY;
            case 3:
                return USE_AS_NAME_IF_EMPTY_AND_SHOW_PILL;
            case 4:
                return OVERRIDE_NAME;
            case 5:
                return OVERRIDE_NAME_AND_SHOW_PILL;
            case 6:
                return REMOVE_NAME_AND_SHOW_PILL;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.GetSearchWarningsResult$UseAsNamePolicy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ze0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.GetSearchWarningsResult$UseAsNamePolicy valueOf(int i) {
        return forNumber(i);
    }
}
