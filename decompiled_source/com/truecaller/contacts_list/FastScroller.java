package com.truecaller.contacts_list;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FastScroller extends android.widget.RelativeLayout {
    public static final /* synthetic */ int j = 0;
    public final int a;
    public androidx.recyclerview.widget.RecyclerView b;
    public androidx.recyclerview.widget.LinearLayoutManager c;
    public kotlin.jvm.functions.Function1 d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastScroller(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        this.e = gj.m.I(2131363832, this);
        this.f = gj.m.I(2131363833, this);
        this.g = gj.m.I(2131363835, this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.contacts_list.R$styleable.a, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 100);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(2131561019, (android.view.ViewGroup) this, true);
    }

    private final void setContainerAndScrollBarPosition(float f) {
        kotlin.Lazy lazy = this.e;
        int height = ((com.truecaller.ui.view.TintedImageView) lazy.getValue()).getHeight();
        kotlin.Lazy lazy2 = this.f;
        int height2 = ((android.widget.FrameLayout) lazy2.getValue()).getHeight();
        int i = height / 2;
        ((com.truecaller.ui.view.TintedImageView) lazy.getValue()).setY(uf3.p.e((int) (f - i), new kotlin.ranges.bar(0, getHeight() - height, 1)));
        ((android.widget.FrameLayout) lazy2.getValue()).setY(uf3.p.e((int) (f - height2), new kotlin.ranges.bar(0, (getHeight() - height2) - i, 1)));
    }

    private final void setRecyclerViewPosition(float f) {
        if (this.h > 0) {
            int i = this.h;
            int e = uf3.p.e((int) ((f / getHeight()) * i), uf3.p.l(0, i));
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.c;
            if (linearLayoutManager != null) {
                linearLayoutManager.s1(e, 0);
                kotlin.Lazy lazy = this.g;
                android.widget.TextView textView = (android.widget.TextView) lazy.getValue();
                kotlin.jvm.functions.Function1 function1 = this.d;
                if (function1 != null) {
                    textView.setText((java.lang.CharSequence) function1.invoke(java.lang.Integer.valueOf(e)));
                    java.util.Objects.toString(((android.widget.TextView) lazy.getValue()).getText());
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("indexByPosition");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("layoutManager");
            throw null;
        }
    }

    public final void a() {
        int i;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.c;
        if (linearLayoutManager != null) {
            int d1 = linearLayoutManager.d1();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = this.c;
            if (linearLayoutManager2 != null) {
                boolean z = true;
                int b1 = (d1 - linearLayoutManager2.b1()) + 1;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    androidx.recyclerview.widget.h1 adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        i = adapter.getItemCount();
                    } else {
                        i = 0;
                    }
                    this.h = i;
                    if (i <= b1) {
                        z = false;
                    }
                    gj.m.k0(this, z);
                    c();
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("recyclerView");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("layoutManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("layoutManager");
        throw null;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "indexByPosition");
        this.b = recyclerView;
        this.d = function1;
        androidx.recyclerview.widget.LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.Intrinsics.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.c = layoutManager;
        recyclerView.addOnScrollListener(new b81.a0(this));
        a();
    }

    public final void c() {
        if (!this.i) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                if (this.b != null) {
                    setContainerAndScrollBarPosition(getHeight() * (computeVerticalScrollOffset / r3.computeVerticalScrollRange()));
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("recyclerView");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("recyclerView");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (!this.i) {
            int layoutDirection = getLayoutDirection();
            int i = this.a;
            if (layoutDirection != 1 ? motionEvent.getX() <= getWidth() - i : motionEvent.getX() >= i) {
                return super.onTouchEvent(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        kotlin.Lazy lazy = this.f;
        kotlin.Lazy lazy2 = this.e;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    setContainerAndScrollBarPosition(motionEvent.getY());
                    setRecyclerViewPosition(motionEvent.getY());
                    return true;
                }
            }
            this.i = false;
            java.lang.Object value = lazy.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            gj.m.h0((android.view.View) value);
            ((com.truecaller.ui.view.TintedImageView) lazy2.getValue()).setSelected(false);
            return true;
        }
        float y = motionEvent.getY();
        int height = ((com.truecaller.ui.view.TintedImageView) lazy2.getValue()).getHeight();
        float y2 = ((com.truecaller.ui.view.TintedImageView) lazy2.getValue()).getY();
        float f = height + y2;
        if (y2 <= y && y <= f) {
            this.i = true;
            java.lang.Object value2 = lazy.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
            gj.m.j0((android.view.View) value2);
            ((com.truecaller.ui.view.TintedImageView) lazy2.getValue()).setSelected(true);
            setContainerAndScrollBarPosition(motionEvent.getY());
            setRecyclerViewPosition(motionEvent.getY());
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
