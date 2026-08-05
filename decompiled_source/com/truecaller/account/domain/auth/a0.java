package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a0 {
    public final com.truecaller.account.domain.auth.v0 a;
    public final qo1.i b;

    public a0(com.truecaller.account.domain.auth.v0 v0Var, qo1.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v0Var, "repo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        this.a = v0Var;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0076, code lost:
    
        if (r13 == r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.y yVar;
        ef3.bar barVar;
        int i;
        com.truecaller.account.domain.auth.v0 v0Var;
        com.truecaller.account.domain.auth.a1 a1Var;
        com.truecaller.account.domain.auth.z0 z0Var;
        com.truecaller.account.domain.auth.a1 a1Var2;
        com.truecaller.account.domain.auth.q1 q1Var;
        java.util.Map map;
        java.util.List list;
        java.util.Iterator it;
        java.lang.Object obj;
        com.truecaller.account.domain.auth.p1 p1Var;
        java.lang.String str3;
        java.lang.Object f;
        java.lang.String str4;
        java.lang.String str5;
        if (quxVar instanceof com.truecaller.account.domain.auth.y) {
            yVar = (com.truecaller.account.domain.auth.y) quxVar;
            int i2 = yVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.C = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = yVar.A;
                barVar = ef3.bar.a;
                i = yVar.C;
                v0Var = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj2);
                                    return obj2;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a1Var2 = yVar.z;
                            od.p.E(obj2);
                            q1Var = (com.truecaller.account.domain.auth.q1) obj2;
                            if (q1Var == null) {
                                str4 = q1Var.a;
                            } else {
                                str4 = null;
                            }
                            if (str4 == null) {
                                str5 = q1Var.a;
                                if (this.b.b.a("featureAuthTokenClientState", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(str5);
                                    sb.append(',');
                                    sb.append(a1Var2.b.getValue());
                                    sb.append(q1Var.b.getValue());
                                    int i3 = a1Var2.c;
                                    int i4 = 9;
                                    if (i3 > 9) {
                                        i3 = 9;
                                    }
                                    sb.append(i3);
                                    int i5 = q1Var.c;
                                    if (i5 <= 9) {
                                        i4 = i5;
                                    }
                                    sb.append(i4);
                                    str5 = sb.toString();
                                }
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                yVar.x = null;
                                yVar.y = null;
                                yVar.z = null;
                                yVar.C = 4;
                                java.lang.Object e = v0Var.e(yVar);
                                if (e == barVar) {
                                    return barVar;
                                }
                                return e;
                            }
                            return str5;
                        }
                        str2 = yVar.y;
                        str = yVar.x;
                        od.p.E(obj2);
                    } else {
                        od.p.E(obj2);
                        return obj2;
                    }
                } else {
                    od.p.E(obj2);
                    if (kotlin.jvm.internal.Intrinsics.b(str, com.truecaller.common.network.util.KnownEndpoints.ACCOUNT.getKey())) {
                        yVar.x = null;
                        yVar.y = null;
                        yVar.C = 1;
                        java.lang.Object e2 = v0Var.e(yVar);
                        if (e2 != barVar) {
                            return e2;
                        }
                    } else {
                        yVar.x = str;
                        yVar.y = str2;
                        yVar.C = 2;
                        obj2 = v0Var.d(yVar);
                    }
                    return barVar;
                }
                a1Var = (com.truecaller.account.domain.auth.a1) obj2;
                z0Var = a1Var.a;
                if (z0Var != null && (map = z0Var.c) != null && (list = (java.util.List) map.get(str)) != null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = it.next();
                            if (((com.truecaller.account.domain.auth.p1) obj).b.a.f(str2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    p1Var = (com.truecaller.account.domain.auth.p1) obj;
                    if (p1Var != null && (str3 = p1Var.a) != null) {
                        yVar.x = null;
                        yVar.y = null;
                        yVar.z = a1Var;
                        yVar.C = 3;
                        f = v0Var.f(z0Var, str3, yVar);
                        if (f != barVar) {
                            obj2 = f;
                            a1Var2 = a1Var;
                            q1Var = (com.truecaller.account.domain.auth.q1) obj2;
                            if (q1Var == null) {
                            }
                            if (str4 == null) {
                            }
                            if (str5 != null) {
                            }
                        }
                        return barVar;
                    }
                }
                a1Var2 = a1Var;
                q1Var = null;
                if (q1Var == null) {
                }
                if (str4 == null) {
                }
                if (str5 != null) {
                }
            }
        }
        yVar = new com.truecaller.account.domain.auth.y(this, quxVar);
        java.lang.Object obj22 = yVar.A;
        barVar = ef3.bar.a;
        i = yVar.C;
        v0Var = this.a;
        if (i == 0) {
        }
        a1Var = (com.truecaller.account.domain.auth.a1) obj22;
        z0Var = a1Var.a;
        if (z0Var != null) {
            it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            p1Var = (com.truecaller.account.domain.auth.p1) obj;
            if (p1Var != null) {
                yVar.x = null;
                yVar.y = null;
                yVar.z = a1Var;
                yVar.C = 3;
                f = v0Var.f(z0Var, str3, yVar);
                if (f != barVar) {
                }
                return barVar;
            }
        }
        a1Var2 = a1Var;
        q1Var = null;
        if (q1Var == null) {
        }
        if (str4 == null) {
        }
        if (str5 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r3.l(r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3.q(r8, r0, r7) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, long j, cy.qux quxVar, ff3.qux quxVar2) {
        com.truecaller.account.domain.auth.z zVar;
        int i;
        if (quxVar2 instanceof com.truecaller.account.domain.auth.z) {
            zVar = (com.truecaller.account.domain.auth.z) quxVar2;
            int i2 = zVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = zVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = zVar.B;
                com.truecaller.account.domain.auth.v0 v0Var = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = zVar.y;
                    quxVar = zVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    zVar.x = quxVar;
                    zVar.y = j;
                    zVar.B = 1;
                }
                if (quxVar != null) {
                    zVar.x = null;
                    zVar.y = j;
                    zVar.B = 2;
                }
                return kotlin.Unit.a;
            }
        }
        zVar = new com.truecaller.account.domain.auth.z(this, quxVar2);
        java.lang.Object obj2 = zVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = zVar.B;
        com.truecaller.account.domain.auth.v0 v0Var2 = this.a;
        if (i == 0) {
        }
        if (quxVar != null) {
        }
        return kotlin.Unit.a;
    }
}
