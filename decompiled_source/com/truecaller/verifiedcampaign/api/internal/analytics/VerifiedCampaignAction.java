package com.truecaller.verifiedcampaign.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/internal/analytics/VerifiedCampaignAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICKED", "SHOWN", "CLICKED_NO_ACTION", "CLICKED_INVALID_URL", "CLICKED_NO_REDIRECTION", "IMAGE_NOT_LOADED", "DISMISSED", "CLICK_STREAM_API_FAILURE", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedCampaignAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction CLICKED = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("CLICKED", 0, "Clicked");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction SHOWN = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("SHOWN", 1, "Shown");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction CLICKED_NO_ACTION = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("CLICKED_NO_ACTION", 2, "Clicked_no_action");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction CLICKED_INVALID_URL = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("CLICKED_INVALID_URL", 3, "Clicked_invalid_url");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction CLICKED_NO_REDIRECTION = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("CLICKED_NO_REDIRECTION", 4, "Clicked_no_redirection");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction IMAGE_NOT_LOADED = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("IMAGE_NOT_LOADED", 5, "Image_not_loaded");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction DISMISSED = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("DISMISSED", 6, "Dismissed");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction CLICK_STREAM_API_FAILURE = new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction("CLICK_STREAM_API_FAILURE", 7, "Click_stream_api_failure");

    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[] $values() {
        return new com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[]{CLICKED, SHOWN, CLICKED_NO_ACTION, CLICKED_INVALID_URL, CLICKED_NO_REDIRECTION, IMAGE_NOT_LOADED, DISMISSED, CLICK_STREAM_API_FAILURE};
    }

    static {
        com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VerifiedCampaignAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction valueOf(java.lang.String str) {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction) java.lang.Enum.valueOf(com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction.class, str);
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[] values() {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
