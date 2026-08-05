package com.truecaller.account.domain.attestation.data;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.account.domain.attestation.AttestationEngine.values().length];
        try {
            iArr[com.truecaller.account.domain.attestation.AttestationEngine.SAFETY_DETECT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.account.domain.attestation.AttestationEngine.PLAY_INTEGRITY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
