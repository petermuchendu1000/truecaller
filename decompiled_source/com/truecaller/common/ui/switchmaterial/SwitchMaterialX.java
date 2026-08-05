package com.truecaller.common.ui.switchmaterial;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class SwitchMaterialX extends com.google.android.material.materialswitch.MaterialSwitch {
    public static final /* synthetic */ int l0 = 0;
    public android.widget.CompoundButton.OnCheckedChangeListener k0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchMaterialX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(com.truecaller.common.ui.switchmaterial.SwitchMaterialX switchMaterialX, boolean z) {
        super/*android.widget.CompoundButton*/.setOnCheckedChangeListener(null);
        switchMaterialX.setChecked(z);
        super/*android.widget.CompoundButton*/.setOnCheckedChangeListener(switchMaterialX.k0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnCheckedChangeListener(@org.jetbrains.annotations.Nullable android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super/*android.widget.CompoundButton*/.setOnCheckedChangeListener(onCheckedChangeListener);
        this.k0 = onCheckedChangeListener;
    }

    public final void setOnSilentCheckedChangeListener(@org.jetbrains.annotations.NotNull android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCheckedChangeListener, "listener");
        setOnCheckedChangeListener(new hi2.t(2, this, onCheckedChangeListener));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchMaterialX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchMaterialX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SwitchMaterialX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
