package com.truecaller.acs.ui.widgets.avatar;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class bar {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.values().length];
        try {
            iArr[com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.FACS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.PACS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
