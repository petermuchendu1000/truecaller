package com.truecaller.messaging.urgent;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class KeyguardOverlay extends android.view.View {
    public static final /* synthetic */ int f = 0;
    public android.view.MotionEvent a;
    public android.view.MotionEvent b;
    public final android.app.KeyguardManager c;
    public kotlin.jvm.functions.Function0 d;
    public final android.view.GestureDetector e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyguardOverlay(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(boolean z) {
        android.view.View view;
        if (this.c.isKeyguardLocked() && !z) {
            setVisibility(0);
            return;
        }
        android.view.MotionEvent motionEvent = this.a;
        android.view.MotionEvent motionEvent2 = this.b;
        setVisibility(8);
        java.lang.Object parent = getParent();
        if (parent instanceof android.view.View) {
            view = (android.view.View) parent;
        } else {
            view = null;
        }
        if (view != null && motionEvent != null && motionEvent2 != null && android.os.SystemClock.uptimeMillis() - motionEvent2.getEventTime() < p42.baz.a) {
            motionEvent.offsetLocation(getLeft(), getTop());
            motionEvent2.offsetLocation(getLeft(), getTop());
            view.post(new p0.baz(view, motionEvent, motionEvent2, 4));
        }
        this.a = null;
        this.b = null;
    }

    public final boolean b(android.view.MotionEvent motionEvent, java.util.List list) {
        android.view.View view;
        java.lang.Object parent = getParent();
        if (parent instanceof android.view.View) {
            view = (android.view.View) parent;
        } else {
            view = null;
        }
        if (view == null) {
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        this.e.onTouchEvent(motionEvent);
        return !b(motionEvent, p42.baz.c);
    }

    public final void setOnInteractionListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "listener");
        this.d = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyguardOverlay(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyguardOverlay(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("keyguard");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.c = (android.app.KeyguardManager) systemService;
        this.e = new android.view.GestureDetector(context, new p42.bar(this, context));
    }

    public /* synthetic */ KeyguardOverlay(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
