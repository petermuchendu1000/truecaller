package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/MiddleCreativePosition;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TOP_RIGHT", "TOP_LEFT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "BOTTOM_MIDDLE", "TOP_MIDDLE", "START", "END", "CENTER", "MIDDLE_LEFT", "MIDDLE_RIGHT", "UNKNOWN", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MiddleCreativePosition {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.MiddleCreativePosition[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    @bw.qux("TopRight")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition TOP_RIGHT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("TOP_RIGHT", 0, "TopRight");

    @bw.qux("TopLeft")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition TOP_LEFT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("TOP_LEFT", 1, "TopLeft");

    @bw.qux("BottomRight")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition BOTTOM_RIGHT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("BOTTOM_RIGHT", 2, "BottomRight");

    @bw.qux("BottomLeft")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition BOTTOM_LEFT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("BOTTOM_LEFT", 3, "BottomLeft");

    @bw.qux("BottomMiddle")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition BOTTOM_MIDDLE = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("BOTTOM_MIDDLE", 4, "BottomMiddle");

    @bw.qux("TopMiddle")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition TOP_MIDDLE = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("TOP_MIDDLE", 5, "TopMiddle");

    @bw.qux("Start")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition START = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("START", 6, "Start");

    @bw.qux("End")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition END = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("END", 7, "End");

    @bw.qux("Center")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition CENTER = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("CENTER", 8, "Center");

    @bw.qux("MiddleLeft")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition MIDDLE_LEFT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("MIDDLE_LEFT", 9, "MiddleLeft");

    @bw.qux("MiddleRight")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition MIDDLE_RIGHT = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("MIDDLE_RIGHT", 10, "MiddleLeft");

    @bw.qux("UNRECOGNIZED")
    public static final com.truecaller.ads.adsrouter.model.MiddleCreativePosition UNKNOWN = new com.truecaller.ads.adsrouter.model.MiddleCreativePosition("UNKNOWN", 11, "UNRECOGNIZED");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.MiddleCreativePosition[] $values() {
        return new com.truecaller.ads.adsrouter.model.MiddleCreativePosition[]{TOP_RIGHT, TOP_LEFT, BOTTOM_RIGHT, BOTTOM_LEFT, BOTTOM_MIDDLE, TOP_MIDDLE, START, END, CENTER, MIDDLE_LEFT, MIDDLE_RIGHT, UNKNOWN};
    }

    static {
        com.truecaller.ads.adsrouter.model.MiddleCreativePosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MiddleCreativePosition(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.MiddleCreativePosition valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.MiddleCreativePosition) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.MiddleCreativePosition.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.MiddleCreativePosition[] values() {
        return (com.truecaller.ads.adsrouter.model.MiddleCreativePosition[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
