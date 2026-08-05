package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class v1 implements g.bar, u6.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit b;

    public /* synthetic */ v1(com.truecaller.ui.TruecallerInit truecallerInit, int i) {
        this.a = i;
        this.b = truecallerInit;
    }

    public void onActivityResult(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = com.truecaller.ui.TruecallerInit.y1;
        if (booleanValue) {
            this.b.H0().M(com.truecaller.bottombar.BottomBarButtonType.MESSAGES);
        }
    }

    public u6.z1 onApplyWindowInsets(android.view.View view, u6.z1 z1Var) {
        int i = this.a;
        int i2 = 0;
        com.truecaller.ui.TruecallerInit truecallerInit = this.b;
        switch (i) {
            case 1:
                int i3 = com.truecaller.ui.TruecallerInit.y1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z1Var, "windowInsets");
                k6.b g = z1Var.a.g(519);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "getInsets(...)");
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                com.truecaller.common.ui.o oVar = truecallerInit.q1;
                if (oVar == null || !oVar.c) {
                    i2 = g.b;
                }
                marginLayoutParams.topMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return z1Var;
            default:
                int i4 = com.truecaller.ui.TruecallerInit.y1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z1Var, "windowInsets");
                k6.b g2 = z1Var.a.g(519);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g2, "getInsets(...)");
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                com.truecaller.common.ui.o oVar2 = truecallerInit.q1;
                if (oVar2 == null || !oVar2.c) {
                    i2 = g2.b;
                }
                marginLayoutParams2.topMargin = i2;
                view.setLayoutParams(marginLayoutParams2);
                return z1Var;
        }
    }
}
