package com.truecaller.premium.premiumusertab.list;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DummySwitch extends com.truecaller.common.ui.switchmaterial.SwitchMaterialX {
    public android.view.View.OnClickListener m0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DummySwitch(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 2) {
            return true;
        }
        return super/*androidx.appcompat.widget.SwitchCompat*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        android.view.View.OnClickListener onClickListener = this.m0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            return true;
        }
        return true;
    }

    public void setOnCheckedChangeListener(@org.jetbrains.annotations.Nullable android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        this.m0 = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DummySwitch(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DummySwitch(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }
}
