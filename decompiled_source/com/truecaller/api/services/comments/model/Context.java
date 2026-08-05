package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Context implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_CONTEXT(0),
    BLOCK(1),
    DETAIL_VIEW(2),
    ACS_SCREEN(3),
    BLOCK_A(4),
    BLOCK_B(5),
    UNRECOGNIZED(-1);

    public static final int ACS_SCREEN_VALUE = 3;
    public static final int BLOCK_A_VALUE = 4;
    public static final int BLOCK_B_VALUE = 5;
    public static final int BLOCK_VALUE = 1;
    public static final int DETAIL_VIEW_VALUE = 2;
    public static final int UNKNOWN_CONTEXT_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.Context> internalValueMap = new java.lang.Object();
    private final int value;

    Context(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.Context forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return BLOCK_B;
                        }
                        return BLOCK_A;
                    }
                    return ACS_SCREEN;
                }
                return DETAIL_VIEW;
            }
            return BLOCK;
        }
        return UNKNOWN_CONTEXT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.Context> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.Context valueOf(int i) {
        return forNumber(i);
    }
}
