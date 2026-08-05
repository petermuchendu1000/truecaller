package com.truecaller.api.services.searchwarnings.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ListAllSearchWarningsResult$MessageDisplayState implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    CLOSED(1),
    EXPANDED(2),
    UNRECOGNIZED(-1);

    public static final int CLOSED_VALUE = 1;
    public static final int EXPANDED_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.ListAllSearchWarningsResult$MessageDisplayState> internalValueMap = new java.lang.Object();
    private final int value;

    ListAllSearchWarningsResult$MessageDisplayState(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.ListAllSearchWarningsResult$MessageDisplayState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return EXPANDED;
            }
            return CLOSED;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.searchwarnings.v1.ListAllSearchWarningsResult$MessageDisplayState> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ze0.o.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.ListAllSearchWarningsResult$MessageDisplayState valueOf(int i) {
        return forNumber(i);
    }
}
