package com.truecaller.api.services.messenger.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MediaHandles$Request$UploadType implements com.google.protobuf.Internal.EnumLite {
    MEDIA(0),
    AVATAR(1),
    UNRECOGNIZED(-1);

    public static final int AVATAR_VALUE = 1;
    public static final int MEDIA_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.MediaHandles$Request$UploadType> internalValueMap = new java.lang.Object();
    private final int value;

    MediaHandles$Request$UploadType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.MediaHandles$Request$UploadType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return AVATAR;
        }
        return MEDIA;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.MediaHandles$Request$UploadType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return qe0.b1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.MediaHandles$Request$UploadType valueOf(int i) {
        return forNumber(i);
    }
}
