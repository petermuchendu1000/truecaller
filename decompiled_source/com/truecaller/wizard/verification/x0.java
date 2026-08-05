package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class x0 implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 b;

    public /* synthetic */ x0(com.truecaller.wizard.verification.s1 s1Var, int i) {
        this.a = i;
        this.b = s1Var;
    }

    public final java.lang.Object invoke() {
        java.util.Map o;
        int i = this.a;
        com.truecaller.wizard.verification.s1 s1Var = this.b;
        switch (i) {
            case 0:
                com.google.gson.Gson gson = new com.google.gson.Gson();
                try {
                    kotlin.o oVar = kotlin.q.b;
                    o = (java.util.Map) gson.fromJson(((wj2.b) s1Var.x.get()).a.d("verificationFallbackConfig_46215", ""), new com.truecaller.wizard.verification.z0().getType());
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                if (o instanceof kotlin.p) {
                    o = null;
                }
                java.util.Map map = o;
                if (map == null) {
                    return kotlin.collections.r0.f();
                }
                return map;
            case 1:
                return kotlin.text.StringsKt.f0(((wj2.b) s1Var.x.get()).a.d("verificationAbandonedConfig_51657", ""), new char[]{','}, 6);
            case 2:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.b(s1Var.N, "reverse_otp"));
            case 3:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.b(s1Var.N, "reverse_whatsapp"));
            case 4:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.b(s1Var.N, "reverse_otp"));
            case 5:
                return java.lang.Boolean.valueOf(com.truecaller.wizard.verification.s1.l2(s1Var.N));
            case 6:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.b(s1Var.N, "reverse_otp"));
            default:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.b(s1Var.N, "reverse_otp"));
        }
    }
}
