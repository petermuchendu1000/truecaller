package com.truecaller.insights.commons.logging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/insights/commons/logging/InsightsExceptions$Cause", "", "Lcom/truecaller/insights/commons/logging/InsightsExceptions$Cause;", "", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "PARSE_FAILURE", "PARSER_UNKNOWN_GRM_EXCEPTION", "INSIGHTS_DB_ERROR", "DUPLICATE_SMS_BACKUPS_FOUND", "PARSER_ANALYTICS_EXCEPTION", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsExceptions$Cause {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.logging.InsightsExceptions$Cause[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String description;
    public static final com.truecaller.insights.commons.logging.InsightsExceptions$Cause PARSE_FAILURE = new com.truecaller.insights.commons.logging.InsightsExceptions$Cause("PARSE_FAILURE", 0, "Insights parser failed to parse the message");
    public static final com.truecaller.insights.commons.logging.InsightsExceptions$Cause PARSER_UNKNOWN_GRM_EXCEPTION = new com.truecaller.insights.commons.logging.InsightsExceptions$Cause("PARSER_UNKNOWN_GRM_EXCEPTION", 1, "Unknown grammar exception ");
    public static final com.truecaller.insights.commons.logging.InsightsExceptions$Cause INSIGHTS_DB_ERROR = new com.truecaller.insights.commons.logging.InsightsExceptions$Cause("INSIGHTS_DB_ERROR", 2, "DB error which cannot be recovered from");
    public static final com.truecaller.insights.commons.logging.InsightsExceptions$Cause DUPLICATE_SMS_BACKUPS_FOUND = new com.truecaller.insights.commons.logging.InsightsExceptions$Cause("DUPLICATE_SMS_BACKUPS_FOUND", 3, "Found duplicate error messages while on sync");
    public static final com.truecaller.insights.commons.logging.InsightsExceptions$Cause PARSER_ANALYTICS_EXCEPTION = new com.truecaller.insights.commons.logging.InsightsExceptions$Cause("PARSER_ANALYTICS_EXCEPTION", 4, "Tried logging for parser analytics with incomplete data");

    private static final /* synthetic */ com.truecaller.insights.commons.logging.InsightsExceptions$Cause[] $values() {
        return new com.truecaller.insights.commons.logging.InsightsExceptions$Cause[]{PARSE_FAILURE, PARSER_UNKNOWN_GRM_EXCEPTION, INSIGHTS_DB_ERROR, DUPLICATE_SMS_BACKUPS_FOUND, PARSER_ANALYTICS_EXCEPTION};
    }

    static {
        com.truecaller.insights.commons.logging.InsightsExceptions$Cause[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsExceptions$Cause(java.lang.String str, int i, java.lang.String str2) {
        this.description = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.logging.InsightsExceptions$Cause valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.logging.InsightsExceptions$Cause) java.lang.Enum.valueOf(com.truecaller.insights.commons.logging.InsightsExceptions$Cause.class, str);
    }

    public static com.truecaller.insights.commons.logging.InsightsExceptions$Cause[] values() {
        return (com.truecaller.insights.commons.logging.InsightsExceptions$Cause[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return this.description;
    }
}
