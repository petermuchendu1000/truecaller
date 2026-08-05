package com.truecaller.filterstore.api;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum GetNumberSeriesConfig$Response$NumberSeriesLevel implements com.google.protobuf.Internal.EnumLite {
    NUMBER_SERIES_LEVEL_UNKNOWN(0),
    NUMBER_SERIES_LEVEL_BASIC(1),
    NUMBER_SERIES_LEVEL_PREMIUM(2),
    UNRECOGNIZED(-1);

    public static final int NUMBER_SERIES_LEVEL_BASIC_VALUE = 1;
    public static final int NUMBER_SERIES_LEVEL_PREMIUM_VALUE = 2;
    public static final int NUMBER_SERIES_LEVEL_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.filterstore.api.GetNumberSeriesConfig$Response$NumberSeriesLevel> internalValueMap = new java.lang.Object();
    private final int value;

    GetNumberSeriesConfig$Response$NumberSeriesLevel(int i) {
        this.value = i;
    }

    public static com.truecaller.filterstore.api.GetNumberSeriesConfig$Response$NumberSeriesLevel forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return NUMBER_SERIES_LEVEL_PREMIUM;
            }
            return NUMBER_SERIES_LEVEL_BASIC;
        }
        return NUMBER_SERIES_LEVEL_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.filterstore.api.GetNumberSeriesConfig$Response$NumberSeriesLevel> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return cp1.f.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.filterstore.api.GetNumberSeriesConfig$Response$NumberSeriesLevel valueOf(int i) {
        return forNumber(i);
    }
}
