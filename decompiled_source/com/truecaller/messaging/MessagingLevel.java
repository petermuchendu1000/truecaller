package com.truecaller.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/messaging/MessagingLevel;", "", "state", "", "analyticLevel", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getState", "()I", "getAnalyticLevel", "()Ljava/lang/String;", "LOW", "MEDIUM", "HIGH", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessagingLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.MessagingLevel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticLevel;
    private final int state;
    public static final com.truecaller.messaging.MessagingLevel LOW = new com.truecaller.messaging.MessagingLevel("LOW", 0, 1, "low");
    public static final com.truecaller.messaging.MessagingLevel MEDIUM = new com.truecaller.messaging.MessagingLevel("MEDIUM", 1, 2, "medium");
    public static final com.truecaller.messaging.MessagingLevel HIGH = new com.truecaller.messaging.MessagingLevel("HIGH", 2, 3, "high");

    private static final /* synthetic */ com.truecaller.messaging.MessagingLevel[] $values() {
        return new com.truecaller.messaging.MessagingLevel[]{LOW, MEDIUM, HIGH};
    }

    static {
        com.truecaller.messaging.MessagingLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessagingLevel(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.state = i2;
        this.analyticLevel = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.MessagingLevel valueOf(java.lang.String str) {
        return (com.truecaller.messaging.MessagingLevel) java.lang.Enum.valueOf(com.truecaller.messaging.MessagingLevel.class, str);
    }

    public static com.truecaller.messaging.MessagingLevel[] values() {
        return (com.truecaller.messaging.MessagingLevel[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticLevel() {
        return this.analyticLevel;
    }

    public final int getState() {
        return this.state;
    }
}
