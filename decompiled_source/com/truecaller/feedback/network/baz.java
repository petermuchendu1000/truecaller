package com.truecaller.feedback.network;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.lang.CharSequence A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String C;
    public final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.t D;
    public final /* synthetic */ java.lang.CharSequence x;
    public final /* synthetic */ java.lang.CharSequence y;
    public final /* synthetic */ java.lang.CharSequence z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.String str, java.lang.String str2, com.moloco.sdk.internal.services.bidtoken.t tVar, df3.bar barVar) {
        super(2, barVar);
        this.x = charSequence;
        this.y = charSequence2;
        this.z = charSequence3;
        this.A = charSequence4;
        this.B = str;
        this.C = str2;
        this.D = tVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.feedback.network.baz(this.x, this.y, this.z, this.A, this.B, this.C, this.D, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wj3.k0 H;
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        com.moloco.sdk.internal.services.bidtoken.t tVar = this.D;
        try {
            H = com.truecaller.feedback.network.a.a(this.x, this.y, this.z, this.A, this.B, this.C, ((u03.b) tVar.b).i(), null).H();
        } catch (java.io.IOException unused) {
        }
        if (H.a.k()) {
            return com.truecaller.feedback.network.h.a;
        }
        java.lang.Object obj2 = ((qc3.bar) tVar.d).get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        com.truecaller.feedback.network.FeedbackErrorResponse feedbackErrorResponse = (com.truecaller.feedback.network.FeedbackErrorResponse) qe0.i1.n(H, (com.google.gson.Gson) obj2, com.truecaller.feedback.network.FeedbackErrorResponse.class);
        if (feedbackErrorResponse != null) {
            switch (feedbackErrorResponse.getReason()) {
                case com.truecaller.feedback.network.FeedbackErrorResponse.REASON_EMPTY_MESSAGE /* 40001 */:
                    return com.truecaller.feedback.network.c.a;
                case com.truecaller.feedback.network.FeedbackErrorResponse.REASON_EMPTY_EMAIL /* 40002 */:
                    return com.truecaller.feedback.network.b.a;
                case com.truecaller.feedback.network.FeedbackErrorResponse.REASON_INVALID_EMAIL /* 40003 */:
                    return com.truecaller.feedback.network.e.a;
                case com.truecaller.feedback.network.FeedbackErrorResponse.REASON_FORBIDDEN_EMAIL /* 40004 */:
                    return com.truecaller.feedback.network.d.a;
            }
        }
        return com.truecaller.feedback.network.f.a;
    }
}
