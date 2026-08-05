package com.truecaller.callui.presentation.ui.components.tooltip;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.values().length];
        try {
            iArr[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.BATTERY.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.SIGNAL.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.ON_HOLD.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
