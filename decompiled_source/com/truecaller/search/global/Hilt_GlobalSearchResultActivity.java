package com.truecaller.search.global;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class Hilt_GlobalSearchResultActivity extends com.truecaller.ui.FragmentActivityBase {
    public boolean i0 = false;

    public Hilt_GlobalSearchResultActivity() {
        addOnContextAvailableListener(new com.truecaller.search.global.v0(this));
    }

    @Override // com.truecaller.ui.Hilt_FragmentActivityBase
    public final void t0() {
        if (!this.i0) {
            this.i0 = true;
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = (com.truecaller.search.global.GlobalSearchResultActivity) this;
            tx.e eVar = (com.truecaller.search.global.l0) X3();
            tx.w wVar = eVar.f;
            globalSearchResultActivity.e0 = (qw2.a0) wVar.x6.get();
            globalSearchResultActivity.f0 = (qw2.d0) wVar.l5.get();
            globalSearchResultActivity.g0 = (qo1.m) wVar.F2.get();
            globalSearchResultActivity.k0 = (tx.c) eVar.N0.get();
            globalSearchResultActivity.l0 = (q83.a) wVar.Sb.get();
            globalSearchResultActivity.m0 = (qo1.r) wVar.V3.get();
        }
    }
}
