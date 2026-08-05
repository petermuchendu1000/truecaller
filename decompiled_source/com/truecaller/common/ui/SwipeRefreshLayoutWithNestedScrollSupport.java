package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SwipeRefreshLayoutWithNestedScrollSupport extends androidx.swiperefreshlayout.widget.baz {
    public final int M;
    public float N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshLayoutWithNestedScrollSupport(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.M = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && java.lang.Math.abs(motionEvent.getX() - this.N) > this.M) {
                return false;
            }
        } else {
            this.N = android.view.MotionEvent.obtain(motionEvent).getX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
