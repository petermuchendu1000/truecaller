package com.truecaller.messaging.groupinfo;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GroupInfoItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final android.widget.TextView s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupInfoItemView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setSubtitle(@org.jetbrains.annotations.Nullable java.lang.CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupInfoItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupInfoItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131559796, this);
        setMinHeight(getResources().getDimensionPixelSize(2131165968));
        setBackground(bi3.a.u(2130970235, context));
        android.view.View findViewById = findViewById(2131364532);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(2131367051);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(2131366701);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.s = textView;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.d, 0, 0);
        ((android.widget.ImageView) findViewById).setImageDrawable(obtainStyledAttributes.getDrawable(0));
        ((android.widget.TextView) findViewById2).setText(obtainStyledAttributes.getString(2));
        textView.setText(obtainStyledAttributes.getString(1));
    }

    public /* synthetic */ GroupInfoItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
