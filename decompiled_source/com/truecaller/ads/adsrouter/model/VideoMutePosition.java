package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/VideoMutePosition;", "", "<init>", "(Ljava/lang/String;I)V", "TopRight", "BottomRight", "UNRECOGNIZED", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VideoMutePosition {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.VideoMutePosition[] $VALUES;

    @bw.qux("TopRight")
    public static final com.truecaller.ads.adsrouter.model.VideoMutePosition TopRight = new com.truecaller.ads.adsrouter.model.VideoMutePosition("TopRight", 0);

    @bw.qux("BottomRight")
    public static final com.truecaller.ads.adsrouter.model.VideoMutePosition BottomRight = new com.truecaller.ads.adsrouter.model.VideoMutePosition("BottomRight", 1);

    @bw.qux("UNRECOGNIZED")
    public static final com.truecaller.ads.adsrouter.model.VideoMutePosition UNRECOGNIZED = new com.truecaller.ads.adsrouter.model.VideoMutePosition("UNRECOGNIZED", 2);

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.VideoMutePosition[] $values() {
        return new com.truecaller.ads.adsrouter.model.VideoMutePosition[]{TopRight, BottomRight, UNRECOGNIZED};
    }

    static {
        com.truecaller.ads.adsrouter.model.VideoMutePosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VideoMutePosition(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.VideoMutePosition valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.VideoMutePosition) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.VideoMutePosition.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.VideoMutePosition[] values() {
        return (com.truecaller.ads.adsrouter.model.VideoMutePosition[]) $VALUES.clone();
    }
}
