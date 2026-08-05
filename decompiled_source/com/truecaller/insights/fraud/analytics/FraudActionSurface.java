package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudActionSurface;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "MID", "NOTIFICATION", "CONVERSATION", "MESSAGING_SETTINGS", "FEATURE_ANNOUNCEMENT", "ONBOARDING", "FAQ", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudActionSurface {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudActionSurface[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface MID = new com.truecaller.insights.fraud.analytics.FraudActionSurface("MID", 0, "mid");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface NOTIFICATION = new com.truecaller.insights.fraud.analytics.FraudActionSurface("NOTIFICATION", 1, "notification");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface CONVERSATION = new com.truecaller.insights.fraud.analytics.FraudActionSurface("CONVERSATION", 2, "conversation");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface MESSAGING_SETTINGS = new com.truecaller.insights.fraud.analytics.FraudActionSurface("MESSAGING_SETTINGS", 3, "messaging_settings");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface FEATURE_ANNOUNCEMENT = new com.truecaller.insights.fraud.analytics.FraudActionSurface("FEATURE_ANNOUNCEMENT", 4, "feature_announcement");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface ONBOARDING = new com.truecaller.insights.fraud.analytics.FraudActionSurface("ONBOARDING", 5, "onboarding");
    public static final com.truecaller.insights.fraud.analytics.FraudActionSurface FAQ = new com.truecaller.insights.fraud.analytics.FraudActionSurface("FAQ", 6, "faq");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudActionSurface[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudActionSurface[]{MID, NOTIFICATION, CONVERSATION, MESSAGING_SETTINGS, FEATURE_ANNOUNCEMENT, ONBOARDING, FAQ};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudActionSurface[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudActionSurface(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudActionSurface valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudActionSurface) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudActionSurface.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudActionSurface[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudActionSurface[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
