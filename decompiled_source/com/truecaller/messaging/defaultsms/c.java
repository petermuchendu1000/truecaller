package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c {
    public final android.content.Context a;
    public final u03.b b;
    public final qw2.a0 c;
    public final qw2.d0 d;
    public com.truecaller.messaging.defaultsms.a e;

    public c(android.content.Context context, u03.b bVar, qw2.a0 a0Var, qw2.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "permissionsUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "permissionsView");
        this.a = context;
        this.b = bVar;
        this.c = a0Var;
        this.d = d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r3 == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, int i, boolean z, java.lang.String str2, ff3.qux quxVar) {
        com.truecaller.messaging.defaultsms.qux quxVar2;
        java.lang.Object obj;
        int i2;
        java.lang.String str3;
        int i3 = i;
        boolean z2 = z;
        if (quxVar instanceof com.truecaller.messaging.defaultsms.qux) {
            quxVar2 = (com.truecaller.messaging.defaultsms.qux) quxVar;
            int i4 = quxVar2.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                quxVar2.B = i4 - Integer.MIN_VALUE;
                obj = quxVar2.z;
                java.lang.Object obj2 = ef3.bar.a;
                i2 = quxVar2.B;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = quxVar2.y;
                    int i5 = quxVar2.x;
                    od.p.E(obj);
                    z2 = z3;
                    i3 = i5;
                } else {
                    od.p.E(obj);
                    quxVar2.x = i3;
                    quxVar2.y = z2;
                    quxVar2.B = 1;
                    if (this.b.p()) {
                        obj = java.lang.Boolean.TRUE;
                    } else {
                        android.content.Context context = this.a;
                        if (z2) {
                            str3 = context.getString(i3);
                        } else {
                            str3 = null;
                        }
                        android.content.Intent addFlags = com.truecaller.messaging.defaultsms.DefaultSmsActivity.u0(this.a, str, str3, null, str2, true).addFlags(268435456);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                        context.startActivity(addFlags);
                        fg3.j jVar = new fg3.j(1, ef3.e.b(quxVar2));
                        jVar.s();
                        this.e = new com.truecaller.messaging.defaultsms.a(jVar);
                        obj = jVar.r();
                        if (obj == obj2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "frame");
                        }
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    quxVar2.x = i3;
                    quxVar2.y = z2;
                    quxVar2.B = 2;
                    java.lang.Object b = b(i3, quxVar2);
                    if (b == obj2) {
                        return obj2;
                    }
                    return b;
                }
                return java.lang.Boolean.FALSE;
            }
        }
        quxVar2 = new com.truecaller.messaging.defaultsms.qux(this, quxVar);
        obj = quxVar2.z;
        java.lang.Object obj22 = ef3.bar.a;
        i2 = quxVar2.B;
        if (i2 == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(int i, ff3.qux quxVar) {
        com.truecaller.messaging.defaultsms.b bVar;
        int i2;
        if (quxVar instanceof com.truecaller.messaging.defaultsms.b) {
            bVar = (com.truecaller.messaging.defaultsms.b) quxVar;
            int i3 = bVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.z = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.x;
                ef3.bar barVar = ef3.bar.a;
                i2 = bVar.z;
                if (i2 == 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(new java.lang.Integer(i), 3);
                    java.lang.String[] g = this.c.g();
                    java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(g, g.length);
                    bVar.z = 1;
                    obj = this.d.f(permissionRequestOptions, strArr, bVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                return java.lang.Boolean.valueOf(((qw2.j) obj).a);
            }
        }
        bVar = new com.truecaller.messaging.defaultsms.b(this, quxVar);
        java.lang.Object obj2 = bVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i2 = bVar.z;
        if (i2 == 0) {
        }
        return java.lang.Boolean.valueOf(((qw2.j) obj2).a);
    }
}
