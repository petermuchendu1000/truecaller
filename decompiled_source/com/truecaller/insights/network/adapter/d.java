package com.truecaller.insights.network.adapter;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d {
    public final ix1.b a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;

    public d(ix1.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "environmentHelper");
        this.a = bVar;
        this.b = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(15));
        this.c = kotlin.LazyKt.lazy(new com.truecaller.insights.network.adapter.bar(this, 3));
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, ff3.qux quxVar) {
        return ((com.truecaller.insights.network.adapter.c) this.c.getValue()).a(str, str2, str3, quxVar);
    }
}
