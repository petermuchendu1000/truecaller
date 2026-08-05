package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j {
    public final nc0.bar a;

    public j(nc0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = barVar;
    }

    public final void a(kotlin.Pair pair, java.lang.String str, java.lang.String str2, java.util.List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String N;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "entry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "noSearchReason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        com.truecaller.data.entity.messaging.Participant participant = (com.truecaller.data.entity.messaging.Participant) pair.a;
        qx2.mh h = qx2.nh.h();
        java.lang.String str3 = participant.n;
        java.lang.String str4 = participant.e;
        int i = participant.q;
        int i2 = participant.i;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        h.g(!z);
        h.j(participant.r());
        h.n(java.lang.Integer.valueOf(java.lang.Math.max(0, participant.s)));
        h.o(java.lang.Boolean.valueOf(participant.u()));
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        h.l(java.lang.Boolean.valueOf(z2));
        if (i2 == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        h.m(java.lang.Boolean.valueOf(z3));
        h.k(java.lang.Boolean.valueOf(participant.l));
        if ((i & 64) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h.h(java.lang.Boolean.valueOf(z4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "setHasPushData(...)");
        i0.a.w(h, (com.truecaller.data.entity.Contact) pair.b, (java.lang.Integer) null);
        qx2.nh e = h.e();
        hi3.e eVar = new hi3.e(qx2.il.d, qx2.il.e);
        eVar.j((java.util.ArrayList) null);
        hi3.e.d(eVar.b[1], (java.lang.Object) null);
        eVar.c[1] = true;
        eVar.k((java.util.ArrayList) null);
        qx2.il h2 = eVar.h();
        if ((i & 1) == 0) {
            N = null;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "normalizedAddress");
            N = fu.baz.N(str4);
        }
        qx2.w2 h3 = qx2.tk.h();
        h3.A(str4);
        h3.z(h2);
        h3.q(e);
        h3.v(str);
        h3.w(N);
        qx2.tk k = h3.k();
        hi3.e eVar2 = new hi3.e(qx2.kd.m, qx2.kd.n);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        bi3.j0[] j0VarArr = eVar2.b;
        hi3.e.d(j0VarArr[2], uuid);
        ((qx2.jd) eVar2).e = uuid;
        boolean[] zArr = eVar2.c;
        zArr[2] = true;
        bi3.j0 j0Var = j0VarArr[5];
        ((qx2.jd) eVar2).h = str2;
        zArr[5] = true;
        bi3.j0 j0Var2 = j0VarArr[4];
        ((qx2.jd) eVar2).g = "20";
        zArr[4] = true;
        eVar2.g((java.lang.CharSequence) null);
        eVar2.i(false);
        eVar2.j(false);
        eVar2.h(kotlin.collections.x.c(k));
        eVar2.f(list);
        try {
            nc0.a aVar = this.a;
            qx2.kd e2 = eVar2.e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "build(...)");
            aVar.c(e2);
        } catch (bi3.baz e3) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e3);
        }
    }
}
