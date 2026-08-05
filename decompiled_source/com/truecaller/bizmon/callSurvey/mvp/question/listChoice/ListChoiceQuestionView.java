package com.truecaller.bizmon.callSurvey.mvp.question.listChoice;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ListChoiceQuestionView extends android.widget.FrameLayout implements vh0.baz, bd3.qux {
    public static final /* synthetic */ int g = 0;
    public yc3.d a;
    public boolean b;
    public kh0.c c;
    public vh0.d d;
    public vh0.bar e;
    public final fi0.p f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListChoiceQuestionView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final vh0.d getAdapter() {
        vh0.d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.Intrinsics.n("adapter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.p getBinding() {
        return this.f;
    }

    @org.jetbrains.annotations.NotNull
    public final vh0.bar getPresenter() {
        vh0.bar barVar = this.e;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((vh0.qux) getPresenter()).u0(this);
        fi0.p pVar = this.f;
        pVar.f.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        vh0.d adapter = getAdapter();
        vh0.e eVar = new vh0.e(this, 0);
        adapter.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "onItemClick");
        adapter.o = eVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = pVar.f;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(getAdapter());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((vh0.qux) getPresenter()).m1();
    }

    public final void setAdapter(@org.jetbrains.annotations.NotNull vh0.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.d = dVar;
    }

    @Override // vh0.baz
    public void setMargins(int i) {
        fi0.p pVar = this.f;
        android.view.ViewGroup.LayoutParams layoutParams = pVar.e.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, 0, i, i);
        pVar.e.setLayoutParams(marginLayoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = pVar.g.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(0, i, 0, 0);
        pVar.g.setLayoutParams(marginLayoutParams2);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull vh0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.e = barVar;
    }

    @Override // vh0.baz
    public void setRecyclerViewLayoutMargin(int i) {
        fi0.p pVar = this.f;
        android.view.ViewGroup.LayoutParams layoutParams = pVar.d.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, i, 0, 0);
        pVar.d.setLayoutParams(marginLayoutParams);
    }

    public /* synthetic */ ListChoiceQuestionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListChoiceQuestionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            tx.w wVar = ((tx.d0) ((vh0.f) X3())).c;
            this.d = new vh0.d((u03.f0) wVar.q9.get());
            this.e = new vh0.qux((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (u03.b0) wVar.v4.get());
        }
        android.view.LayoutInflater.from(context).inflate(2131559939, this);
        int i = 2131362403;
        android.view.View o = df0.qux.o(2131362403, this);
        if (o != null) {
            i = 2131364826;
            com.airbnb.lottie.LottieAnimationView o2 = df0.qux.o(2131364826, this);
            if (o2 != null) {
                i = 2131364920;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364920, this);
                if (frameLayout != null) {
                    i = 2131364923;
                    androidx.constraintlayout.widget.ConstraintLayout o3 = df0.qux.o(2131364923, this);
                    if (o3 != null) {
                        i = 2131366194;
                        androidx.recyclerview.widget.RecyclerView o4 = df0.qux.o(2131366194, this);
                        if (o4 != null) {
                            i = 2131367230;
                            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367230, this);
                            if (textView != null) {
                                fi0.p pVar = new fi0.p(this, o, o2, frameLayout, o3, o4, textView);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pVar, "inflate(...)");
                                this.f = pVar;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
