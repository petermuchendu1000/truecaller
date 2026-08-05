package com.truecaller.wizard.countries;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends of0.baz implements o83.h {
    public final kotlin.coroutines.CoroutineContext d;
    public final kotlin.coroutines.CoroutineContext e;
    public final o83.baz f;
    public final o83.x g;
    public final m81.bar h;
    public final u03.b0 i;
    public final ig3.h2 j;
    public java.util.List k;
    public java.lang.String l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, o83.baz bazVar, o83.x xVar, m81.bar barVar, u03.b0 b0Var) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "countriesHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "filter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "countryFlagProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        this.d = coroutineContext;
        this.e = coroutineContext2;
        this.f = bazVar;
        this.g = xVar;
        this.h = barVar;
        this.i = b0Var;
        xVar.d = new nr0.qux(this, 12);
        this.j = ig3.w1.c(kotlin.collections.h0.a);
        this.l = "";
        this.n = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(java.lang.Object obj) {
        o83.d dVar = (o83.d) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "presenterView");
        this.a = dVar;
        ig3.w1.F(new androidx.room.o(25, ig3.w1.D(new ke1.h0(new kl1.g(this.j, 9), this, 11), this.e), new o32.d(this, (df3.bar) null, 4)), this);
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new lo1.bar(this, (df3.bar) null, 28), 3);
    }
}
