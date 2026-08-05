package com.truecaller.api.services.messenger.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Batched$Response$Payload$DataCase {
    ERROR(1),
    SEND_MESSAGE(2),
    SEND_REPORT(3),
    SEND_REACTION(4),
    DATA_NOT_SET(0);

    private final int value;

    Batched$Response$Payload$DataCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.Batched$Response$Payload$DataCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SEND_REACTION;
                    }
                    return SEND_REPORT;
                }
                return SEND_MESSAGE;
            }
            return ERROR;
        }
        return DATA_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.Batched$Response$Payload$DataCase valueOf(int i) {
        return forNumber(i);
    }
}
