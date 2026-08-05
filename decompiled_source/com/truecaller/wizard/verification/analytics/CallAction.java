package com.truecaller.wizard.verification.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/wizard/verification/analytics/CallAction;", "", "analyticsName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsName", "()Ljava/lang/String;", "RINGING", "REJECTED", "NOT_REJECTED", "ANSWERED", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.verification.analytics.CallAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;
    public static final com.truecaller.wizard.verification.analytics.CallAction RINGING = new com.truecaller.wizard.verification.analytics.CallAction("RINGING", 0, "Ringing");
    public static final com.truecaller.wizard.verification.analytics.CallAction REJECTED = new com.truecaller.wizard.verification.analytics.CallAction("REJECTED", 1, "Rejected");
    public static final com.truecaller.wizard.verification.analytics.CallAction NOT_REJECTED = new com.truecaller.wizard.verification.analytics.CallAction("NOT_REJECTED", 2, "Not Rejected");
    public static final com.truecaller.wizard.verification.analytics.CallAction ANSWERED = new com.truecaller.wizard.verification.analytics.CallAction("ANSWERED", 3, "Answered");

    private static final /* synthetic */ com.truecaller.wizard.verification.analytics.CallAction[] $values() {
        return new com.truecaller.wizard.verification.analytics.CallAction[]{RINGING, REJECTED, NOT_REJECTED, ANSWERED};
    }

    static {
        com.truecaller.wizard.verification.analytics.CallAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallAction(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.verification.analytics.CallAction valueOf(java.lang.String str) {
        return (com.truecaller.wizard.verification.analytics.CallAction) java.lang.Enum.valueOf(com.truecaller.wizard.verification.analytics.CallAction.class, str);
    }

    public static com.truecaller.wizard.verification.analytics.CallAction[] values() {
        return (com.truecaller.wizard.verification.analytics.CallAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }
}
