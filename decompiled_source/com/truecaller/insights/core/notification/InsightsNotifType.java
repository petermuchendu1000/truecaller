package com.truecaller.insights.core.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/core/notification/InsightsNotifType;", "", "<init>", "(Ljava/lang/String;I)V", "FEEDBACK_MID", "FRAUD_MID", "SPAM_MID", "REGULAR_MID", "LLM_L2_MID", "LLM_L3_MID", "LLM_SUMMARY", "LLM_USE_CASE", "PARSER_MID", "GOVERNMENT_MID", "NO_NOTIF", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsNotifType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.notification.InsightsNotifType[] $VALUES;
    public static final com.truecaller.insights.core.notification.InsightsNotifType FEEDBACK_MID = new com.truecaller.insights.core.notification.InsightsNotifType("FEEDBACK_MID", 0);
    public static final com.truecaller.insights.core.notification.InsightsNotifType FRAUD_MID = new com.truecaller.insights.core.notification.InsightsNotifType("FRAUD_MID", 1);
    public static final com.truecaller.insights.core.notification.InsightsNotifType SPAM_MID = new com.truecaller.insights.core.notification.InsightsNotifType("SPAM_MID", 2);
    public static final com.truecaller.insights.core.notification.InsightsNotifType REGULAR_MID = new com.truecaller.insights.core.notification.InsightsNotifType("REGULAR_MID", 3);
    public static final com.truecaller.insights.core.notification.InsightsNotifType LLM_L2_MID = new com.truecaller.insights.core.notification.InsightsNotifType("LLM_L2_MID", 4);
    public static final com.truecaller.insights.core.notification.InsightsNotifType LLM_L3_MID = new com.truecaller.insights.core.notification.InsightsNotifType("LLM_L3_MID", 5);
    public static final com.truecaller.insights.core.notification.InsightsNotifType LLM_SUMMARY = new com.truecaller.insights.core.notification.InsightsNotifType("LLM_SUMMARY", 6);
    public static final com.truecaller.insights.core.notification.InsightsNotifType LLM_USE_CASE = new com.truecaller.insights.core.notification.InsightsNotifType("LLM_USE_CASE", 7);
    public static final com.truecaller.insights.core.notification.InsightsNotifType PARSER_MID = new com.truecaller.insights.core.notification.InsightsNotifType("PARSER_MID", 8);
    public static final com.truecaller.insights.core.notification.InsightsNotifType GOVERNMENT_MID = new com.truecaller.insights.core.notification.InsightsNotifType("GOVERNMENT_MID", 9);
    public static final com.truecaller.insights.core.notification.InsightsNotifType NO_NOTIF = new com.truecaller.insights.core.notification.InsightsNotifType("NO_NOTIF", 10);

    private static final /* synthetic */ com.truecaller.insights.core.notification.InsightsNotifType[] $values() {
        return new com.truecaller.insights.core.notification.InsightsNotifType[]{FEEDBACK_MID, FRAUD_MID, SPAM_MID, REGULAR_MID, LLM_L2_MID, LLM_L3_MID, LLM_SUMMARY, LLM_USE_CASE, PARSER_MID, GOVERNMENT_MID, NO_NOTIF};
    }

    static {
        com.truecaller.insights.core.notification.InsightsNotifType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsNotifType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.notification.InsightsNotifType valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.notification.InsightsNotifType) java.lang.Enum.valueOf(com.truecaller.insights.core.notification.InsightsNotifType.class, str);
    }

    public static com.truecaller.insights.core.notification.InsightsNotifType[] values() {
        return (com.truecaller.insights.core.notification.InsightsNotifType[]) $VALUES.clone();
    }
}
