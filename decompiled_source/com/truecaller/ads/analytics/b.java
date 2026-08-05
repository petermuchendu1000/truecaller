package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class b {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.truecaller.ads.analytics.d(1));
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new com.truecaller.ads.analytics.d(2));

    public static java.lang.String a(java.lang.String str) {
        java.lang.String J;
        java.lang.String value;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String k0 = kotlin.text.StringsKt.k0(':', str, str);
        java.lang.Object obj2 = null;
        if (kotlin.jvm.internal.Intrinsics.b(k0, str)) {
            k0 = null;
        }
        if (k0 == null || (obj = kotlin.text.StringsKt.u0(k0).toString()) == null || (J = kotlin.text.c0.J(80, obj)) == null) {
            J = kotlin.text.c0.J(80, str);
        }
        java.util.List list = (java.util.List) b.getValue();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (new kotlin.text.Regex(((com.truecaller.ads.analytics.AdErrorMap) next).getMsg()).f(J)) {
                    obj2 = next;
                    break;
                }
            }
            com.truecaller.ads.analytics.AdErrorMap adErrorMap = (com.truecaller.ads.analytics.AdErrorMap) obj2;
            if (adErrorMap != null && (value = adErrorMap.getValue()) != null) {
                return value;
            }
        }
        return J;
    }
}
