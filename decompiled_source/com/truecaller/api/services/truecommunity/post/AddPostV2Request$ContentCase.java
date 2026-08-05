package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AddPostV2Request$ContentCase {
    TEXT(1),
    IMAGE(2),
    CONTENT_NOT_SET(0);

    private final int value;

    AddPostV2Request$ContentCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.AddPostV2Request$ContentCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return IMAGE;
            }
            return TEXT;
        }
        return CONTENT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.AddPostV2Request$ContentCase valueOf(int i) {
        return forNumber(i);
    }
}
