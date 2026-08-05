package com.truecaller.api.services.profile.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum FieldType$TypeCase {
    TEXT_FIELD(1),
    COMBOBOX_FIELD(2),
    RADIO_FIELD(3),
    DATE_FIELD(4),
    TYPE_NOT_SET(0);

    private final int value;

    FieldType$TypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.profile.model.FieldType$TypeCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return DATE_FIELD;
                    }
                    return RADIO_FIELD;
                }
                return COMBOBOX_FIELD;
            }
            return TEXT_FIELD;
        }
        return TYPE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.profile.model.FieldType$TypeCase valueOf(int i) {
        return forNumber(i);
    }
}
