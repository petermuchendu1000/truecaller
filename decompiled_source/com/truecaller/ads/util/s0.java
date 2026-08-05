package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class s0 {
    public final java.util.HashMap a = new java.util.HashMap();

    public final java.lang.String a(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if ("AFTERCALL".equals(str) || kotlin.text.StringsKt.N(str, "AFTER_CALL", false)) {
            str = "AFTERCALL";
        }
        if ("AFTERCALL".equals(str)) {
            java.util.HashMap hashMap = this.a;
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            if (str2 == null) {
                if (z) {
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    hashMap.put(str, uuid);
                    return uuid;
                }
                return null;
            }
            return str2;
        }
        return null;
    }
}
