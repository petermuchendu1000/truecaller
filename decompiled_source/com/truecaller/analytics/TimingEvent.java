package com.truecaller.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/analytics/TimingEvent;", "", "event", "", "eventGranularity", "", "itemGranularity", "unique", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;[J[JZ)V", "getEvent", "()Ljava/lang/String;", "getEventGranularity", "()[J", "getItemGranularity", "getUnique", "()Z", "CALL_LOG_MERGE", "CALL_LOG_FETCH_AND_MERGE", "CALL_LOG_STARTUP", "DIALER_STARTUP", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TimingEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.TimingEvent[] $VALUES;
    public static final com.truecaller.analytics.TimingEvent CALL_LOG_FETCH_AND_MERGE;
    public static final com.truecaller.analytics.TimingEvent CALL_LOG_MERGE;
    public static final com.truecaller.analytics.TimingEvent CALL_LOG_STARTUP;
    public static final com.truecaller.analytics.TimingEvent DIALER_STARTUP;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String event;

    @org.jetbrains.annotations.Nullable
    private final long[] eventGranularity;

    @org.jetbrains.annotations.Nullable
    private final long[] itemGranularity;
    private final boolean unique;

    private static final /* synthetic */ com.truecaller.analytics.TimingEvent[] $values() {
        return new com.truecaller.analytics.TimingEvent[]{CALL_LOG_MERGE, CALL_LOG_FETCH_AND_MERGE, CALL_LOG_STARTUP, DIALER_STARTUP};
    }

    static {
        long[] jArr = nc0.q1.b;
        long[] jArr2 = nc0.q1.a;
        CALL_LOG_MERGE = new com.truecaller.analytics.TimingEvent("CALL_LOG_MERGE", 0, "CallLogMerge", jArr, jArr2, false, 8, null);
        CALL_LOG_FETCH_AND_MERGE = new com.truecaller.analytics.TimingEvent("CALL_LOG_FETCH_AND_MERGE", 1, "CallLogFetchMerge", jArr, jArr2, false, 8, null);
        long[] jArr3 = nc0.q1.c;
        CALL_LOG_STARTUP = new com.truecaller.analytics.TimingEvent("CALL_LOG_STARTUP", 2, "CallLogStartup", jArr3, null, true, 4, null);
        DIALER_STARTUP = new com.truecaller.analytics.TimingEvent("DIALER_STARTUP", 3, "DialerStartup", jArr3, null, true, 4, null);
        com.truecaller.analytics.TimingEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TimingEvent(java.lang.String str, int i, java.lang.String str2, long[] jArr, long[] jArr2, boolean z) {
        this.event = str2;
        this.eventGranularity = jArr;
        this.itemGranularity = jArr2;
        this.unique = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.TimingEvent valueOf(java.lang.String str) {
        return (com.truecaller.analytics.TimingEvent) java.lang.Enum.valueOf(com.truecaller.analytics.TimingEvent.class, str);
    }

    public static com.truecaller.analytics.TimingEvent[] values() {
        return (com.truecaller.analytics.TimingEvent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEvent() {
        return this.event;
    }

    @org.jetbrains.annotations.Nullable
    public final long[] getEventGranularity() {
        return this.eventGranularity;
    }

    @org.jetbrains.annotations.Nullable
    public final long[] getItemGranularity() {
        return this.itemGranularity;
    }

    public final boolean getUnique() {
        return this.unique;
    }

    public /* synthetic */ TimingEvent(java.lang.String str, int i, java.lang.String str2, long[] jArr, long[] jArr2, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : jArr, (i2 & 4) != 0 ? null : jArr2, (i2 & 8) != 0 ? false : z);
    }
}
