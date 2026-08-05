package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class r0 implements kotlin.jvm.functions.Function2 {
    public static final com.truecaller.ui.r0 b = new com.truecaller.ui.r0(0);
    public static final com.truecaller.ui.r0 c = new com.truecaller.ui.r0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i) {
        this.a = i;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                com.truecaller.ui.i1 i1Var = (com.truecaller.ui.i1) obj;
                com.truecaller.ui.i1 i1Var2 = (com.truecaller.ui.i1) obj2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i1Var, "oldItem");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i1Var2, "newItem");
                if (i1Var.hashCode() == i1Var2.hashCode()) {
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                com.truecaller.ui.g1 g1Var = (com.truecaller.ui.g1) obj;
                com.truecaller.ui.g1 g1Var2 = (com.truecaller.ui.g1) obj2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var, "oldItem");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var2, "newItem");
                if (g1Var.hashCode() == g1Var2.hashCode()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return java.lang.Boolean.valueOf(z2);
        }
    }
}
