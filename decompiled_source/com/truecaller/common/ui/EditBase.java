package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class EditBase extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
    public static final /* synthetic */ int g = 0;
    public final android.graphics.drawable.Drawable a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public com.truecaller.common.ui.e e;
    public android.view.View.OnClickListener f;

    public EditBase(android.content.Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.b) {
            setCompoundDrawables((android.graphics.drawable.Drawable) null, getCompoundDrawables()[1], getCompoundDrawables()[2], getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (android.graphics.drawable.Drawable) null, getCompoundDrawables()[3]);
        }
    }

    public void setClearIconVisibilityListener(com.truecaller.common.ui.e eVar) {
        this.e = eVar;
    }

    public void setOnClearIconClickListener(android.view.View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public EditBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditBase(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes = yy.qux.v(context, true).obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.c);
        android.graphics.drawable.Drawable x = bi3.a.x(context, obtainStyledAttributes.getResourceId(0, 2131232077), obtainStyledAttributes.getResourceId(1, 2130970936), android.graphics.PorterDuff.Mode.DST);
        this.a = x;
        obtainStyledAttributes.recycle();
        this.b = !isInEditMode() && mz1.bar.a();
        int b = t41.i.b(24.0f, context);
        x.setBounds(0, 0, b, b);
        setOnTouchListener(new cc3.a(this, 3));
        addTextChangedListener(new com.truecaller.common.ui.d(this, 0));
    }
}
