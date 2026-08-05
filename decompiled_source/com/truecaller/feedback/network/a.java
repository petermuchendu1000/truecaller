package com.truecaller.feedback.network;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j31.n, java.lang.Object] */
    public static final wj3.a a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "subject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "premiumLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "deviceName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Truecaller", "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("26.28.5", "appDisplayableVersionName");
        java.lang.String str5 = android.os.Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "";
        }
        com.truecaller.feedback.network.Feedback feedback = new com.truecaller.feedback.network.Feedback(charSequence2.toString(), kotlin.text.y.s(kotlin.text.s.e("\n            |FEEDBACK FORM ANDROID " + str + "\n            |Name: " + ((java.lang.Object) charSequence) + "\n            |Subject: " + ((java.lang.Object) charSequence3) + "\n            |Device Name: " + str3 + "\n            |Android OS Version: " + str5 + "\n            |Truecaller Version: 26.28.5\n            |Feedback:\n            |\n            |" + ((java.lang.Object) charSequence4) + " " + str2 + "\n            |"), "\n", "\r\n", false));
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.FEEDBACK);
        obj.g(com.truecaller.feedback.network.qux.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, str4);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        return ((com.truecaller.feedback.network.qux) obj.d(com.truecaller.feedback.network.qux.class)).a(feedback);
    }
}
