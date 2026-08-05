package com.truecaller.verifiedcampaign.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/internal/analytics/VerifiedCampaignSwipeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTO", "MANUAL", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedCampaignSwipeType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[] $VALUES;
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType AUTO = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType("AUTO", 0, "auto");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType MANUAL = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType("MANUAL", 1, "manual");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[] $values() {
        return new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[]{AUTO, MANUAL};
    }

    static {
        com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VerifiedCampaignSwipeType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType valueOf(java.lang.String str) {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType) java.lang.Enum.valueOf(com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType.class, str);
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[] values() {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignSwipeType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
