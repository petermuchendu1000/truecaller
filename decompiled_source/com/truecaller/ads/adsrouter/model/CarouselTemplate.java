package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/CarouselTemplate;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EXPOSED", "GRID", "TILE", "EXPOSED_PROMO", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CarouselTemplate {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.CarouselTemplate[] $VALUES;

    @bw.qux("Exposed")
    public static final com.truecaller.ads.adsrouter.model.CarouselTemplate EXPOSED = new com.truecaller.ads.adsrouter.model.CarouselTemplate("EXPOSED", 0, "Exposed");

    @bw.qux("Grid")
    public static final com.truecaller.ads.adsrouter.model.CarouselTemplate GRID = new com.truecaller.ads.adsrouter.model.CarouselTemplate("GRID", 1, "Grid");

    @bw.qux("Tile")
    public static final com.truecaller.ads.adsrouter.model.CarouselTemplate TILE = new com.truecaller.ads.adsrouter.model.CarouselTemplate("TILE", 2, "Tile");

    @bw.qux("ExposedPromo")
    public static final com.truecaller.ads.adsrouter.model.CarouselTemplate EXPOSED_PROMO = new com.truecaller.ads.adsrouter.model.CarouselTemplate("EXPOSED_PROMO", 3, "ExposedPromo");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.CarouselTemplate[] $values() {
        return new com.truecaller.ads.adsrouter.model.CarouselTemplate[]{EXPOSED, GRID, TILE, EXPOSED_PROMO};
    }

    static {
        com.truecaller.ads.adsrouter.model.CarouselTemplate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CarouselTemplate(java.lang.String str, int i, java.lang.String str2) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.CarouselTemplate valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.CarouselTemplate) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.CarouselTemplate.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.CarouselTemplate[] values() {
        return (com.truecaller.ads.adsrouter.model.CarouselTemplate[]) $VALUES.clone();
    }
}
