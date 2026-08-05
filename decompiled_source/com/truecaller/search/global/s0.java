package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s0 extends com.truecaller.search.global.b {
    public final u03.b0 k;

    public s0(u03.b0 b0Var) {
        super(3);
        this.k = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.global.b
    public final void b(ey2.a aVar, int i) {
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.c1 c1Var = (com.truecaller.search.global.c1) aVar;
        s42.qux quxVar = h0Var.E;
        u03.f0 f0Var = h0Var.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "searchResultView");
        if (h0Var.p0) {
            ((com.truecaller.search.global.n0) c1Var).p();
            return;
        }
        com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) h0Var.b0.get(i);
        java.lang.String R = ak.r0.R(conversation.l);
        boolean z = false;
        if (R == null || R.length() == 0) {
            R = ((u03.g0) f0Var).h(2132018208, new java.lang.Object[0]);
        }
        java.lang.String str = R;
        com.truecaller.search.global.n0 n0Var = (com.truecaller.search.global.n0) c1Var;
        n0Var.n(com.truecaller.common.ui.avatar.AvatarXConfig.a(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, true, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -38), (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, Integer.MAX_VALUE));
        n0Var.u(str);
        java.lang.String str2 = conversation.i;
        int i2 = conversation.e;
        java.lang.String str3 = conversation.f;
        s42.qux quxVar2 = quxVar;
        java.lang.String b = quxVar2.b(i2, str2, str3, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "<this>");
        if ((conversation.d & 2) != 0) {
            u03.g0 g0Var = (u03.g0) f0Var;
            java.lang.String q = h8.s0.q(g0Var.h(2132018184, new java.lang.Object[0]), " · ", b);
            com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor = com.truecaller.common.ui.listitem.ListItemX.SubtitleColor.DEFAULT;
            com.ironsource.adqualitysdk.sdk.i.bar.D(n0Var, q, subtitleColor, g0Var.d(2131233271), (android.graphics.drawable.Drawable) null, subtitleColor, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.API_FAILED_STATUS_CODE_VALUE);
        } else {
            com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor2 = com.truecaller.common.ui.listitem.ListItemX.SubtitleColor.DEFAULT;
            com.ironsource.adqualitysdk.sdk.i.bar.D(n0Var, b, subtitleColor2, quxVar2.l(conversation), quxVar2.d(i2, str3), subtitleColor2, 96);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
        com.truecaller.common.ui.listitem.ListItemX.O(n0Var.d, quxVar2.b.g(conversation.h.i()).toString());
        if (conversation.I.i() > 0) {
            z = true;
        }
        n0Var.o(z);
        ne0.baz.m(n0Var, h0Var.k, h0Var.e0, str, str, true);
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
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int n() {
        return 2131364283;
    }

    @Override // com.truecaller.search.global.b
    public final java.lang.String o() {
        return ((u03.g0) this.k).h(2132021623, new java.lang.Object[0]);
    }

    @Override // com.truecaller.search.global.b
    public final int p() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int q() {
        return 2131364294;
    }
}
