package com.truecaller.contact_call_history.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/contact_call_history/analytics/ContactCallHistoryAnalytics$MenuSubAction", "", "Lcom/truecaller/contact_call_history/analytics/ContactCallHistoryAnalytics$MenuSubAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "VIEW_OUTGOING_CALLS", "VIEW_INCOMING_CALLS", "VIEW_MISSED_CALLS", "VIEW_BLOCKED_CALLS", "contact-call-history_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ContactCallHistoryAnalytics$MenuSubAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction VIEW_OUTGOING_CALLS = new com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction("VIEW_OUTGOING_CALLS", 0, "viewOutgoingCalls");
    public static final com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction VIEW_INCOMING_CALLS = new com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction("VIEW_INCOMING_CALLS", 1, "viewIncomingCalls");
    public static final com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction VIEW_MISSED_CALLS = new com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction("VIEW_MISSED_CALLS", 2, "viewMissedCalls");
    public static final com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction VIEW_BLOCKED_CALLS = new com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction("VIEW_BLOCKED_CALLS", 3, "viewBlockedCalls");

    private static final /* synthetic */ com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[] $values() {
        return new com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[]{VIEW_OUTGOING_CALLS, VIEW_INCOMING_CALLS, VIEW_MISSED_CALLS, VIEW_BLOCKED_CALLS};
    }

    static {
        com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactCallHistoryAnalytics$MenuSubAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction valueOf(java.lang.String str) {
        return (com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction) java.lang.Enum.valueOf(com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction.class, str);
    }

    public static com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[] values() {
        return (com.truecaller.contact_call_history.analytics.ContactCallHistoryAnalytics$MenuSubAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
