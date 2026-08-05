package com.truecaller.premium.ui.subscription.buttons.subscription.compose;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionButtonComposeView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int y = 0;
    public yc3.d s;
    public final boolean t;
    public qc3.bar u;
    public final ig3.h2 v;
    public final ig3.q1 w;
    public kotlin.jvm.functions.Function0 x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionButtonComposeView(android.content.Context context) {
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

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getMapper() {
        qc3.bar barVar = this.u;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("mapper");
        throw null;
    }

    public final void setButtonConfig(@org.jetbrains.annotations.NotNull xe2.s sVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "buttonConfig");
        ff2.g a = ((ff2.h) getMapper().get()).a(sVar);
        ig3.h2 h2Var = this.v;
        h2Var.getClass();
        h2Var.p((java.lang.Object) null, a);
    }

    public final void setMapper(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.u = barVar;
    }

    public final void setOnClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClickListener");
        this.x = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionButtonComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SubscriptionButtonComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionButtonComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.u = cd3.baz.a(((ff2.f) X3()).c.b.Z8);
        }
        ig3.h2 c = ig3.w1.c((java.lang.Object) null);
        this.v = c;
        this.w = new ig3.q1(c);
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setContent(new d3.qux(-2106729878, new ff2.e(this, 0), true));
        addView(composeView);
    }
}
