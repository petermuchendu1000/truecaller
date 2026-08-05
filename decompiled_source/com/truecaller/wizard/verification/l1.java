package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l1 implements ig3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig3.j b;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 c;

    public /* synthetic */ l1(ig3.j jVar, com.truecaller.wizard.verification.s1 s1Var, int i) {
        this.a = i;
        this.b = jVar;
        this.c = s1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.wizard.verification.k1 k1Var;
        int i;
        com.truecaller.wizard.verification.n1 n1Var;
        int i2;
        java.lang.String str;
        java.lang.Character G;
        int i3 = this.a;
        com.truecaller.wizard.verification.s1 s1Var = this.c;
        ig3.j jVar = this.b;
        switch (i3) {
            case 0:
                if (barVar instanceof com.truecaller.wizard.verification.k1) {
                    k1Var = (com.truecaller.wizard.verification.k1) barVar;
                    int i4 = k1Var.y;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        k1Var.y = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = k1Var.x;
                        ef3.bar barVar2 = ef3.bar.a;
                        i = k1Var.y;
                        if (i == 0) {
                            if (i == 1) {
                                od.p.E(obj2);
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj2);
                            if (((java.lang.String) obj).length() > 0 && s1Var.P > 0) {
                                k1Var.y = 1;
                                if (jVar.emit(obj, k1Var) == barVar2) {
                                    return barVar2;
                                }
                            }
                        }
                        return kotlin.Unit.a;
                    }
                }
                k1Var = new com.truecaller.wizard.verification.k1(this, barVar);
                java.lang.Object obj22 = k1Var.x;
                ef3.bar barVar22 = ef3.bar.a;
                i = k1Var.y;
                if (i == 0) {
                }
                return kotlin.Unit.a;
            default:
                if (barVar instanceof com.truecaller.wizard.verification.n1) {
                    n1Var = (com.truecaller.wizard.verification.n1) barVar;
                    int i5 = n1Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        n1Var.y = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = n1Var.x;
                        ef3.bar barVar3 = ef3.bar.a;
                        i2 = n1Var.y;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                od.p.E(obj3);
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj3);
                            java.lang.String str2 = (java.lang.String) ((kotlin.Pair) obj).a;
                            java.lang.String str3 = s1Var.Q;
                            if (str3 != null) {
                                java.util.List f0 = kotlin.text.StringsKt.f0(str3, new char[]{','}, 6);
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(f0, 10));
                                java.util.Iterator it = f0.iterator();
                                while (it.hasNext()) {
                                    java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull((java.lang.String) it.next());
                                    if (intOrNull != null && (G = kotlin.text.c0.G((str2.length() - intOrNull.intValue()) - 1, str2)) != null) {
                                        arrayList.add(G);
                                    }
                                }
                                str = kotlin.collections.CollectionsKt.b0(arrayList, "", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62);
                                n1Var.y = 1;
                                if (jVar.emit(str, n1Var) == barVar3) {
                                    return barVar3;
                                }
                            }
                            str = null;
                            n1Var.y = 1;
                            if (jVar.emit(str, n1Var) == barVar3) {
                            }
                        }
                        return kotlin.Unit.a;
                    }
                }
                n1Var = new com.truecaller.wizard.verification.n1(this, barVar);
                java.lang.Object obj32 = n1Var.x;
                ef3.bar barVar32 = ef3.bar.a;
                i2 = n1Var.y;
                if (i2 == 0) {
                }
                return kotlin.Unit.a;
        }
    }
}
