package com.truecaller.common.ui.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/common/ui/recyclerview/SafeLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SafeLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public final java.lang.String F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SafeLinearLayoutManager(android.content.Context context, java.lang.String str, int i, int i2) {
        super(context, i, false);
        i = (i2 & 4) != 0 ? 1 : i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "debugTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.F = str;
    }

    public final int C0(int i, androidx.recyclerview.widget.a2 a2Var, androidx.recyclerview.widget.g2 g2Var) {
        try {
            return super.C0(i, a2Var, g2Var);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.truecaller.log.AssertionUtil.report(new java.lang.String[]{"SafeLinearLayoutManager scrollHorizontallyBy " + e + " with tag " + this.F});
            return 0;
        }
    }

    public final int E0(int i, androidx.recyclerview.widget.a2 a2Var, androidx.recyclerview.widget.g2 g2Var) {
        try {
            return super.E0(i, a2Var, g2Var);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.truecaller.log.AssertionUtil.report(new java.lang.String[]{"SafeLinearLayoutManager scrollVerticallyBy " + e + " with tag " + this.F});
            return 0;
        }
    }

    public final void p0(androidx.recyclerview.widget.a2 a2Var, androidx.recyclerview.widget.g2 g2Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2Var, "recycler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2Var, "state");
        try {
            super.p0(a2Var, g2Var);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.truecaller.log.AssertionUtil.report(new java.lang.String[]{"SafeLinearLayoutManager onLayoutChildren " + e + " with tag " + this.F});
        }
    }
}
