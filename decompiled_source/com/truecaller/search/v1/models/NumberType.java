package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum NumberType implements com.google.protobuf.Internal.EnumLite {
    NUMBER_TYPE_UNSET(0),
    NUMBER_TYPE_FIXED_LINE(1),
    NUMBER_TYPE_MOBILE(2),
    NUMBER_TYPE_FIXED_LINE_OR_MOBILE(3),
    NUMBER_TYPE_TOLL_FREE(4),
    NUMBER_TYPE_PREMIUM_RATE(5),
    NUMBER_TYPE_SHARED_COST(6),
    NUMBER_TYPE_VOIP(7),
    NUMBER_TYPE_PERSONAL_NUMBER(8),
    NUMBER_TYPE_PAGER(9),
    NUMBER_TYPE_UAN(10),
    NUMBER_TYPE_VOICEMAIL(11),
    NUMBER_TYPE_SPECIAL_NUMBER(12),
    NUMBER_TYPE_FREE_PHONE(13),
    NUMBER_TYPE_SATELLITE(14),
    NUMBER_TYPE_FAX(15),
    NUMBER_TYPE_UNKNOWN(16),
    UNRECOGNIZED(-1);

    public static final int NUMBER_TYPE_FAX_VALUE = 15;
    public static final int NUMBER_TYPE_FIXED_LINE_OR_MOBILE_VALUE = 3;
    public static final int NUMBER_TYPE_FIXED_LINE_VALUE = 1;
    public static final int NUMBER_TYPE_FREE_PHONE_VALUE = 13;
    public static final int NUMBER_TYPE_MOBILE_VALUE = 2;
    public static final int NUMBER_TYPE_PAGER_VALUE = 9;
    public static final int NUMBER_TYPE_PERSONAL_NUMBER_VALUE = 8;
    public static final int NUMBER_TYPE_PREMIUM_RATE_VALUE = 5;
    public static final int NUMBER_TYPE_SATELLITE_VALUE = 14;
    public static final int NUMBER_TYPE_SHARED_COST_VALUE = 6;
    public static final int NUMBER_TYPE_SPECIAL_NUMBER_VALUE = 12;
    public static final int NUMBER_TYPE_TOLL_FREE_VALUE = 4;
    public static final int NUMBER_TYPE_UAN_VALUE = 10;
    public static final int NUMBER_TYPE_UNKNOWN_VALUE = 16;
    public static final int NUMBER_TYPE_UNSET_VALUE = 0;
    public static final int NUMBER_TYPE_VOICEMAIL_VALUE = 11;
    public static final int NUMBER_TYPE_VOIP_VALUE = 7;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.NumberType> internalValueMap = new java.lang.Object();
    private final int value;

    NumberType(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.NumberType forNumber(int i) {
        switch (i) {
            case 0:
                return NUMBER_TYPE_UNSET;
            case 1:
                return NUMBER_TYPE_FIXED_LINE;
            case 2:
                return NUMBER_TYPE_MOBILE;
            case 3:
                return NUMBER_TYPE_FIXED_LINE_OR_MOBILE;
            case 4:
                return NUMBER_TYPE_TOLL_FREE;
            case 5:
                return NUMBER_TYPE_PREMIUM_RATE;
            case 6:
                return NUMBER_TYPE_SHARED_COST;
            case 7:
                return NUMBER_TYPE_VOIP;
            case 8:
                return NUMBER_TYPE_PERSONAL_NUMBER;
            case 9:
                return NUMBER_TYPE_PAGER;
            case 10:
                return NUMBER_TYPE_UAN;
            case 11:
                return NUMBER_TYPE_VOICEMAIL;
            case 12:
                return NUMBER_TYPE_SPECIAL_NUMBER;
            case 13:
                return NUMBER_TYPE_FREE_PHONE;
            case 14:
                return NUMBER_TYPE_SATELLITE;
            case 15:
                return NUMBER_TYPE_FAX;
            case 16:
                return NUMBER_TYPE_UNKNOWN;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.NumberType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.v1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.NumberType valueOf(int i) {
        return forNumber(i);
    }
}
