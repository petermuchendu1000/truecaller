package com.truecaller.settings.impl.ui.block;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b implements zq2.d {
    public final dj.qux a;

    public b(dj.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "visibility");
        this.a = quxVar;
    }

    @Override // zq2.d
    public final java.lang.Object a(ff3.qux quxVar) {
        return i61.bar.n(yp.k.l(new eo2.qux(9)).a(), this.a, quxVar);
    }

    @Override // zq2.d
    public final com.truecaller.settings.impl.ui.search.SettingCategory b() {
        return com.truecaller.settings.impl.ui.search.SettingCategory.BLOCK;
    }
}
