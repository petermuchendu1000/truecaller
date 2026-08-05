package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class u0 implements ig3.j, kotlin.jvm.internal.i {
    public final /* synthetic */ com.truecaller.ui.b1 a;

    public u0(com.truecaller.ui.b1 b1Var) {
        this.a = b1Var;
    }

    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        int i;
        int i2;
        com.truecaller.ui.t0 t0Var = com.truecaller.ui.b1.n;
        com.truecaller.ui.b1 b1Var = this.a;
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = b1Var.Z5().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatSpinner, "periodPicker");
        boolean z = ((com.truecaller.ui.j1) obj).a;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatSpinner.setVisibility(i);
        android.widget.ImageView imageView = b1Var.Z5().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "share");
        if (z) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        androidx.recyclerview.widget.RecyclerView recyclerView = b1Var.Z5().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "statsList");
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            d6.a aVar = (d6.a) layoutParams;
            if (z) {
                i2 = 19;
            } else {
                i2 = 5;
            }
            aVar.setMargins(0, bd.bar.q(i2), 0, 0);
            recyclerView.setLayoutParams(aVar);
            kotlin.Unit unit = kotlin.Unit.a;
            ef3.bar barVar2 = ef3.bar.a;
            return unit;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof ig3.j) && (obj instanceof kotlin.jvm.internal.i)) {
            return kotlin.jvm.internal.Intrinsics.b(getFunctionDelegate(), ((kotlin.jvm.internal.i) obj).getFunctionDelegate());
        }
        return false;
    }

    public final kotlin.d getFunctionDelegate() {
        return new kotlin.jvm.internal.bar(2, 4, com.truecaller.ui.b1.class, this.a, "updateUi", "updateUi(Lcom/truecaller/ui/StatsUiState;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
