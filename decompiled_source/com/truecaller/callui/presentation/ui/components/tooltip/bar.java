package com.truecaller.callui.presentation.ui.components.tooltip;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class bar {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.values().length];
        try {
            iArr[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.SIGNAL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.BATTERY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
