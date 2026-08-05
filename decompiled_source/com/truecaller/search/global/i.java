package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    public final /* synthetic */ com.truecaller.search.global.m b;

    public i(com.truecaller.search.global.m mVar) {
        this.b = mVar;
    }

    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        com.truecaller.search.global.a0 a0Var = this.b.i;
        if (a0Var != null) {
            com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) a0Var;
            com.truecaller.log.AssertionUtil.isNotNull(h0Var.X, new java.lang.String[0]);
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = h0Var.X;
            if (globalSearchResultActivity != null) {
                globalSearchResultActivity.w0();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }
}
