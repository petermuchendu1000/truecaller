package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class i0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.truecaller.ads.provider.holders.AdHolderType.values().length];
        try {
            iArr[com.truecaller.ads.provider.holders.AdHolderType.BANNER_AD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.ads.provider.holders.AdHolderType.NATIVE_AD.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.ads.provider.holders.AdHolderType.HOUSE_AD.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.ads.provider.holders.AdHolderType.CUSTOM_AD.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.ads.adsrouter.ui.AdRouterAdHolderType.values().length];
        try {
            iArr2[com.truecaller.ads.adsrouter.ui.AdRouterAdHolderType.NATIVE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.truecaller.ads.adsrouter.ui.AdRouterAdHolderType.BANNER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.truecaller.ads.adsrouter.ui.AdRouterAdHolderType.VIDEO.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.truecaller.ads.adsrouter.ui.AdRouterAdHolderType.PREMIUM.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
