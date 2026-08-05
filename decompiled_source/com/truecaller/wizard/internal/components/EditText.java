package com.truecaller.wizard.internal.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class EditText extends androidx.appcompat.widget.AppCompatEditText implements bd3.qux {
    public static final /* synthetic */ int n = 0;
    public yc3.d g;
    public boolean h;
    public final android.graphics.drawable.Drawable i;
    public final android.graphics.drawable.Drawable j;
    public u03.f0 k;
    public r83.bar l;
    public android.graphics.drawable.Drawable m;

    /* JADX WARN: Multi-variable type inference failed */
    public EditText(android.content.Context context) {
        super(context);
        if (!isInEditMode()) {
            e();
        }
        this.i = c(getContext());
        this.j = getContext().getDrawable(2131234503);
        d();
    }

    private android.graphics.drawable.Drawable getCurrentIcon() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setIcon(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable currentIcon = getCurrentIcon();
        this.m = drawable;
        if (currentIcon != null) {
            android.animation.ValueAnimator b = b(currentIcon, false);
            b.addListener(new com.truecaller.ui.s1(1, this, drawable));
            b.start();
        } else {
            setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawable, null);
            b(drawable, true).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.g == null) {
            this.g = new yc3.d((android.view.View) this);
        }
        return this.g.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.animation.ValueAnimator b(android.graphics.drawable.Drawable drawable, boolean z) {
        int i;
        long integer = getResources().getInteger(2131427419);
        int i2 = com.unity3d.services.UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        if (z) {
            i = 0;
        } else {
            i = 10000;
        }
        if (!z) {
            i2 = 0;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(integer);
        ofInt.addUpdateListener(new e52.bar(drawable, 3));
        return ofInt;
    }

    public final android.graphics.drawable.Drawable c(android.content.Context context) {
        android.graphics.drawable.Drawable drawable = context.getDrawable(2131234504);
        if (drawable != null) {
            drawable.mutate();
            drawable.setTint(bi3.a.s(((u03.g0) this.k).a, 2130970565));
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(2131166764));
    }

    public final void e() {
        if (!this.h) {
            this.h = true;
            this.k = (u03.f0) ((r83.baz) X3()).c.q9.get();
        }
    }

    public final boolean f() {
        r83.bar barVar;
        if (getText() != null && (barVar = this.l) != null && barVar.o(getText().toString().trim())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super/*android.widget.EditText*/.onFocusChanged(z, i, rect);
        if (z) {
            if (getText().length() > 0) {
                setIcon(this.i);
            }
        } else {
            if (getText().length() > 0 && f()) {
                setIcon(this.j);
                return;
            }
            android.graphics.drawable.Drawable currentIcon = getCurrentIcon();
            this.m = null;
            if (currentIcon != null) {
                android.animation.ValueAnimator b = b(currentIcon, false);
                b.addListener(new ad.b(this, 11));
                b.start();
            }
        }
    }

    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() == 0) {
            android.graphics.drawable.Drawable currentIcon = getCurrentIcon();
            this.m = null;
            if (currentIcon != null) {
                android.animation.ValueAnimator b = b(currentIcon, false);
                b.addListener(new ad.b(this, 11));
                b.start();
                return;
            }
            return;
        }
        if (f()) {
            android.graphics.drawable.Drawable currentIcon2 = getCurrentIcon();
            android.graphics.drawable.Drawable drawable = this.j;
            if (currentIcon2 != drawable) {
                setIcon(drawable);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable currentIcon3 = getCurrentIcon();
        android.graphics.drawable.Drawable drawable2 = this.i;
        if (currentIcon3 != drawable2) {
            setIcon(drawable2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float width;
        float width2;
        android.graphics.drawable.Drawable currentIcon = getCurrentIcon();
        android.graphics.drawable.Drawable drawable = this.i;
        if (currentIcon == drawable && motionEvent.getAction() == 1) {
            if (getResources().getConfiguration().getLayoutDirection() == 1) {
                width = 0.0f;
            } else {
                width = ((getWidth() - getPaddingRight()) - drawable.getIntrinsicWidth()) - getCompoundDrawablePadding();
            }
            if (getResources().getConfiguration().getLayoutDirection() == 1) {
                width2 = getCompoundDrawablePadding() + drawable.getIntrinsicWidth() + getPaddingLeft();
            } else {
                width2 = getWidth();
            }
            float x = motionEvent.getX();
            if (x >= width && x <= width2) {
                setText("");
            }
        }
        return super/*android.widget.EditText*/.onTouchEvent(motionEvent);
    }

    public void setInputValidator(@androidx.annotation.Nullable r83.bar barVar) {
        this.l = barVar;
    }

    public void setIsValid(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            setIcon(this.j);
        } else {
            setIcon(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            e();
        }
        this.i = c(getContext());
        this.j = getContext().getDrawable(2131234503);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            e();
        }
        this.i = c(getContext());
        this.j = getContext().getDrawable(2131234503);
        d();
    }
}
