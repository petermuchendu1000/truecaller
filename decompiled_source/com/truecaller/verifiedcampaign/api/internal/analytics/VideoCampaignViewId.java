package com.truecaller.verifiedcampaign.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/internal/analytics/VideoCampaignViewId;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MUTE_CAROUSEL", "UNMUTE_CAROUSEL", "MUTE_VIDEO_POPUP", "UNMUTE_VIDEO_POPUP", "CTA_VIDEO_POPUP", "VIDEO_POPUP", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VideoCampaignViewId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId MUTE_CAROUSEL = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("MUTE_CAROUSEL", 0, "Mute_Carousel");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId UNMUTE_CAROUSEL = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("UNMUTE_CAROUSEL", 1, "UnMute_Carousel");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId MUTE_VIDEO_POPUP = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("MUTE_VIDEO_POPUP", 2, "Mute_VideoPopup");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId UNMUTE_VIDEO_POPUP = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("UNMUTE_VIDEO_POPUP", 3, "UnMute_VideoPopup");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId CTA_VIDEO_POPUP = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("CTA_VIDEO_POPUP", 4, "CTA_VideoPopup");
    public static final com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId VIDEO_POPUP = new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId("VIDEO_POPUP", 5, "VideoPopup");

    private static final /* synthetic */ com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[] $values() {
        return new com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[]{MUTE_CAROUSEL, UNMUTE_CAROUSEL, MUTE_VIDEO_POPUP, UNMUTE_VIDEO_POPUP, CTA_VIDEO_POPUP, VIDEO_POPUP};
    }

    static {
        com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VideoCampaignViewId(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId valueOf(java.lang.String str) {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId) java.lang.Enum.valueOf(com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId.class, str);
    }

    public static com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[] values() {
        return (com.truecaller.verifiedcampaign.api.internal.analytics.VideoCampaignViewId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
