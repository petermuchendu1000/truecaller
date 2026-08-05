package com.truecaller.contactrequest.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TipsBannerView extends androidx.cardview.widget.CardView {
    public static final /* synthetic */ int f = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TipsBannerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final androidx.appcompat.widget.AppCompatImageView getCloseIconIv() {
        return (androidx.appcompat.widget.AppCompatImageView) this.e.getValue();
    }

    private final android.widget.TextView getDescriptionTv() {
        return (android.widget.TextView) this.c.getValue();
    }

    private final androidx.appcompat.widget.AppCompatImageView getInfoIconIv() {
        return (androidx.appcompat.widget.AppCompatImageView) this.d.getValue();
    }

    private final android.widget.TextView getTitleTv() {
        return (android.widget.TextView) this.a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBannerBackgroundColor(int i) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setCardBackgroundColor(ak.r0.I(i, context));
    }

    public final void setCloseIcon(int i) {
        getCloseIconIv().setImageResource(i);
    }

    public final void setDescription(@org.jetbrains.annotations.NotNull java.lang.String str) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "description");
        android.widget.TextView descriptionTv = getDescriptionTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptionTv, "<get-descriptionTv>(...)");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(descriptionTv, z);
        getDescriptionTv().setText(str);
    }

    public final void setInfoIcon(int i) {
        getInfoIconIv().setImageResource(i);
    }

    public final void setOnCloseClickListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        getCloseIconIv().setOnClickListener(new be2.bar(17, function0));
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        android.widget.TextView titleTv = getTitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(titleTv, "<get-titleTv>(...)");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(titleTv, z);
        getTitleTv().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TipsBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TipsBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = gj.m.I(2131367033, this);
        this.c = gj.m.I(2131363468, this);
        this.d = gj.m.I(2131367023, this);
        this.e = gj.m.I(2131367022, this);
        gj.m.z(this, 2131560048, true);
        setRadius(ak.r0.s(context, 12));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        setElevation(ak.r0.r(0, context));
    }

    public /* synthetic */ TipsBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
