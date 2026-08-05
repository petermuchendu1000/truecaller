package com.truecaller.wizard.phonenumber.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ com.truecaller.wizard.phonenumber.utils.d x;
    public final /* synthetic */ java.lang.String y;
    public final /* synthetic */ com.truecaller.data.country.CountryListDto.bar z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.truecaller.wizard.phonenumber.utils.d dVar, java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, java.lang.String str2, df3.bar barVar2) {
        super(2, barVar2);
        this.x = dVar;
        this.y = str;
        this.z = barVar;
        this.A = str2;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.wizard.phonenumber.utils.c(this.x, this.y, this.z, this.A, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.data.country.CountryListDto.bar barVar = this.z;
        com.truecaller.wizard.phonenumber.utils.d dVar = this.x;
        com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = dVar.b;
        ef3.bar barVar2 = ef3.bar.a;
        od.p.E(obj);
        try {
            java.lang.String a = dVar.a(this.y, barVar, false);
            if ("IN".equalsIgnoreCase(barVar.c) && a.length() < 10) {
                return new com.truecaller.wizard.phonenumber.utils.baz(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_NSN);
            }
            java.lang.String str = this.A;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
            java.lang.String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parse = phoneNumberUtil.parse(a, upperCase);
            boolean isValidNumber = phoneNumberUtil.isValidNumber(parse);
            com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType numberType = phoneNumberUtil.getNumberType(parse);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(numberType, "getNumberType(...)");
            com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberWithReason = phoneNumberUtil.isPossibleNumberWithReason(parse);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(isPossibleNumberWithReason, "isPossibleNumberWithReason(...)");
            return new com.truecaller.wizard.phonenumber.utils.a(isValidNumber, numberType, isPossibleNumberWithReason, ((com.truecaller.wizard.phonenumber.utils.VerificationNumberValidationRulesIndia) dVar.f.getValue()).getNumberTypes());
        } catch (com.google.i18n.phonenumbers.NumberParseException e) {
            return new com.truecaller.wizard.phonenumber.utils.baz(e.getErrorType());
        } catch (com.google.i18n.phonenumbers.MissingMetadataException e2) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
            return new com.truecaller.wizard.phonenumber.utils.baz(null);
        }
    }
}
