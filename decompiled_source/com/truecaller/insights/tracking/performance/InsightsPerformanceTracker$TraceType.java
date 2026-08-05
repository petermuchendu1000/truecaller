package com.truecaller.insights.tracking.performance;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/insights/tracking/performance/InsightsPerformanceTracker$TraceType", "", "Lcom/truecaller/insights/tracking/performance/InsightsPerformanceTracker$TraceType;", "<init>", "(Ljava/lang/String;I)V", "INSIGHTS_SYNC_FLOW", "INSIGHTS_SMS_TO_NOTIF_FLOW", "INSIGHTS_IM_TO_NOTIF_FLOW", "INSIGHTS_NOTIFICATION_FLOW", "INSIGHTS_INITIALIZATION", "INSIGHTS_MODULE_INITIALIZATION", "tracking-utils_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsPerformanceTracker$TraceType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[] $VALUES;
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_SYNC_FLOW = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_SYNC_FLOW", 0);
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_SMS_TO_NOTIF_FLOW = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_SMS_TO_NOTIF_FLOW", 1);
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_IM_TO_NOTIF_FLOW = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_IM_TO_NOTIF_FLOW", 2);
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_NOTIFICATION_FLOW = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_NOTIFICATION_FLOW", 3);
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_INITIALIZATION = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_INITIALIZATION", 4);
    public static final com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType INSIGHTS_MODULE_INITIALIZATION = new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType("INSIGHTS_MODULE_INITIALIZATION", 5);

    private static final /* synthetic */ com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[] $values() {
        return new com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[]{INSIGHTS_SYNC_FLOW, INSIGHTS_SMS_TO_NOTIF_FLOW, INSIGHTS_IM_TO_NOTIF_FLOW, INSIGHTS_NOTIFICATION_FLOW, INSIGHTS_INITIALIZATION, INSIGHTS_MODULE_INITIALIZATION};
    }

    static {
        com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsPerformanceTracker$TraceType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType valueOf(java.lang.String str) {
        return (com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType) java.lang.Enum.valueOf(com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType.class, str);
    }

    public static com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[] values() {
        return (com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType[]) $VALUES.clone();
    }
}
