package com.truecaller.background_work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/truecaller/background_work/WorkActionPeriod;", "", "Lorg/joda/time/Duration;", "duration", "flexInterval", "exponentialBackoff", "", "maxRetryCount", "<init>", "(Ljava/lang/String;ILorg/joda/time/Duration;Lorg/joda/time/Duration;Lorg/joda/time/Duration;I)V", "Lorg/joda/time/Duration;", "getDuration", "()Lorg/joda/time/Duration;", "getFlexInterval", "getExponentialBackoff", "I", "getMaxRetryCount", "()I", "Companion", "uf0/s", "EVERY_THREE_HOURS", "EVERY_SIX_HOURS", "EVERY_TWELVE_HOURS", "DAILY", "WEEKLY", "MONTHLY", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class WorkActionPeriod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.background_work.WorkActionPeriod[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final uf0.s Companion;
    public static final com.truecaller.background_work.WorkActionPeriod DAILY;
    public static final com.truecaller.background_work.WorkActionPeriod EVERY_SIX_HOURS;
    public static final com.truecaller.background_work.WorkActionPeriod EVERY_THREE_HOURS;
    public static final com.truecaller.background_work.WorkActionPeriod EVERY_TWELVE_HOURS;
    public static final com.truecaller.background_work.WorkActionPeriod MONTHLY;
    public static final com.truecaller.background_work.WorkActionPeriod WEEKLY;

    @org.jetbrains.annotations.NotNull
    private final org.joda.time.Duration duration;

    @org.jetbrains.annotations.NotNull
    private final org.joda.time.Duration exponentialBackoff;

    @org.jetbrains.annotations.NotNull
    private final org.joda.time.Duration flexInterval;
    private final int maxRetryCount;

    private static final /* synthetic */ com.truecaller.background_work.WorkActionPeriod[] $values() {
        return new com.truecaller.background_work.WorkActionPeriod[]{EVERY_THREE_HOURS, EVERY_SIX_HOURS, EVERY_TWELVE_HOURS, DAILY, WEEKLY, MONTHLY};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uf0.s] */
    static {
        org.joda.time.Duration i = org.joda.time.Duration.i(3L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "standardHours(...)");
        org.joda.time.Duration j = org.joda.time.Duration.j(30L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(j, "standardMinutes(...)");
        org.joda.time.Duration j2 = org.joda.time.Duration.j(30L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(j2, "standardMinutes(...)");
        EVERY_THREE_HOURS = new com.truecaller.background_work.WorkActionPeriod("EVERY_THREE_HOURS", 0, i, j, j2, 1);
        org.joda.time.Duration i2 = org.joda.time.Duration.i(6L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i2, "standardHours(...)");
        org.joda.time.Duration i3 = org.joda.time.Duration.i(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i3, "standardHours(...)");
        org.joda.time.Duration i4 = org.joda.time.Duration.i(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i4, "standardHours(...)");
        EVERY_SIX_HOURS = new com.truecaller.background_work.WorkActionPeriod("EVERY_SIX_HOURS", 1, i2, i3, i4, 1);
        org.joda.time.Duration i5 = org.joda.time.Duration.i(12L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i5, "standardHours(...)");
        org.joda.time.Duration i6 = org.joda.time.Duration.i(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i6, "standardHours(...)");
        org.joda.time.Duration i7 = org.joda.time.Duration.i(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i7, "standardHours(...)");
        EVERY_TWELVE_HOURS = new com.truecaller.background_work.WorkActionPeriod("EVERY_TWELVE_HOURS", 2, i5, i6, i7, 2);
        org.joda.time.Duration h = org.joda.time.Duration.h(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "standardDays(...)");
        org.joda.time.Duration i8 = org.joda.time.Duration.i(12L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i8, "standardHours(...)");
        org.joda.time.Duration i9 = org.joda.time.Duration.i(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i9, "standardHours(...)");
        DAILY = new com.truecaller.background_work.WorkActionPeriod("DAILY", 3, h, i8, i9, 2);
        org.joda.time.Duration h2 = org.joda.time.Duration.h(7L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "standardDays(...)");
        org.joda.time.Duration h3 = org.joda.time.Duration.h(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "standardDays(...)");
        org.joda.time.Duration i11 = org.joda.time.Duration.i(6L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i11, "standardHours(...)");
        WEEKLY = new com.truecaller.background_work.WorkActionPeriod("WEEKLY", 4, h2, h3, i11, 3);
        org.joda.time.Duration h4 = org.joda.time.Duration.h(30L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "standardDays(...)");
        org.joda.time.Duration h5 = org.joda.time.Duration.h(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h5, "standardDays(...)");
        org.joda.time.Duration i12 = org.joda.time.Duration.i(12L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i12, "standardHours(...)");
        MONTHLY = new com.truecaller.background_work.WorkActionPeriod("MONTHLY", 5, h4, h5, i12, 3);
        com.truecaller.background_work.WorkActionPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private WorkActionPeriod(java.lang.String str, int i, org.joda.time.Duration duration, org.joda.time.Duration duration2, org.joda.time.Duration duration3, int i2) {
        this.duration = duration;
        this.flexInterval = duration2;
        this.exponentialBackoff = duration3;
        this.maxRetryCount = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.background_work.WorkActionPeriod valueOf(java.lang.String str) {
        return (com.truecaller.background_work.WorkActionPeriod) java.lang.Enum.valueOf(com.truecaller.background_work.WorkActionPeriod.class, str);
    }

    public static com.truecaller.background_work.WorkActionPeriod[] values() {
        return (com.truecaller.background_work.WorkActionPeriod[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final org.joda.time.Duration getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.NotNull
    public final org.joda.time.Duration getExponentialBackoff() {
        return this.exponentialBackoff;
    }

    @org.jetbrains.annotations.NotNull
    public final org.joda.time.Duration getFlexInterval() {
        return this.flexInterval;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }
}
