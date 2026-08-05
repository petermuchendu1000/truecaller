package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Enum b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ n(com.truecaller.blockinglevel.api.BlockLevel blockLevel, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, d3.qux quxVar, int i, int i2) {
        this.a = i2;
        this.b = blockLevel;
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.f = function0;
        this.g = quxVar;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 0:
                ((java.lang.Integer) obj2).getClass();
                int D = v2.f.D(1);
                com.truecaller.blockinglevel.presentation.g0.c((com.truecaller.blockinglevel.api.BlockLevel) this.b, this.c, this.d, (kotlin.jvm.functions.Function1) this.e, (kotlin.jvm.functions.Function0) this.f, (d3.qux) this.g, (v2.n) obj, D);
                return kotlin.Unit.a;
            case 1:
                ((java.lang.Integer) obj2).getClass();
                int D2 = v2.f.D(1);
                com.truecaller.blockinglevel.presentation.g0.d((com.truecaller.blockinglevel.api.BlockLevel) this.b, this.c, this.d, (kotlin.jvm.functions.Function1) this.e, (kotlin.jvm.functions.Function0) this.f, (d3.qux) this.g, (v2.n) obj, D2);
                return kotlin.Unit.a;
            default:
                ((java.lang.Integer) obj2).getClass();
                int D3 = v2.f.D(1);
                dz0.baz.a((com.truecaller.callui.api.model.CallUICallState) this.b, (java.lang.Long) this.e, (m51.bar) this.f, (java.lang.String) this.g, this.c, this.d, (v2.n) obj, D3);
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ n(com.truecaller.callui.api.model.CallUICallState callUICallState, java.lang.Long l, m51.bar barVar, java.lang.String str, boolean z, boolean z2, int i) {
        this.a = 2;
        this.b = callUICallState;
        this.e = l;
        this.f = barVar;
        this.g = str;
        this.c = z;
        this.d = z2;
    }
}
