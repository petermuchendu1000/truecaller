package com.truecaller.details_view.ui.businessDetails.viewImage;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BizDetailViewImageView extends bb1.bar implements va1.baz {
    public static final /* synthetic */ int z = 0;
    public va1.e v;
    public va1.bar w;
    public final ea1.e x;
    public final kotlin.Lazy y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailViewImageView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final androidx.recyclerview.widget.d1 getPagerSnapHelper() {
        return (androidx.recyclerview.widget.d1) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.h1, va1.e] */
    public final void F() {
        if (this.v == null) {
            this.v = new androidx.recyclerview.widget.h1();
        }
        ea1.e eVar = this.x;
        androidx.recyclerview.widget.RecyclerView recyclerView = eVar.b;
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setNestedScrollingEnabled(false);
        }
        if (recyclerView.getAdapter() == null) {
            va1.e eVar2 = this.v;
            if (eVar2 != null) {
                recyclerView.setAdapter(eVar2);
                getPagerSnapHelper().a(eVar.b);
            } else {
                kotlin.jvm.internal.Intrinsics.n("businessImagesAdapter");
                throw null;
            }
        }
    }

    @org.jetbrains.annotations.NotNull
    public final ea1.e getBinding() {
        return this.x;
    }

    @org.jetbrains.annotations.NotNull
    public final va1.bar getPresenter() {
        va1.bar barVar = this.w;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        ((va1.qux) getPresenter()).u0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        getPresenter().m1();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull va1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.w = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailViewImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailViewImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizDetailViewImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2, 4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(context).inflate(2131560946, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i3 = 2131366198;
        androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131366198, inflate);
        if (o != null) {
            i3 = 2131367204;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367204, inflate);
            if (textView != null) {
                ea1.e eVar = new ea1.e(textView, inflate, o);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                this.x = eVar;
                this.y = kotlin.LazyKt.lazy(new v1.k1(6));
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public /* synthetic */ BizDetailViewImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
