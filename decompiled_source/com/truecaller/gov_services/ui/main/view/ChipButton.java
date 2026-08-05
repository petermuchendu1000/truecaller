package com.truecaller.gov_services.ui.main.view;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ChipButton extends androidx.constraintlayout.widget.ConstraintLayout {
    public final ck2.bar s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        setBackgroundResource(2131231270);
    }

    public final void setText(@org.jetbrains.annotations.Nullable java.lang.String str) {
        ck2.bar barVar = this.s;
        if (barVar != null) {
            ((androidx.appcompat.widget.AppCompatTextView) barVar.c).setText(str);
        } else {
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (isInEditMode()) {
            gj.m.z(this, 2131558833, true);
            return;
        }
        android.view.LayoutInflater.from(context).inflate(2131558833, (android.view.ViewGroup) this);
        int i2 = 2131364521;
        if (df0.qux.o(2131364521, this) != null) {
            i2 = 2131367033;
            androidx.appcompat.widget.AppCompatTextView o = df0.qux.o(2131367033, this);
            if (o != null) {
                ck2.bar barVar = new ck2.bar(this, 14, o);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                this.s = barVar;
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ ChipButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
