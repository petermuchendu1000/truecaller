package com.truecaller.clevertap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/clevertap/MonthSegment;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "jz0/r", "UNDEFINED", "CURRENT_MONTH", "ONE_MONTH", "TWO_MONTH", "THREE_MONTH", "FOUR_SIX_MONTH", "SEVEN_NINE_MONTH", "TEN_TWELVE_MONTH", "YEAR_MORE", "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MonthSegment {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.clevertap.MonthSegment[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final jz0.r Companion;
    public static final com.truecaller.clevertap.MonthSegment UNDEFINED = new com.truecaller.clevertap.MonthSegment("UNDEFINED", 0);
    public static final com.truecaller.clevertap.MonthSegment CURRENT_MONTH = new com.truecaller.clevertap.MonthSegment("CURRENT_MONTH", 1);
    public static final com.truecaller.clevertap.MonthSegment ONE_MONTH = new com.truecaller.clevertap.MonthSegment("ONE_MONTH", 2);
    public static final com.truecaller.clevertap.MonthSegment TWO_MONTH = new com.truecaller.clevertap.MonthSegment("TWO_MONTH", 3);
    public static final com.truecaller.clevertap.MonthSegment THREE_MONTH = new com.truecaller.clevertap.MonthSegment("THREE_MONTH", 4);
    public static final com.truecaller.clevertap.MonthSegment FOUR_SIX_MONTH = new com.truecaller.clevertap.MonthSegment("FOUR_SIX_MONTH", 5);
    public static final com.truecaller.clevertap.MonthSegment SEVEN_NINE_MONTH = new com.truecaller.clevertap.MonthSegment("SEVEN_NINE_MONTH", 6);
    public static final com.truecaller.clevertap.MonthSegment TEN_TWELVE_MONTH = new com.truecaller.clevertap.MonthSegment("TEN_TWELVE_MONTH", 7);
    public static final com.truecaller.clevertap.MonthSegment YEAR_MORE = new com.truecaller.clevertap.MonthSegment("YEAR_MORE", 8);

    private static final /* synthetic */ com.truecaller.clevertap.MonthSegment[] $values() {
        return new com.truecaller.clevertap.MonthSegment[]{UNDEFINED, CURRENT_MONTH, ONE_MONTH, TWO_MONTH, THREE_MONTH, FOUR_SIX_MONTH, SEVEN_NINE_MONTH, TEN_TWELVE_MONTH, YEAR_MORE};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [jz0.r, java.lang.Object] */
    static {
        com.truecaller.clevertap.MonthSegment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private MonthSegment(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.clevertap.MonthSegment valueOf(java.lang.String str) {
        return (com.truecaller.clevertap.MonthSegment) java.lang.Enum.valueOf(com.truecaller.clevertap.MonthSegment.class, str);
    }

    public static com.truecaller.clevertap.MonthSegment[] values() {
        return (com.truecaller.clevertap.MonthSegment[]) $VALUES.clone();
    }
}
