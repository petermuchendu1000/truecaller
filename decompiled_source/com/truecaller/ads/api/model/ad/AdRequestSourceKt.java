package com.truecaller.ads.api.model.ad;

@kotlin.Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"api"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class AdRequestSourceKt {
    public static final java.lang.String a(com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestSource, "<this>");
        java.lang.String simpleName = kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(adRequestSource.getClass()).getSimpleName();
        if (simpleName == null) {
            return adRequestSource.toString();
        }
        return simpleName;
    }
}
