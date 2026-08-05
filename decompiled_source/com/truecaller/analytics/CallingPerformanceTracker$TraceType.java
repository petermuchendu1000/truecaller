package com.truecaller.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/analytics/CallingPerformanceTracker$TraceType", "", "Lcom/truecaller/analytics/CallingPerformanceTracker$TraceType;", "<init>", "(Ljava/lang/String;I)V", "INCALLUI_LOAD", "POPUP_CALLERID_LOAD", "FACS_LOAD", "PACS_LOAD", "NEO_FACS_LOAD", "NEO_PACS_LOAD", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallingPerformanceTracker$TraceType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.CallingPerformanceTracker$TraceType[] $VALUES;
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType INCALLUI_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("INCALLUI_LOAD", 0);
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType POPUP_CALLERID_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("POPUP_CALLERID_LOAD", 1);
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType FACS_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("FACS_LOAD", 2);
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType PACS_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("PACS_LOAD", 3);
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType NEO_FACS_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("NEO_FACS_LOAD", 4);
    public static final com.truecaller.analytics.CallingPerformanceTracker$TraceType NEO_PACS_LOAD = new com.truecaller.analytics.CallingPerformanceTracker$TraceType("NEO_PACS_LOAD", 5);

    private static final /* synthetic */ com.truecaller.analytics.CallingPerformanceTracker$TraceType[] $values() {
        return new com.truecaller.analytics.CallingPerformanceTracker$TraceType[]{INCALLUI_LOAD, POPUP_CALLERID_LOAD, FACS_LOAD, PACS_LOAD, NEO_FACS_LOAD, NEO_PACS_LOAD};
    }

    static {
        com.truecaller.analytics.CallingPerformanceTracker$TraceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallingPerformanceTracker$TraceType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.CallingPerformanceTracker$TraceType valueOf(java.lang.String str) {
        return (com.truecaller.analytics.CallingPerformanceTracker$TraceType) java.lang.Enum.valueOf(com.truecaller.analytics.CallingPerformanceTracker$TraceType.class, str);
    }

    public static com.truecaller.analytics.CallingPerformanceTracker$TraceType[] values() {
        return (com.truecaller.analytics.CallingPerformanceTracker$TraceType[]) $VALUES.clone();
    }
}
