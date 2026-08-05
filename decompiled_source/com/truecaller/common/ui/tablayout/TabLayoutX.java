package com.truecaller.common.ui.tablayout;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TabLayoutX extends com.google.android.material.tabs.TabLayout {
    public float a0;
    public kotlin.jvm.functions.Function1 b0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabLayoutX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final java.util.List<wr.d> getTabs() {
        kotlin.ranges.IntRange l = uf3.p.l(0, getTabCount());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.collections.m0 it = l.iterator();
        while (it.hasNext()) {
            wr.d g = g(it.nextInt());
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final void k(wr.d dVar, boolean z) {
        getSelectedTabPosition();
        super.k(dVar, z);
    }

    public final void m(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        n(i, 0.0f, true, true, true);
        float f = i + 0.0f;
        for (wr.d dVar : getTabs()) {
            float max = java.lang.Math.max(1.0f - java.lang.Math.abs(dVar.c - f), 0.0f);
            android.view.ViewGroup.LayoutParams layoutParams2 = dVar.f.getLayoutParams();
            q41.bar barVar = null;
            if (layoutParams2 instanceof android.widget.LinearLayout.LayoutParams) {
                layoutParams = (android.widget.LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.weight = ia0.bar.h(this.a0, 1.0f, max, 1.0f);
            }
            dVar.f.requestLayout();
            java.lang.Object obj = dVar.d;
            if (obj instanceof q41.bar) {
                barVar = (q41.bar) obj;
            }
            if (barVar != null) {
                barVar.H(1.0f - max);
            }
        }
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.functions.Function1 function1 = this.b0;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnInterceptTouchEventListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        this.b0 = function1;
    }

    public final void setSelectedTabWidthRatio(float f) {
        this.a0 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabLayoutX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a0 = 1.0f;
        getSelectedTabPosition();
    }

    public /* synthetic */ TabLayoutX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
