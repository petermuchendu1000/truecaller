package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudModelDeliveryLifecycleAction;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "DOWNLOAD_ATTEMPT", "DOWNLOAD_SUCCESS", "DOWNLOAD_FAILURE", "LOAD_SUCCESS", "LOAD_FAILURE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudModelDeliveryLifecycleAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction DOWNLOAD_ATTEMPT = new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction("DOWNLOAD_ATTEMPT", 0, "download_attempt");
    public static final com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction DOWNLOAD_SUCCESS = new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction("DOWNLOAD_SUCCESS", 1, "download_success");
    public static final com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction DOWNLOAD_FAILURE = new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction("DOWNLOAD_FAILURE", 2, "download_failure");
    public static final com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction LOAD_SUCCESS = new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction("LOAD_SUCCESS", 3, "load_success");
    public static final com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction LOAD_FAILURE = new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction("LOAD_FAILURE", 4, "load_failure");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[]{DOWNLOAD_ATTEMPT, DOWNLOAD_SUCCESS, DOWNLOAD_FAILURE, LOAD_SUCCESS, LOAD_FAILURE};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudModelDeliveryLifecycleAction(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudModelDeliveryLifecycleAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
