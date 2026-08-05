package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class TintedImageView extends androidx.appcompat.widget.AppCompatImageView {
    public android.content.res.ColorStateList a;

    public TintedImageView(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.content.res.ColorStateList colorStateList = this.a;
        if (colorStateList == null) {
            clearColorFilter();
        } else {
            setColorFilter(colorStateList.getColorForState(getDrawableState(), 0), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTint(@androidx.annotation.Nullable android.content.res.ColorStateList colorStateList) {
        this.a = colorStateList;
        if (colorStateList == null) {
            clearColorFilter();
        } else {
            setColorFilter(colorStateList.getColorForState(getDrawableState(), 0), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }

    public TintedImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R.styleable.k, 0, 0);
        this.a = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
    }

    public void setTint(int i) {
        setTint(new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{i}));
    }

    public TintedImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R.styleable.k, i, 0);
        this.a = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
    }
}
