package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudActionScope;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "MESSAGE", "SENDER", "URL", "SETTING", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudActionScope {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudActionScope[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.insights.fraud.analytics.FraudActionScope MESSAGE = new com.truecaller.insights.fraud.analytics.FraudActionScope("MESSAGE", 0, "message");
    public static final com.truecaller.insights.fraud.analytics.FraudActionScope SENDER = new com.truecaller.insights.fraud.analytics.FraudActionScope("SENDER", 1, "sender");
    public static final com.truecaller.insights.fraud.analytics.FraudActionScope URL = new com.truecaller.insights.fraud.analytics.FraudActionScope("URL", 2, "url");
    public static final com.truecaller.insights.fraud.analytics.FraudActionScope SETTING = new com.truecaller.insights.fraud.analytics.FraudActionScope("SETTING", 3, "setting");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudActionScope[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudActionScope[]{MESSAGE, SENDER, URL, SETTING};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudActionScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudActionScope(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudActionScope valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudActionScope) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudActionScope.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudActionScope[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudActionScope[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
