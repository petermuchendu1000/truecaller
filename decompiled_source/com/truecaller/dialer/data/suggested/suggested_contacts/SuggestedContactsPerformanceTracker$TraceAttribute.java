package com.truecaller.dialer.data.suggested.suggested_contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/truecaller/dialer/data/suggested/suggested_contacts/SuggestedContactsPerformanceTracker$TraceAttribute", "", "Lcom/truecaller/dialer/data/suggested/suggested_contacts/SuggestedContactsPerformanceTracker$TraceAttribute;", "<init>", "(Ljava/lang/String;I)V", "BIGGER_FREQUENTS_TEST", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SuggestedContactsPerformanceTracker$TraceAttribute {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[] $VALUES;
    public static final com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute BIGGER_FREQUENTS_TEST = new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute("BIGGER_FREQUENTS_TEST", 0);

    private static final /* synthetic */ com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[] $values() {
        return new com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[]{BIGGER_FREQUENTS_TEST};
    }

    static {
        com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SuggestedContactsPerformanceTracker$TraceAttribute(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute valueOf(java.lang.String str) {
        return (com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute) java.lang.Enum.valueOf(com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute.class, str);
    }

    public static com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[] values() {
        return (com.truecaller.dialer.data.suggested.suggested_contacts.SuggestedContactsPerformanceTracker$TraceAttribute[]) $VALUES.clone();
    }
}
