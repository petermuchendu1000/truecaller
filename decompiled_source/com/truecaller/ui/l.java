package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ com.truecaller.ui.FeedbackFormActivity a;

    public l(com.truecaller.ui.FeedbackFormActivity feedbackFormActivity) {
        this.a = feedbackFormActivity;
    }

    public final java.lang.Object invoke() {
        android.view.LayoutInflater layoutInflater = this.a.getLayoutInflater();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        androidx.coordinatorlayout.widget.CoordinatorLayout inflate = layoutInflater.inflate(2131558476, (android.view.ViewGroup) null, false);
        int i = 2131362273;
        com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362273, inflate);
        if (o != null) {
            i = 2131364006;
            if (df0.qux.o(2131364006, inflate) != null) {
                i = 2131367108;
                androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                if (o2 != null) {
                    return new d91.baz(inflate, o, o2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
