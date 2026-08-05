package com.truecaller.attribution;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/truecaller/attribution/RetentionTracker$RetentionPeriod", "", "Lcom/truecaller/attribution/RetentionTracker$RetentionPeriod;", "", "days", "", "label", "<init>", "(Ljava/lang/String;IJLjava/lang/String;)V", "J", "getDays", "()J", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "D1", "D3", "D7", "D14", "D28", "attribution_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RetentionTracker$RetentionPeriod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.attribution.RetentionTracker$RetentionPeriod[] $VALUES;
    private final long days;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String label;
    public static final com.truecaller.attribution.RetentionTracker$RetentionPeriod D1 = new com.truecaller.attribution.RetentionTracker$RetentionPeriod("D1", 0, 1, "D1");
    public static final com.truecaller.attribution.RetentionTracker$RetentionPeriod D3 = new com.truecaller.attribution.RetentionTracker$RetentionPeriod("D3", 1, 3, "D3");
    public static final com.truecaller.attribution.RetentionTracker$RetentionPeriod D7 = new com.truecaller.attribution.RetentionTracker$RetentionPeriod("D7", 2, 7, "D7");
    public static final com.truecaller.attribution.RetentionTracker$RetentionPeriod D14 = new com.truecaller.attribution.RetentionTracker$RetentionPeriod("D14", 3, 14, "D14");
    public static final com.truecaller.attribution.RetentionTracker$RetentionPeriod D28 = new com.truecaller.attribution.RetentionTracker$RetentionPeriod("D28", 4, 28, "D28");

    private static final /* synthetic */ com.truecaller.attribution.RetentionTracker$RetentionPeriod[] $values() {
        return new com.truecaller.attribution.RetentionTracker$RetentionPeriod[]{D1, D3, D7, D14, D28};
    }

    static {
        com.truecaller.attribution.RetentionTracker$RetentionPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RetentionTracker$RetentionPeriod(java.lang.String str, int i, long j, java.lang.String str2) {
        this.days = j;
        this.label = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.attribution.RetentionTracker$RetentionPeriod valueOf(java.lang.String str) {
        return (com.truecaller.attribution.RetentionTracker$RetentionPeriod) java.lang.Enum.valueOf(com.truecaller.attribution.RetentionTracker$RetentionPeriod.class, str);
    }

    public static com.truecaller.attribution.RetentionTracker$RetentionPeriod[] values() {
        return (com.truecaller.attribution.RetentionTracker$RetentionPeriod[]) $VALUES.clone();
    }

    public final long getDays() {
        return this.days;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return this.label;
    }
}
