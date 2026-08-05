package com.truecaller.premium.ui.subscription.offerpicker;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionOfferButton extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionOfferButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.LinearLayout getFrameContainer() {
        return (android.widget.LinearLayout) this.x.getValue();
    }

    private final android.widget.TextView getOfferDuration() {
        return (android.widget.TextView) this.s.getValue();
    }

    private final android.widget.TextView getOfferHeading() {
        return (android.widget.TextView) this.v.getValue();
    }

    private final android.widget.TextView getOfferPrice() {
        return (android.widget.TextView) this.t.getValue();
    }

    private final android.widget.TextView getOfferPricePerMonth() {
        return (android.widget.TextView) this.u.getValue();
    }

    private final android.widget.ImageView getSelectedTickIcon() {
        return (android.widget.ImageView) this.y.getValue();
    }

    private final androidx.appcompat.widget.AppCompatTextView getSubstituteText() {
        return (androidx.appcompat.widget.AppCompatTextView) this.w.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final android.widget.LinearLayout getInnerContainer() {
        java.lang.Object value = this.z.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final void setInnerBackground(int i) {
        getInnerContainer().setBackgroundResource(i);
    }

    public final void setInnerContainerHeight(int i) {
        android.widget.LinearLayout innerContainer = getInnerContainer();
        android.view.ViewGroup.LayoutParams layoutParams = getInnerContainer().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = i;
        innerContainer.setLayoutParams(layoutParams2);
    }

    public final void setOfferDuration(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "duration");
        getOfferDuration().setText(str);
    }

    public final void setOfferHeading(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        getOfferHeading().setText(str);
        android.widget.TextView offerHeading = getOfferHeading();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(offerHeading, "<get-offerHeading>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(offerHeading, !z);
    }

    public final void setOfferPrice(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "price");
        getOfferPrice().setText(str);
    }

    public final void setOfferPricePerMoth(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "pricePerMonth");
        getOfferPricePerMonth().setText(str);
    }

    public final void setOfferPriceTextColor(int i) {
        getOfferPrice().setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOfferState(@org.jetbrains.annotations.NotNull kf2.qux quxVar) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "state");
        boolean z2 = true;
        if (quxVar instanceof kf2.bar) {
            getFrameContainer().setSelected(false);
            getSubstituteText().setSelected(false);
            getInnerContainer().setSelected(false);
            android.widget.TextView offerHeading = getOfferHeading();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(offerHeading, "<get-offerHeading>(...)");
            gj.m.f0(offerHeading);
            android.widget.ImageView selectedTickIcon = getSelectedTickIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(selectedTickIcon, "<get-selectedTickIcon>(...)");
            gj.m.f0(selectedTickIcon);
            androidx.appcompat.widget.AppCompatTextView substituteText = getSubstituteText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substituteText, "<get-substituteText>(...)");
            java.lang.CharSequence text = getSubstituteText().getText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() <= 0) {
                z2 = false;
            }
            gj.m.k0(substituteText, z2);
            setAlpha(1.0f);
            return;
        }
        if (quxVar instanceof kf2.baz) {
            getFrameContainer().setSelected(true);
            getInnerContainer().setSelected(true);
            androidx.appcompat.widget.AppCompatTextView substituteText2 = getSubstituteText();
            substituteText2.setSelected(true);
            java.lang.CharSequence text2 = getSubstituteText().getText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            gj.m.k0(substituteText2, z);
            android.widget.TextView offerHeading2 = getOfferHeading();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(offerHeading2, "<get-offerHeading>(...)");
            java.lang.CharSequence text3 = getOfferHeading().getText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            if (text3.length() <= 0) {
                z2 = false;
            }
            gj.m.k0(offerHeading2, z2);
            android.widget.ImageView selectedTickIcon2 = getSelectedTickIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(selectedTickIcon2, "<get-selectedTickIcon>(...)");
            gj.m.j0(selectedTickIcon2);
            setAlpha(1.0f);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void setOuterBackground(int i) {
        getFrameContainer().setBackgroundResource(i);
    }

    public final void setSubtext(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        getSubstituteText().setText(str);
        androidx.appcompat.widget.AppCompatTextView substituteText = getSubstituteText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substituteText, "<get-substituteText>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(substituteText, !z);
    }

    public final void setSubtextBackground(int i) {
        getSubstituteText().setBackgroundResource(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSubtextFontColor(int i) {
        getSubstituteText().setTextColor(g6.b.e(i, getContext()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionOfferButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionOfferButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131365550, this);
        this.t = gj.m.I(2131365553, this);
        this.u = gj.m.I(2131365554, this);
        this.v = gj.m.I(2131365552, this);
        this.w = gj.m.I(2131366691, this);
        this.x = gj.m.I(2131364011, this);
        this.y = gj.m.I(2131366339, this);
        this.z = gj.m.I(2131364675, this);
        yy.qux.z(this, 2131561109, true);
    }

    public /* synthetic */ SubscriptionOfferButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
