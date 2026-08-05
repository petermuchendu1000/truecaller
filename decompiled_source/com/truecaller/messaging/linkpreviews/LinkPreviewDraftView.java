package com.truecaller.messaging.linkpreviews;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LinkPreviewDraftView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkPreviewDraftView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.view.View getBtnRemove() {
        return (android.view.View) this.s.getValue();
    }

    private final android.widget.TextView getDescription() {
        return (android.widget.TextView) this.t.getValue();
    }

    private final android.widget.ImageView getImage() {
        return (android.widget.ImageView) this.v.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.u.getValue();
    }

    public final void setDescription(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getDescription().setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setImage(@org.jetbrains.annotations.Nullable android.net.Uri uri) {
        android.widget.ImageView image = getImage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image, "<get-image>(...)");
        if (uri == null) {
            gj.m.h0(image);
        } else {
            gj.m.j0(image);
        }
        com.bumptech.glide.baz.f(this).o(uri).E(new uf.l[]{new java.lang.Object(), new dg.u((int) getResources().getDimension(2131166764))}).P(getImage());
    }

    public final void setOnRemoveClickListener(@org.jetbrains.annotations.NotNull android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickListener, "listener");
        getBtnRemove().setOnClickListener(onClickListener);
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkPreviewDraftView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkPreviewDraftView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131362580, this);
        this.t = gj.m.I(2131363468, this);
        this.u = gj.m.I(2131367033, this);
        this.v = gj.m.I(2131364553, this);
        android.view.View.inflate(context, 2131561039, this);
        setBackgroundResource(2131231239);
    }

    public /* synthetic */ LinkPreviewDraftView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
