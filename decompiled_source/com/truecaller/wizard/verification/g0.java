package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class g0 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ g0(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                com.truecaller.wizard.verification.l0 l0Var = (com.truecaller.wizard.verification.l0) this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((d.y) obj, "$this$addCallback");
                com.truecaller.wizard.verification.s1 d5 = l0Var.d5();
                java.lang.String j2 = d5.j2();
                java.util.List list = (java.util.List) d5.l0.getValue();
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if ("noConfirmation".equalsIgnoreCase((java.lang.String) it.next())) {
                                j2 = null;
                            }
                        }
                    }
                }
                if (j2 != null) {
                    androidx.fragment.app.g1 childFragmentManager = l0Var.getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager, "manager");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j2, "phoneNumber");
                    com.truecaller.wizard.verification.w wVar = new com.truecaller.wizard.verification.w();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("PhoneNumber", j2);
                    wVar.setArguments(bundle);
                    childFragmentManager.getClass();
                    androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(childFragmentManager);
                    barVar.f(0, wVar, (java.lang.String) null, 1);
                    barVar.m(true, true);
                } else {
                    l0Var.d5().m2();
                }
                return kotlin.Unit.a;
            default:
                com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) this.b;
                if (((java.lang.Throwable) obj) == null) {
                    return kotlin.Unit.a;
                }
                com.truecaller.wizard.verification.v1 v1Var = s1Var.f0;
                com.truecaller.wizard.verification.s sVar = v1Var.a;
                if (sVar instanceof com.truecaller.wizard.verification.k) {
                    s1Var.E2(com.truecaller.wizard.verification.v1.a(v1Var, com.truecaller.wizard.verification.k.a((com.truecaller.wizard.verification.k) sVar, false, 43), null, null, 6));
                }
                return kotlin.Unit.a;
        }
    }
}
