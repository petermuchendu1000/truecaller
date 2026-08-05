package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class s {
    public final java.util.HashMap a = new java.util.HashMap();

    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if ("AFTERCALL".equals(str) || kotlin.text.StringsKt.N(str, "AFTER_CALL", false)) {
            str = "AFTERCALL";
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.a.get(str);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw f63.qux.l(it);
            }
        }
    }
}
