package com.truecaller.details_view.ui.comments.single;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SingleCommentView extends bb1.bar {
    public static final /* synthetic */ int z = 0;
    public u03.f0 v;
    public final cw2.bar w;
    public final kotlin.Lazy x;
    public final bb1.b y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleCommentView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static android.view.TouchDelegate F(android.view.View view, int i, int i2) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        int width = i - rect.width();
        int i3 = 0;
        if (width < 0) {
            width = 0;
        }
        float f = width / 2;
        int height = i2 - rect.height();
        if (height >= 0) {
            i3 = height;
        }
        float f2 = i3 / 2;
        if (f == 0.0f && f2 == 0.0f) {
            return null;
        }
        int i4 = (int) f;
        rect.left -= i4;
        rect.right += i4;
        int i5 = (int) f2;
        rect.top -= i5;
        rect.bottom += i5;
        return new android.view.TouchDelegate(rect, view);
    }

    private final int getMinUpDownVoteWidthPx() {
        return ((java.lang.Number) this.x.getValue()).intValue();
    }

    private final void setAvatar(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        w31.c cVar;
        cw2.bar barVar = this.w;
        w31.c presenter = barVar.f.getPresenter();
        if (presenter instanceof w31.c) {
            cVar = presenter;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new w31.c(getThemedResourceProvider(), 0);
        }
        barVar.f.setPresenter(cVar);
        cVar.C2(avatarXConfig, false);
    }

    public final void G(final com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel, boolean z2, db1.o oVar, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12) {
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = commentUiModel.e;
        com.truecaller.details_view.ui.comments.single.model.ThumbState thumbState = commentUiModel.i;
        com.truecaller.details_view.ui.comments.single.model.ThumbState thumbState2 = commentUiModel.h;
        setAvatar(avatarXConfig);
        cw2.bar barVar = this.w;
        android.widget.TextView textView = barVar.g;
        android.widget.TextView textView2 = (android.widget.TextView) barVar.i;
        android.widget.TextView textView3 = (android.widget.TextView) barVar.k;
        android.widget.ImageView imageView = (android.widget.ImageView) barVar.b;
        android.widget.ImageView imageView2 = (android.widget.ImageView) barVar.j;
        textView.setText(commentUiModel.c);
        android.widget.ImageView imageView3 = (android.widget.ImageView) barVar.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView3, "imgVerified");
        gj.m.k0(imageView3, commentUiModel.d);
        barVar.h.setText(commentUiModel.f);
        com.truecaller.common.ui.textview.ExpandableTextView expandableTextView = barVar.c;
        expandableTextView.setText(commentUiModel.g);
        if (z2) {
            expandableTextView.setOnResizeClickListener(new bb1.baz(1, oVar));
            expandableTextView.h(com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.SHOW_MORE, com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.COLLAPSED, 2);
        }
        if ((thumbState2 instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpDefault) || (thumbState2 instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed)) {
            final int i = 0;
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: bb1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i2 = i;
                    com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = commentUiModel;
                    kotlin.jvm.functions.Function1 function13 = function1;
                    switch (i2) {
                        case 0:
                            int i3 = com.truecaller.details_view.ui.comments.single.SingleCommentView.z;
                            if (function13 != null) {
                                function13.invoke(commentUiModel2);
                                return;
                            }
                            return;
                        default:
                            int i4 = com.truecaller.details_view.ui.comments.single.SingleCommentView.z;
                            if (function13 != null) {
                                function13.invoke(commentUiModel2);
                                return;
                            }
                            return;
                    }
                }
            });
            imageView2.setColorFilter(thumbState2.d, android.graphics.PorterDuff.Mode.SRC_IN);
            imageView2.setImageResource(thumbState2.a);
            textView3.setTextColor(thumbState2.c);
            textView3.setText(thumbState2.b);
        }
        if (!(thumbState instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownDefault) && !(thumbState instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownPressed)) {
            return;
        }
        final int i2 = 1;
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: bb1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = commentUiModel;
                kotlin.jvm.functions.Function1 function13 = function12;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.details_view.ui.comments.single.SingleCommentView.z;
                        if (function13 != null) {
                            function13.invoke(commentUiModel2);
                            return;
                        }
                        return;
                    default:
                        int i4 = com.truecaller.details_view.ui.comments.single.SingleCommentView.z;
                        if (function13 != null) {
                            function13.invoke(commentUiModel2);
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setColorFilter(thumbState.d, android.graphics.PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(thumbState.a);
        textView2.setTextColor(thumbState.c);
        textView2.setText(thumbState.b);
    }

    @org.jetbrains.annotations.NotNull
    public final u03.f0 getThemedResourceProvider() {
        u03.f0 f0Var = this.v;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("themedResourceProvider");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        cw2.bar barVar = this.w;
        android.widget.ImageView imageView = (android.widget.ImageView) barVar.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "ivUpVote");
        android.view.TouchDelegate F = F(imageView, getMinUpDownVoteWidthPx(), getMinUpDownVoteWidthPx());
        bb1.b bVar = this.y;
        if (F != null) {
            bVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(F, "delegate");
            bVar.b.add(F);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) barVar.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView2, "ivDownVote");
        android.view.TouchDelegate F2 = F(imageView2, getMinUpDownVoteWidthPx(), getMinUpDownVoteWidthPx());
        if (F2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(F2, "delegate");
            bVar.b.add(F2);
        }
        setTouchDelegate(bVar);
    }

    public final void setThemedResourceProvider(@org.jetbrains.annotations.NotNull u03.f0 f0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.v = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561089, (android.view.ViewGroup) this);
        int i3 = 2131362381;
        com.truecaller.common.ui.avatar.AvatarXView o = df0.qux.o(2131362381, this);
        if (o != null) {
            i3 = 2131363076;
            com.truecaller.common.ui.textview.ExpandableTextView o2 = df0.qux.o(2131363076, this);
            if (o2 != null) {
                i3 = 2131364607;
                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364607, this);
                if (imageView != null) {
                    i3 = 2131364825;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364825, this);
                    if (imageView2 != null) {
                        i3 = 2131364846;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) df0.qux.o(2131364846, this);
                        if (imageView3 != null) {
                            i3 = 2131365612;
                            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365612, this);
                            if (textView != null) {
                                i3 = 2131365769;
                                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131365769, this);
                                if (textView2 != null) {
                                    i3 = 2131366377;
                                    if (((android.widget.TextView) df0.qux.o(2131366377, this)) != null) {
                                        i3 = 2131367202;
                                        android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131367202, this);
                                        if (textView3 != null) {
                                            i3 = 2131367235;
                                            android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131367235, this);
                                            if (textView4 != null) {
                                                cw2.bar barVar = new cw2.bar(this, o, o2, imageView, imageView2, imageView3, textView, textView2, textView3, textView4);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                                this.w = barVar;
                                                this.x = kotlin.LazyKt.lazy(new a02.baz(this, 25));
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView3, "ivUpVote");
                                                this.y = new bb1.b(imageView3);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }

    public /* synthetic */ SingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
