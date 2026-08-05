package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class j0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.values().length];
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.CONTROL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_OFF.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_BASIC.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_MAX.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_OFF_BUTTON.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_BASIC_BUTTON.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_MAX_BUTTON.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_OFF_CARD.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_BASIC_CARD.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_MAX_CARD.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_OFF_FRAUD.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_BASIC_FRAUD.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        try {
            iArr[com.truecaller.blockinglevel.api.internal.BlockLevelConfig.DEFAULT_MAX_FRAUD.ordinal()] = 13;
        } catch (java.lang.NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
