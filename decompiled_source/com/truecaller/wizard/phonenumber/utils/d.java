package com.truecaller.wizard.phonenumber.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d {
    public final kotlin.coroutines.CoroutineContext a;
    public final com.google.i18n.phonenumbers.PhoneNumberUtil b;
    public final t41.t c;
    public final wj2.b d;
    public final javax.inject.Provider e;
    public final kotlin.Lazy f;

    public d(kotlin.coroutines.CoroutineContext coroutineContext, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, t41.t tVar, wj2.b bVar, cd3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberUtil, "phoneNumberUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "identityConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "truecallerAccountManager");
        this.a = coroutineContext;
        this.b = phoneNumberUtil;
        this.c = tVar;
        this.d = bVar;
        this.e = barVar;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.wizard.phonenumber.utils.b
            public final java.lang.Object invoke() {
                com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia o;
                com.truecaller.wizard.phonenumber.utils.d dVar = com.truecaller.wizard.phonenumber.utils.d.this;
                com.google.gson.Gson gson = new com.google.gson.Gson();
                try {
                    kotlin.o oVar = kotlin.q.b;
                    java.lang.String d = dVar.d.a.d("verificationNumberValidationRulesIndia_53882", "");
                    if (d.length() == 0) {
                        d = null;
                    }
                    if (d != null) {
                        o = (com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia) gson.fromJson(d, com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia.class);
                    } else {
                        o = null;
                    }
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                if (o instanceof kotlin.p) {
                    o = null;
                }
                com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia verificationNumberValidationRulesIndia = o;
                if (verificationNumberValidationRulesIndia == null) {
                    return new com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia(false, null, 3, null);
                }
                return verificationNumberValidationRulesIndia;
            }
        });
    }

    public static java.lang.String d(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar) {
        java.lang.String q = k9.d.q("00", barVar.d);
        if (kotlin.text.y.w(str, q, false)) {
            java.lang.String substring = str.substring(q.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        if (kotlin.text.y.w(str, "00", false)) {
            java.lang.String substring2 = str.substring(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return substring2;
        }
        return str;
    }

    public final java.lang.String a(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, boolean z) {
        boolean isDigit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        int i = 0;
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i2 = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                int i3 = i2 + 1;
                if (i2 == 0 && charAt == '+') {
                    isDigit = true;
                } else {
                    isDigit = java.lang.Character.isDigit(charAt);
                }
                if (isDigit) {
                    sb.append(charAt);
                }
                i++;
                i2 = i3;
            }
            return sb.toString();
        }
        if (kotlin.text.y.w(str, "+", false)) {
            str = kotlin.text.y.u(str, "+", "00");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int length = str.length();
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (java.lang.Character.isDigit(charAt2)) {
                sb2.append(charAt2);
            }
            i++;
        }
        java.lang.String sb4 = sb2.toString();
        if (barVar != null) {
            return d(sb4, barVar);
        }
        return sb4;
    }

    public final boolean b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        if (str.length() >= 5) {
            for (int i = 0; i < str.length(); i++) {
                if (java.lang.Character.isDigit(str.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.Object c(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, ff3.qux quxVar) {
        java.lang.String str2 = barVar.c;
        if (str2 == null) {
            return new com.truecaller.wizard.phonenumber.utils.baz(com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE);
        }
        return fg3.h0.W(this.a, new com.truecaller.wizard.phonenumber.utils.c(this, str, barVar, str2, null), quxVar);
    }

    public final boolean e(com.truecaller.data.country.CountryListDto.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY);
        if ("IN".equalsIgnoreCase(barVar.c) && ((com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia) this.f.getValue()).getIsEnabled()) {
            return true;
        }
        return false;
    }
}
