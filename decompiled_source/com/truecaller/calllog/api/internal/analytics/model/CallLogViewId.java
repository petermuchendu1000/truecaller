package com.truecaller.calllog.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/calllog/api/internal/analytics/model/CallLogViewId;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_TAB_DELETE_ALL_CALLS_DIALOG", "CALL_TAB_FILTER_MISSED_CALLS", "CALL_TAB_FILTER_INCOMING_CALLS", "CALL_TAB_FILTER_BLOCKED_CALLS", "CALL_TAB_FILTER_OUTGOING_CALLS", "CALL_TAB_MORE_MENU", "CALL_TAB_RECENTS", "CALL_TAB_SIM_SELECTOR", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogViewId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_DELETE_ALL_CALLS_DIALOG = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_DELETE_ALL_CALLS_DIALOG", 0, "callTab_deleteAllCallsDialog");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_FILTER_MISSED_CALLS = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_FILTER_MISSED_CALLS", 1, "callTab_filterMissedCalls");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_FILTER_INCOMING_CALLS = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_FILTER_INCOMING_CALLS", 2, "callTab_filterIncomingCalls");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_FILTER_BLOCKED_CALLS = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_FILTER_BLOCKED_CALLS", 3, "callTab_filterBlockedCalls");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_FILTER_OUTGOING_CALLS = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_FILTER_OUTGOING_CALLS", 4, "callTab_filterOutgoingCalls");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_MORE_MENU = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_MORE_MENU", 5, "callTab_moreMenu");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_RECENTS = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_RECENTS", 6, "callTab_recents");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogViewId CALL_TAB_SIM_SELECTOR = new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId("CALL_TAB_SIM_SELECTOR", 7, "callTab_simSelector");

    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[] $values() {
        return new com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[]{CALL_TAB_DELETE_ALL_CALLS_DIALOG, CALL_TAB_FILTER_MISSED_CALLS, CALL_TAB_FILTER_INCOMING_CALLS, CALL_TAB_FILTER_BLOCKED_CALLS, CALL_TAB_FILTER_OUTGOING_CALLS, CALL_TAB_MORE_MENU, CALL_TAB_RECENTS, CALL_TAB_SIM_SELECTOR};
    }

    static {
        com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogViewId(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.internal.analytics.model.CallLogViewId valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.internal.analytics.model.CallLogViewId) java.lang.Enum.valueOf(com.truecaller.calllog.api.internal.analytics.model.CallLogViewId.class, str);
    }

    public static com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[] values() {
        return (com.truecaller.calllog.api.internal.analytics.model.CallLogViewId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
