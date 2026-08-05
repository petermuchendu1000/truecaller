package com.truecaller.common.cloudtelephony.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/common/cloudtelephony/report/CallReportType;", "", "code", "", "analyticsName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getAnalyticsName", "()Ljava/lang/String;", "UNANSWERED", "REJECTED", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallReportType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.report.CallReportType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;
    private final int code;
    public static final com.truecaller.common.cloudtelephony.report.CallReportType UNANSWERED = new com.truecaller.common.cloudtelephony.report.CallReportType("UNANSWERED", 0, 0, "MissedCall");
    public static final com.truecaller.common.cloudtelephony.report.CallReportType REJECTED = new com.truecaller.common.cloudtelephony.report.CallReportType("REJECTED", 1, 1, "SendToAssistant");

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.report.CallReportType[] $values() {
        return new com.truecaller.common.cloudtelephony.report.CallReportType[]{UNANSWERED, REJECTED};
    }

    static {
        com.truecaller.common.cloudtelephony.report.CallReportType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallReportType(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.code = i2;
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.report.CallReportType valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.report.CallReportType) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.report.CallReportType.class, str);
    }

    public static com.truecaller.common.cloudtelephony.report.CallReportType[] values() {
        return (com.truecaller.common.cloudtelephony.report.CallReportType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getCode() {
        return this.code;
    }
}
