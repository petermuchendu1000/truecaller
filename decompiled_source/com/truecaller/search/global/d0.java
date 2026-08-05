package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class d0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.search.global.SearchResultOrder.values().length];
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_MCGT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_GMCT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_CTGM.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_CGMT.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_CTMG.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
