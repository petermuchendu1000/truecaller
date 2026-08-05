package com.truecaller.qa.premium;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class bar {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.qa.premium.QaPremiumReportDialog.Type.values().length];
        try {
            iArr[com.truecaller.qa.premium.QaPremiumReportDialog.Type.PREMIUM_REPORT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.qa.premium.QaPremiumReportDialog.Type.PRODUCTS_REPORT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.qa.premium.QaPremiumReportDialog.Type.DISCOUNT_STRINGS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
