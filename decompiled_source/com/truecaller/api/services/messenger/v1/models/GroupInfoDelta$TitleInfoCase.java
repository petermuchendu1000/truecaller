package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GroupInfoDelta$TitleInfoCase {
    TITLE(1),
    TITLEUNCHANGED(3),
    TITLEINFO_NOT_SET(0);

    private final int value;

    GroupInfoDelta$TitleInfoCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.GroupInfoDelta$TitleInfoCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return null;
                }
                return TITLEUNCHANGED;
            }
            return TITLE;
        }
        return TITLEINFO_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.GroupInfoDelta$TitleInfoCase valueOf(int i) {
        return forNumber(i);
    }
}
