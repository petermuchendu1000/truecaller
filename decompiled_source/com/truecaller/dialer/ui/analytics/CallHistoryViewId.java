package com.truecaller.dialer.ui.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/dialer/ui/analytics/CallHistoryViewId;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_TAB_BLOCK_SELECTED_CALLS_DIALOG", "CALL_TAB_DELETE_SELECTED_CALLS_DIALOG", "CALL_TAB_DELETE_ALL_CALLS_DIALOG", "SPEED_DIAL_DIALOG", "T9_SEARCH", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallHistoryViewId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialer.ui.analytics.CallHistoryViewId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.dialer.ui.analytics.CallHistoryViewId CALL_TAB_BLOCK_SELECTED_CALLS_DIALOG = new com.truecaller.dialer.ui.analytics.CallHistoryViewId("CALL_TAB_BLOCK_SELECTED_CALLS_DIALOG", 0, "callTab_blockSelectedCallsDialog");
    public static final com.truecaller.dialer.ui.analytics.CallHistoryViewId CALL_TAB_DELETE_SELECTED_CALLS_DIALOG = new com.truecaller.dialer.ui.analytics.CallHistoryViewId("CALL_TAB_DELETE_SELECTED_CALLS_DIALOG", 1, "callTab_deleteSelectedCallsDialog");
    public static final com.truecaller.dialer.ui.analytics.CallHistoryViewId CALL_TAB_DELETE_ALL_CALLS_DIALOG = new com.truecaller.dialer.ui.analytics.CallHistoryViewId("CALL_TAB_DELETE_ALL_CALLS_DIALOG", 2, "callTab_deleteAllCallsDialog");
    public static final com.truecaller.dialer.ui.analytics.CallHistoryViewId SPEED_DIAL_DIALOG = new com.truecaller.dialer.ui.analytics.CallHistoryViewId("SPEED_DIAL_DIALOG", 3, "speedDialDialog");
    public static final com.truecaller.dialer.ui.analytics.CallHistoryViewId T9_SEARCH = new com.truecaller.dialer.ui.analytics.CallHistoryViewId("T9_SEARCH", 4, "t9Search");

    private static final /* synthetic */ com.truecaller.dialer.ui.analytics.CallHistoryViewId[] $values() {
        return new com.truecaller.dialer.ui.analytics.CallHistoryViewId[]{CALL_TAB_BLOCK_SELECTED_CALLS_DIALOG, CALL_TAB_DELETE_SELECTED_CALLS_DIALOG, CALL_TAB_DELETE_ALL_CALLS_DIALOG, SPEED_DIAL_DIALOG, T9_SEARCH};
    }

    static {
        com.truecaller.dialer.ui.analytics.CallHistoryViewId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallHistoryViewId(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialer.ui.analytics.CallHistoryViewId valueOf(java.lang.String str) {
        return (com.truecaller.dialer.ui.analytics.CallHistoryViewId) java.lang.Enum.valueOf(com.truecaller.dialer.ui.analytics.CallHistoryViewId.class, str);
    }

    public static com.truecaller.dialer.ui.analytics.CallHistoryViewId[] values() {
        return (com.truecaller.dialer.ui.analytics.CallHistoryViewId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
