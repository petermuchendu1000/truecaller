package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w0 implements ig3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ui.b1 b;

    public /* synthetic */ w0(com.truecaller.ui.b1 b1Var, int i) {
        this.a = i;
        this.b = b1Var;
    }

    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        int i = this.a;
        com.truecaller.ui.b1 b1Var = this.b;
        switch (i) {
            case 0:
                java.util.List list = (java.util.List) obj;
                com.truecaller.ui.s0 s0Var = b1Var.l;
                if (s0Var != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
                    s0Var.m.setValue(s0Var, com.truecaller.ui.s0.n[0], list);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("adapter");
                throw null;
            case 1:
                java.util.List list2 = (java.util.List) obj;
                com.truecaller.ui.e1 e1Var = b1Var.m;
                if (e1Var != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "<set-?>");
                    e1Var.m.setValue(e1Var, com.truecaller.ui.e1.n[0], list2);
                    android.widget.ImageView imageView = b1Var.Z5().c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "share");
                    gj.m.j0(imageView);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("listAdapter");
                throw null;
            case 2:
                int intValue = ((java.lang.Number) obj).intValue();
                com.truecaller.ui.t0 t0Var = com.truecaller.ui.b1.n;
                b1Var.Z5().b.setSelection(intValue);
                return kotlin.Unit.a;
            default:
                android.net.Uri uri = (android.net.Uri) obj;
                com.truecaller.ui.t0 t0Var2 = com.truecaller.ui.b1.n;
                java.lang.String string = b1Var.getResources().getString(2132023429);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                android.content.Context requireContext = b1Var.requireContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                boolean J = ze0.q.J(ze0.q.i(requireContext, uri), b1Var.getActivity());
                boolean J2 = ze0.q.J(ze0.q.k(uri, string, "com.whatsapp"), b1Var.getActivity());
                boolean J3 = ze0.q.J(ze0.q.k(uri, string, "com.facebook.orca"), b1Var.getActivity());
                boolean J4 = ze0.q.J(ze0.q.k(uri, string, "com.twitter.android"), b1Var.getActivity());
                androidx.fragment.app.g1 childFragmentManager = b1Var.getChildFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager, "fragmentManager");
                if (childFragmentManager.G(ys2.qux.class.getSimpleName()) == null && cp1.bar.v(b1Var)) {
                    androidx.fragment.app.g1 childFragmentManager2 = b1Var.getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager2, "fragmentManager");
                    ys2.qux quxVar = new ys2.qux();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("show_insta_stories", J);
                    bundle.putBoolean("show_whatsapp", J2);
                    bundle.putBoolean("show_fb_messenger", J3);
                    bundle.putBoolean("show_twitter", J4);
                    quxVar.setArguments(bundle);
                    quxVar.show(childFragmentManager2, ys2.qux.class.getSimpleName());
                }
                return kotlin.Unit.a;
        }
    }
}
