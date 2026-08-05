package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class f1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result.values().length];
        try {
            iArr[com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result.SUCCESS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result.PERMISSION_DENIED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result.CANCELED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result.FAILED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
