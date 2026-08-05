package com.truecaller.bizmon.banner.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/bizmon/banner/analytics/BizVerifiedCampaignAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICKED", "SHOWN", "CLICKED_NO_ACTION", "CLICKED_INVALID_URL", "CLICKED_NO_REDIRECTION", "IMAGE_NOT_LOADED", "CLICK_STREAM_API_FAILURE", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizVerifiedCampaignAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction CLICKED = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("CLICKED", 0, "clicked");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction SHOWN = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("SHOWN", 1, "shown");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction CLICKED_NO_ACTION = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("CLICKED_NO_ACTION", 2, "Clicked_no_action");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction CLICKED_INVALID_URL = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("CLICKED_INVALID_URL", 3, "Clicked_invalid_url");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction CLICKED_NO_REDIRECTION = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("CLICKED_NO_REDIRECTION", 4, "Clicked_no_redirection");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction IMAGE_NOT_LOADED = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("IMAGE_NOT_LOADED", 5, "Image_not_loaded");
    public static final com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction CLICK_STREAM_API_FAILURE = new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction("CLICK_STREAM_API_FAILURE", 6, "Click_stream_api_failure");

    private static final /* synthetic */ com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[] $values() {
        return new com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[]{CLICKED, SHOWN, CLICKED_NO_ACTION, CLICKED_INVALID_URL, CLICKED_NO_REDIRECTION, IMAGE_NOT_LOADED, CLICK_STREAM_API_FAILURE};
    }

    static {
        com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizVerifiedCampaignAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction) java.lang.Enum.valueOf(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.class, str);
    }

    public static com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[] values() {
        return (com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
