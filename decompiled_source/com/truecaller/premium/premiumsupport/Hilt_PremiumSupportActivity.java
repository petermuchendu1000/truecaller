package com.truecaller.premium.premiumsupport;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class Hilt_PremiumSupportActivity extends com.truecaller.ui.FragmentActivityBase {
    public boolean i0 = false;

    public Hilt_PremiumSupportActivity() {
        addOnContextAvailableListener(new ps2.baz(this, 25));
    }

    public final void t0() {
        if (!this.i0) {
            this.i0 = true;
            com.truecaller.premium.premiumsupport.PremiumSupportActivity premiumSupportActivity = (com.truecaller.premium.premiumsupport.PremiumSupportActivity) this;
            tx.w wVar = ((ub2.bar) X3()).f;
            ((com.truecaller.ui.FragmentActivityBase) premiumSupportActivity).e0 = (qw2.a0) wVar.x6.get();
            ((com.truecaller.ui.FragmentActivityBase) premiumSupportActivity).f0 = (qw2.d0) wVar.l5.get();
            ((com.truecaller.ui.FragmentActivityBase) premiumSupportActivity).g0 = (qo1.m) wVar.F2.get();
            tx.w wVar2 = wVar.b.a;
            premiumSupportActivity.j0 = new ab1.qux((np1.baz) wVar2.Qm.get(), wVar2.j3(), (kotlin.coroutines.CoroutineContext) wVar2.P.get(), (kotlin.coroutines.CoroutineContext) wVar2.V1.get());
        }
    }
}
