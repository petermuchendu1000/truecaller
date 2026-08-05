package com.truecaller.insights.network.adapter;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux {
    public final ix1.b a;
    public final kotlin.Lazy b;

    public qux(ix1.b bVar, int i) {
        switch (i) {
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "environmentHelper");
                this.a = bVar;
                this.b = kotlin.LazyKt.lazy(new com.truecaller.insights.network.adapter.bar(this, 1));
                return;
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "environmentHelper");
                this.a = bVar;
                this.b = kotlin.LazyKt.lazy(new com.truecaller.insights.network.adapter.bar(this, 2));
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "environmentHelper");
                this.a = bVar;
                this.b = kotlin.LazyKt.lazy(new com.truecaller.insights.network.adapter.bar(this, 0));
                return;
        }
    }

    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, df3.bar barVar) {
        return ((com.truecaller.insights.network.adapter.baz) this.b.getValue()).a(str, str2, str3, barVar);
    }

    public java.lang.Object b(ix1.bar barVar) {
        com.truecaller.insights.network.adapter.b bVar = (com.truecaller.insights.network.adapter.b) this.b.getValue();
        ix1.b bVar2 = this.a;
        return bVar.a(bVar2.f, bVar2.b(), barVar);
    }

    public java.lang.Object c(java.lang.String str, java.lang.String str2, java.lang.String str3, tx0.s sVar) {
        return ((com.truecaller.insights.network.adapter.a) this.b.getValue()).a(str, str2, str3, sVar);
    }
}
