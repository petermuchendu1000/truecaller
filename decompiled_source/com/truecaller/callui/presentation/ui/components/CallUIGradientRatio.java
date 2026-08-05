package com.truecaller.callui.presentation.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/callui/presentation/ui/components/CallUIGradientRatio;", "", "value", "", "<init>", "(Ljava/lang/String;IF)V", "getValue", "()F", "ONGOING_GRADIENT_HEIGHT", "INCOMING_GRADIENT_HEIGHT", "PIP_GRADIENT_HEIGHT", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIGradientRatio {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[] $VALUES;
    private final float value;
    public static final com.truecaller.callui.presentation.ui.components.CallUIGradientRatio ONGOING_GRADIENT_HEIGHT = new com.truecaller.callui.presentation.ui.components.CallUIGradientRatio("ONGOING_GRADIENT_HEIGHT", 0, 0.75f);
    public static final com.truecaller.callui.presentation.ui.components.CallUIGradientRatio INCOMING_GRADIENT_HEIGHT = new com.truecaller.callui.presentation.ui.components.CallUIGradientRatio("INCOMING_GRADIENT_HEIGHT", 1, 0.95f);
    public static final com.truecaller.callui.presentation.ui.components.CallUIGradientRatio PIP_GRADIENT_HEIGHT = new com.truecaller.callui.presentation.ui.components.CallUIGradientRatio("PIP_GRADIENT_HEIGHT", 2, 1.0f);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[] $values() {
        return new com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[]{ONGOING_GRADIENT_HEIGHT, INCOMING_GRADIENT_HEIGHT, PIP_GRADIENT_HEIGHT};
    }

    static {
        com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIGradientRatio(java.lang.String str, int i, float f) {
        this.value = f;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.components.CallUIGradientRatio valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.components.CallUIGradientRatio) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.components.CallUIGradientRatio.class, str);
    }

    public static com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[] values() {
        return (com.truecaller.callui.presentation.ui.components.CallUIGradientRatio[]) $VALUES.clone();
    }

    public final float getValue() {
        return this.value;
    }
}
