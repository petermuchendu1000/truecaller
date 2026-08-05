package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.common.account.Region.values().length];
        try {
            iArr[com.truecaller.common.account.Region.REGION_ZA.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.common.account.Region.REGION_BR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
