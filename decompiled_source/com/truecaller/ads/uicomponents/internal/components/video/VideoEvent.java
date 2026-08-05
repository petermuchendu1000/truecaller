package com.truecaller.ads.uicomponents.internal.components.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/uicomponents/internal/components/video/VideoEvent;", "", "videoStat", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getVideoStat", "()Ljava/lang/String;", "START", "FIRST_QUARTILE", "MID_POINT", "THIRD_QUARTILE", "COMPLETE", "PAUSE", "RESUME", "MUTE", "UNMUTE", "REPLAY", "TAP_TO_REDIRECT", "TAP_TO_UNMUTE", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VideoEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[] $VALUES;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String videoStat;
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent START = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("START", 0, "video_start");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent FIRST_QUARTILE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("FIRST_QUARTILE", 1, "play_25");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent MID_POINT = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("MID_POINT", 2, "play_50");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent THIRD_QUARTILE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("THIRD_QUARTILE", 3, "play_75");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent COMPLETE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("COMPLETE", 4, "video_end");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent PAUSE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("PAUSE", 5, "video_pause");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent RESUME = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("RESUME", 6, "video_resume");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent MUTE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("MUTE", 7, "video_mute");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent UNMUTE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("UNMUTE", 8, "video_unmute");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent REPLAY = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("REPLAY", 9, "video_replay");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent TAP_TO_REDIRECT = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("TAP_TO_REDIRECT", 10, "ttr");
    public static final com.truecaller.ads.uicomponents.internal.components.video.VideoEvent TAP_TO_UNMUTE = new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent("TAP_TO_UNMUTE", 11, "ttum");

    private static final /* synthetic */ com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[] $values() {
        return new com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[]{START, FIRST_QUARTILE, MID_POINT, THIRD_QUARTILE, COMPLETE, PAUSE, RESUME, MUTE, UNMUTE, REPLAY, TAP_TO_REDIRECT, TAP_TO_UNMUTE};
    }

    static {
        com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VideoEvent(java.lang.String str, int i, java.lang.String str2) {
        this.videoStat = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.uicomponents.internal.components.video.VideoEvent valueOf(java.lang.String str) {
        return (com.truecaller.ads.uicomponents.internal.components.video.VideoEvent) java.lang.Enum.valueOf(com.truecaller.ads.uicomponents.internal.components.video.VideoEvent.class, str);
    }

    public static com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[] values() {
        return (com.truecaller.ads.uicomponents.internal.components.video.VideoEvent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVideoStat() {
        return this.videoStat;
    }
}
