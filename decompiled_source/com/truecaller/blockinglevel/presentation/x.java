package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.blockinglevel.presentation.PurchaseResult.values().length];
        try {
            iArr[com.truecaller.blockinglevel.presentation.PurchaseResult.SUCCESS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.blockinglevel.presentation.PurchaseResult.FAILURE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.blockinglevel.presentation.PurchaseResult.SHOW_PAYWALL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.blockinglevel.presentation.PurchaseResult.ABORTED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.blockinglevel.presentation.PurchaseResult.PROCESSING.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
