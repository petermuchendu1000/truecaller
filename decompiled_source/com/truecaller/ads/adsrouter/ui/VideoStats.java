package com.truecaller.ads.adsrouter.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/VideoStats;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VIDEO_START", "PLAY_10", "PLAY_25", "PLAY_50", "PLAY_75", "VIDEO_END", "VIDEO_MUTE", "VIDEO_UNMUTE", "VIDEO_RESUME", "VIDEO_PAUSE", "TAP_TO_REDIRECT", "TAP_TO_UNMUTE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VideoStats {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.VideoStats[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_START = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_START", 0, "video_start");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats PLAY_10 = new com.truecaller.ads.adsrouter.ui.VideoStats("PLAY_10", 1, "play_10");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats PLAY_25 = new com.truecaller.ads.adsrouter.ui.VideoStats("PLAY_25", 2, "play_25");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats PLAY_50 = new com.truecaller.ads.adsrouter.ui.VideoStats("PLAY_50", 3, "play_50");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats PLAY_75 = new com.truecaller.ads.adsrouter.ui.VideoStats("PLAY_75", 4, "play_75");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_END = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_END", 5, "video_end");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_MUTE = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_MUTE", 6, "video_mute");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_UNMUTE = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_UNMUTE", 7, "video_unmute");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_RESUME = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_RESUME", 8, "video_resume");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats VIDEO_PAUSE = new com.truecaller.ads.adsrouter.ui.VideoStats("VIDEO_PAUSE", 9, "video_pause");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats TAP_TO_REDIRECT = new com.truecaller.ads.adsrouter.ui.VideoStats("TAP_TO_REDIRECT", 10, "ttr");
    public static final com.truecaller.ads.adsrouter.ui.VideoStats TAP_TO_UNMUTE = new com.truecaller.ads.adsrouter.ui.VideoStats("TAP_TO_UNMUTE", 11, "ttum");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.VideoStats[] $values() {
        return new com.truecaller.ads.adsrouter.ui.VideoStats[]{VIDEO_START, PLAY_10, PLAY_25, PLAY_50, PLAY_75, VIDEO_END, VIDEO_MUTE, VIDEO_UNMUTE, VIDEO_RESUME, VIDEO_PAUSE, TAP_TO_REDIRECT, TAP_TO_UNMUTE};
    }

    static {
        com.truecaller.ads.adsrouter.ui.VideoStats[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VideoStats(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.ui.VideoStats valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.ui.VideoStats) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.ui.VideoStats.class, str);
    }

    public static com.truecaller.ads.adsrouter.ui.VideoStats[] values() {
        return (com.truecaller.ads.adsrouter.ui.VideoStats[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
