package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Models$ExpectingOtp$MethodCase {
    SMS(4),
    DROPCALL(5),
    REVERSEOTP(6),
    WHATSAPP(7),
    REVERSEWHATSAPP(8),
    METHOD_NOT_SET(0);

    private final int value;

    Models$ExpectingOtp$MethodCase(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Models$ExpectingOtp$MethodCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 4:
                    return SMS;
                case 5:
                    return DROPCALL;
                case 6:
                    return REVERSEOTP;
                case 7:
                    return WHATSAPP;
                case 8:
                    return REVERSEWHATSAPP;
                default:
                    return null;
            }
        }
        return METHOD_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Models$ExpectingOtp$MethodCase valueOf(int i) {
        return forNumber(i);
    }
}
