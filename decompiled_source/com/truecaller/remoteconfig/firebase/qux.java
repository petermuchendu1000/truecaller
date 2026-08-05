package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux implements vj2.c {
    public final qc3.bar a;
    public final qc3.bar b;
    public final kotlin.Lazy c;

    public qux(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "remoteConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "qmConfigsRepo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "environment");
        this.a = barVar;
        this.b = barVar3;
        this.c = kotlin.LazyKt.lazy(kotlin.k.b, new com.truecaller.ads.util.u0(18));
    }

    public final java.lang.Object a(java.lang.String str, kotlinx.serialization.KSerializer kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "deserializationStrategy");
        ((lo1.qux) this.b.get()).getClass();
        java.lang.String a = ((vj2.a) this.a.get()).a(str, "__not_found__");
        if (kotlin.jvm.internal.Intrinsics.b(a, "__not_found__")) {
            a = null;
        }
        if (a == null) {
            return null;
        }
        return hi3.baz.z((zg3.qux) this.c.getValue(), str, a, kSerializer);
    }

    @Override // vj2.c
    public final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        return ((vj2.a) this.a.get()).a(str, "null");
    }

    @Override // vj2.c
    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "defaultValue");
        ((lo1.qux) this.b.get()).getClass();
        return ((vj2.a) this.a.get()).a(str, str2);
    }

    @Override // vj2.c
    public final long e(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        ((lo1.qux) this.b.get()).getClass();
        return ((vj2.a) this.a.get()).getLong(str, j);
    }

    @Override // vj2.c
    public final int g(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        ((lo1.qux) this.b.get()).getClass();
        return ((vj2.a) this.a.get()).getInt(str, i);
    }
}
