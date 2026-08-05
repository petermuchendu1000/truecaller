package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.push.PushProviderService.values().length];
        try {
            iArr[com.truecaller.push.PushProviderService.GMS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.push.PushProviderService.HMS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
