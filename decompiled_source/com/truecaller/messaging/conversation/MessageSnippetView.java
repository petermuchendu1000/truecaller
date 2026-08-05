package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageSnippetView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int h = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageSnippetView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getAttachmentImageView() {
        return (android.widget.ImageView) this.d.getValue();
    }

    private final android.view.View getDismissButton() {
        return (android.view.View) this.e.getValue();
    }

    private final android.widget.TextView getSnippetContentText() {
        return (android.widget.TextView) this.f.getValue();
    }

    private final android.widget.TextView getSnippetSenderText() {
        return (android.widget.TextView) this.g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setThumbnailPreview(android.net.Uri uri) {
        android.widget.ImageView attachmentImageView = getAttachmentImageView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView, "<get-attachmentImageView>(...)");
        gj.m.k0(attachmentImageView, true);
        com.bumptech.glide.g o = com.bumptech.glide.baz.e(getContext()).o(uri);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166710);
        o.q(dimensionPixelSize, dimensionPixelSize).D(new uf.e(kotlin.collections.y.j(new dg.b[]{new java.lang.Object(), new dg.u(getContext().getResources().getDimensionPixelSize(2131166709))})), true).P(getAttachmentImageView());
    }

    public final void a() {
        android.widget.TextView snippetSenderText = getSnippetSenderText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(snippetSenderText, "<get-snippetSenderText>(...)");
        gj.m.k0(snippetSenderText, false);
        getSnippetContentText().setText(getContext().getString(2132018168));
        getSnippetContentText().setAlpha(0.7f);
        android.view.ViewGroup.LayoutParams layoutParams = getSnippetContentText().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(15, -1);
        getSnippetContentText().setLayoutParams(layoutParams2);
        android.widget.ImageView attachmentImageView = getAttachmentImageView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView, "<get-attachmentImageView>(...)");
        gj.m.k0(attachmentImageView, false);
        setEnabled(false);
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getSnippetSenderText().setText(2132017763);
        getSnippetSenderText().setTextColor(bi3.a.s(getContext(), 2130970634));
        android.widget.TextView snippetSenderText = getSnippetSenderText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(snippetSenderText, "<get-snippetSenderText>(...)");
        gj.m.k0(snippetSenderText, true);
        getSnippetContentText().setText(str);
        getSnippetContentText().setTextColor(bi3.a.s(getContext(), 2130970931));
        getSnippetContentText().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        bi3.a.B(this, 2130970607);
        android.widget.ImageView attachmentImageView = getAttachmentImageView();
        kotlin.jvm.internal.Intrinsics.d(attachmentImageView);
        gj.m.k0(attachmentImageView, true);
        attachmentImageView.setBackground(null);
        attachmentImageView.setImageResource(2131233358);
        attachmentImageView.setColorFilter(bi3.a.s(attachmentImageView.getContext(), 2130970634));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    public final void c(com.truecaller.messaging.data.types.ReplySnippet replySnippet, java.lang.String str, boolean z) {
        com.truecaller.messaging.data.types.TextEntity textEntity;
        com.truecaller.messaging.data.types.TextEntity textEntity2;
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replySnippet, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
        boolean z2 = this.a;
        if (z2) {
            getSnippetContentText().setTextColor(bi3.a.s(getContext(), 2130970800));
            getSnippetSenderText().setTextColor(bi3.a.s(getContext(), 2130970525));
            bi3.a.B(this, 2130970511);
        } else {
            getSnippetContentText().setTextColor(bi3.a.s(getContext(), 2130970563));
            getSnippetSenderText().setTextColor(bi3.a.s(getContext(), 2130970527));
            bi3.a.B(this, 2130970512);
        }
        android.widget.TextView snippetSenderText = getSnippetSenderText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(snippetSenderText, "<get-snippetSenderText>(...)");
        gj.m.k0(snippetSenderText, true);
        getSnippetSenderText().setText(str);
        android.widget.ImageView attachmentImageView = getAttachmentImageView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView, "<get-attachmentImageView>(...)");
        gj.m.k0(attachmentImageView, false);
        getAttachmentImageView().clearColorFilter();
        com.truecaller.messaging.data.types.TextEntity textEntity3 = null;
        getAttachmentImageView().setBackgroundTintList(null);
        getSnippetContentText().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        java.util.List<com.truecaller.messaging.data.types.Entity> list = replySnippet.c;
        for (com.truecaller.messaging.data.types.Entity entity : list) {
            if (entity.getC()) {
                setThumbnailPreview(((com.truecaller.messaging.data.types.ImageEntity) entity).i);
                getSnippetContentText().setText(getContext().getString(2132018202));
            } else if (entity.getA()) {
                setThumbnailPreview(((com.truecaller.messaging.data.types.ImageEntity) entity).i);
                getSnippetContentText().setText(getContext().getString(2132018193));
            } else if (entity.getB()) {
                setThumbnailPreview(((com.truecaller.messaging.data.types.VideoEntity) entity).i);
                getSnippetContentText().setText(getContext().getString(2132018194));
            } else {
                boolean a = entity.getA();
                int i3 = this.c;
                int i4 = this.b;
                if (a) {
                    com.truecaller.messaging.data.types.VCardEntity vCardEntity = (com.truecaller.messaging.data.types.VCardEntity) entity;
                    android.widget.ImageView attachmentImageView2 = getAttachmentImageView();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView2, "<get-attachmentImageView>(...)");
                    android.net.Uri uri = vCardEntity.y;
                    if (vCardEntity.x <= 1) {
                        i2 = 2131232190;
                    } else {
                        i2 = 2131232191;
                    }
                    if (uri != null && !uri.equals(android.net.Uri.EMPTY)) {
                        gj.m.k0(attachmentImageView2, true);
                        attachmentImageView2.setImageDrawable(null);
                        attachmentImageView2.clearColorFilter();
                        attachmentImageView2.setBackground(null);
                        attachmentImageView2.setBackgroundTintList(null);
                        attachmentImageView2.setImageTintList(null);
                        com.bumptech.glide.baz.e(attachmentImageView2.getContext()).o(uri).r(i2).f().i(wf.g.e).j(i2).P(attachmentImageView2);
                    } else {
                        gj.m.k0(attachmentImageView2, true);
                        attachmentImageView2.setBackground(null);
                        attachmentImageView2.setImageResource(i2);
                        attachmentImageView2.setColorFilter(i4);
                        attachmentImageView2.setBackgroundResource(2131234491);
                        attachmentImageView2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(i3));
                    }
                    android.widget.TextView snippetContentText = getSnippetContentText();
                    android.content.Context context = getAttachmentImageView().getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    snippetContentText.setText(lf.bar.x(vCardEntity, context));
                } else if (entity.getS()) {
                    android.widget.ImageView attachmentImageView3 = getAttachmentImageView();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView3, "<get-attachmentImageView>(...)");
                    gj.m.k0(attachmentImageView3, false);
                    getSnippetContentText().setText(getContext().getString(2132018234));
                    if (z2) {
                        i = 2130970521;
                    } else {
                        i = 2130970527;
                    }
                    getSnippetContentText().setCompoundDrawablesRelativeWithIntrinsicBounds(bi3.a.x(getContext(), 2131232757, i, android.graphics.PorterDuff.Mode.SRC_IN), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                } else if (entity.getU()) {
                    android.widget.TextView snippetContentText2 = getSnippetContentText();
                    java.lang.String str2 = ((com.truecaller.messaging.data.types.DocumentEntity) entity).w;
                    if (str2 == null) {
                        str2 = getContext().getString(2132018188);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                    }
                    snippetContentText2.setText(str2);
                    android.widget.ImageView attachmentImageView4 = getAttachmentImageView();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attachmentImageView4, "<get-attachmentImageView>(...)");
                    gj.m.k0(attachmentImageView4, true);
                    getAttachmentImageView().setBackground(null);
                    getAttachmentImageView().setImageResource(2131232185);
                    getAttachmentImageView().setColorFilter(i4);
                    getAttachmentImageView().setBackgroundResource(2131234491);
                    getAttachmentImageView().setBackgroundTintList(android.content.res.ColorStateList.valueOf(i3));
                } else if (entity.getV()) {
                    com.truecaller.messaging.data.types.LocationEntity locationEntity = (com.truecaller.messaging.data.types.LocationEntity) entity;
                    setThumbnailPreview(locationEntity.i);
                    getSnippetContentText().setText(locationEntity.w);
                }
            }
        }
        setEnabled(z);
        getSnippetContentText().setAlpha(1.0f);
        java.util.List<com.truecaller.messaging.data.types.Entity> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.truecaller.messaging.data.types.Entity entity2 : list2) {
            if (entity2 instanceof com.truecaller.messaging.data.types.TextEntity) {
                textEntity2 = (com.truecaller.messaging.data.types.TextEntity) entity2;
            } else {
                textEntity2 = null;
            }
            if (textEntity2 != null) {
                arrayList.add(textEntity2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((com.truecaller.messaging.data.types.TextEntity) next).i.length() > 0) {
                arrayList2.add(next);
            }
        }
        java.lang.String b0 = kotlin.collections.CollectionsKt.b0(arrayList2, "\n", (java.lang.String) null, (java.lang.String) null, new c1.n1(14), 30);
        if (b0.length() > 0) {
            getSnippetContentText().setText(t41.k0.a(b0));
            java.util.Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    textEntity = it2.next();
                    if (((com.truecaller.messaging.data.types.Entity) textEntity).getK()) {
                        break;
                    }
                } else {
                    textEntity = 0;
                    break;
                }
            }
            if (textEntity instanceof com.truecaller.messaging.data.types.TextEntity) {
                textEntity3 = textEntity;
            }
            if (textEntity3 != null && textEntity3.j) {
                java.util.List list3 = p12.b.a;
                android.widget.TextView snippetContentText3 = getSnippetContentText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(snippetContentText3, "<get-snippetContentText>(...)");
                p12.b.b(snippetContentText3, com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility.REMOVE);
            }
        }
    }

    public final void setDismissActionListener(@org.jetbrains.annotations.NotNull android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        getDismissButton().setOnClickListener(onClickListener);
    }

    public final void setDismissActionVisible(boolean z) {
        android.view.View dismissButton = getDismissButton();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dismissButton, "<get-dismissButton>(...)");
        gj.m.k0(dismissButton, z);
        if (z) {
            android.view.ViewGroup.LayoutParams layoutParams = getSnippetSenderText().getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            getSnippetSenderText().setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = getSnippetContentText().getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -1;
            getSnippetContentText().setLayoutParams(layoutParams4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageSnippetView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSnippetView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166764);
        this.d = gj.m.I(2131362343, this);
        this.e = gj.m.I(2131363534, this);
        this.f = gj.m.I(2131366528, this);
        this.g = gj.m.I(2131366529, this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131561053, this);
        setBackgroundResource(2131231242);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.e, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = obtainStyledAttributes.getInt(0, 0) == 1;
        this.a = z;
        if (z) {
            getSnippetContentText().setTextColor(bi3.a.s(context, 2130970800));
            bi3.a.B(this, 2130970511);
            this.b = bi3.a.s(context, 2130970547);
            this.c = bi3.a.s(context, 2130970511);
        } else {
            getSnippetContentText().setTextColor(bi3.a.s(context, 2130970563));
            bi3.a.B(this, 2130970512);
            this.b = bi3.a.s(context, 2130970549);
            this.c = bi3.a.s(context, 2130970767);
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ MessageSnippetView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
