package com.truecaller.dialer.ui.items.entries.abtest.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/dialer/ui/items/entries/abtest/utils/ICallLogListItem$PlayButtonState", "", "Lcom/truecaller/dialer/ui/items/entries/abtest/utils/ICallLogListItem$PlayButtonState;", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "GONE", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ICallLogListItem$PlayButtonState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[] $VALUES;
    public static final com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState VISIBLE = new com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState("VISIBLE", 0);
    public static final com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState GONE = new com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState("GONE", 1);

    private static final /* synthetic */ com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[] $values() {
        return new com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[]{VISIBLE, GONE};
    }

    static {
        com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ICallLogListItem$PlayButtonState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState valueOf(java.lang.String str) {
        return (com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState) java.lang.Enum.valueOf(com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState.class, str);
    }

    public static com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[] values() {
        return (com.truecaller.dialer.ui.items.entries.abtest.utils.ICallLogListItem$PlayButtonState[]) $VALUES.clone();
    }
}
