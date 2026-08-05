package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CtaButtonX extends com.google.android.material.button.MaterialButton implements da0.j {
    public static final /* synthetic */ int t = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CtaButtonX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, int i2) {
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.i(this, valueOf);
        setTextColor(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // da0.j
    public void setOnClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "listener");
        setOnClickListener((android.view.View.OnClickListener) new be2.bar(8, function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CtaButtonX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaButtonX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CtaButtonX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
