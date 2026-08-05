package com.truecaller.filters.blockedevents;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends com.truecaller.sdk.bar implements ib1.bar {
    public final /* synthetic */ int b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;

    public qux(n11.g gVar, tc1.bar barVar, oc1.bar barVar2) {
        this.b = 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "detailsViewStateEventAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "detailsViewTTFDTracker");
        this.c = gVar;
        this.d = barVar;
        this.e = barVar2;
    }

    public void m1() {
        switch (this.b) {
            case 1:
                ((com.truecaller.sdk.bar) this).a = null;
                java.lang.Runnable runnable = (k0.d) this.e;
                if (runnable != null) {
                    ((android.os.Handler) this.d).removeCallbacks(runnable);
                    return;
                }
                return;
            default:
                super.m1();
                return;
        }
    }

    public qux(to1.g gVar, to1.k kVar, nd.j0 j0Var) {
        this.b = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "filterSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "adjuster");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "workManager");
        this.c = gVar;
        this.d = kVar;
        this.e = j0Var;
    }

    public qux(u03.b0 b0Var) {
        this.b = 1;
        this.d = new android.os.Handler(android.os.Looper.myLooper());
        this.c = b0Var;
    }
}
