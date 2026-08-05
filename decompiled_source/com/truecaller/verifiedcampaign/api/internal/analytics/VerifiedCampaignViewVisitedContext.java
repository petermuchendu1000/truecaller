package com.truecaller.verifiedcampaign.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/internal/analytics/VerifiedCampaignViewVisitedContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS_VIEW_V2", "DETAILS_VIEW_V3", "FACS", "NEO_FACS", "PACS", "NEO_PACS", "MID", "AI_MID", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedCampaignViewVisitedContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext DETAILS_VIEW_V2 = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("DETAILS_VIEW_V2", 0, "DetailsViewV2");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext DETAILS_VIEW_V3 = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("DETAILS_VIEW_V3", 1, "DetailsViewV3");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext FACS = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("FACS", 2, "Facs");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext NEO_FACS = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("NEO_FACS", 3, "NeoFacs");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext PACS = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("PACS", 4, "Pacs");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext NEO_PACS = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("NEO_PACS", 5, "NeoPacs");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext MID = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("MID", 6, "mid");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext AI_MID = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext("AI_MID", 7, "aiMid");

    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[] $values() {
        return new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[]{DETAILS_VIEW_V2, DETAILS_VIEW_V3, FACS, NEO_FACS, PACS, NEO_PACS, MID, AI_MID};
    }

    static {
        com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VerifiedCampaignViewVisitedContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext valueOf(java.lang.String str) {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext) java.lang.Enum.valueOf(com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext.class, str);
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[] values() {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignViewVisitedContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
