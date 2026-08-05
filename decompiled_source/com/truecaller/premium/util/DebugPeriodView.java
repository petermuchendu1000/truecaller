package com.truecaller.premium.util;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DebugPeriodView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final android.widget.TextView s;
    public final android.widget.EditText t;
    public final android.widget.Spinner u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugPeriodView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.Nullable
    public final org.joda.time.Period getPeriod() {
        int parseInt = java.lang.Integer.parseInt(this.t.getText().toString());
        if (parseInt == 0) {
            return null;
        }
        int ordinal = tf2.bar.values()[this.u.getSelectedItemPosition()].ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return new org.joda.time.base.BasePeriod(new int[]{parseInt, 0, 0, 0, 0, 0, 0, 0}, org.joda.time.PeriodType.k());
                    }
                    throw new java.lang.RuntimeException();
                }
                return new org.joda.time.base.BasePeriod(new int[]{0, parseInt, 0, 0, 0, 0, 0, 0}, org.joda.time.PeriodType.k());
            }
            return new org.joda.time.base.BasePeriod(new int[]{0, 0, parseInt, 0, 0, 0, 0, 0}, org.joda.time.PeriodType.k());
        }
        return org.joda.time.Period.m(parseInt);
    }

    public final void setPeriod(@org.jetbrains.annotations.Nullable org.joda.time.Period period) {
        android.widget.EditText editText = this.t;
        android.widget.Spinner spinner = this.u;
        if (period == null) {
            spinner.setSelection(0);
            editText.setText("0");
            return;
        }
        if (period.s() > 0) {
            editText.setText(java.lang.String.valueOf(period.s()));
            tf2.bar[] barVarArr = tf2.bar.a;
            spinner.setSelection(3);
        } else if (period.q() > 0) {
            editText.setText(java.lang.String.valueOf(period.q()));
            tf2.bar[] barVarArr2 = tf2.bar.a;
            spinner.setSelection(2);
        } else if (period.r() > 0) {
            editText.setText(java.lang.String.valueOf(period.r()));
            tf2.bar[] barVarArr3 = tf2.bar.a;
            spinner.setSelection(1);
        } else {
            editText.setText(java.lang.String.valueOf(period.n()));
            tf2.bar[] barVarArr4 = tf2.bar.a;
            spinner.setSelection(0);
        }
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        this.s.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugPeriodView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPeriodView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131561005, this);
        android.view.View findViewById = findViewById(2131367033);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.s = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(2131365534);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.t = (android.widget.EditText) findViewById2;
        android.view.View findViewById3 = findViewById(2131365679);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById3;
        this.u = spinner;
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, tf2.bar.values());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
    }

    public /* synthetic */ DebugPeriodView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
