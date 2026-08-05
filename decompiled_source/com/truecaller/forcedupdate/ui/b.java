package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.forcedupdate.UpdateType.values().length];
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.REQUIRED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.DISCONTINUED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.NONE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.forcedupdate.UpdateType.OPTIONAL.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
