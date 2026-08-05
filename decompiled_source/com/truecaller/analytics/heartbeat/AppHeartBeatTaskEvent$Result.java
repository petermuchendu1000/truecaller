package com.truecaller.analytics.heartbeat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/analytics/heartbeat/AppHeartBeatTaskEvent$Result", "", "Lcom/truecaller/analytics/heartbeat/AppHeartBeatTaskEvent$Result;", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "QUEUED", "FAILED_BUILDING_EVENT", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppHeartBeatTaskEvent$Result {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String status;
    public static final com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result SUCCESS = new com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result("SUCCESS", 0, "Success");
    public static final com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result FAILURE = new com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result("FAILURE", 1, "Failure");
    public static final com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result QUEUED = new com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result("QUEUED", 2, "Queued");
    public static final com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result FAILED_BUILDING_EVENT = new com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result("FAILED_BUILDING_EVENT", 3, "FailedBuildingEvent");

    private static final /* synthetic */ com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[] $values() {
        return new com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[]{SUCCESS, FAILURE, QUEUED, FAILED_BUILDING_EVENT};
    }

    static {
        com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AppHeartBeatTaskEvent$Result(java.lang.String str, int i, java.lang.String str2) {
        this.status = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result valueOf(java.lang.String str) {
        return (com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result) java.lang.Enum.valueOf(com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result.class, str);
    }

    public static com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[] values() {
        return (com.truecaller.analytics.heartbeat.AppHeartBeatTaskEvent$Result[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return this.status;
    }
}
