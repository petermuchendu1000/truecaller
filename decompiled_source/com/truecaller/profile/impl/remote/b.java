package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.profile.api.model.ImageSource.values().length];
        try {
            iArr[com.truecaller.profile.api.model.ImageSource.TRUECALLER.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.profile.api.model.ImageSource.GOOGLE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
