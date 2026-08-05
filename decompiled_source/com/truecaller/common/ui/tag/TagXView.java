package com.truecaller.common.ui.tag;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TagXView extends android.widget.LinearLayout {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) this.a.getValue();
    }

    private final com.truecaller.common.ui.textview.GoldShineTextView getTitle() {
        return (com.truecaller.common.ui.textview.GoldShineTextView) this.b.getValue();
    }

    public final void a() {
        getTitle().k();
        getIcon().setImageTintList(android.content.res.ColorStateList.valueOf(getContext().getColor(2131101675)));
    }

    public final void b(float f) {
        getTitle().setTextSize(0, f);
    }

    public final void setIcon(@org.jetbrains.annotations.Nullable java.lang.String str) {
        com.bumptech.glide.baz.e(getContext()).q(str).P(getIcon());
    }

    public final void setIconTint(int i) {
        getIcon().setImageTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    public final void setTitleColor(int i) {
        getTitle().setTextColor(i);
        getIcon().clearColorFilter();
    }

    public final void setTitleTextAppearance(int i) {
        getTitle().setTextAppearance(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIcon(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
        getIcon().setImageDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagXView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = gj.m.I(2131364521, this);
        this.b = gj.m.I(2131367033, this);
        gj.m.z(this, 2131560046, true);
        setBackgroundResource(2131231334);
    }

    public /* synthetic */ TagXView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
