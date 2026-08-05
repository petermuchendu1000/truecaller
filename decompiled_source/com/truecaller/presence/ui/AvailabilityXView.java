package com.truecaller.presence.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class AvailabilityXView extends android.widget.FrameLayout implements hg2.a {
    public static final /* synthetic */ int i = 0;
    public hg2.qux a;
    public final kotlin.Lazy b;
    public int c;
    public int d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvailabilityXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final zf2.bar getBinding() {
        return (zf2.bar) this.b.getValue();
    }

    private final boolean getHasIcon() {
        if (getBinding().b.getCompoundDrawables()[0] == null) {
            return false;
        }
        return true;
    }

    private final boolean getHasText() {
        java.lang.CharSequence text = getBinding().b.getText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            return true;
        }
        return false;
    }

    private final android.graphics.drawable.Drawable getOnCallIcon() {
        return (android.graphics.drawable.Drawable) this.f.getValue();
    }

    private final int getPaddingHorizontal() {
        return ((java.lang.Number) this.g.getValue()).intValue();
    }

    private final int getPaddingVertical() {
        return ((java.lang.Number) this.h.getValue()).intValue();
    }

    private final android.graphics.drawable.Drawable getSilentIcon() {
        return (android.graphics.drawable.Drawable) this.e.getValue();
    }

    public final void a(com.truecaller.presence.ui.AvailabilityXMvp$AvailabilityStatus availabilityXMvp$AvailabilityStatus, java.lang.String str) {
        android.graphics.drawable.Drawable silentIcon;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availabilityXMvp$AvailabilityStatus, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = getBinding().b;
        kotlin.jvm.internal.Intrinsics.d(appCompatTextView);
        int i2 = hg2.d.a[availabilityXMvp$AvailabilityStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                silentIcon = null;
            } else {
                silentIcon = getOnCallIcon();
            }
        } else {
            silentIcon = getSilentIcon();
        }
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(silentIcon, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        appCompatTextView.setText(str);
        gj.m.j0(appCompatTextView);
        c();
    }

    public final void b(int i2, int i3) {
        if (this.c == i2 && this.d == i3) {
            return;
        }
        android.graphics.drawable.Drawable mutate = getBackground().mutate();
        kotlin.jvm.internal.Intrinsics.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) mutate;
        gradientDrawable.setStroke(i2, i3);
        this.c = i2;
        this.d = i3;
        setBackground(gradientDrawable);
        c();
    }

    public final void c() {
        int i2;
        int paddingHorizontal = getPaddingHorizontal() + this.c;
        if (getHasIcon() && getHasText()) {
            i2 = getPaddingVertical() + this.c;
        } else {
            i2 = paddingHorizontal;
        }
        int paddingVertical = getPaddingVertical() + this.c;
        setPadding(i2, paddingVertical, paddingHorizontal, paddingVertical);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hg2.qux quxVar = this.a;
        if (quxVar != null) {
            quxVar.u0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hg2.qux quxVar = this.a;
        if (quxVar != null) {
            quxVar.m1();
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        hg2.qux quxVar = this.a;
        if (quxVar != null) {
            hg2.bar barVar = (hg2.bar) quxVar;
            barVar.d = z;
            barVar.c2(barVar.c);
        }
    }

    @Override // android.view.View, hg2.a
    public void setBackgroundColor(int i2) {
        android.graphics.drawable.Drawable mutate = getBackground().mutate();
        kotlin.jvm.internal.Intrinsics.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) mutate;
        gradientDrawable.setColor(i2);
        setBackground(gradientDrawable);
    }

    public final void setPresenter(@org.jetbrains.annotations.Nullable hg2.qux quxVar) {
        this.a = quxVar;
        if (quxVar != null) {
            quxVar.u0(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvailabilityXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityXView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new f63.g(22, context, this));
        setMinimumWidth(getResources().getDimensionPixelSize(2131165423));
        setMinimumHeight(getResources().getDimensionPixelSize(2131165422));
        setElevation(getResources().getDimension(2131165421));
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setBackground(fe0.m.s(resources, 2131231292, null));
        this.b = lazy;
        this.d = -1;
        this.e = kotlin.LazyKt.lazy(new be.x(context, 15));
        this.f = kotlin.LazyKt.lazy(new be.x(context, 16));
        final int i3 = 0;
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: hg2.c
            public final /* synthetic */ com.truecaller.presence.ui.AvailabilityXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int dimensionPixelSize;
                int i4 = i3;
                com.truecaller.presence.ui.AvailabilityXView availabilityXView = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.presence.ui.AvailabilityXView.i;
                        dimensionPixelSize = availabilityXView.getResources().getDimensionPixelSize(2131165424);
                        break;
                    default:
                        int i6 = com.truecaller.presence.ui.AvailabilityXView.i;
                        dimensionPixelSize = availabilityXView.getResources().getDimensionPixelSize(2131165425);
                        break;
                }
                return java.lang.Integer.valueOf(dimensionPixelSize);
            }
        });
        final int i4 = 1;
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: hg2.c
            public final /* synthetic */ com.truecaller.presence.ui.AvailabilityXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int dimensionPixelSize;
                int i42 = i4;
                com.truecaller.presence.ui.AvailabilityXView availabilityXView = this.b;
                switch (i42) {
                    case 0:
                        int i5 = com.truecaller.presence.ui.AvailabilityXView.i;
                        dimensionPixelSize = availabilityXView.getResources().getDimensionPixelSize(2131165424);
                        break;
                    default:
                        int i6 = com.truecaller.presence.ui.AvailabilityXView.i;
                        dimensionPixelSize = availabilityXView.getResources().getDimensionPixelSize(2131165425);
                        break;
                }
                return java.lang.Integer.valueOf(dimensionPixelSize);
            }
        });
    }

    public /* synthetic */ AvailabilityXView(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
