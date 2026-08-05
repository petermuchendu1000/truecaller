package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.truecaller.blockinglevel.api.BlockLevelVariant.values().length];
        try {
            iArr[com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.blockinglevel.api.BlockLevel.values().length];
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevel.OFF.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevel.BASIC.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.truecaller.blockinglevel.api.BlockLevel.MAX.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
