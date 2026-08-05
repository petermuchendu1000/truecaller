package com.truecaller.call_assistant.core.onboarding.permissions;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class OnboardingPermissionView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final xp0.z s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingPermissionView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtonOnClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        ((android.widget.Button) this.s.c).setOnClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIsSuccessful(boolean z) {
        int i;
        xp0.z zVar = this.s;
        android.widget.ImageView imageView = (android.widget.ImageView) zVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "successIcon");
        gj.m.k0(imageView, z);
        android.widget.Button button = (android.widget.Button) zVar.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "button");
        gj.m.k0(button, !z);
        if (z) {
            i = 2130970569;
        } else if (!z) {
            i = 2130970935;
        } else {
            throw new java.lang.RuntimeException();
        }
        zVar.d.setTextColor(bi3.a.s(getContext(), i));
    }

    public final void setSubtitle(int i) {
        this.s.d.setText(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingPermissionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingPermissionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561057, (android.view.ViewGroup) this);
        int i2 = 2131362629;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131362629, this);
        if (button != null) {
            i2 = 2131364521;
            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364521, this);
            if (imageView != null) {
                i2 = 2131366692;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366692, this);
                if (textView != null) {
                    i2 = 2131366705;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131366705, this);
                    if (imageView2 != null) {
                        i2 = 2131367033;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, this);
                        if (textView2 != null) {
                            xp0.z zVar = new xp0.z(this, button, imageView, textView, imageView2, textView2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zVar, "inflate(...)");
                            this.s = zVar;
                            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.call_assistant.core.R$styleable.b, 0, 0);
                            try {
                                imageView.setImageDrawable(obtainStyledAttributes.getDrawable(1));
                                textView2.setText(obtainStyledAttributes.getString(3));
                                textView.setText(obtainStyledAttributes.getString(2));
                                button.setText(obtainStyledAttributes.getString(0));
                                return;
                            } finally {
                                obtainStyledAttributes.recycle();
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ OnboardingPermissionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
