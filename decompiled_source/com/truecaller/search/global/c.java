package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.search.global.SearchResultOrder.values().length];
        a = iArr;
        try {
            iArr[com.truecaller.search.global.SearchResultOrder.ORDER_CGMT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_CTGM.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_CTMG.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_TCGM.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_TCMG.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_GMCT.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            a[com.truecaller.search.global.SearchResultOrder.ORDER_MCGT.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
