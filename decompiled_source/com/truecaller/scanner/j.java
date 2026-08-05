package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.scanner.NumberDetectorProcessor$ScanType.values().length];
        a = iArr;
        try {
            iArr[com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_VPA.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PAY.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
