package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerticalNestedScrollView extends androidx.core.widget.NestedScrollView {
    public final int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "motion");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.I = java.lang.Math.abs(x - this.K) + this.I;
                this.J = java.lang.Math.abs(y - this.L) + this.J;
                this.K = x;
                this.L = y;
            }
        } else {
            this.I = 0.0f;
            this.J = 0.0f;
            this.K = motionEvent.getX();
            this.L = motionEvent.getY();
            this.H = -1;
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            float f = this.J;
            float f2 = this.G;
            if ((f > f2 || this.I > f2) && this.H == -1) {
                if (java.lang.Math.abs(f) > java.lang.Math.abs(this.I)) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.H = i;
            }
            if (this.H == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.G = i2;
    }

    public /* synthetic */ VerticalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? android.view.ViewConfiguration.get(context).getScaledTouchSlop() : i2);
    }
}
