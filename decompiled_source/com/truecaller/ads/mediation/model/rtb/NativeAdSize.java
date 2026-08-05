package com.truecaller.ads.mediation.model.rtb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/NativeAdSize;", "", "width", "", "height", "supportsVideo", "", "supportsMainImage", "<init>", "(Ljava/lang/String;IIIZZ)V", "getWidth", "()I", "getHeight", "getSupportsVideo", "()Z", "getSupportsMainImage", "SMALL", "MEDIUM", "LARGE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NativeAdSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.mediation.model.rtb.NativeAdSize[] $VALUES;
    private final int height;
    private final boolean supportsMainImage;
    private final boolean supportsVideo;
    private final int width;
    public static final com.truecaller.ads.mediation.model.rtb.NativeAdSize SMALL = new com.truecaller.ads.mediation.model.rtb.NativeAdSize("SMALL", 0, 320, 50, false, false);
    public static final com.truecaller.ads.mediation.model.rtb.NativeAdSize MEDIUM = new com.truecaller.ads.mediation.model.rtb.NativeAdSize("MEDIUM", 1, 320, 140, true, true);
    public static final com.truecaller.ads.mediation.model.rtb.NativeAdSize LARGE = new com.truecaller.ads.mediation.model.rtb.NativeAdSize("LARGE", 2, 320, 250, true, true);

    private static final /* synthetic */ com.truecaller.ads.mediation.model.rtb.NativeAdSize[] $values() {
        return new com.truecaller.ads.mediation.model.rtb.NativeAdSize[]{SMALL, MEDIUM, LARGE};
    }

    static {
        com.truecaller.ads.mediation.model.rtb.NativeAdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NativeAdSize(java.lang.String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.width = i2;
        this.height = i3;
        this.supportsVideo = z;
        this.supportsMainImage = z2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.mediation.model.rtb.NativeAdSize valueOf(java.lang.String str) {
        return (com.truecaller.ads.mediation.model.rtb.NativeAdSize) java.lang.Enum.valueOf(com.truecaller.ads.mediation.model.rtb.NativeAdSize.class, str);
    }

    public static com.truecaller.ads.mediation.model.rtb.NativeAdSize[] values() {
        return (com.truecaller.ads.mediation.model.rtb.NativeAdSize[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getSupportsMainImage() {
        return this.supportsMainImage;
    }

    public final boolean getSupportsVideo() {
        return this.supportsVideo;
    }

    public final int getWidth() {
        return this.width;
    }
}
