package com.truecaller.api.service.messageclassifier.patterns;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Action$ContentCase {
    URI(4),
    CLIPBOARD_COPY(5),
    CONTENT_NOT_SET(0);

    private final int value;

    Action$ContentCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.service.messageclassifier.patterns.Action$ContentCase forNumber(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    return null;
                }
                return CLIPBOARD_COPY;
            }
            return URI;
        }
        return CONTENT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.service.messageclassifier.patterns.Action$ContentCase valueOf(int i) {
        return forNumber(i);
    }
}
