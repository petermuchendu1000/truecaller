package com.truecaller.ugc;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b {
    public final javax.inject.Provider a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final n11.g d;
    public final aa1.qux e;
    public final kotlin.Lazy f;

    public b(cd3.bar barVar, javax.inject.Provider provider, javax.inject.Provider provider2, n11.g gVar, aa1.qux quxVar, pk0.baz bazVar, android.content.pm.PackageManager packageManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "ugcSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "triggerStateReport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "buildHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.a = barVar;
        this.b = provider;
        this.c = provider2;
        this.d = gVar;
        this.e = quxVar;
        this.f = kotlin.LazyKt.lazy(new by2.a(23, packageManager, bazVar));
    }

    public final boolean a() {
        if (((java.lang.Boolean) this.f.getValue()).booleanValue() && ((n11.l) this.a.get()).j()) {
            n11.g gVar = this.d;
            if (!li.qux.k(gVar)) {
                oo1.f fVar = (oo1.f) this.b.get();
                if (!fVar.Z.n(fVar, oo1.f.i1[53]).isEnabled() && !gVar.f("tr")) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean b() {
        if (a() && ((cl2.m) ((com.truecaller.ugc.c) this.c.get())).y("backup")) {
            return true;
        }
        return false;
    }

    public final void c(boolean z) {
        javax.inject.Provider provider = this.c;
        if (((cl2.m) ((com.truecaller.ugc.c) provider.get())).y("backup") == z) {
            return;
        }
        ((cl2.m) ((com.truecaller.ugc.c) provider.get())).c0("backup", z);
        this.e.invoke(java.lang.Boolean.valueOf(z));
    }
}
