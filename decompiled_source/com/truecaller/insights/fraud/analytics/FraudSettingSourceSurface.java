package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudSettingSourceSurface;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "MESSAGING_SETTINGS", "FEATURE_ANNOUNCEMENT", "ONBOARDING", "FAQ", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudSettingSourceSurface {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface MESSAGING_SETTINGS = new com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface("MESSAGING_SETTINGS", 0, "messaging_settings");
    public static final com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface FEATURE_ANNOUNCEMENT = new com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface("FEATURE_ANNOUNCEMENT", 1, "feature_announcement");
    public static final com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface ONBOARDING = new com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface("ONBOARDING", 2, "onboarding");
    public static final com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface FAQ = new com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface("FAQ", 3, "faq");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[]{MESSAGING_SETTINGS, FEATURE_ANNOUNCEMENT, ONBOARDING, FAQ};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudSettingSourceSurface(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudSettingSourceSurface[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
