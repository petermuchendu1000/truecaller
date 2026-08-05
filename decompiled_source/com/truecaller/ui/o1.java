package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class o1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.stats.StatsPeriod.values().length];
        try {
            iArr[com.truecaller.stats.StatsPeriod.LAST_30_DAYS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.stats.StatsPeriod.LAST_3_MONTH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.stats.StatsPeriod.LAST_6_MONTH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.stats.StatsPeriod.THIS_YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.stats.StatsPeriod.ALL_TIME.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
