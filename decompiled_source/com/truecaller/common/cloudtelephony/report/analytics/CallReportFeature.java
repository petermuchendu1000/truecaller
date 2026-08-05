package com.truecaller.common.cloudtelephony.report.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/common/cloudtelephony/report/analytics/CallReportFeature;", "", "analyticsName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsName", "()Ljava/lang/String;", "ASSISTANT", "VOICEMAIL", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallReportFeature {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[] $VALUES;
    public static final com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature ASSISTANT = new com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature("ASSISTANT", 0, "Assistant");
    public static final com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature VOICEMAIL = new com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature("VOICEMAIL", 1, "Voicemail");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[] $values() {
        return new com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[]{ASSISTANT, VOICEMAIL};
    }

    static {
        com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallReportFeature(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature.class, str);
    }

    public static com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[] values() {
        return (com.truecaller.common.cloudtelephony.report.analytics.CallReportFeature[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }
}
