package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputMessageContent$MessageEntity$EntityCase {
    MENTION(3),
    LINK_PREVIEW(4),
    ENTITY_NOT_SET(0);

    private final int value;

    InputMessageContent$MessageEntity$EntityCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$MessageEntity$EntityCase forNumber(int i) {
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
    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$MessageEntity$EntityCase valueOf(int i) {
        return forNumber(i);
    }
}
