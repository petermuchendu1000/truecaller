package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$EventType implements com.google.protobuf.Internal.EnumLite {
    IMPRESSION(0),
    VIEWABLE_IMPRESSION(1),
    CLICK(2),
    VIDEO_IMPRESSION(3),
    THANK_YOU(4),
    EVENT(5),
    WIN(6),
    LOSS(7),
    JS_TAG(8),
    UNRECOGNIZED(-1);

    public static final int CLICK_VALUE = 2;
    public static final int EVENT_VALUE = 5;
    public static final int IMPRESSION_VALUE = 0;
    public static final int JS_TAG_VALUE = 8;
    public static final int LOSS_VALUE = 7;
    public static final int THANK_YOU_VALUE = 4;
    public static final int VIDEO_IMPRESSION_VALUE = 3;
    public static final int VIEWABLE_IMPRESSION_VALUE = 1;
    public static final int WIN_VALUE = 6;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$EventType> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$EventType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$EventType forNumber(int i) {
        switch (i) {
            case 0:
                return IMPRESSION;
            case 1:
                return VIEWABLE_IMPRESSION;
            case 2:
                return CLICK;
            case 3:
                return VIDEO_IMPRESSION;
            case 4:
                return THANK_YOU;
            case 5:
                return EVENT;
            case 6:
                return WIN;
            case 7:
                return LOSS;
            case 8:
                return JS_TAG;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$EventType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.x1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$EventType valueOf(int i) {
        return forNumber(i);
    }
}
