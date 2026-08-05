package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class baz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[com.truecaller.blockinglevel.api.BlockLevelVariant.values().length];
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelVariant.BUTTON.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelVariant.CARD.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.values().length];
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.DEEPLINK.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.ACS_MAX.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevelLaunchContext.POST_REGISTRATION.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[com.truecaller.blockinglevel.api.BlockLevel.values().length];
        try {
            iArr3[com.truecaller.blockinglevel.api.BlockLevel.OFF.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr3[com.truecaller.blockinglevel.api.BlockLevel.BASIC.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr3[com.truecaller.blockinglevel.api.BlockLevel.MAX.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
