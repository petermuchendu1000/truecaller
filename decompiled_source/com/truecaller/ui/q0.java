package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ui/q0;", "Landroidx/lifecycle/n1;", "com/truecaller/ui/k0", "com/truecaller/ui/n0", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q0 extends androidx.lifecycle.n1 {
    public final le2.v b;
    public final kotlin.coroutines.CoroutineContext c;
    public final ig3.v1 d;
    public final ig3.p1 e;

    public q0(le2.v vVar, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "startupDialogRouter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        this.b = vVar;
        this.c = coroutineContext;
        ig3.v1 b = ig3.w1.b(1, 0, (hg3.bar) null, 6);
        b.e(com.truecaller.ui.i0.a);
        this.d = b;
        this.e = ig3.w1.J(new a63.h0(new androidx.room.o(8, b, this), 23), androidx.lifecycle.g1.l(this), ig3.z1.b, 1);
    }
}
