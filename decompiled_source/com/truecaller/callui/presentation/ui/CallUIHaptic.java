package com.truecaller.callui.presentation.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/callui/presentation/ui/CallUIHaptic;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "KEYPAD", "REJECT", "CONFIRM", "LONG_PRESS", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIHaptic {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.CallUIHaptic[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.CallUIHaptic CLICK = new com.truecaller.callui.presentation.ui.CallUIHaptic("CLICK", 0);
    public static final com.truecaller.callui.presentation.ui.CallUIHaptic KEYPAD = new com.truecaller.callui.presentation.ui.CallUIHaptic("KEYPAD", 1);
    public static final com.truecaller.callui.presentation.ui.CallUIHaptic REJECT = new com.truecaller.callui.presentation.ui.CallUIHaptic("REJECT", 2);
    public static final com.truecaller.callui.presentation.ui.CallUIHaptic CONFIRM = new com.truecaller.callui.presentation.ui.CallUIHaptic("CONFIRM", 3);
    public static final com.truecaller.callui.presentation.ui.CallUIHaptic LONG_PRESS = new com.truecaller.callui.presentation.ui.CallUIHaptic("LONG_PRESS", 4);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.CallUIHaptic[] $values() {
        return new com.truecaller.callui.presentation.ui.CallUIHaptic[]{CLICK, KEYPAD, REJECT, CONFIRM, LONG_PRESS};
    }

    static {
        com.truecaller.callui.presentation.ui.CallUIHaptic[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIHaptic(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.CallUIHaptic valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.CallUIHaptic) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.CallUIHaptic.class, str);
    }

    public static com.truecaller.callui.presentation.ui.CallUIHaptic[] values() {
        return (com.truecaller.callui.presentation.ui.CallUIHaptic[]) $VALUES.clone();
    }
}
