package com.truecaller.ghost_call;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ghost_call/ScheduleDuration;", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "titleRes", "", "<init>", "(Ljava/lang/String;IJLjava/util/concurrent/TimeUnit;I)V", "getDelay", "()J", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "getTitleRes", "()I", "IMMEDIATE", "TEN_SECONDS", "ONE_MINUTE", "FIVE_MINUTES", "THIRTY_MINUTES", "ghost-call_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ScheduleDuration {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ghost_call.ScheduleDuration[] $VALUES;
    public static final com.truecaller.ghost_call.ScheduleDuration FIVE_MINUTES;
    public static final com.truecaller.ghost_call.ScheduleDuration IMMEDIATE;
    public static final com.truecaller.ghost_call.ScheduleDuration ONE_MINUTE;
    public static final com.truecaller.ghost_call.ScheduleDuration TEN_SECONDS;
    public static final com.truecaller.ghost_call.ScheduleDuration THIRTY_MINUTES;
    private final long delay;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.TimeUnit timeUnit;
    private final int titleRes;

    private static final /* synthetic */ com.truecaller.ghost_call.ScheduleDuration[] $values() {
        return new com.truecaller.ghost_call.ScheduleDuration[]{IMMEDIATE, TEN_SECONDS, ONE_MINUTE, FIVE_MINUTES, THIRTY_MINUTES};
    }

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        IMMEDIATE = new com.truecaller.ghost_call.ScheduleDuration("IMMEDIATE", 0, 0L, timeUnit, 2132018798);
        TEN_SECONDS = new com.truecaller.ghost_call.ScheduleDuration("TEN_SECONDS", 1, 10L, timeUnit, 2132018800);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        ONE_MINUTE = new com.truecaller.ghost_call.ScheduleDuration("ONE_MINUTE", 2, 1L, timeUnit2, 2132018799);
        FIVE_MINUTES = new com.truecaller.ghost_call.ScheduleDuration("FIVE_MINUTES", 3, 5L, timeUnit2, 2132018797);
        THIRTY_MINUTES = new com.truecaller.ghost_call.ScheduleDuration("THIRTY_MINUTES", 4, 30L, timeUnit2, 2132018801);
        com.truecaller.ghost_call.ScheduleDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScheduleDuration(java.lang.String str, int i, long j, java.util.concurrent.TimeUnit timeUnit, int i2) {
        this.delay = j;
        this.timeUnit = timeUnit;
        this.titleRes = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ghost_call.ScheduleDuration valueOf(java.lang.String str) {
        return (com.truecaller.ghost_call.ScheduleDuration) java.lang.Enum.valueOf(com.truecaller.ghost_call.ScheduleDuration.class, str);
    }

    public static com.truecaller.ghost_call.ScheduleDuration[] values() {
        return (com.truecaller.ghost_call.ScheduleDuration[]) $VALUES.clone();
    }

    public final long getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }
}
