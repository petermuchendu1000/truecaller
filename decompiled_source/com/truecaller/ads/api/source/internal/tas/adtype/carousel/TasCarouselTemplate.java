package com.truecaller.ads.api.source.internal.tas.adtype.carousel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ads/api/source/internal/tas/adtype/carousel/TasCarouselTemplate;", "", "<init>", "(Ljava/lang/String;I)V", "Exposed", "Grid", "Tile", "ExposedPromo", "toPositionDisplayInfo", "", "position", "", "toEventDisplayInfo", "toEventName", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TasCarouselTemplate {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[] $VALUES;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate Exposed = new com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate("Exposed", 0);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate Grid = new com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate("Grid", 1);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate Tile = new com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate("Tile", 2);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate ExposedPromo = new com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate("ExposedPromo", 3);

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[] $values() {
        return new com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[]{Exposed, Grid, Tile, ExposedPromo};
    }

    static {
        com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TasCarouselTemplate(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate.class, str);
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[] values() {
        return (com.truecaller.ads.api.source.internal.tas.adtype.carousel.TasCarouselTemplate[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String toEventDisplayInfo(int position) {
        int i = position + 1;
        int i2 = v30.a.a[ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return bar.k(i, "TILE_");
                }
                throw new java.lang.RuntimeException();
            }
            return null;
        }
        return bar.k(i, "CARD_");
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toEventName(int position) {
        int i = position + 1;
        if (v30.a.a[ordinal()] == 1) {
            return bar.k(i, "CARD_");
        }
        return "";
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toPositionDisplayInfo(int position) {
        int i = position + 1;
        int i2 = v30.a.a[ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return bar.k(i, "TILE_");
                }
                throw new java.lang.RuntimeException();
            }
            return bar.k(i, "GRID_");
        }
        return bar.k(i, "CARD_");
    }
}
