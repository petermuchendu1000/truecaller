package com.truecaller.messaging.securedTab.passcode;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PasscodeView extends android.view.ViewGroup {
    public static final /* synthetic */ int i = 0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public kotlin.jvm.functions.Function1 g;
    public final android.widget.EditText h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasscodeView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        android.widget.EditText editText = this.h;
        if (editText != null) {
            editText.requestFocus();
            java.lang.Object systemService = getContext().getSystemService("input_method");
            kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
            android.widget.EditText editText2 = this.h;
            if (editText2 != null) {
                inputMethodManager.showSoftInput(editText2, 0);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("editText");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("editText");
        throw null;
    }

    public final void b() {
        android.os.VibrationEffect createOneShot;
        startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), 2130772044));
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.os.Vibrator J = ak.r0.J(context);
        if (!J.hasVibrator()) {
            J = null;
        }
        if (J != null) {
            createOneShot = android.os.VibrationEffect.createOneShot(200L, -1);
            bx.q.q(J, createOneShot);
        }
    }

    @org.jetbrains.annotations.NotNull
    public final android.text.Editable getText() {
        android.widget.EditText editText = this.h;
        if (editText != null) {
            android.text.Editable text = editText.getText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return text;
        }
        kotlin.jvm.internal.Intrinsics.n("editText");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = 0;
        while (true) {
            int i8 = this.a;
            if (i7 < i8) {
                android.view.View childAt = getChildAt(i7);
                int i9 = this.d;
                int i10 = i7 * i9;
                if (i7 > 0) {
                    i6 = this.c * i7;
                } else {
                    i6 = 0;
                }
                int i11 = i10 + i6;
                childAt.layout(getPaddingLeft() + i11, getPaddingTop(), getPaddingLeft() + i11 + i9, getPaddingTop() + i9);
                i7++;
            } else {
                getChildAt(i8).layout(0, 0, 1, getMeasuredHeight());
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(i2, i3);
        }
        int i5 = this.d;
        int i6 = this.a;
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + li.qux.r(i6, 1, this.c, i5 * i6), getPaddingBottom() + getPaddingTop() + i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            a();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnPasscodeChangeListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        this.g = function1;
    }

    public final void setText(@org.jetbrains.annotations.NotNull android.text.Editable editable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editable, "text");
        int length = editable.length();
        int i2 = this.a;
        java.lang.CharSequence charSequence = editable;
        if (length > i2) {
            charSequence = editable.subSequence(0, i2);
        }
        android.widget.EditText editText = this.h;
        if (editText != null) {
            editText.setText(charSequence);
            for (int i3 = 0; i3 < i2; i3++) {
                getChildAt(i3).invalidate();
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("editText");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasscodeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = 4;
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.b = applyDimension;
        this.c = (int) android.util.TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        this.d = applyDimension * 2;
        this.e = ze0.q.B(2130970933, context);
        this.f = ze0.q.B(2130970529, context);
        setWillNotDraw(false);
        for (int i3 = 0; i3 < 4; i3++) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            addView(new t32.e(this, context2, i3));
        }
        android.widget.EditText editText = new android.widget.EditText(getContext());
        editText.setBackgroundColor(0);
        editText.setTextColor(0);
        editText.setCursorVisible(false);
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(4)});
        editText.setInputType(2);
        editText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("1234567890"));
        editText.setImeOptions(268435456);
        editText.setImportantForAutofill(2);
        editText.setOnFocusChangeListener(new q91.a(1, editText, this));
        editText.addTextChangedListener(new c41.f(6, this, editText));
        this.h = editText;
        addView(editText);
        invalidate();
    }

    public /* synthetic */ PasscodeView(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
