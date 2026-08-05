package com.truecaller.insights.ui.widget;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageIdExpandableTextView extends androidx.constraintlayout.widget.ConstraintLayout {
    public boolean s;
    public boolean t;
    public final android.widget.TextView u;
    public final android.widget.ImageView v;
    public int w;
    public kotlin.jvm.functions.Function1 x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageIdExpandableTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void F() {
        boolean z = this.t;
        android.widget.ImageView imageView = this.v;
        if (z) {
            imageView.setVisibility(0);
            boolean z2 = this.s;
            android.util.Property property = android.view.View.ROTATION;
            if (z2) {
                android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, 0.0f, 180.0f).setDuration(300L).start();
                return;
            } else {
                android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, 180.0f, 0.0f).setDuration(300L).start();
                return;
            }
        }
        imageView.setVisibility(8);
    }

    public final void setDrawable(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        this.v.setImageDrawable(drawable);
    }

    public final void setDrawableRes(int i) {
        this.v.setImageResource(i);
    }

    public final void setExpandableClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.x = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageIdExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageIdExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.w = 2;
        android.view.View.inflate(context, 2131561051, this);
        android.view.View findViewById = findViewById(2131363781);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.u = textView;
        android.view.View findViewById2 = findViewById(2131363780);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.v = imageView;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.insights.ui.R$styleable.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            textView.setText(obtainStyledAttributes.getText(3));
            textView.setTextColor(obtainStyledAttributes.getColor(2, context.getColor(android.R.color.black)));
            textView.setTextSize(obtainStyledAttributes.getDimension(0, 14.0f));
            textView.setTypeface(textView.getTypeface(), obtainStyledAttributes.getInt(1, 0));
            this.w = obtainStyledAttributes.getInt(4, 2);
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(5);
            if (drawable != null) {
                setDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
        }
        imageView.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 24));
        post(new bx.s0(this, 3, false));
    }

    public /* synthetic */ MessageIdExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
