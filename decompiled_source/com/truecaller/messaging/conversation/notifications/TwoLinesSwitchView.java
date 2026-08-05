package com.truecaller.messaging.conversation.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TwoLinesSwitchView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLinesSwitchView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getIcon() {
        java.lang.Object value = this.v.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.widget.TextView getSubtitle() {
        java.lang.Object value = this.t.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final com.truecaller.common.ui.switchmaterial.SwitchMaterialX getSwitch() {
        java.lang.Object value = this.u.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.truecaller.common.ui.switchmaterial.SwitchMaterialX) value;
    }

    private final android.widget.TextView getTitle() {
        java.lang.Object value = this.s.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void setIsChecked(boolean z) {
        getSwitch().setChecked(z);
    }

    public final void setOnCheckedChangeListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, kotlin.Unit> function2) {
        io0.a aVar;
        com.truecaller.common.ui.switchmaterial.SwitchMaterialX switchMaterialX = getSwitch();
        if (function2 != null) {
            aVar = new io0.a(2, function2);
        } else {
            aVar = null;
        }
        switchMaterialX.setOnCheckedChangeListener(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnViewClickListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        aq2.g gVar;
        if (function1 != null) {
            gVar = new aq2.g(15, function1);
        } else {
            gVar = null;
        }
        setOnClickListener(gVar);
    }

    public final void setSubtitle(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        android.widget.TextView subtitle = getSubtitle();
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(subtitle, z);
        getSubtitle().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLinesSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TwoLinesSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131367033, this);
        this.t = gj.m.I(2131366692, this);
        this.u = gj.m.I(2131366767, this);
        this.v = gj.m.I(2131364521, this);
        gj.m.z(this, 2131560060, true);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.h, 0, 0);
        getIcon().setImageDrawable(obtainStyledAttributes.getDrawable(0));
        getTitle().setText(obtainStyledAttributes.getString(1));
    }

    public /* synthetic */ TwoLinesSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
