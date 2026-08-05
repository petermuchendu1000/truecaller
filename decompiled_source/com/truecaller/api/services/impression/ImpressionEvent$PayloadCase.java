package com.truecaller.api.services.impression;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ImpressionEvent$PayloadCase {
    CAMPAIGN_EVENT(2),
    PAYLOAD_NOT_SET(0);

    private final int value;

    ImpressionEvent$PayloadCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.impression.ImpressionEvent$PayloadCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                return null;
            }
            return CAMPAIGN_EVENT;
        }
        return PAYLOAD_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.impression.ImpressionEvent$PayloadCase valueOf(int i) {
        return forNumber(i);
    }
}
