package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ConstraintLayoutWithTouchInterceptor extends androidx.constraintlayout.widget.ConstraintLayout {
    public kotlin.jvm.functions.Function0 s;
    public final u6.i t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithTouchInterceptor(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.s != null && motionEvent != null) {
            ((android.view.GestureDetector) this.t.a).onTouchEvent(motionEvent);
        }
        return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnSingleTapListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.s = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.t = new u6.i(context, new k4.p1(this, 1));
    }

    public /* synthetic */ ConstraintLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
