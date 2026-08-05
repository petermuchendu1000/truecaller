package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ boolean y;
    public final /* synthetic */ ac1.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ac1.e eVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = eVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.qa.e0 e0Var = new com.truecaller.qa.e0(this.z, barVar, 0);
                e0Var.y = ((java.lang.Boolean) obj).booleanValue();
                return e0Var;
            default:
                com.truecaller.qa.e0 e0Var2 = new com.truecaller.qa.e0(this.z, barVar, 1);
                e0Var2.y = ((java.lang.Boolean) obj).booleanValue();
                return e0Var2;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.x;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        df3.bar barVar = (df3.bar) obj2;
        switch (i) {
            case 0:
                return ((com.truecaller.qa.e0) create(bool, barVar)).invokeSuspend(kotlin.Unit.a);
            default:
                return ((com.truecaller.qa.e0) create(bool, barVar)).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        ac1.e eVar = this.z;
        switch (i) {
            case 0:
                boolean z = this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ((com.truecaller.qa.x) eVar.c).c0("isForceShowSimStepOnVoicemailOnboarding", z);
                return kotlin.Unit.a;
            default:
                boolean z2 = this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                ((com.truecaller.qa.x) eVar.c).c0("isForceShowVoicemailPromoScreen", z2);
                return kotlin.Unit.a;
        }
    }
}
