package com.truecaller.verifiedcampaign.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/VerifiedCampaignDisplayType;", "", "context", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "DETAILS_VIEW", "DETAILS_VIEW_MESSAGE", "DETAILS_VIEW_V3", "DETAILS_VIEW_MESSAGE_V3", "FACS", "NEO_FACS", "PACS", "NEO_PACS", "MID", "AI_MID", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedCampaignDisplayType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType DETAILS_VIEW = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("DETAILS_VIEW", 0, "details_view");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType DETAILS_VIEW_MESSAGE = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("DETAILS_VIEW_MESSAGE", 1, "details_view_mid");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType DETAILS_VIEW_V3 = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("DETAILS_VIEW_V3", 2, "details_view_v3");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType DETAILS_VIEW_MESSAGE_V3 = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("DETAILS_VIEW_MESSAGE_V3", 3, "details_view_mid_v3");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType FACS = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("FACS", 4, "facs");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType NEO_FACS = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("NEO_FACS", 5, "neoFacs");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType PACS = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("PACS", 6, "pacs");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType NEO_PACS = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("NEO_PACS", 7, "neoPacs");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType MID = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("MID", 8, "mid");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType AI_MID = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("AI_MID", 9, "aiMid");
    public static final com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType UNKNOWN = new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType("UNKNOWN", 10, "unknown");

    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[] $values() {
        return new com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[]{DETAILS_VIEW, DETAILS_VIEW_MESSAGE, DETAILS_VIEW_V3, DETAILS_VIEW_MESSAGE_V3, FACS, NEO_FACS, PACS, NEO_PACS, MID, AI_MID, UNKNOWN};
    }

    static {
        com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VerifiedCampaignDisplayType(java.lang.String str, int i, java.lang.String str2) {
        this.context = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType valueOf(java.lang.String str) {
        return (com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType) java.lang.Enum.valueOf(com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType.class, str);
    }

    public static com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[] values() {
        return (com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }
}
