package com.truecaller.callui.presentation.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/callui/presentation/ui/ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "CHECKED", "DISABLED", "HIDDEN", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ButtonState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.ButtonState[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.ButtonState REGULAR = new com.truecaller.callui.presentation.ui.ButtonState("REGULAR", 0);
    public static final com.truecaller.callui.presentation.ui.ButtonState CHECKED = new com.truecaller.callui.presentation.ui.ButtonState("CHECKED", 1);
    public static final com.truecaller.callui.presentation.ui.ButtonState DISABLED = new com.truecaller.callui.presentation.ui.ButtonState("DISABLED", 2);
    public static final com.truecaller.callui.presentation.ui.ButtonState HIDDEN = new com.truecaller.callui.presentation.ui.ButtonState("HIDDEN", 3);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.ButtonState[] $values() {
        return new com.truecaller.callui.presentation.ui.ButtonState[]{REGULAR, CHECKED, DISABLED, HIDDEN};
    }

    static {
        com.truecaller.callui.presentation.ui.ButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ButtonState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.ButtonState valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.ButtonState) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.ButtonState.class, str);
    }

    public static com.truecaller.callui.presentation.ui.ButtonState[] values() {
        return (com.truecaller.callui.presentation.ui.ButtonState[]) $VALUES.clone();
    }
}
