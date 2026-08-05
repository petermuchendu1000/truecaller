package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/AdRenderStyle;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "TRANSPARENT", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRenderStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.AdRenderStyle[] $VALUES;

    @bw.qux("STANDARD")
    public static final com.truecaller.ads.adsrouter.model.AdRenderStyle STANDARD = new com.truecaller.ads.adsrouter.model.AdRenderStyle("STANDARD", 0);

    @bw.qux("TRANSPARENT")
    public static final com.truecaller.ads.adsrouter.model.AdRenderStyle TRANSPARENT = new com.truecaller.ads.adsrouter.model.AdRenderStyle("TRANSPARENT", 1);

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.AdRenderStyle[] $values() {
        return new com.truecaller.ads.adsrouter.model.AdRenderStyle[]{STANDARD, TRANSPARENT};
    }

    static {
        com.truecaller.ads.adsrouter.model.AdRenderStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdRenderStyle(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.AdRenderStyle valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.AdRenderStyle) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.AdRenderStyle.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.AdRenderStyle[] values() {
        return (com.truecaller.ads.adsrouter.model.AdRenderStyle[]) $VALUES.clone();
    }
}
