package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class baz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.forcedupdate.UpdateType.values().length];
        a = iArr;
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.REQUIRED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.truecaller.forcedupdate.UpdateType.DISCONTINUED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
