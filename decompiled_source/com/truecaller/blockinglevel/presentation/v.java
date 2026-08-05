package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.values().length];
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.DEEPLINK.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.ACS_MAX.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.POST_REGISTRATION.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
