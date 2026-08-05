package com.truecaller.acspromo.uicomponents;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AcsPromoView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int z = 0;
    public yc3.d s;
    public final boolean t;
    public java.lang.Runnable u;
    public final ig3.h2 v;
    public final ig3.q1 w;
    public final ig3.h2 x;
    public final ig3.q1 y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcsPromoView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    public final void setOnCtaClickListener(@org.jetbrains.annotations.NotNull java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "listener");
        this.u = runnable;
    }

    public final void setPromo(@org.jetbrains.annotations.NotNull f00.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "config");
        this.v.o(bazVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcsPromoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AcsPromoView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AcsPromoView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            ((m00.a) X3()).getClass();
        }
        ig3.h2 c = ig3.w1.c((java.lang.Object) null);
        this.v = c;
        this.w = new ig3.q1(c);
        ig3.h2 c2 = ig3.w1.c(java.lang.Boolean.FALSE);
        this.x = c2;
        this.y = new ig3.q1(c2);
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setContent(new d3.qux(1107335574, new m00.qux(this, 0), true));
        addView(composeView);
    }
}
