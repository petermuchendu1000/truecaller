package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class y1 {
    public final wj2.b a;
    public final n11.g b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;

    public y1(wj2.b bVar, n11.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "identityConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        this.a = bVar;
        this.b = gVar;
        this.c = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(23));
        this.d = kotlin.LazyKt.lazy(new com.truecaller.wizard.verification.x1(this, 0));
    }

    public final com.moloco.sdk.internal.services.bidtoken.t a(com.truecaller.wizard.verification.u0 u0Var, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "verificationMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryIso");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        if (num != null) {
            str2 = "+" + num + str2;
        }
        if (this.b.g(str)) {
            str3 = "support.eu@truecaller.com";
        } else {
            str3 = "support@truecaller.com";
        }
        java.lang.String str4 = u0Var.c;
        return new com.moloco.sdk.internal.services.bidtoken.t(str3, str4, k9.d.r("You are contacting truecaller support as you are receiving an error as: ", str4, " when signing up using ", str2));
    }

    public final boolean b(com.truecaller.wizard.verification.u0 u0Var, java.lang.String str) {
        java.lang.Boolean bool;
        java.util.List<java.lang.String> countries;
        boolean z;
        java.util.List<java.lang.String> messages;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "verificationMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryCode");
        kotlin.Lazy lazy = this.d;
        com.truecaller.wizard.verification.WizardContactSupportConfig wizardContactSupportConfig = (com.truecaller.wizard.verification.WizardContactSupportConfig) lazy.getValue();
        java.lang.Boolean bool2 = null;
        if (wizardContactSupportConfig != null && (messages = wizardContactSupportConfig.getMessages()) != null) {
            java.util.List<java.lang.String> list = messages;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.y.p((java.lang.String) it.next(), u0Var.a, true)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            bool = java.lang.Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        if (yp.d0.D(bool)) {
            com.truecaller.wizard.verification.WizardContactSupportConfig wizardContactSupportConfig2 = (com.truecaller.wizard.verification.WizardContactSupportConfig) lazy.getValue();
            if (wizardContactSupportConfig2 != null && (countries = wizardContactSupportConfig2.getCountries()) != null) {
                java.util.List<java.lang.String> list2 = countries;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (kotlin.text.y.p((java.lang.String) it3.next(), str, true)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                bool2 = java.lang.Boolean.valueOf(z);
            }
            if (yp.d0.D(bool2)) {
                return true;
            }
        }
        return false;
    }
}
