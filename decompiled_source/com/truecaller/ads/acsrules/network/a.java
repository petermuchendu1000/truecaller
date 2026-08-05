package com.truecaller.ads.acsrules.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0) new java.lang.Object());

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, ff3.qux quxVar) {
        com.truecaller.ads.acsrules.network.baz bazVar;
        int i;
        wj3.k0 k0Var;
        if (quxVar instanceof com.truecaller.ads.acsrules.network.baz) {
            bazVar = (com.truecaller.ads.acsrules.network.baz) quxVar;
            int i2 = bazVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.ads.acsrules.network.qux quxVar2 = new com.truecaller.ads.acsrules.network.qux(this, str, null);
                    bazVar.z = 1;
                    obj = ak.r0.h0(quxVar2, bazVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                k0Var = (wj3.k0) obj;
                if (k0Var != null || !k0Var.a.k()) {
                    return null;
                }
                return (com.truecaller.ads.acsrules.model.AcsRulesResponse) k0Var.b;
            }
        }
        bazVar = new com.truecaller.ads.acsrules.network.baz(this, quxVar);
        java.lang.Object obj2 = bazVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = bazVar.z;
        if (i == 0) {
        }
        k0Var = (wj3.k0) obj2;
        if (k0Var != null) {
        }
        return null;
    }
}
