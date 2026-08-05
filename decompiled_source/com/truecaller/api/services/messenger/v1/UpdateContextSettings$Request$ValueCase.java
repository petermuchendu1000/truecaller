package com.truecaller.api.services.messenger.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum UpdateContextSettings$Request$ValueCase {
    UPDATE_GLOBAL_CONTEXT(1),
    UPDATE_ONE_TO_ONE_CONTEXT(2),
    UPDATE_GROUP_CONTEXT(3),
    VALUE_NOT_SET(0);

    private final int value;

    UpdateContextSettings$Request$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.UpdateContextSettings$Request$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UPDATE_GROUP_CONTEXT;
                }
                return UPDATE_ONE_TO_ONE_CONTEXT;
            }
            return UPDATE_GLOBAL_CONTEXT;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.UpdateContextSettings$Request$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
