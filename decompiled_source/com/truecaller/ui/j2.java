package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j2 implements ig3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ j2(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.ui.k2 k2Var;
        int i;
        int i2 = this.a;
        java.lang.Object obj2 = this.b;
        switch (i2) {
            case 0:
                if1.e eVar = (if1.e) obj;
                com.truecaller.ui.TruecallerInit truecallerInit = (com.truecaller.ui.TruecallerInit) obj2;
                if (kotlin.jvm.internal.Intrinsics.b(eVar, if1.d.a)) {
                    truecallerInit.H0().M(com.truecaller.bottombar.BottomBarButtonType.CALLS);
                    truecallerInit.J0().p(com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.CONTACTS);
                    if1.bar barVar2 = truecallerInit.W0;
                    if (barVar2 != null) {
                        barVar2.a.o((java.lang.Object) null);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("floatingToolbarDeeplinkHandler");
                        throw null;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.b(eVar, if1.a.a)) {
                    int i3 = com.truecaller.ui.TruecallerInit.y1;
                    truecallerInit.g1("callTab_contacts");
                } else if (kotlin.jvm.internal.Intrinsics.b(eVar, if1.b.a)) {
                    int i4 = com.truecaller.ui.TruecallerInit.y1;
                    truecallerInit.g1("callTab_favourites");
                } else if (kotlin.jvm.internal.Intrinsics.b(eVar, if1.c.a)) {
                    d91.e eVar2 = truecallerInit.w1;
                    if (eVar2 != null) {
                        truecallerInit.e1(((com.truecaller.ui.view.SearchBarView) eVar2.s).getToolbar());
                        if1.bar barVar3 = truecallerInit.W0;
                        if (barVar3 != null) {
                            barVar3.a.o((java.lang.Object) null);
                            truecallerInit.invalidateOptionsMenu();
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("floatingToolbarDeeplinkHandler");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            case 1:
                com.truecaller.ui.n0 n0Var = (com.truecaller.ui.n0) obj;
                androidx.fragment.app.FragmentActivity fragmentActivity = (com.truecaller.ui.TruecallerInit) obj2;
                if (kotlin.jvm.internal.Intrinsics.b(n0Var, com.truecaller.ui.l0.a)) {
                    fragmentActivity.finish();
                } else if (n0Var instanceof com.truecaller.ui.m0) {
                    int i5 = com.truecaller.ui.TruecallerInit.y1;
                    com.truecaller.ui.q0 q0Var = (com.truecaller.ui.q0) fragmentActivity.h1.getValue();
                    pt2.qux quxVar = ((com.truecaller.ui.m0) n0Var).a;
                    q0Var.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "startupDialogResolver");
                    fg3.h0.J(androidx.lifecycle.g1.l(q0Var), q0Var.c, (fg3.f0) null, new com.truecaller.ui.o0(quxVar, null, 0), 2);
                    j52.b.N(quxVar, fragmentActivity);
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            default:
                if (barVar instanceof com.truecaller.ui.k2) {
                    k2Var = (com.truecaller.ui.k2) barVar;
                    int i6 = k2Var.y;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        k2Var.y = i6 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = k2Var.x;
                        ef3.bar barVar4 = ef3.bar.a;
                        i = k2Var.y;
                        if (i == 0) {
                            if (i == 1) {
                                od.p.E(obj3);
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj3);
                            ig3.j jVar = (ig3.j) obj2;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                k2Var.y = 1;
                                if (jVar.emit(obj, k2Var) == barVar4) {
                                    return barVar4;
                                }
                            }
                        }
                        return kotlin.Unit.a;
                    }
                }
                k2Var = new com.truecaller.ui.k2(this, barVar);
                java.lang.Object obj32 = k2Var.x;
                ef3.bar barVar42 = ef3.bar.a;
                i = k2Var.y;
                if (i == 0) {
                }
                return kotlin.Unit.a;
        }
    }
}
