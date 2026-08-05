package com.truecaller.api.services.messenger.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Batched$Request$Payload$DataCase {
    SEND_MESSAGE(2),
    SEND_REPORT(3),
    SEND_REACTION(4),
    DATA_NOT_SET(0);

    private final int value;

    Batched$Request$Payload$DataCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.Batched$Request$Payload$DataCase forNumber(int i) {
        if (i != 0) {
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
        return DATA_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.Batched$Request$Payload$DataCase valueOf(int i) {
        return forNumber(i);
    }
}
