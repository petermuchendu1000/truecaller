package com.truecaller.details_view.ui.comments.withads;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CommentsHeaderView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int v = 0;
    public yc3.d s;
    public final boolean t;
    public final ea1.h u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsHeaderView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void F(db1.p pVar) {
        android.widget.TextView textView = this.u.b;
        gj.m.j0(textView);
        textView.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(pVar, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(long j) {
        this.u.h.setText(getContext().getString(2132020509, java.lang.Long.valueOf(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final ea1.h getBinding() {
        return this.u;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CommentsHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            ((db1.qux) X3()).getClass();
        }
        android.view.LayoutInflater.from(context).inflate(2131560979, (android.view.ViewGroup) this);
        int i3 = 2131362168;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131362168, this);
        if (textView != null) {
            i3 = 2131362169;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131362169, this);
            if (frameLayout != null) {
                i3 = 2131363080;
                com.truecaller.details_view.ui.comments.keywords.CommentsKeywordsView commentsKeywordsView = (com.truecaller.details_view.ui.comments.keywords.CommentsKeywordsView) df0.qux.o(2131363080, this);
                if (commentsKeywordsView != null) {
                    i3 = 2131363083;
                    com.truecaller.common.ui.ShimmerLoadingView o = df0.qux.o(2131363083, this);
                    if (o != null) {
                        i3 = 2131363933;
                        com.truecaller.details_view.ui.comments.single.SingleCommentView singleCommentView = (com.truecaller.details_view.ui.comments.single.SingleCommentView) df0.qux.o(2131363933, this);
                        if (singleCommentView != null) {
                            i3 = 2131365768;
                            com.truecaller.details_view.ui.comments.single.PostedSingleCommentView postedSingleCommentView = (com.truecaller.details_view.ui.comments.single.PostedSingleCommentView) df0.qux.o(2131365768, this);
                            if (postedSingleCommentView != null) {
                                i3 = 2131367033;
                                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, this);
                                if (textView2 != null) {
                                    ea1.h hVar = new ea1.h(this, textView, frameLayout, commentsKeywordsView, o, singleCommentView, postedSingleCommentView, textView2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hVar, "inflate(...)");
                                    this.u = hVar;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
