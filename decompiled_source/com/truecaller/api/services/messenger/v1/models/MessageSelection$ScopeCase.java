package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MessageSelection$ScopeCase {
    MARKED(1),
    PEER(2),
    SCOPE_NOT_SET(0);

    private final int value;

    MessageSelection$ScopeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.MessageSelection$ScopeCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PEER;
            }
            return MARKED;
        }
        return SCOPE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.MessageSelection$ScopeCase valueOf(int i) {
        return forNumber(i);
    }
}
