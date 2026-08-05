package com.truecaller.call_assistant.core.callui.ui.widgets.callerlabel;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCallerLabelView extends androidx.appcompat.widget.AppCompatTextView implements eo0.baz {
    public eo0.bar h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantCallerLabelView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final eo0.bar getPresenter() {
        eo0.bar barVar = this.h;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.TextView*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) b0Var.c.get();
        lu0.baz bazVar = (lu0.baz) b0Var.d.get();
        tx.w wVar = (tx.w) b0Var.a;
        u03.b0 b0Var2 = (u03.b0) wVar.v4.get();
        es.baz.k(b0Var2);
        this.h = new dw2.qux(coroutineContext, bazVar, new pz1.bar(b0Var2, wVar.H.b.k4()));
        getPresenter().u0(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eo0.baz
    public void setCallerLabel(@org.jetbrains.annotations.NotNull eo0.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "callerLabel");
        setText(bVar.a);
        setBackgroundResource(bVar.b);
        setTextColor(getResources().getColor(bVar.c));
        gj.m.j0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eo0.baz
    public void setCallerLabelIcon(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "icon");
        android.content.res.Resources resources = getContext().getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int p = (int) fe0.m.p(resources, 16.0f);
        com.bumptech.glide.g q = com.bumptech.glide.baz.e(getContext()).q(str);
        q.Q(new com.truecaller.search.global.m0(p, this, 1), (mg.b) null, q, qg.b.a);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull eo0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.h = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantCallerLabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantCallerLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantCallerLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
