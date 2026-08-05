package com.truecaller.dialer.data.suggested.suggested_contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/dialer/data/suggested/suggested_contacts/SuggestedContactsPerformanceTracker$TraceType", "", "Lcom/truecaller/dialer/data/suggested/suggested_contacts/SuggestedContactsPerformanceTracker$TraceType;", "<init>", "(Ljava/lang/String;I)V", "SUGGESTED_CONTACTS_LOADING_TRACE", "SUGGESTED_CONTACTS_HIDDEN_LOADING_TRACE", "SUGGESTED_CONTACTS_PINNED_LOADING_TRACE", "SUGGESTED_CONTACTS_MOST_CALLED_LOADING_TRACE", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SuggestedContactsPerformanceTracker$TraceType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[] $VALUES;
    public static final com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType SUGGESTED_CONTACTS_LOADING_TRACE = new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType("SUGGESTED_CONTACTS_LOADING_TRACE", 0);
    public static final com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType SUGGESTED_CONTACTS_HIDDEN_LOADING_TRACE = new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType("SUGGESTED_CONTACTS_HIDDEN_LOADING_TRACE", 1);
    public static final com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType SUGGESTED_CONTACTS_PINNED_LOADING_TRACE = new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType("SUGGESTED_CONTACTS_PINNED_LOADING_TRACE", 2);
    public static final com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType SUGGESTED_CONTACTS_MOST_CALLED_LOADING_TRACE = new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType("SUGGESTED_CONTACTS_MOST_CALLED_LOADING_TRACE", 3);

    private static final /* synthetic */ com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[] $values() {
        return new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[]{SUGGESTED_CONTACTS_LOADING_TRACE, SUGGESTED_CONTACTS_HIDDEN_LOADING_TRACE, SUGGESTED_CONTACTS_PINNED_LOADING_TRACE, SUGGESTED_CONTACTS_MOST_CALLED_LOADING_TRACE};
    }

    static {
        com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SuggestedContactsPerformanceTracker$TraceType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType valueOf(java.lang.String str) {
        return (com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType) java.lang.Enum.valueOf(com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType.class, str);
    }

    public static com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[] values() {
        return (com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceType[]) $VALUES.clone();
    }
}
