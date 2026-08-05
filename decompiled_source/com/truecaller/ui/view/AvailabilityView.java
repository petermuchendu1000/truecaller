package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AvailabilityView extends androidx.appcompat.widget.AppCompatTextView implements xf2.bar {
    public mp2.bar h;
    public kotlin.jvm.functions.Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAvailability(yf2.bar barVar) {
        pk3.b bVar;
        int i;
        java.lang.CharSequence u;
        pk3.c cVar;
        if (barVar != null && (cVar = barVar.b) != null) {
            bVar = cVar.i();
        } else {
            bVar = null;
        }
        gj.m.j0(this);
        if (bVar == null) {
            i = -1;
        } else {
            i = qy2.bar.a[bVar.ordinal()];
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            setCompoundDrawables((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            kotlin.jvm.functions.Function1 function1 = this.i;
            if (function1 != null) {
                setText((java.lang.CharSequence) function1.invoke(barVar));
                return;
            } else {
                gj.m.f0(this);
                return;
            }
        }
        kotlin.jvm.functions.Function1 function12 = this.i;
        if (function12 == null || (u = (java.lang.CharSequence) function12.invoke(barVar)) == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u = ll.baz.u(barVar, context);
        }
        setText(u);
        android.content.Context context2 = getContext();
        androidx.recyclerview.widget.r0 r0Var = new androidx.recyclerview.widget.r0(context2);
        r0Var.c = false;
        r0Var.d = 6;
        r0Var.e = 12;
        if (bVar != pk3.b.c) {
            z = false;
        }
        r0Var.b = z;
        setCompoundDrawablesRelativeWithIntrinsicBounds(new com.truecaller.ui.baz(context2, r0Var), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public final void I(yf2.bar barVar) {
        setAvailability(barVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(mp2.bar barVar) {
        mp2.bar barVar2 = this.h;
        if (barVar2 != null && barVar2.b != null) {
            barVar2.b();
        }
        setAvailability(null);
        this.h = barVar;
        if (barVar != null && barVar.b == null) {
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            if (isAttachedToWindow()) {
                setAvailability(null);
                barVar.a(this);
            }
        }
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<yf2.bar, java.lang.CharSequence> getCustomTextProvider() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.TextView*/.onAttachedToWindow();
        mp2.bar barVar = this.h;
        if (barVar != null && barVar.b == null) {
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            if (isAttachedToWindow()) {
                setAvailability(null);
                barVar.a(this);
            }
        }
    }

    public final void onDetachedFromWindow() {
        mp2.bar barVar = this.h;
        if (barVar != null && barVar.b != null) {
            barVar.b();
        }
        setAvailability(null);
        super.onDetachedFromWindow();
    }

    public final void setCustomTextProvider(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super yf2.bar, ? extends java.lang.CharSequence> function1) {
        this.i = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }
}
