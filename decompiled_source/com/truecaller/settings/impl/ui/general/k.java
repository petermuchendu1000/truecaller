package com.truecaller.settings.impl.ui.general;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k implements zq2.d {
    public final dn2.qux a;

    public k(dn2.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "visibility");
        this.a = quxVar;
    }

    @Override // zq2.d
    public final java.lang.Object a(ff3.qux quxVar) {
        return i61.bar.n(yp.k.l(new ge3.bar(19)).a(), this.a, quxVar);
    }

    @Override // zq2.d
    public final com.truecaller.settings.impl.ui.search.SettingCategory b() {
        return com.truecaller.settings.impl.ui.search.SettingCategory.GENERAL;
    }
}
