package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.wizard.WizardVerificationMode.values().length];
        try {
            iArr[com.truecaller.wizard.WizardVerificationMode.PRIMARY_NUMBER.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.wizard.WizardVerificationMode.CHANGE_NUMBER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.wizard.WizardVerificationMode.SECONDARY_NUMBER.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
