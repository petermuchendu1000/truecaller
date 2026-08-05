package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class x0 extends com.truecaller.search.global.b {
    public final u03.b0 k;

    public x0(u03.b0 b0Var) {
        super(3);
        this.k = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    @Override // com.truecaller.search.global.b
    public final void b(ey2.a aVar, int i) {
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.b1 b1Var = (com.truecaller.search.global.b1) aVar;
        h0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b1Var, "searchResultView");
        if (h0Var.p0) {
            ((com.truecaller.search.global.n0) b1Var).p();
            ((com.truecaller.search.global.w0) b1Var).v(null);
            return;
        }
        com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) h0Var.c0.get(i);
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
        java.lang.String a = message.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "buildMessageText(...)");
        java.lang.String str3 = participant.n;
        java.lang.String str4 = participant.e;
        if (str3 == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "normalizedAddress");
            str = str4;
        } else {
            str = str3;
        }
        java.lang.String C = ak.r0.C(participant);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getDisplayName(...)");
        m03.s sVar = h0Var.f;
        qo1.qux quxVar = h0Var.Q;
        java.lang.Object obj = h0Var.L.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        com.truecaller.common.ui.avatar.AvatarXConfig a2 = com.truecaller.common.ui.avatar.AvatarXConfig.a(new rq0.l(sVar, quxVar, (qo1.k) obj).I(participant), (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, Integer.MAX_VALUE);
        com.truecaller.search.global.n0 n0Var = (com.truecaller.search.global.n0) b1Var;
        n0Var.n(a2);
        com.truecaller.common.ui.listitem.ListItemX listItemX = n0Var.d;
        n0Var.u(C);
        fg0.baz bazVar = h0Var.A;
        if (bazVar.f(participant)) {
            listItemX.T();
        } else {
            listItemX.S(bazVar.c(participant));
        }
        com.truecaller.common.ui.listitem.ListItemX.O(listItemX, h0Var.w.f(message.e.i()).toString());
        if (participant.b != 0) {
            str4 = null;
        }
        ((hg2.b) n0Var.h.getValue()).d2(str4);
        p02.z3 z3Var = h0Var.C;
        z3Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        java.lang.Boolean bool = (java.lang.Boolean) z3Var.d.get(java.lang.Long.valueOf(message.b));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        n0Var.o(z);
        fg3.h0.J(h0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new be1.w(h0Var, b1Var, message, i, (df3.bar) null, 2), 3);
        if (!h0Var.I.i.a.a("featureInsightsFtsSearch", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            boolean t = participant.t();
            int i2 = participant.s;
            if (t) {
                str2 = ((u03.g0) h0Var.i).h(2132017225, h0Var.R.format(java.lang.Integer.valueOf(i2)));
            } else {
                str2 = null;
            }
            n0Var.s(str2, 2131233459, null);
            h0Var.j2(b1Var, a, message, false, new com.truecaller.search.global.b0(new java.lang.Object(), a, 0));
            ne0.baz.m(b1Var, h0Var.k, h0Var.e0, str, C, false);
            ne0.baz.l(b1Var, h0Var.k, h0Var.e0, a, a, false, false);
            return;
        }
        h0Var.j2(b1Var, a, message, true, null);
        ne0.baz.m(b1Var, h0Var.k, h0Var.e0, str, C, true);
    }

    @Override // com.truecaller.search.global.b
    public final boolean c(ey2.a aVar, boolean z) {
        return false;
    }

    @Override // com.truecaller.search.global.b
    public final int i() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int j() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int k() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int l() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int m() {
        return 2131364290;
    }

    @Override // com.truecaller.search.global.b
    public final int n() {
        return 2131364288;
    }

    @Override // com.truecaller.search.global.b
    public final java.lang.String o() {
        return ((u03.g0) this.k).h(2132021625, new java.lang.Object[0]);
    }

    @Override // com.truecaller.search.global.b
    public final int p() {
        return 2131364284;
    }

    @Override // com.truecaller.search.global.b
    public final int q() {
        return 2131364295;
    }
}
