package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudWarningSurface;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MID", "NOTIFICATION", "MESSAGE_INLINE_ICON", "DETAILS_VIEW", "INBOX", "ONBOARDING", "FEATURE_ANNOUNCEMENT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudWarningSurface {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudWarningSurface[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface MID = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("MID", 0, "mid");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface NOTIFICATION = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("NOTIFICATION", 1, "notification");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface MESSAGE_INLINE_ICON = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("MESSAGE_INLINE_ICON", 2, "message_inline_icon");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface DETAILS_VIEW = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("DETAILS_VIEW", 3, "details_view");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface INBOX = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("INBOX", 4, "inbox");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface ONBOARDING = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("ONBOARDING", 5, "onboarding");
    public static final com.truecaller.insights.fraud.analytics.FraudWarningSurface FEATURE_ANNOUNCEMENT = new com.truecaller.insights.fraud.analytics.FraudWarningSurface("FEATURE_ANNOUNCEMENT", 6, "feature_announcement");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudWarningSurface[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudWarningSurface[]{MID, NOTIFICATION, MESSAGE_INLINE_ICON, DETAILS_VIEW, INBOX, ONBOARDING, FEATURE_ANNOUNCEMENT};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudWarningSurface[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudWarningSurface(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudWarningSurface valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudWarningSurface) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudWarningSurface.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudWarningSurface[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudWarningSurface[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
