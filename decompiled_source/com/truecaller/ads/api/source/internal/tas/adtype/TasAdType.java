package com.truecaller.ads.api.source.internal.tas.adtype;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/source/internal/tas/adtype/TasAdType;", "Lc30/f;", "", "<init>", "(Ljava/lang/String;I)V", "Native", "NativeImage", "NativeVideo", "Video", "Banner", "Lottie", "Carousel", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TasAdType implements c30.f {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[] $VALUES;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType Native = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("Native", 0);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType NativeImage = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("NativeImage", 1);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType NativeVideo = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("NativeVideo", 2);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType Video = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("Video", 3);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType Banner = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("Banner", 4);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType Lottie = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("Lottie", 5);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdType Carousel = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType("Carousel", 6);

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[] $values() {
        return new com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[]{Native, NativeImage, NativeVideo, Video, Banner, Lottie, Carousel};
    }

    static {
        com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TasAdType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdType) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.tas.adtype.TasAdType.class, str);
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[] values() {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdType[]) $VALUES.clone();
    }
}
