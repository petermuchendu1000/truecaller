package com.truecaller.details_view.ui.comments.withads;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CommentsFooterView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int v = 0;
    public yc3.d s;
    public final boolean t;
    public final ea1.g u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsFooterView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.truecaller.details_view.ui.comments.single.SingleCommentView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.truecaller.details_view.ui.comments.single.SingleCommentView, android.view.View, java.lang.Object] */
    public final void F(java.util.List list, db1.o oVar, db1.o oVar2) {
        db1.o oVar3;
        db1.o oVar4;
        com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) kotlin.collections.CollectionsKt.X(0, list);
        com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) kotlin.collections.CollectionsKt.X(1, list);
        com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel3 = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) kotlin.collections.CollectionsKt.X(2, list);
        ea1.g gVar = this.u;
        if (commentUiModel != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = gVar.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "firstComment");
            gj.m.j0(constraintLayout);
            com.truecaller.details_view.ui.comments.single.SingleCommentView singleCommentView = gVar.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "commentUiModel");
            singleCommentView.G(commentUiModel, false, null, oVar, oVar2);
            oVar3 = oVar;
            oVar4 = oVar2;
        } else {
            oVar3 = oVar;
            oVar4 = oVar2;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = gVar.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "firstComment");
            gj.m.f0(constraintLayout2);
            android.view.View view = gVar.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "postedDivider");
            gj.m.f0(view);
        }
        if (commentUiModel2 != null) {
            android.view.View view2 = gVar.c;
            ?? r3 = gVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "firstDivider");
            gj.m.j0(view2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) r3, "secondComment");
            gj.m.j0((android.view.View) r3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "commentUiModel");
            r3.G(commentUiModel2, false, null, oVar3, oVar4);
        } else {
            android.view.View view3 = gVar.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view3, "firstDivider");
            gj.m.f0(view3);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = gVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout3, "secondComment");
            gj.m.f0(constraintLayout3);
        }
        if (commentUiModel3 != null) {
            android.view.View view4 = gVar.g;
            ?? r33 = gVar.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view4, "secondDivider");
            gj.m.j0(view4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) r33, "thirdComment");
            gj.m.j0((android.view.View) r33);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel3, "commentUiModel");
            r33.G(commentUiModel3, false, null, oVar3, oVar4);
            return;
        }
        android.view.View view5 = gVar.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view5, "secondDivider");
        gj.m.f0(view5);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = gVar.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout4, "thirdComment");
        gj.m.f0(constraintLayout4);
        android.view.View view6 = gVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view6, "thirdDivider");
        gj.m.f0(view6);
    }

    public final void G(boolean z, db1.p pVar) {
        ea1.g gVar = this.u;
        android.view.View view = gVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "thirdDivider");
        gj.m.k0(view, z);
        com.google.android.material.button.MaterialButton materialButton = gVar.j;
        gj.m.k0(materialButton, z);
        materialButton.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(pVar, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final ea1.g getBinding() {
        return this.u;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsFooterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CommentsFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            ((db1.baz) X3()).getClass();
        }
        android.view.LayoutInflater.from(context).inflate(2131560978, (android.view.ViewGroup) this);
        int i3 = 2131363933;
        com.truecaller.details_view.ui.comments.single.SingleCommentView singleCommentView = (com.truecaller.details_view.ui.comments.single.SingleCommentView) df0.qux.o(2131363933, this);
        if (singleCommentView != null) {
            i3 = 2131363934;
            android.view.View o = df0.qux.o(2131363934, this);
            if (o != null) {
                i3 = 2131365768;
                com.truecaller.details_view.ui.comments.single.PostedSingleCommentView postedSingleCommentView = (com.truecaller.details_view.ui.comments.single.PostedSingleCommentView) df0.qux.o(2131365768, this);
                if (postedSingleCommentView != null) {
                    i3 = 2131365770;
                    android.view.View o2 = df0.qux.o(2131365770, this);
                    if (o2 != null) {
                        i3 = 2131366302;
                        com.truecaller.details_view.ui.comments.single.SingleCommentView singleCommentView2 = (com.truecaller.details_view.ui.comments.single.SingleCommentView) df0.qux.o(2131366302, this);
                        if (singleCommentView2 != null) {
                            i3 = 2131366303;
                            android.view.View o3 = df0.qux.o(2131366303, this);
                            if (o3 != null) {
                                i3 = 2131366974;
                                com.truecaller.details_view.ui.comments.single.SingleCommentView singleCommentView3 = (com.truecaller.details_view.ui.comments.single.SingleCommentView) df0.qux.o(2131366974, this);
                                if (singleCommentView3 != null) {
                                    i3 = 2131366975;
                                    android.view.View o4 = df0.qux.o(2131366975, this);
                                    if (o4 != null) {
                                        i3 = 2131367406;
                                        com.google.android.material.button.MaterialButton o5 = df0.qux.o(2131367406, this);
                                        if (o5 != null) {
                                            ea1.g gVar = new ea1.g(this, singleCommentView, o, postedSingleCommentView, o2, singleCommentView2, o3, singleCommentView3, o4, o5);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gVar, "inflate(...)");
                                            this.u = gVar;
                                            return;
                                        }
                                    }
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
