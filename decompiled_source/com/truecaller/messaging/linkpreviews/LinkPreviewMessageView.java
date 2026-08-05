package com.truecaller.messaging.linkpreviews;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LinkPreviewMessageView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkPreviewMessageView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getBigImage() {
        return (android.widget.ImageView) this.u.getValue();
    }

    private final android.widget.TextView getDescription() {
        return (android.widget.TextView) this.s.getValue();
    }

    private final android.widget.ImageView getImage() {
        return (android.widget.ImageView) this.t.getValue();
    }

    private final android.view.View getPlayButton() {
        return (android.view.View) this.w.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.v.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(android.net.Uri uri, android.widget.ImageView imageView) {
        com.bumptech.glide.baz.f(this).o(uri).E(new uf.l[]{new java.lang.Object(), new dg.u((int) getResources().getDimension(2131166764))}).P(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(android.net.Uri uri, com.truecaller.messaging.conversation.LinkPreviewType linkPreviewType) {
        java.lang.Boolean bool;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkPreviewType, "type");
        if (uri != null) {
            bool = java.lang.Boolean.valueOf(gf0.e.E(uri));
        } else {
            bool = null;
        }
        boolean D = yp.d0.D(bool);
        boolean z = !D;
        int i2 = o22.c.a[linkPreviewType.ordinal()];
        boolean z2 = true;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    android.widget.ImageView bigImage = getBigImage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigImage, "<get-bigImage>(...)");
                    gj.m.f0(bigImage);
                    android.widget.ImageView image = getImage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image, "<get-image>(...)");
                    gj.m.j0(image);
                    getImage().setImageResource(2131232572);
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                android.widget.ImageView image2 = getImage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image2, "<get-image>(...)");
                gj.m.f0(image2);
                android.widget.ImageView bigImage2 = getBigImage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigImage2, "<get-bigImage>(...)");
                gj.m.k0(bigImage2, z);
                android.widget.ImageView bigImage3 = getBigImage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigImage3, "<get-bigImage>(...)");
                F(uri, bigImage3);
            }
        } else {
            android.widget.ImageView bigImage4 = getBigImage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigImage4, "<get-bigImage>(...)");
            gj.m.f0(bigImage4);
            android.widget.ImageView image3 = getImage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image3, "<get-image>(...)");
            gj.m.k0(image3, z);
            android.widget.ImageView image4 = getImage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image4, "<get-image>(...)");
            F(uri, image4);
        }
        android.view.View playButton = getPlayButton();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(playButton, "<get-playButton>(...)");
        if (D || linkPreviewType != com.truecaller.messaging.conversation.LinkPreviewType.PLAYABLE) {
            z2 = false;
        }
        gj.m.k0(playButton, z2);
        android.view.ViewGroup.LayoutParams layoutParams = getImage().getLayoutParams();
        android.content.res.Resources resources = getContext().getResources();
        if (linkPreviewType == com.truecaller.messaging.conversation.LinkPreviewType.EMPTY) {
            i = 2131165532;
        } else {
            i = 2131165539;
        }
        layoutParams.height = (int) resources.getDimension(i);
    }

    public final void setDescription(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getDescription().setText(str);
    }

    public final void setOnPlayButtonClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        getPlayButton().setOnClickListener(new aq2.g(16, function1));
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    public final void setTitleIcon(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        android.widget.TextView title = getTitle();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(title, "<get-title>(...)");
        ge0.i.S(title, (android.graphics.drawable.Drawable) null, drawable, 11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkPreviewMessageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkPreviewMessageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131363468, this);
        this.t = gj.m.I(2131364553, this);
        this.u = gj.m.I(2131362465, this);
        this.v = gj.m.I(2131367033, this);
        this.w = gj.m.I(2131365746, this);
        android.view.View.inflate(context, 2131561052, this);
        setBackgroundResource(2131231239);
    }

    public /* synthetic */ LinkPreviewMessageView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
