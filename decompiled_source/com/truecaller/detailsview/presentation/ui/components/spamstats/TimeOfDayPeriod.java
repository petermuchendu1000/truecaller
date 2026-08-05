package com.truecaller.detailsview.presentation.ui.components.spamstats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/truecaller/detailsview/presentation/ui/components/spamstats/TimeOfDayPeriod;", "", "", "index", "", "start", "end", "<init>", "(Ljava/lang/String;IIJJ)V", "I", "getIndex", "()I", "J", "getStart", "()J", "getEnd", "Companion", "ge1/e", "EARLY_MORNING", "MORNING", "AFTERNOON", "EARLY_EVENING", "EVENING", "NIGHT", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TimeOfDayPeriod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ge1.e Companion;
    private final long end;
    private final int index;
    private final long start;
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod EARLY_MORNING = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("EARLY_MORNING", 0, 0, 3, 6);
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod MORNING = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("MORNING", 1, 4, 7, 10);
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod AFTERNOON = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("AFTERNOON", 2, 8, 11, 14);
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod EARLY_EVENING = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("EARLY_EVENING", 3, 12, 15, 18);
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod EVENING = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("EVENING", 4, 16, 19, 22);
    public static final com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod NIGHT = new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod("NIGHT", 5, 20, 23, 2);

    private static final /* synthetic */ com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[] $values() {
        return new com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[]{EARLY_MORNING, MORNING, AFTERNOON, EARLY_EVENING, EVENING, NIGHT};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ge1.e, java.lang.Object] */
    static {
        com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private TimeOfDayPeriod(java.lang.String str, int i, int i2, long j, long j2) {
        this.index = i2;
        this.start = j;
        this.end = j2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod) java.lang.Enum.valueOf(com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod.class, str);
    }

    public static com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[] values() {
        return (com.truecaller.detailsview.presentation.ui.components.spamstats.TimeOfDayPeriod[]) $VALUES.clone();
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getStart() {
        return this.start;
    }
}
