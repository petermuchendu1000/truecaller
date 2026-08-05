package com.truecaller.bizmon.banner.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/bizmon/banner/analytics/BizVerifiedCampaignDisplayType;", "", "context", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "FACS", "PACS", "NEO_FACS", "NEO_PACS", "FCID", "PCID", "MID", "AI_MID", "DETAILS_MID", "DETAILS_VIEW", "FCID_V2", "UNKNOWN", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizVerifiedCampaignDisplayType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType FACS = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("FACS", 0, "facs");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType PACS = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("PACS", 1, "pacs");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType NEO_FACS = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("NEO_FACS", 2, "neo_facs");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType NEO_PACS = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("NEO_PACS", 3, "neo_pacs");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType FCID = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("FCID", 4, "fcid");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType PCID = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("PCID", 5, "pcid");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType MID = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("MID", 6, "mid");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType AI_MID = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("AI_MID", 7, "ai_mid");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType DETAILS_MID = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("DETAILS_MID", 8, "details_mid");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType DETAILS_VIEW = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("DETAILS_VIEW", 9, "details_view");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType FCID_V2 = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("FCID_V2", 10, "fcidV2");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType UNKNOWN = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType("UNKNOWN", 11, "unknown");

    private static final /* synthetic */ com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[] $values() {
        return new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[]{FACS, PACS, NEO_FACS, NEO_PACS, FCID, PCID, MID, AI_MID, DETAILS_MID, DETAILS_VIEW, FCID_V2, UNKNOWN};
    }

    static {
        com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizVerifiedCampaignDisplayType(java.lang.String str, int i, java.lang.String str2) {
        this.context = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType) java.lang.Enum.valueOf(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType.class, str);
    }

    public static com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[] values() {
        return (com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }
}
