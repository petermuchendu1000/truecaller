package com.truecaller.api.services.callerid.v1.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum CallContext$MessageCase {
    CUSTOMMESSAGE(1),
    PREDEFINEDMESSAGE(3),
    MESSAGE_NOT_SET(0);

    private final int value;

    CallContext$MessageCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.callerid.v1.model.CallContext$MessageCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return null;
                }
                return PREDEFINEDMESSAGE;
            }
            return CUSTOMMESSAGE;
        }
        return MESSAGE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.callerid.v1.model.CallContext$MessageCase valueOf(int i) {
        return forNumber(i);
    }
}
