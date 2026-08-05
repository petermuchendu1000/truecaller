package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ f(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                return ef0.a.u(((com.truecaller.account.domain.auth.g) this.b).a, "auth_config.pb");
            case 1:
                com.truecaller.account.domain.auth.g gVar = ((com.truecaller.account.domain.auth.k) this.b).a;
                fg3.e0 e0Var = gVar.b;
                return t7.f.a(com.truecaller.account.domain.auth.e.a, new u6.i(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(1)), (java.util.List) null, e0Var, new com.truecaller.account.domain.auth.f(gVar, 0), 4);
            case 2:
                return (wj3.k0) ((kotlin.jvm.functions.Function0) this.b).invoke();
            case 3:
                return fg3.h0.b(((com.truecaller.account.domain.auth.u) this.b).a);
            default:
                com.truecaller.account.domain.auth.m1 m1Var = (com.truecaller.account.domain.auth.m1) this.b;
                qc3.bar barVar = m1Var.g;
                java.lang.Object obj = m1Var.f.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return new com.truecaller.account.domain.auth.u1(barVar, (t52.qux) obj);
        }
    }
}
