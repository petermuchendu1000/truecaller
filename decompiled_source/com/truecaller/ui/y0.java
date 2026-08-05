package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class y0 implements kotlin.jvm.functions.Function1 {
    public final java.lang.Object invoke(java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.constraintlayout.widget.ConstraintLayout requireView = fragment.requireView();
        int i = 2131362434;
        if (df0.qux.o(2131362434, requireView) != null) {
            i = 2131365680;
            androidx.appcompat.widget.AppCompatSpinner o = df0.qux.o(2131365680, requireView);
            if (o != null) {
                i = 2131366403;
                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131366403, requireView);
                if (imageView != null) {
                    i = 2131366642;
                    androidx.recyclerview.widget.RecyclerView o2 = df0.qux.o(2131366642, requireView);
                    if (o2 != null) {
                        return new wt2.bar(requireView, o, imageView, o2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(requireView.getResources().getResourceName(i)));
    }
}
