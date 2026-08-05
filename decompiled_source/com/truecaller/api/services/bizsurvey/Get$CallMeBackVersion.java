package com.truecaller.api.services.bizsurvey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Get$CallMeBackVersion implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_VERSION(0),
    DAY_TIME_SLOT_VERSION(1),
    DAY_SPECIFIC_TIME_SLOT_VERSION(2),
    UNRECOGNIZED(-1);

    public static final int DAY_SPECIFIC_TIME_SLOT_VERSION_VALUE = 2;
    public static final int DAY_TIME_SLOT_VERSION_VALUE = 1;
    public static final int UNKNOWN_VERSION_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.bizsurvey.Get$CallMeBackVersion> internalValueMap = new java.lang.Object();
    private final int value;

    Get$CallMeBackVersion(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.bizsurvey.Get$CallMeBackVersion forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DAY_SPECIFIC_TIME_SLOT_VERSION;
            }
            return DAY_TIME_SLOT_VERSION;
        }
        return UNKNOWN_VERSION;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.bizsurvey.Get$CallMeBackVersion> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return he0.l.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.bizsurvey.Get$CallMeBackVersion valueOf(int i) {
        return forNumber(i);
    }
}
