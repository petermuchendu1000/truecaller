package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s0 extends androidx.recyclerview.widget.h1 {
    public static final /* synthetic */ kotlin.reflect.KProperty[] n = {kotlin.jvm.internal.k0.a.mutableProperty1(new kotlin.jvm.internal.t("stats", 0, "getStats()Ljava/util/List;", com.truecaller.ui.s0.class))};
    public final com.truecaller.editprofile.impl.ui.legacy.o m = new com.truecaller.editprofile.impl.ui.legacy.o(1, kotlin.collections.h0.a, this);

    public final int getItemCount() {
        return ((java.util.List) this.m.getValue(this, n[0])).size();
    }

    public final int getItemViewType(int i) {
        if (((java.util.List) this.m.getValue(this, n[0])).get(i) instanceof com.truecaller.ui.g1) {
            return 2131367497;
        }
        return 2131367538;
    }

    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        int dimensionPixelSize;
        int i2;
        int i3;
        int i4;
        int dimensionPixelSize2;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        if (k2Var instanceof com.truecaller.ui.k1) {
            com.truecaller.ui.k1 k1Var = (com.truecaller.ui.k1) k2Var;
            java.lang.Object obj = ((java.util.List) this.m.getValue(this, n[0])).get(i);
            kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type com.truecaller.ui.StatsUiModel.Data");
            com.truecaller.ui.g1 g1Var = (com.truecaller.ui.g1) obj;
            int itemCount = getItemCount();
            int i7 = k1Var.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var, "statsUIModel");
            wt2.qux quxVar = k1Var.b;
            quxVar.f.setText(g1Var.e);
            android.widget.TextView textView = quxVar.e;
            android.content.Context context = k1Var.c;
            textView.setText(context.getResources().getString(g1Var.f));
            int i8 = g1Var.a;
            int i9 = g1Var.c;
            android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
            android.graphics.drawable.Drawable x = bi3.a.x(context, i8, i9, mode);
            if (x != null) {
                x.setAutoMirrored(g1Var.b);
            } else {
                x = null;
            }
            quxVar.c.setImageDrawable(x);
            if (k1Var.d) {
                i4 = 2130970621;
            } else {
                i4 = g1Var.d;
            }
            quxVar.d.setImageDrawable(bi3.a.x(context, 2131234413, i4, mode));
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = quxVar.b;
            if (i % i7 == 0) {
                dimensionPixelSize2 = 0;
            } else {
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166826);
            }
            if (i >= itemCount - i7) {
                i5 = context.getResources().getDimensionPixelSize(2131165620);
            } else {
                i5 = 0;
            }
            if (i < i7) {
                i6 = context.getResources().getDimensionPixelSize(2131165620);
            } else {
                i6 = 0;
            }
            constraintLayout.setPaddingRelative(dimensionPixelSize2, i5, 0, i6);
            return;
        }
        if (k2Var instanceof com.truecaller.ui.p1) {
            com.truecaller.ui.p1 p1Var = (com.truecaller.ui.p1) k2Var;
            int itemCount2 = getItemCount();
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = p1Var.b.b;
            android.content.Context context2 = constraintLayout2.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i10 = p1Var.c;
            if (i % i10 == 0) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = context2.getResources().getDimensionPixelSize(2131166826);
            }
            android.content.Context context3 = constraintLayout2.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            if (i >= itemCount2 - i10) {
                i2 = context3.getResources().getDimensionPixelSize(2131165620);
            } else {
                i2 = 0;
            }
            android.content.Context context4 = constraintLayout2.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            if (i < i10) {
                i3 = context4.getResources().getDimensionPixelSize(2131165620);
            } else {
                i3 = 0;
            }
            constraintLayout2.setPaddingRelative(dimensionPixelSize, i2, 0, i3);
        }
    }

    public final androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "parent");
        int i2 = 2131367033;
        if (i == 2131367497) {
            androidx.constraintlayout.widget.ConstraintLayout j = uf.qux.j(viewGroup, 2131560907, (android.view.ViewGroup) null, false);
            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364553, j);
            if (imageView != null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364592, j);
                if (imageView2 != null) {
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366692, j);
                    if (textView != null) {
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, j);
                        if (textView2 != null) {
                            wt2.qux quxVar = new wt2.qux(j, imageView, imageView2, textView, textView2, 0);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quxVar, "inflate(...)");
                            return new com.truecaller.ui.k1(quxVar);
                        }
                    } else {
                        i2 = 2131366692;
                    }
                } else {
                    i2 = 2131364592;
                }
            } else {
                i2 = 2131364553;
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(j.getResources().getResourceName(i2)));
        }
        androidx.constraintlayout.widget.ConstraintLayout j2 = uf.qux.j(viewGroup, 2131560909, (android.view.ViewGroup) null, false);
        android.view.View o = df0.qux.o(2131364553, j2);
        if (o != null) {
            android.view.View o2 = df0.qux.o(2131366692, j2);
            if (o2 != null) {
                android.view.View o3 = df0.qux.o(2131367033, j2);
                if (o3 != null) {
                    d41.a aVar = new d41.a(j2, o, o2, o3, 27);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    return new com.truecaller.ui.p1(aVar);
                }
            } else {
                i2 = 2131366692;
            }
        } else {
            i2 = 2131364553;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(j2.getResources().getResourceName(i2)));
    }
}
