package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class d2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.bottombar.BottomBarButtonType.values().length];
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.ASSISTANT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.VOICEMAIL.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.CALLS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.MESSAGES.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.BLOCKING.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.FAMILY_PROTECTION_CONFIG.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.PREMIUM.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.INVITE.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr[com.truecaller.bottombar.BottomBarButtonType.SCAM_FEED.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
