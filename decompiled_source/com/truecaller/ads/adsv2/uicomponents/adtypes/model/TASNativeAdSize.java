package com.truecaller.ads.adsv2.uicomponents.adtypes.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/ads/adsv2/uicomponents/adtypes/model/TASNativeAdSize;", "", "width", "", "height", "<init>", "(Ljava/lang/String;III)V", "getWidth", "()I", "getHeight", "SMALL", "MEDIUM", "LARGE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TASNativeAdSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[] $VALUES;
    private final int height;
    private final int width;
    public static final com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize SMALL = new com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize("SMALL", 0, 320, 72);
    public static final com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize MEDIUM = new com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize("MEDIUM", 1, 320, 140);
    public static final com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize LARGE = new com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize("LARGE", 2, 320, 250);

    private static final /* synthetic */ com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[] $values() {
        return new com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[]{SMALL, MEDIUM, LARGE};
    }

    static {
        com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TASNativeAdSize(java.lang.String str, int i, int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize) java.lang.Enum.valueOf(com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize.class, str);
    }

    public static com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[] values() {
        return (com.truecaller.ads.adsv2.uicomponents.adtypes.model.TASNativeAdSize[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
