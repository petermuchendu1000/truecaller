package com.truecaller.ads.adsrouter.pixel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/ads/adsrouter/pixel/AdsPixel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICK", "IMPRESSION", "VIEW", "VIDEO", "THANK_YOU", "EVENT_PIXEL", "WIN_PIXEL", "LOSS_PIXEL", "PAGE_VIEW", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsPixel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.pixel.AdsPixel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel CLICK = new com.truecaller.ads.adsrouter.pixel.AdsPixel("CLICK", 0, "click");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel IMPRESSION = new com.truecaller.ads.adsrouter.pixel.AdsPixel("IMPRESSION", 1, "imp");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel VIEW = new com.truecaller.ads.adsrouter.pixel.AdsPixel("VIEW", 2, "view_imp");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel VIDEO = new com.truecaller.ads.adsrouter.pixel.AdsPixel("VIDEO", 3, "video_imp");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel THANK_YOU = new com.truecaller.ads.adsrouter.pixel.AdsPixel("THANK_YOU", 4, "thankyou");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel EVENT_PIXEL = new com.truecaller.ads.adsrouter.pixel.AdsPixel("EVENT_PIXEL", 5, "event");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel WIN_PIXEL = new com.truecaller.ads.adsrouter.pixel.AdsPixel("WIN_PIXEL", 6, "win");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel LOSS_PIXEL = new com.truecaller.ads.adsrouter.pixel.AdsPixel("LOSS_PIXEL", 7, "loss");
    public static final com.truecaller.ads.adsrouter.pixel.AdsPixel PAGE_VIEW = new com.truecaller.ads.adsrouter.pixel.AdsPixel("PAGE_VIEW", 8, "page_view");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.pixel.AdsPixel[] $values() {
        return new com.truecaller.ads.adsrouter.pixel.AdsPixel[]{CLICK, IMPRESSION, VIEW, VIDEO, THANK_YOU, EVENT_PIXEL, WIN_PIXEL, LOSS_PIXEL, PAGE_VIEW};
    }

    static {
        com.truecaller.ads.adsrouter.pixel.AdsPixel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdsPixel(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.pixel.AdsPixel valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.pixel.AdsPixel) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.pixel.AdsPixel.class, str);
    }

    public static com.truecaller.ads.adsrouter.pixel.AdsPixel[] values() {
        return (com.truecaller.ads.adsrouter.pixel.AdsPixel[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
