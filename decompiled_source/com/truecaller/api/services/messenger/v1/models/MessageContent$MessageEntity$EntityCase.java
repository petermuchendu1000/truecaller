package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MessageContent$MessageEntity$EntityCase {
    MENTION(3),
    LINK_PREVIEW(4),
    ENTITY_NOT_SET(0);

    private final int value;

    MessageContent$MessageEntity$EntityCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.MessageContent$MessageEntity$EntityCase forNumber(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return LINK_PREVIEW;
            }
            return MENTION;
        }
        return ENTITY_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.MessageContent$MessageEntity$EntityCase valueOf(int i) {
        return forNumber(i);
    }
}
