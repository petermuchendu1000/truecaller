package com.truecaller.api.services.survey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Context implements com.google.protobuf.Internal.EnumLite {
    ACS(0),
    DETAILS_VIEW(1),
    BLOCK(2),
    UNRECOGNIZED(-1);

    public static final int ACS_VALUE = 0;
    public static final int BLOCK_VALUE = 2;
    public static final int DETAILS_VIEW_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.Context> internalValueMap = new java.lang.Object();
    private final int value;

    Context(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.survey.Context forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BLOCK;
            }
            return DETAILS_VIEW;
        }
        return ACS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.Context> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return bf0.r0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.survey.Context valueOf(int i) {
        return forNumber(i);
    }
}
