package com.truecaller.videocallerid.ui.videoplayer.playing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/videocallerid/ui/videoplayer/playing/PlayingBehaviour$Fallback$Partly", "", "Lcom/truecaller/videocallerid/ui/videoplayer/playing/PlayingBehaviour$Fallback$Partly;", "<init>", "(Ljava/lang/String;I)V", "WAIT_FOR_BUFFER", "LOOP_PARTLY", "FIRST_FRAME", "FIRST_FRAME_WITH_LOADER", "DO_NOT_PLAY", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PlayingBehaviour$Fallback$Partly {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[] $VALUES;
    public static final com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly WAIT_FOR_BUFFER = new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly("WAIT_FOR_BUFFER", 0);
    public static final com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly LOOP_PARTLY = new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly("LOOP_PARTLY", 1);
    public static final com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly FIRST_FRAME = new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly("FIRST_FRAME", 2);
    public static final com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly FIRST_FRAME_WITH_LOADER = new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly("FIRST_FRAME_WITH_LOADER", 3);
    public static final com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly DO_NOT_PLAY = new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly("DO_NOT_PLAY", 4);

    private static final /* synthetic */ com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[] $values() {
        return new com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[]{WAIT_FOR_BUFFER, LOOP_PARTLY, FIRST_FRAME, FIRST_FRAME_WITH_LOADER, DO_NOT_PLAY};
    }

    static {
        com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PlayingBehaviour$Fallback$Partly(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly valueOf(java.lang.String str) {
        return (com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly) java.lang.Enum.valueOf(com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly.class, str);
    }

    public static com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[] values() {
        return (com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly[]) $VALUES.clone();
    }
}
