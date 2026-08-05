package com.truecaller.premium.ui.countdown;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CountDownTextView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final u03.g0 s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public me2.bar v;
    public ij3.u w;
    public kotlin.jvm.functions.Function1 x;
    public long y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void F(com.truecaller.premium.ui.countdown.CountDownTextView countDownTextView, org.joda.time.Period period) {
        ij3.u uVar = countDownTextView.w;
        if (uVar == null) {
            ij3.c0 c0Var = new ij3.c0();
            c0Var.a = 2;
            c0Var.b = 4;
            if (period.o() > 24) {
                c0Var.b(3);
                c0Var.d("d");
                c0Var.d(":");
            }
            c0Var.b(4);
            c0Var.d("h");
            c0Var.d(":");
            c0Var.b(5);
            if (period.o() < 24) {
                c0Var.d(":");
                c0Var.b(6);
            }
            uVar = c0Var.f();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uVar, "toFormatter(...)");
        }
        if (period.o() > 24) {
            org.joda.time.PeriodType periodType = org.joda.time.PeriodType.i;
            if (periodType == null) {
                periodType = new org.joda.time.PeriodType("DayTime", new org.joda.time.DurationFieldType[]{org.joda.time.DurationFieldType.g, org.joda.time.DurationFieldType.i, org.joda.time.DurationFieldType.j, org.joda.time.DurationFieldType.k, org.joda.time.DurationFieldType.l}, new int[]{-1, -1, -1, 0, 1, 2, 3, 4});
                org.joda.time.PeriodType.i = periodType;
            }
            period = period.t(periodType);
        }
        countDownTextView.getTimerTextView().setText(uVar.b(period));
        countDownTextView.getTimerTextView().invalidate();
    }

    private final android.widget.TextView getPreTextView() {
        java.lang.Object value = this.t.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final android.widget.TextView getTimerTextView() {
        java.lang.Object value = this.u.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setPrefixTextAttributes(android.content.res.TypedArray typedArray) {
        android.graphics.Typeface typeface;
        u03.g0 g0Var = this.s;
        int s = bi3.a.s(g0Var.a, 2130970931);
        setPrefixText(typedArray.getString(2));
        setPrefixTextColor(typedArray.getColor(3, s));
        setPrefixSpacing(typedArray.getDimensionPixelSize(1, 0));
        int resourceId = typedArray.getResourceId(0, -1);
        if (resourceId != -1) {
            typeface = i6.h.b(resourceId, g0Var.a);
        } else {
            typeface = null;
        }
        setPrefixFontFamily(typeface);
        setPrefixTextSize(typedArray.getDimensionPixelSize(4, t41.i.e(14.0f, getContext())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTimerTextAttributes(android.content.res.TypedArray typedArray) {
        android.graphics.Typeface typeface;
        u03.g0 g0Var = this.s;
        setTimerTextColor(typedArray.getColor(7, bi3.a.s(g0Var.a, 2130970931)));
        int resourceId = typedArray.getResourceId(5, -1);
        if (resourceId != -1) {
            typeface = i6.h.b(resourceId, g0Var.a);
        } else {
            typeface = null;
        }
        setTimerFontFamily(typeface);
        setTimerLetterSpacing(typedArray.getFloat(6, 0.0f));
        setTimerTextSize(typedArray.getDimensionPixelSize(4, t41.i.e(14.0f, getContext())));
    }

    public final void G(long j) {
        this.y = j;
        me2.bar barVar = this.v;
        if (barVar != null) {
            barVar.cancel();
        }
        this.v = null;
        me2.bar barVar2 = new me2.bar(this.y - new org.joda.time.DateTime().i(), this);
        this.v = barVar2;
        barVar2.start();
        kotlin.jvm.functions.Function1 function1 = this.x;
        if (function1 != null) {
            function1.invoke(me2.baz.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        long j = this.y;
        if (j != 0) {
            G(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        me2.bar barVar = this.v;
        if (barVar != null) {
            barVar.cancel();
        }
        this.v = null;
    }

    public final void setOnCountDownTimerStateListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super me2.b, kotlin.Unit> function1) {
        this.x = function1;
    }

    public final void setPeriodFormatter(@org.jetbrains.annotations.NotNull ij3.u uVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uVar, "periodFormatter");
        this.w = uVar;
    }

    public final void setPrefixFontFamily(@org.jetbrains.annotations.Nullable android.graphics.Typeface typeface) {
        if (typeface == null) {
            typeface = android.graphics.Typeface.SANS_SERIF;
        }
        getPreTextView().setTypeface(typeface);
    }

    public final void setPrefixSpacing(int i) {
        getPreTextView().setPadding(0, 0, i, 0);
    }

    public final void setPrefixText(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        android.widget.TextView preTextView = getPreTextView();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(preTextView, true ^ z);
        getPreTextView().setText(str);
    }

    public final void setPrefixTextColor(int i) {
        getPreTextView().setTextColor(i);
    }

    public final void setPrefixTextSize(int i) {
        getPreTextView().setTextSize(0, i);
    }

    public final void setTimerFontFamily(@org.jetbrains.annotations.Nullable android.graphics.Typeface typeface) {
        if (typeface == null) {
            typeface = android.graphics.Typeface.SANS_SERIF;
        }
        getTimerTextView().setTypeface(typeface);
    }

    public final void setTimerLetterSpacing(float f) {
        getTimerTextView().setLetterSpacing(f);
    }

    public final void setTimerTextColor(int i) {
        getTimerTextView().setTextColor(i);
    }

    public final void setTimerTextSize(int i) {
        getTimerTextView().setTextSize(0, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountDownTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = new u03.g0(context);
        this.t = gj.m.I(2131365773, this);
        this.u = gj.m.I(2131367008, this);
        android.view.View.inflate(context, 2131558953, this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.premium.R.styleable.a, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setPrefixTextAttributes(obtainStyledAttributes);
            setTimerTextAttributes(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
        setSaveEnabled(true);
    }

    public /* synthetic */ CountDownTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
