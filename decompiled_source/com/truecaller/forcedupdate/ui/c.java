package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.forcedupdate.UpdateType.values().length];
        a = iArr;
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.OPTIONAL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.truecaller.forcedupdate.UpdateType.REQUIRED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.truecaller.forcedupdate.UpdateType.DISCONTINUED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
