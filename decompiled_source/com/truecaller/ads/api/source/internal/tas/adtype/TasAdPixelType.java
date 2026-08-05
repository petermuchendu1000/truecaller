package com.truecaller.ads.api.source.internal.tas.adtype;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/truecaller/ads/api/source/internal/tas/adtype/TasAdPixelType;", "", "", "", "value", "Lcom/truecaller/ads/api/source/internal/tas/adtype/PixelDeduplicationStrategy;", "deduplicationStrategy", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/truecaller/ads/api/source/internal/tas/adtype/PixelDeduplicationStrategy;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Lcom/truecaller/ads/api/source/internal/tas/adtype/PixelDeduplicationStrategy;", "getDeduplicationStrategy", "()Lcom/truecaller/ads/api/source/internal/tas/adtype/PixelDeduplicationStrategy;", "Impression", "ViewableImpression", "Click", "VideoImpression", "VideoInteractionImpression", "VastVideoImpression", "VastVideoInteraction", "ThankYou", "Event", "Win", "Loss", "Error", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TasAdPixelType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[] $VALUES;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Click;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Error;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Event;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Impression;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Loss;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType ThankYou;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType VastVideoImpression;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType VastVideoInteraction;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType VideoImpression;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType VideoInteractionImpression;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType ViewableImpression;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType Win;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy deduplicationStrategy;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[] $values() {
        return new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[]{Impression, ViewableImpression, Click, VideoImpression, VideoInteractionImpression, VastVideoImpression, VastVideoInteraction, ThankYou, Event, Win, Loss, Error};
    }

    static {
        com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy pixelDeduplicationStrategy = com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy.ONCE_PER_AD;
        Impression = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Impression", 0, "impression", pixelDeduplicationStrategy);
        ViewableImpression = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("ViewableImpression", 1, "viewable_impression", pixelDeduplicationStrategy);
        Click = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Click", 2, "click", pixelDeduplicationStrategy);
        com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy pixelDeduplicationStrategy2 = com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy.ONCE_PER_VALUE;
        VideoImpression = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("VideoImpression", 3, "video_impression", pixelDeduplicationStrategy2);
        com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy pixelDeduplicationStrategy3 = com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy.ALWAYS;
        VideoInteractionImpression = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("VideoInteractionImpression", 4, "video_interaction_impression", pixelDeduplicationStrategy3);
        VastVideoImpression = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("VastVideoImpression", 5, "vast_video_progress", pixelDeduplicationStrategy2);
        VastVideoInteraction = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("VastVideoInteraction", 6, "vast_video_interaction", pixelDeduplicationStrategy3);
        ThankYou = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("ThankYou", 7, "thank_you", pixelDeduplicationStrategy2);
        Event = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Event", 8, "event", pixelDeduplicationStrategy2);
        Win = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Win", 9, "win", pixelDeduplicationStrategy);
        Loss = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Loss", 10, "loss", pixelDeduplicationStrategy);
        Error = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType("Error", 11, "error", pixelDeduplicationStrategy);
        com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TasAdPixelType(java.lang.String str, int i, java.lang.String str2, com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy pixelDeduplicationStrategy) {
        this.value = str2;
        this.deduplicationStrategy = pixelDeduplicationStrategy;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType.class, str);
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[] values() {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdPixelType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public com.truecaller.ads.api.source.internal.tas.adtype.PixelDeduplicationStrategy getDeduplicationStrategy() {
        return this.deduplicationStrategy;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getValue() {
        return this.value;
    }
}
