package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Feature implements com.google.protobuf.Internal.EnumLite {
    DEFAULT(0),
    RECEIVE_READ_REPORT(2),
    RECEIVE_MESSAGE(4),
    RECEIVE_ATTACHMENT_IMAGE(8),
    RECEIVE_ATTACHMENT_VIDEO(16),
    RECEIVE_ATTACHMENT_FILE(32),
    RECEIVE_ATTACHMENT_VCARD(64),
    RECEIVE_ATTACHMENT_LOCATION(128),
    SEND_ATTACHMENT_IMAGE(256),
    SEND_ATTACHMENT_VIDEO(512),
    SEND_ATTACHMENT_FILE(1024),
    SEND_RICH_TEXT(4096),
    TRACK_CONVERSATION(8192),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    public static final int RECEIVE_ATTACHMENT_FILE_VALUE = 32;
    public static final int RECEIVE_ATTACHMENT_IMAGE_VALUE = 8;
    public static final int RECEIVE_ATTACHMENT_LOCATION_VALUE = 128;
    public static final int RECEIVE_ATTACHMENT_VCARD_VALUE = 64;
    public static final int RECEIVE_ATTACHMENT_VIDEO_VALUE = 16;
    public static final int RECEIVE_MESSAGE_VALUE = 4;
    public static final int RECEIVE_READ_REPORT_VALUE = 2;
    public static final int SEND_ATTACHMENT_FILE_VALUE = 1024;
    public static final int SEND_ATTACHMENT_IMAGE_VALUE = 256;
    public static final int SEND_ATTACHMENT_VIDEO_VALUE = 512;
    public static final int SEND_RICH_TEXT_VALUE = 4096;
    public static final int TRACK_CONVERSATION_VALUE = 8192;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.Feature> internalValueMap = new java.lang.Object();
    private final int value;

    Feature(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.Feature forNumber(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 2:
                return RECEIVE_READ_REPORT;
            case 4:
                return RECEIVE_MESSAGE;
            case 8:
                return RECEIVE_ATTACHMENT_IMAGE;
            case 16:
                return RECEIVE_ATTACHMENT_VIDEO;
            case 32:
                return RECEIVE_ATTACHMENT_FILE;
            case 64:
                return RECEIVE_ATTACHMENT_VCARD;
            case 128:
                return RECEIVE_ATTACHMENT_LOCATION;
            case 256:
                return SEND_ATTACHMENT_IMAGE;
            case 512:
                return SEND_ATTACHMENT_VIDEO;
            case 1024:
                return SEND_ATTACHMENT_FILE;
            case 4096:
                return SEND_RICH_TEXT;
            case 8192:
                return TRACK_CONVERSATION;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.Feature> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.i.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.Feature valueOf(int i) {
        return forNumber(i);
    }
}
