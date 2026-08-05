package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class l1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.ui.StatsType.values().length];
        try {
            iArr[com.truecaller.ui.StatsType.SHOWN.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.ui.StatsType.FILTER_CHANGED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.ui.StatsType.SHARE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
