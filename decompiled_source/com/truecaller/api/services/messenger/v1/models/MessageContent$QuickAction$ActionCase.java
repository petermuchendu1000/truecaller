package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MessageContent$QuickAction$ActionCase {
    DEEP_LINK(2),
    REPLY(11),
    MODAL_FORM_ACTION(12),
    ACTION_NOT_SET(0);

    private final int value;

    MessageContent$QuickAction$ActionCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.MessageContent$QuickAction$ActionCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 11) {
                    if (i != 12) {
                        return null;
                    }
                    return MODAL_FORM_ACTION;
                }
                return REPLY;
            }
            return DEEP_LINK;
        }
        return ACTION_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.MessageContent$QuickAction$ActionCase valueOf(int i) {
        return forNumber(i);
    }
}
