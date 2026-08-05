package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b {
    public static com.truecaller.google_login.GoogleProfileData a(java.lang.String str) {
        com.truecaller.google_login.GoogleIdTokenPayload o;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "idToken");
        java.lang.String str6 = null;
        try {
            kotlin.o oVar = kotlin.q.b;
            java.lang.String str7 = (java.lang.String) kotlin.collections.CollectionsKt.X(1, kotlin.text.StringsKt.g0(str, new java.lang.String[]{"."}, 0, 6));
            if (str7 != null) {
                byte[] decode = android.util.Base64.decode(str7, 8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, kotlin.text.Charsets.UTF_8));
                o = new com.truecaller.google_login.GoogleIdTokenPayload(jSONObject.optString("sub"), jSONObject.optString("email"), jSONObject.optString("picture"), jSONObject.optString("given_name"), jSONObject.optString("family_name"));
            } else {
                o = null;
            }
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        java.lang.Throwable a = kotlin.q.a(o);
        if (a != null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
        }
        if (o instanceof kotlin.p) {
            o = null;
        }
        com.truecaller.google_login.GoogleIdTokenPayload googleIdTokenPayload = o;
        if (googleIdTokenPayload != null) {
            str2 = googleIdTokenPayload.getSub();
        } else {
            str2 = null;
        }
        if (googleIdTokenPayload != null) {
            str3 = googleIdTokenPayload.getGiven_name();
        } else {
            str3 = null;
        }
        if (googleIdTokenPayload != null) {
            str4 = googleIdTokenPayload.getFamily_name();
        } else {
            str4 = null;
        }
        if (googleIdTokenPayload != null) {
            str5 = googleIdTokenPayload.getEmail();
        } else {
            str5 = null;
        }
        if (googleIdTokenPayload != null) {
            str6 = googleIdTokenPayload.getPicture();
        }
        return new com.truecaller.google_login.GoogleProfileData(str, str2, str3, str4, str5, str6);
    }
}
