package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/CountDownPosition;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TOP_RIGHT", "TOP_LEFT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "UNKNOWN", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CountDownPosition {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.CountDownPosition[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    @bw.qux("TopRight")
    public static final com.truecaller.ads.adsrouter.model.CountDownPosition TOP_RIGHT = new com.truecaller.ads.adsrouter.model.CountDownPosition("TOP_RIGHT", 0, "TopRight");

    @bw.qux("TopLeft")
    public static final com.truecaller.ads.adsrouter.model.CountDownPosition TOP_LEFT = new com.truecaller.ads.adsrouter.model.CountDownPosition("TOP_LEFT", 1, "TopLeft");

    @bw.qux("BottomRight")
    public static final com.truecaller.ads.adsrouter.model.CountDownPosition BOTTOM_RIGHT = new com.truecaller.ads.adsrouter.model.CountDownPosition("BOTTOM_RIGHT", 2, "BottomRight");

    @bw.qux("BottomLeft")
    public static final com.truecaller.ads.adsrouter.model.CountDownPosition BOTTOM_LEFT = new com.truecaller.ads.adsrouter.model.CountDownPosition("BOTTOM_LEFT", 3, "BottomLeft");

    @bw.qux("UNRECOGNIZED")
    public static final com.truecaller.ads.adsrouter.model.CountDownPosition UNKNOWN = new com.truecaller.ads.adsrouter.model.CountDownPosition("UNKNOWN", 4, "UNRECOGNIZED");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.CountDownPosition[] $values() {
        return new com.truecaller.ads.adsrouter.model.CountDownPosition[]{TOP_RIGHT, TOP_LEFT, BOTTOM_RIGHT, BOTTOM_LEFT, UNKNOWN};
    }

    static {
        com.truecaller.ads.adsrouter.model.CountDownPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CountDownPosition(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.CountDownPosition valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.CountDownPosition) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.CountDownPosition.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.CountDownPosition[] values() {
        return (com.truecaller.ads.adsrouter.model.CountDownPosition[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
