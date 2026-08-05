package com.truecaller.ads.vast;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/vast/VastTrackingEvents;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CREATIVE_VIEW", "MID_POINT", "START", "FIRST_QUARTILE", "UN_MUTE", "MUTE", "RESUME", "PAUSE", "THIRD_QUARTILE", "COMPLETE", "PROGRESS", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VastTrackingEvents {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.vast.VastTrackingEvents[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.vast.VastTrackingEvents CREATIVE_VIEW = new com.truecaller.ads.vast.VastTrackingEvents("CREATIVE_VIEW", 0, "creativeView");
    public static final com.truecaller.ads.vast.VastTrackingEvents MID_POINT = new com.truecaller.ads.vast.VastTrackingEvents("MID_POINT", 1, "midpoint");
    public static final com.truecaller.ads.vast.VastTrackingEvents START = new com.truecaller.ads.vast.VastTrackingEvents("START", 2, "start");
    public static final com.truecaller.ads.vast.VastTrackingEvents FIRST_QUARTILE = new com.truecaller.ads.vast.VastTrackingEvents("FIRST_QUARTILE", 3, "firstQuartile");
    public static final com.truecaller.ads.vast.VastTrackingEvents UN_MUTE = new com.truecaller.ads.vast.VastTrackingEvents("UN_MUTE", 4, "unmute");
    public static final com.truecaller.ads.vast.VastTrackingEvents MUTE = new com.truecaller.ads.vast.VastTrackingEvents("MUTE", 5, "mute");
    public static final com.truecaller.ads.vast.VastTrackingEvents RESUME = new com.truecaller.ads.vast.VastTrackingEvents("RESUME", 6, "resume");
    public static final com.truecaller.ads.vast.VastTrackingEvents PAUSE = new com.truecaller.ads.vast.VastTrackingEvents("PAUSE", 7, "pause");
    public static final com.truecaller.ads.vast.VastTrackingEvents THIRD_QUARTILE = new com.truecaller.ads.vast.VastTrackingEvents("THIRD_QUARTILE", 8, "thirdQuartile");
    public static final com.truecaller.ads.vast.VastTrackingEvents COMPLETE = new com.truecaller.ads.vast.VastTrackingEvents("COMPLETE", 9, "complete");
    public static final com.truecaller.ads.vast.VastTrackingEvents PROGRESS = new com.truecaller.ads.vast.VastTrackingEvents("PROGRESS", 10, "progress");

    private static final /* synthetic */ com.truecaller.ads.vast.VastTrackingEvents[] $values() {
        return new com.truecaller.ads.vast.VastTrackingEvents[]{CREATIVE_VIEW, MID_POINT, START, FIRST_QUARTILE, UN_MUTE, MUTE, RESUME, PAUSE, THIRD_QUARTILE, COMPLETE, PROGRESS};
    }

    static {
        com.truecaller.ads.vast.VastTrackingEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VastTrackingEvents(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.vast.VastTrackingEvents valueOf(java.lang.String str) {
        return (com.truecaller.ads.vast.VastTrackingEvents) java.lang.Enum.valueOf(com.truecaller.ads.vast.VastTrackingEvents.class, str);
    }

    public static com.truecaller.ads.vast.VastTrackingEvents[] values() {
        return (com.truecaller.ads.vast.VastTrackingEvents[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
