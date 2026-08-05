package com.truecaller.insights.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/ui/utils/SafeLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SafeLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public final void p0(androidx.recyclerview.widget.a2 a2Var, androidx.recyclerview.widget.g2 g2Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2Var, "recycler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2Var, "state");
        try {
            super.p0(a2Var, g2Var);
        } catch (java.lang.IndexOutOfBoundsException e) {
            java.text.SimpleDateFormat simpleDateFormat = bt1.baz.a;
            bt1.baz.b(null, e);
        }
    }
}
