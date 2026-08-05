package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class y0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.values().length];
        try {
            iArr[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.ONBOARDED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.ATTESTATIONREQUIRED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.EXPECTINGOTP.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase.ERROR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.values().length];
        try {
            iArr2[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.ONBOARDED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase.ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.values().length];
        try {
            iArr3[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.ONBOARDED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr3[com.truecaller.accountonboarding.v1.Service.VerifyReverseOtpResponse.ResponseCase.ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.values().length];
        try {
            iArr4[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.SMS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr4[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.WHATSAPP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            iArr4[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.DROPCALL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            iArr4[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.REVERSEOTP.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        try {
            iArr4[com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase.REVERSEWHATSAPP.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused13) {
        }
        d = iArr4;
    }
}
