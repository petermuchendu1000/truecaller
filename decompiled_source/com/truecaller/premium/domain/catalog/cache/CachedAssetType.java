package com.truecaller.premium.domain.catalog.cache;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum CachedAssetType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    IMAGE(1),
    VIDEO(2),
    ANIMATION(3),
    UNRECOGNIZED(-1);

    public static final int ANIMATION_VALUE = 3;
    public static final int IMAGE_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.domain.catalog.cache.CachedAssetType> internalValueMap = new java.lang.Object();
    private final int value;

    CachedAssetType(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.domain.catalog.cache.CachedAssetType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ANIMATION;
                }
                return VIDEO;
            }
            return IMAGE;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.domain.catalog.cache.CachedAssetType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return x92.b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.domain.catalog.cache.CachedAssetType valueOf(int i) {
        return forNumber(i);
    }
}
