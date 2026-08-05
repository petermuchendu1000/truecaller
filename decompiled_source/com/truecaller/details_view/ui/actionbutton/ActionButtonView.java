package com.truecaller.details_view.ui.actionbutton;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActionButtonView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final d91.n0 s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBadge(int i) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.s.b;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        z31.baz bazVar = new z31.baz(context, 5118);
        bazVar.a(i);
        imageView.setImageDrawable(bazVar);
    }

    public final void setBorderAlpha(float f) {
        this.s.d.getBackground().setAlpha((int) (f * 255));
    }

    public final void setIcon(int i) {
        ((com.truecaller.common.ui.imageview.GoldShineImageView) this.s.f).setImageResource(i);
    }

    public final void setIconPainter(@org.jetbrains.annotations.NotNull xb1.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "painter");
        com.truecaller.common.ui.imageview.GoldShineImageView goldShineImageView = (com.truecaller.common.ui.imageview.GoldShineImageView) this.s.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goldShineImageView, "icon");
        dVar.a(goldShineImageView);
    }

    public final void setIconTag(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        ((com.truecaller.common.ui.imageview.GoldShineImageView) this.s.f).setTag(num);
    }

    public final void setOnClickedListener(@org.jetbrains.annotations.NotNull android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        ((com.truecaller.common.ui.imageview.GoldShineImageView) this.s.f).setOnClickListener(onClickListener);
    }

    public final void setTextAlpha(float f) {
        ((android.widget.TextView) this.s.e).setAlpha(f);
    }

    public final void setTextColor(int i) {
        ((android.widget.TextView) this.s.e).setTextColor(i);
    }

    public final void setTitle(int i) {
        ((android.widget.TextView) this.s.e).setText(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131559887, (android.view.ViewGroup) this);
        int i3 = 2131362412;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131362412, this);
        if (imageView != null) {
            i3 = 2131362500;
            android.view.View o = df0.qux.o(2131362500, this);
            if (o != null) {
                i3 = 2131364521;
                com.truecaller.common.ui.imageview.GoldShineImageView o2 = df0.qux.o(2131364521, this);
                if (o2 != null) {
                    i3 = 2131366839;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366839, this);
                    if (textView != null) {
                        d91.n0 n0Var = new d91.n0(this, imageView, o, o2, textView);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n0Var, "inflate(...)");
                        this.s = n0Var;
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }

    public /* synthetic */ ActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
