package com.truecaller.blocking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/blocking/TrackingAction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "dj0/r", "BLOCK", "UNBLOCK", "NOT_SPAM", "REPORT_SPAM", "MARK_AS_SAFE", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TrackingAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.TrackingAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final dj0.r Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.blocking.TrackingAction BLOCK = new com.truecaller.blocking.TrackingAction("BLOCK", 0, "block");
    public static final com.truecaller.blocking.TrackingAction UNBLOCK = new com.truecaller.blocking.TrackingAction("UNBLOCK", 1, "unblock");
    public static final com.truecaller.blocking.TrackingAction NOT_SPAM = new com.truecaller.blocking.TrackingAction("NOT_SPAM", 2, "notspam");
    public static final com.truecaller.blocking.TrackingAction REPORT_SPAM = new com.truecaller.blocking.TrackingAction("REPORT_SPAM", 3, "reportSpam");
    public static final com.truecaller.blocking.TrackingAction MARK_AS_SAFE = new com.truecaller.blocking.TrackingAction("MARK_AS_SAFE", 4, "markAsSafe");

    private static final /* synthetic */ com.truecaller.blocking.TrackingAction[] $values() {
        return new com.truecaller.blocking.TrackingAction[]{BLOCK, UNBLOCK, NOT_SPAM, REPORT_SPAM, MARK_AS_SAFE};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, dj0.r] */
    static {
        com.truecaller.blocking.TrackingAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private TrackingAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.TrackingAction valueOf(java.lang.String str) {
        return (com.truecaller.blocking.TrackingAction) java.lang.Enum.valueOf(com.truecaller.blocking.TrackingAction.class, str);
    }

    public static com.truecaller.blocking.TrackingAction[] values() {
        return (com.truecaller.blocking.TrackingAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
