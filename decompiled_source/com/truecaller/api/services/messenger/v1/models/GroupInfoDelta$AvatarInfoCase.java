package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GroupInfoDelta$AvatarInfoCase {
    AVATAR(2),
    AVATARUNCHANGED(4),
    AVATARINFO_NOT_SET(0);

    private final int value;

    GroupInfoDelta$AvatarInfoCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.GroupInfoDelta$AvatarInfoCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    return null;
                }
                return AVATARUNCHANGED;
            }
            return AVATAR;
        }
        return AVATARINFO_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.GroupInfoDelta$AvatarInfoCase valueOf(int i) {
        return forNumber(i);
    }
}
