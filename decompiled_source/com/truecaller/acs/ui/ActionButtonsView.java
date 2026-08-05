package com.truecaller.acs.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActionButtonsView extends android.widget.LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final android.view.LayoutInflater a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonsView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static androidx.constraintlayout.widget.ConstraintLayout a(com.truecaller.acs.ui.ActionButtonsView actionButtonsView, jz.baz bazVar, int i, int i2) {
        boolean z = false;
        androidx.constraintlayout.widget.ConstraintLayout inflate = actionButtonsView.a.inflate(2131560935, (android.view.ViewGroup) actionButtonsView, false);
        int i3 = 2131362412;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131362412, inflate);
        if (imageView != null) {
            i3 = 2131364586;
            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364586, inflate);
            if (imageView2 != null) {
                i3 = 2131366949;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366949, inflate);
                if (textView != null) {
                    i3 = 2131367468;
                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367468, inflate);
                    if (textView2 != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                        jz.d dVar = bazVar.a;
                        jz.m0 m0Var = bazVar.c;
                        constraintLayout.setTag(dVar);
                        constraintLayout.setOnClickListener(new gr2.bar(bazVar, 19));
                        imageView2.setImageResource(i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "viewPromo");
                        gj.m.k0(textView2, false);
                        if (m0Var != null && m0Var.a) {
                            z = true;
                        }
                        gj.m.k0(imageView, z);
                        if (z) {
                            android.content.Context context = actionButtonsView.getContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            z31.baz bazVar2 = new z31.baz(context, 7166);
                            bazVar2.a(m0Var.b);
                            imageView.setImageDrawable(bazVar2);
                        }
                        textView.setText(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public final void b(int i, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if ((childAt.getTag() instanceof jz.c) && z) {
                ((android.widget.ImageView) childAt.findViewById(2131364586)).setImageTintList(android.content.res.ColorStateList.valueOf(getContext().getColor(2131101087)));
            } else {
                ((android.widget.ImageView) childAt.findViewById(2131364586)).setImageTintList(android.content.res.ColorStateList.valueOf(i));
            }
            ((android.widget.TextView) childAt.findViewById(2131366949)).setTextColor(i);
        }
    }

    public final void setActionButtonTheme(int i) {
        int color = getContext().getColor(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            ((android.widget.TextView) childAt.findViewById(2131366949)).setTextColor(color);
            ((android.widget.ImageView) childAt.findViewById(2131364586)).setImageTintList(android.content.res.ColorStateList.valueOf(color));
        }
    }

    public final void setActionButtons(@org.jetbrains.annotations.NotNull java.util.List<jz.baz> list) {
        androidx.constraintlayout.widget.ConstraintLayout a;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "actionButtons");
        removeAllViews();
        for (jz.baz bazVar : list) {
            jz.d dVar = bazVar.a;
            if (dVar.equals(jz.a.a)) {
                a = a(this, bazVar, 2132021578, 2131233348);
            } else if (dVar.equals(jz.a.f)) {
                a = a(this, bazVar, 2132021598, 2131233363);
            } else if (dVar.equals(jz.a.e)) {
                a = a(this, bazVar, 2132021612, 2131233376);
            } else if (dVar.equals(jz.a.b)) {
                a = a(this, bazVar, 2132021590, 2131233358);
            } else if (dVar instanceof jz.qux) {
                if (((jz.qux) dVar).a) {
                    i = 2132019308;
                } else {
                    i = 2132019304;
                }
                a = a(this, bazVar, i, 2131233403);
            } else {
                int i2 = 2132019306;
                if (dVar instanceof jz.b) {
                    if (!((jz.b) dVar).a) {
                        i2 = 2132019309;
                    }
                    a = a(this, bazVar, i2, 2131233403);
                } else if (dVar.equals(jz.a.c)) {
                    a = a(this, bazVar, 2132019306, 2131233516);
                } else if (dVar instanceof jz.c) {
                    a = a(this, bazVar, 2132019312, 2131233375);
                } else if (dVar.equals(jz.a.d)) {
                    a = a(this, bazVar, 2132019307, 2131233710);
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
            addView(a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        this.a = from;
    }

    public /* synthetic */ ActionButtonsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
