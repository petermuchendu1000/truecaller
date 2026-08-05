package com.truecaller.ads.api.source.internal.tas.adtype.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/api/source/internal/tas/adtype/video/TasVastVideoEvent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "START", "FIRST_QUARTILE", "MID_POINT", "THIRD_QUARTILE", "PAUSE", "RESUME", "MUTE", "UNMUTE", "COMPLETE", "CREATIVE_VIEW", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TasVastVideoEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent START = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("START", 0, "video_start");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent FIRST_QUARTILE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("FIRST_QUARTILE", 1, "video_25");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent MID_POINT = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("MID_POINT", 2, "video_50");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent THIRD_QUARTILE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("THIRD_QUARTILE", 3, "video_75");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent PAUSE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("PAUSE", 4, "video_pause");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent RESUME = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("RESUME", 5, "video_resume");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent MUTE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("MUTE", 6, "video_mute");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent UNMUTE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("UNMUTE", 7, "video_unmute");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent COMPLETE = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("COMPLETE", 8, "complete");
    public static final com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent CREATIVE_VIEW = new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent("CREATIVE_VIEW", 9, "creative_view");

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[] $values() {
        return new com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[]{START, FIRST_QUARTILE, MID_POINT, THIRD_QUARTILE, PAUSE, RESUME, MUTE, UNMUTE, COMPLETE, CREATIVE_VIEW};
    }

    static {
        com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TasVastVideoEvent(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent.class, str);
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[] values() {
        return (com.truecaller.ads.api.source.internal.tas.adtype.video.TasVastVideoEvent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
