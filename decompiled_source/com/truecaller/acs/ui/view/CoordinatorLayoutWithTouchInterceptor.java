package com.truecaller.acs.ui.view;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CoordinatorLayoutWithTouchInterceptor extends androidx.coordinatorlayout.widget.CoordinatorLayout {
    public static final /* synthetic */ int A = 0;
    public kotlin.jvm.functions.Function0 y;
    public final android.view.GestureDetector z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayoutWithTouchInterceptor(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.z.onTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnSingleTapListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "listener");
        this.y = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.y = new s20.bar(21);
        this.z = new android.view.GestureDetector(context, (android.view.GestureDetector.OnGestureListener) new k4.p1(this, 2));
    }

    public /* synthetic */ CoordinatorLayoutWithTouchInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
