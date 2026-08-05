package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputMessageContent$AttachmentCase {
    IMAGE(2),
    VCARD(3),
    LOCATION(4),
    VIDEO(5),
    AUDIO(6),
    ANIMATION(7),
    FILE(8),
    ATTACHMENT_NOT_SET(0);

    private final int value;

    InputMessageContent$AttachmentCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$AttachmentCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return IMAGE;
                case 3:
                    return VCARD;
                case 4:
                    return LOCATION;
                case 5:
                    return VIDEO;
                case 6:
                    return AUDIO;
                case 7:
                    return ANIMATION;
                case 8:
                    return FILE;
                default:
                    return null;
            }
        }
        return ATTACHMENT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$AttachmentCase valueOf(int i) {
        return forNumber(i);
    }
}
