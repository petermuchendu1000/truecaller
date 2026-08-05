package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class v0 extends androidx.recyclerview.widget.d1 {
    public final int[] b(androidx.recyclerview.widget.t1 t1Var, android.view.View view) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t1Var, "layoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "targetView");
        int[] iArr = new int[2];
        if (t1Var instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) t1Var;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            if (linearLayoutManager.o()) {
                androidx.recyclerview.widget.b1 b1Var = new androidx.recyclerview.widget.b1(linearLayoutManager, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b1Var, "createHorizontalHelper(...)");
                iArr[0] = b1Var.e(view) - ((androidx.recyclerview.widget.t1) ((a8.d) b1Var).b).getPaddingLeft();
            }
            iArr[1] = 0;
        }
        return iArr;
    }
}
