package com.truecaller.api.services.bizsurvey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SecondaryCTAType implements com.google.protobuf.Internal.EnumLite {
    NOT_INTERESTED(0),
    IN_30_MINS(1),
    UNRECOGNIZED(-1);

    public static final int IN_30_MINS_VALUE = 1;
    public static final int NOT_INTERESTED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.bizsurvey.SecondaryCTAType> internalValueMap = new java.lang.Object();
    private final int value;

    SecondaryCTAType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.bizsurvey.SecondaryCTAType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return IN_30_MINS;
        }
        return NOT_INTERESTED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.bizsurvey.SecondaryCTAType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return he0.f1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.bizsurvey.SecondaryCTAType valueOf(int i) {
        return forNumber(i);
    }
}
