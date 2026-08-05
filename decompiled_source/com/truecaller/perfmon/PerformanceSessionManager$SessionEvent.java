package com.truecaller.perfmon;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/perfmon/PerformanceSessionManager$SessionEvent", "", "Lcom/truecaller/perfmon/PerformanceSessionManager$SessionEvent;", "<init>", "(Ljava/lang/String;I)V", "NONE", "RECORD_TRACE_MANUAL", "RECORD_TRACE_AUTO", "RECORD_SNAPSHOT_MANUAL", "RECORD_SNAPSHOT_AUTO", "FLUSH", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PerformanceSessionManager$SessionEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[] $VALUES;
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent NONE = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("NONE", 0);
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent RECORD_TRACE_MANUAL = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("RECORD_TRACE_MANUAL", 1);
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent RECORD_TRACE_AUTO = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("RECORD_TRACE_AUTO", 2);
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent RECORD_SNAPSHOT_MANUAL = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("RECORD_SNAPSHOT_MANUAL", 3);
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent RECORD_SNAPSHOT_AUTO = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("RECORD_SNAPSHOT_AUTO", 4);
    public static final com.truecaller.perfmon.PerformanceSessionManager$SessionEvent FLUSH = new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent("FLUSH", 5);

    private static final /* synthetic */ com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[] $values() {
        return new com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[]{NONE, RECORD_TRACE_MANUAL, RECORD_TRACE_AUTO, RECORD_SNAPSHOT_MANUAL, RECORD_SNAPSHOT_AUTO, FLUSH};
    }

    static {
        com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PerformanceSessionManager$SessionEvent(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.perfmon.PerformanceSessionManager$SessionEvent valueOf(java.lang.String str) {
        return (com.truecaller.perfmon.PerformanceSessionManager$SessionEvent) java.lang.Enum.valueOf(com.truecaller.perfmon.PerformanceSessionManager$SessionEvent.class, str);
    }

    public static com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[] values() {
        return (com.truecaller.perfmon.PerformanceSessionManager$SessionEvent[]) $VALUES.clone();
    }
}
