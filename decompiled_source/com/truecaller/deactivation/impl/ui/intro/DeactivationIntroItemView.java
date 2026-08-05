package com.truecaller.deactivation.impl.ui.intro;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationIntroItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final android.widget.CheckBox s;
    public final android.widget.ImageView t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeactivationIntroItemView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void F(int i, int i2) {
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        android.widget.ImageView imageView = this.t;
        u6.k0.i(imageView, valueOf);
        imageView.setColorFilter(i2, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public final void setOnCheckedChangeListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onChecked");
        this.s.setOnCheckedChangeListener(new aq2.r(function1, 10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeactivationIntroItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeactivationIntroItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561003, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(2131363288);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById;
        this.s = checkBox;
        android.view.View findViewById2 = findViewById(2131363291);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(2131363289);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.t = imageView;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.deactivation.impl.R$styleable.a, 0, 0);
        try {
            checkBox.setText(obtainStyledAttributes.getString(0));
            textView.setText(obtainStyledAttributes.getString(2));
            imageView.setImageResource(obtainStyledAttributes.getResourceId(1, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ DeactivationIntroItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
