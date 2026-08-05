package com.truecaller.insights.commons.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/truecaller/insights/commons/utils/DateFormat;", "", "", "pattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lij3/bar;", "formatter", "()Lij3/bar;", "dateString", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;)Ljava/util/Date;", "date", "formatDate", "(Ljava/util/Date;)Ljava/lang/String;", "Lorg/joda/time/DateTime;", "dateTime", "(Lorg/joda/time/DateTime;)Ljava/lang/String;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "yyyy_MM_dd_HH_mm_ss", "yyyy_MM_dd_HH_mm", "hh_mm_aa", "dd_MMM", "dd_MMM_yyyy", "yyyy_MM_dd", "d", "MMM", "YYYY_MM", "MMM_YY", "H_mm", "MMMM", "MMMM_yyyy", "dd_MMM_yy", "ddMMyyyy", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DateFormat {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.DateFormat[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String pattern;
    public static final com.truecaller.insights.commons.utils.DateFormat yyyy_MM_dd_HH_mm_ss = new com.truecaller.insights.commons.utils.DateFormat("yyyy_MM_dd_HH_mm_ss", 0, "yyyy-MM-dd HH:mm:ss");
    public static final com.truecaller.insights.commons.utils.DateFormat yyyy_MM_dd_HH_mm = new com.truecaller.insights.commons.utils.DateFormat("yyyy_MM_dd_HH_mm", 1, "yyyy-MM-dd HH:mm");
    public static final com.truecaller.insights.commons.utils.DateFormat hh_mm_aa = new com.truecaller.insights.commons.utils.DateFormat("hh_mm_aa", 2, "hh:mm aa");
    public static final com.truecaller.insights.commons.utils.DateFormat dd_MMM = new com.truecaller.insights.commons.utils.DateFormat("dd_MMM", 3, "dd MMM");
    public static final com.truecaller.insights.commons.utils.DateFormat dd_MMM_yyyy = new com.truecaller.insights.commons.utils.DateFormat("dd_MMM_yyyy", 4, "dd MMM yyyy");
    public static final com.truecaller.insights.commons.utils.DateFormat yyyy_MM_dd = new com.truecaller.insights.commons.utils.DateFormat("yyyy_MM_dd", 5, "yyyy-MM-dd");
    public static final com.truecaller.insights.commons.utils.DateFormat d = new com.truecaller.insights.commons.utils.DateFormat("d", 6, "d");
    public static final com.truecaller.insights.commons.utils.DateFormat MMM = new com.truecaller.insights.commons.utils.DateFormat("MMM", 7, "MMM");
    public static final com.truecaller.insights.commons.utils.DateFormat YYYY_MM = new com.truecaller.insights.commons.utils.DateFormat("YYYY_MM", 8, "YYYY-MM");
    public static final com.truecaller.insights.commons.utils.DateFormat MMM_YY = new com.truecaller.insights.commons.utils.DateFormat("MMM_YY", 9, "MMM YY");
    public static final com.truecaller.insights.commons.utils.DateFormat H_mm = new com.truecaller.insights.commons.utils.DateFormat("H_mm", 10, "H:mm");
    public static final com.truecaller.insights.commons.utils.DateFormat MMMM = new com.truecaller.insights.commons.utils.DateFormat("MMMM", 11, "MMMM");
    public static final com.truecaller.insights.commons.utils.DateFormat MMMM_yyyy = new com.truecaller.insights.commons.utils.DateFormat("MMMM_yyyy", 12, "MMMM yyyy");
    public static final com.truecaller.insights.commons.utils.DateFormat dd_MMM_yy = new com.truecaller.insights.commons.utils.DateFormat("dd_MMM_yy", 13, "dd MMM yy");
    public static final com.truecaller.insights.commons.utils.DateFormat ddMMyyyy = new com.truecaller.insights.commons.utils.DateFormat("ddMMyyyy", 14, "ddMMyyyy");

    private static final /* synthetic */ com.truecaller.insights.commons.utils.DateFormat[] $values() {
        return new com.truecaller.insights.commons.utils.DateFormat[]{yyyy_MM_dd_HH_mm_ss, yyyy_MM_dd_HH_mm, hh_mm_aa, dd_MMM, dd_MMM_yyyy, yyyy_MM_dd, d, MMM, YYYY_MM, MMM_YY, H_mm, MMMM, MMMM_yyyy, dd_MMM_yy, ddMMyyyy};
    }

    static {
        com.truecaller.insights.commons.utils.DateFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DateFormat(java.lang.String str, int i, java.lang.String str2) {
        this.pattern = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.DateFormat valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.DateFormat) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.DateFormat.class, str);
    }

    public static com.truecaller.insights.commons.utils.DateFormat[] values() {
        return (com.truecaller.insights.commons.utils.DateFormat[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.lang.String format = new java.text.SimpleDateFormat(this.pattern, java.util.Locale.ENGLISH).format(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @org.jetbrains.annotations.NotNull
    public final ij3.bar formatter() {
        ij3.bar a = org.joda.time.format.bar.a(this.pattern);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "forPattern(...)");
        return a;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date parseDate(@org.jetbrains.annotations.NotNull java.lang.String dateString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "dateString");
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(this.pattern, java.util.Locale.ENGLISH).parse(dateString);
            if (parse == null) {
                return new java.util.Date();
            }
            return parse;
        } catch (java.text.ParseException unused) {
            return new java.util.Date();
        }
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull org.joda.time.DateTime dateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        java.lang.String format = new java.text.SimpleDateFormat(this.pattern, java.util.Locale.ENGLISH).format(dateTime.o());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
