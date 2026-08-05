package com.truecaller.premium.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/analytics/LogLevel;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "I", "getPriority", "()I", "Companion", "k82/qux", "VERBOSE", "DEBUG", "CORE", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class LogLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.analytics.LogLevel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final k82.qux Companion;
    private final int priority;
    public static final com.truecaller.premium.analytics.LogLevel VERBOSE = new com.truecaller.premium.analytics.LogLevel("VERBOSE", 0, 3);
    public static final com.truecaller.premium.analytics.LogLevel DEBUG = new com.truecaller.premium.analytics.LogLevel("DEBUG", 1, 2);
    public static final com.truecaller.premium.analytics.LogLevel CORE = new com.truecaller.premium.analytics.LogLevel("CORE", 2, 1);
    public static final com.truecaller.premium.analytics.LogLevel NONE = new com.truecaller.premium.analytics.LogLevel("NONE", 3, 0);

    private static final /* synthetic */ com.truecaller.premium.analytics.LogLevel[] $values() {
        return new com.truecaller.premium.analytics.LogLevel[]{VERBOSE, DEBUG, CORE, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k82.qux] */
    static {
        com.truecaller.premium.analytics.LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private LogLevel(java.lang.String str, int i10, int i11) {
        this.priority = i11;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.analytics.LogLevel valueOf(java.lang.String str) {
        return (com.truecaller.premium.analytics.LogLevel) java.lang.Enum.valueOf(com.truecaller.premium.analytics.LogLevel.class, str);
    }

    public static com.truecaller.premium.analytics.LogLevel[] values() {
        return (com.truecaller.premium.analytics.LogLevel[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
