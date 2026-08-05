package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class bar {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.values().length];
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.SMS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.DROPCALL.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.REVERSEOTP.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.WHATSAPP.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.REVERSEWHATSAPP.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.METHOD_NOT_SET.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.values().length];
        try {
            iArr2[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.RESPONSE_NOT_SET.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.values().length];
        try {
            iArr3[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.RESPONSE_NOT_SET.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr3[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.values().length];
        try {
            iArr4[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            iArr4[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.RESPONSE_NOT_SET.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
