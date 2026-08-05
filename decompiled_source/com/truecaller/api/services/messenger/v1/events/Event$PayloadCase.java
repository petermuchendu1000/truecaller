package com.truecaller.api.services.messenger.v1.events;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Event$PayloadCase {
    MESSAGE_SENT(2),
    REPORT_SENT(3),
    REACTION_SENT(4),
    GROUP_CREATED(5),
    PARTICIPANT_ADDED(6),
    PARTICIPANT_REMOVED(7),
    ROLES_UPDATED(8),
    GROUP_INFO_UPDATED(9),
    GROUP_DELETED(10),
    USER_TYPING(11),
    GROUP_INVITE_KEY_UPDATED(12),
    MESSAGE_EDITED(13),
    MESSAGES_DELETED(14),
    MESSAGE_ACTION_PERFORMED(15),
    MODAL_FORM_COMPLETED(16),
    BATCH(re0.t0.BATCH_FIELD_NUMBER),
    PING(re0.t0.PING_FIELD_NUMBER),
    INCOMPATIBLE_EVENT(998),
    PAYLOAD_NOT_SET(0);

    private final int value;

    Event$PayloadCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.events.Event$PayloadCase forNumber(int i) {
        if (i != 0) {
            if (i != 995) {
                if (i != 997) {
                    if (i != 998) {
                        switch (i) {
                            case 2:
                                return MESSAGE_SENT;
                            case 3:
                                return REPORT_SENT;
                            case 4:
                                return REACTION_SENT;
                            case 5:
                                return GROUP_CREATED;
                            case 6:
                                return PARTICIPANT_ADDED;
                            case 7:
                                return PARTICIPANT_REMOVED;
                            case 8:
                                return ROLES_UPDATED;
                            case 9:
                                return GROUP_INFO_UPDATED;
                            case 10:
                                return GROUP_DELETED;
                            case 11:
                                return USER_TYPING;
                            case 12:
                                return GROUP_INVITE_KEY_UPDATED;
                            case 13:
                                return MESSAGE_EDITED;
                            case 14:
                                return MESSAGES_DELETED;
                            case 15:
                                return MESSAGE_ACTION_PERFORMED;
                            case 16:
                                return MODAL_FORM_COMPLETED;
                            default:
                                return null;
                        }
                    }
                    return INCOMPATIBLE_EVENT;
                }
                return PING;
            }
            return BATCH;
        }
        return PAYLOAD_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.events.Event$PayloadCase valueOf(int i) {
        return forNumber(i);
    }
}
