package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e1 extends androidx.recyclerview.widget.h1 {
    public static final /* synthetic */ kotlin.reflect.KProperty[] n = {kotlin.jvm.internal.k0.a.mutableProperty1(new kotlin.jvm.internal.t("stats", 0, "getStats()Ljava/util/List;", com.truecaller.ui.e1.class))};
    public final com.truecaller.editprofile.impl.ui.legacy.o m = new com.truecaller.editprofile.impl.ui.legacy.o(2, kotlin.collections.h0.a, this);

    public final int getItemCount() {
        return ((java.util.List) this.m.getValue(this, n[0])).size();
    }

    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        com.truecaller.ui.f1 f1Var = (com.truecaller.ui.f1) k2Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f1Var, "holder");
        com.truecaller.ui.g1 g1Var = (com.truecaller.ui.g1) ((java.util.List) this.m.getValue(this, n[0])).get(i);
        f1Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var, "statsUIModel");
        wt2.qux quxVar = f1Var.b;
        quxVar.f.setText(g1Var.e);
        android.widget.TextView textView = quxVar.e;
        android.content.Context context = f1Var.c;
        textView.setText(context.getResources().getString(g1Var.f));
        android.widget.ImageView imageView = quxVar.c;
        int i2 = g1Var.a;
        int i3 = g1Var.c;
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
        imageView.setImageDrawable(bi3.a.x(context, i2, i3, mode));
        quxVar.d.setImageDrawable(bi3.a.x(context, 2131234413, g1Var.d, mode));
    }

    public final androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "parent");
        androidx.constraintlayout.widget.ConstraintLayout j = uf.qux.j(viewGroup, 2131560908, viewGroup, false);
        int i2 = 2131364553;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364553, j);
        if (imageView != null) {
            i2 = 2131364592;
            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364592, j);
            if (imageView2 != null) {
                i2 = 2131366692;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366692, j);
                if (textView != null) {
                    i2 = 2131367033;
                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, j);
                    if (textView2 != null) {
                        wt2.qux quxVar = new wt2.qux(j, imageView, imageView2, textView, textView2, 1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quxVar, "inflate(...)");
                        return new com.truecaller.ui.f1(quxVar);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(j.getResources().getResourceName(i2)));
    }
}
