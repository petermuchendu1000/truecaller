package com.truecaller.api.services.businesscallerid.v1.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Badge implements com.google.protobuf.Internal.EnumLite {
    BADGE_UNKNOWN(0),
    BADGE_PRIORITY(1),
    BADGE_VERIFIED(2),
    UNRECOGNIZED(-1);

    public static final int BADGE_PRIORITY_VALUE = 1;
    public static final int BADGE_UNKNOWN_VALUE = 0;
    public static final int BADGE_VERIFIED_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.businesscallerid.v1.model.Badge> internalValueMap = new java.lang.Object();
    private final int value;

    Badge(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.businesscallerid.v1.model.Badge forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BADGE_VERIFIED;
            }
            return BADGE_PRIORITY;
        }
        return BADGE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.businesscallerid.v1.model.Badge> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ie0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.businesscallerid.v1.model.Badge valueOf(int i) {
        return forNumber(i);
    }
}
