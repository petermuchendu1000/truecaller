package com.truecaller.details_view.ui.comments.keywords;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CommentsKeywordsView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public yc3.d s;
    public final boolean t;
    public final ea1.i u;
    public ab1.bar v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getPresenter$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final ab1.bar getPresenter() {
        ab1.bar barVar = this.v;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        getPresenter().a = new ab1.a(this.u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        getPresenter().m1();
    }

    public final void set(@org.jetbrains.annotations.NotNull com.truecaller.data.entity.Contact contact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        ((ab1.qux) getPresenter()).d2(contact);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull ab1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.v = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CommentsKeywordsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsKeywordsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            tx.e eVar = ((ab1.c) X3()).e;
            tx.w wVar = eVar.f;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            g11.p pVar = (g11.p) wVar.Xl.get();
            qa1.baz bazVar = (qa1.baz) eVar.g.h.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "commentsRepository");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "analytics");
            this.v = new ab1.qux(coroutineContext, pVar, "DetailsViewV2", bazVar);
        }
        ea1.i a = ea1.i.a(android.view.LayoutInflater.from(context), this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
        this.u = a;
        setBackground(context.getDrawable(2131231198));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        gj.m.f0(constraintLayout);
    }
}
