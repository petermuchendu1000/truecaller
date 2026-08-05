package com.truecaller.settings.impl.ui.voicemail;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux implements zq2.d {
    public final le2.v a;

    public qux(le2.v vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "visibility");
        this.a = vVar;
    }

    @Override // zq2.d
    public final java.lang.Object a(ff3.qux quxVar) {
        return i61.bar.n(yp.k.l(new sr2.k(15)).a(), this.a, quxVar);
    }

    @Override // zq2.d
    public final com.truecaller.settings.impl.ui.search.SettingCategory b() {
        return com.truecaller.settings.impl.ui.search.SettingCategory.VOICEMAIL;
    }
}
