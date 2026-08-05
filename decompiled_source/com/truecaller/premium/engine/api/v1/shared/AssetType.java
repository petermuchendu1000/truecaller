package com.truecaller.premium.engine.api.v1.shared;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum AssetType implements com.google.protobuf.Internal.EnumLite {
    image(0),
    video(1),
    animation(2),
    UNRECOGNIZED(-1);

    public static final int animation_VALUE = 2;
    public static final int image_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.api.v1.shared.AssetType> internalValueMap = new java.lang.Object();
    public static final int video_VALUE = 1;
    private final int value;

    AssetType(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.api.v1.shared.AssetType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return animation;
            }
            return video;
        }
        return image;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.premium.engine.api.v1.shared.AssetType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ra2.b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.api.v1.shared.AssetType valueOf(int i) {
        return forNumber(i);
    }
}
