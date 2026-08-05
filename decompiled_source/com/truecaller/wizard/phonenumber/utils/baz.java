package com.truecaller.wizard.phonenumber.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz implements com.truecaller.wizard.phonenumber.utils.qux {
    public final com.google.i18n.phonenumbers.NumberParseException.ErrorType a;

    public baz(com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType) {
        this.a = errorType;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.wizard.phonenumber.utils.baz) && this.a == ((com.truecaller.wizard.phonenumber.utils.baz) obj).a;
    }

    public final int hashCode() {
        com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType = this.a;
        if (errorType == null) {
            return 0;
        }
        return errorType.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneNumberParseError(errorType=" + this.a + ")";
    }
}
