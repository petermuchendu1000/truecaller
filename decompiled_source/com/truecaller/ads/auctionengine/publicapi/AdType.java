package com.truecaller.ads.auctionengine.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AdType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    BANNER(1),
    NATIVE(2),
    VIDEO(3),
    NATIVE_IMAGE(4),
    NATIVE_VIDEO(5),
    SUGGESTED_APPS(6),
    CAROUSEL(7),
    BUBBLE(8),
    ANIMATED_ICON(9),
    VAST_VIDEO(10),
    FLOATER(11),
    BUBBLE_CAROUSEL(12),
    UNRECOGNIZED(-1);

    public static final int ANIMATED_ICON_VALUE = 9;
    public static final int BANNER_VALUE = 1;
    public static final int BUBBLE_CAROUSEL_VALUE = 12;
    public static final int BUBBLE_VALUE = 8;
    public static final int CAROUSEL_VALUE = 7;
    public static final int FLOATER_VALUE = 11;
    public static final int NATIVE_IMAGE_VALUE = 4;
    public static final int NATIVE_VALUE = 2;
    public static final int NATIVE_VIDEO_VALUE = 5;
    public static final int SUGGESTED_APPS_VALUE = 6;
    public static final int UNKNOWN_VALUE = 0;
    public static final int VAST_VIDEO_VALUE = 10;
    public static final int VIDEO_VALUE = 3;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.auctionengine.publicapi.AdType> internalValueMap = new java.lang.Object();
    private final int value;

    AdType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.auctionengine.publicapi.AdType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BANNER;
            case 2:
                return NATIVE;
            case 3:
                return VIDEO;
            case 4:
                return NATIVE_IMAGE;
            case 5:
                return NATIVE_VIDEO;
            case 6:
                return SUGGESTED_APPS;
            case 7:
                return CAROUSEL;
            case 8:
                return BUBBLE;
            case 9:
                return ANIMATED_ICON;
            case 10:
                return VAST_VIDEO;
            case 11:
                return FLOATER;
            case 12:
                return BUBBLE_CAROUSEL;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.auctionengine.publicapi.AdType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return f40.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.auctionengine.publicapi.AdType valueOf(int i) {
        return forNumber(i);
    }
}
