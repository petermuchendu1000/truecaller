package com.truecaller.details_view.ui.comments.single;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PostedSingleCommentView extends bb1.bar {
    public static final /* synthetic */ int x = 0;
    public u03.f0 v;
    public final d91.d w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostedSingleCommentView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setAvatar(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        w31.c cVar;
        d91.d dVar = this.w;
        w31.c presenter = ((com.truecaller.common.ui.avatar.AvatarXView) dVar.e).getPresenter();
        if (presenter instanceof w31.c) {
            cVar = presenter;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new w31.c(getThemedResourceProvider(), 0);
        }
        ((com.truecaller.common.ui.avatar.AvatarXView) dVar.e).setPresenter(cVar);
        cVar.C2(avatarXConfig, false);
    }

    public final void F(com.truecaller.details_view.ui.comments.single.model.PostedCommentUiModel postedCommentUiModel, boolean z, db1.o oVar) {
        setAvatar(postedCommentUiModel.e);
        d91.d dVar = this.w;
        ((android.widget.TextView) dVar.d).setText(postedCommentUiModel.c);
        android.widget.ImageView imageView = (android.widget.ImageView) dVar.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "imgVerified");
        gj.m.k0(imageView, postedCommentUiModel.d);
        ((android.widget.TextView) dVar.g).setText(postedCommentUiModel.f);
        com.truecaller.common.ui.textview.ExpandableTextView expandableTextView = dVar.c;
        expandableTextView.setText(postedCommentUiModel.g);
        if (z) {
            expandableTextView.setOnResizeClickListener(new bb1.baz(0, oVar));
            expandableTextView.h(com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.SHOW_MORE, com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.COLLAPSED, 2);
        }
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

    public final void set(@org.jetbrains.annotations.NotNull com.truecaller.details_view.ui.comments.single.model.PostedCommentUiModel postedCommentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postedCommentUiModel, "postedCommentUiModel");
        F(postedCommentUiModel, false, null);
    }

    public final void setThemedResourceProvider(@org.jetbrains.annotations.NotNull u03.f0 f0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.v = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostedSingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostedSingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostedSingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561059, (android.view.ViewGroup) this);
        int i3 = 2131362381;
        com.truecaller.common.ui.avatar.AvatarXView o = df0.qux.o(2131362381, this);
        if (o != null) {
            i3 = 2131363076;
            com.truecaller.common.ui.textview.ExpandableTextView o2 = df0.qux.o(2131363076, this);
            if (o2 != null) {
                i3 = 2131364607;
                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364607, this);
                if (imageView != null) {
                    i3 = 2131365612;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365612, this);
                    if (textView != null) {
                        i3 = 2131365769;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131365769, this);
                        if (textView2 != null) {
                            i3 = 2131366377;
                            if (((android.widget.TextView) df0.qux.o(2131366377, this)) != null) {
                                d91.d dVar = new d91.d((android.view.ViewGroup) this, (android.view.View) o, (android.view.View) o2, (android.view.View) imageView, (android.view.View) textView, (android.view.View) textView2, 6);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                                this.w = dVar;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }

    public /* synthetic */ PostedSingleCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
