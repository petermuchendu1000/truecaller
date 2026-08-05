package com.truecaller.wizard.phonenumber.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a implements com.truecaller.wizard.phonenumber.utils.qux {
    public final boolean a;
    public final com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType b;
    public final com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult c;
    public final java.util.List d;
    public final boolean e;

    public a(boolean z, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType, com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult validationResult, java.util.List list) {
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberType, "phoneNumberType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "acceptedNumberTypes");
        this.a = z;
        this.b = phoneNumberType;
        this.c = validationResult;
        this.d = list;
        if (z) {
            java.util.List list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.b((java.lang.String) it.next(), this.b.name())) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        this.e = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.phonenumber.utils.a)) {
            return false;
        }
        com.truecaller.wizard.phonenumber.utils.a aVar = (com.truecaller.wizard.phonenumber.utils.a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && kotlin.jvm.internal.Intrinsics.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int i;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (i * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "PhoneNumberParseSuccess(isValid=" + this.a + ", phoneNumberType=" + this.b + ", validationResult=" + this.c + ", acceptedNumberTypes=" + this.d + ")";
    }
}
