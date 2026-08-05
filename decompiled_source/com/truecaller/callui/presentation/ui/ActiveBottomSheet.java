package com.truecaller.callui.presentation.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/callui/presentation/ui/ActiveBottomSheet;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "REJECT_MESSAGE_PICKER", "REJECT_CUSTOM_MESSAGE", "KEYPAD", "AUDIO_ROUTE_PICKER", "MORE_MENU", "MANAGE_CONFERENCE", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActiveBottomSheet {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.ActiveBottomSheet[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet NONE = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("NONE", 0);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet REJECT_MESSAGE_PICKER = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("REJECT_MESSAGE_PICKER", 1);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet REJECT_CUSTOM_MESSAGE = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("REJECT_CUSTOM_MESSAGE", 2);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet KEYPAD = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("KEYPAD", 3);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet AUDIO_ROUTE_PICKER = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("AUDIO_ROUTE_PICKER", 4);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet MORE_MENU = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("MORE_MENU", 5);
    public static final com.truecaller.callui.presentation.ui.ActiveBottomSheet MANAGE_CONFERENCE = new com.truecaller.callui.presentation.ui.ActiveBottomSheet("MANAGE_CONFERENCE", 6);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.ActiveBottomSheet[] $values() {
        return new com.truecaller.callui.presentation.ui.ActiveBottomSheet[]{NONE, REJECT_MESSAGE_PICKER, REJECT_CUSTOM_MESSAGE, KEYPAD, AUDIO_ROUTE_PICKER, MORE_MENU, MANAGE_CONFERENCE};
    }

    static {
        com.truecaller.callui.presentation.ui.ActiveBottomSheet[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActiveBottomSheet(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.ActiveBottomSheet valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.ActiveBottomSheet) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.ActiveBottomSheet.class, str);
    }

    public static com.truecaller.callui.presentation.ui.ActiveBottomSheet[] values() {
        return (com.truecaller.callui.presentation.ui.ActiveBottomSheet[]) $VALUES.clone();
    }
}
