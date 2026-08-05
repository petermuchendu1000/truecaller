package com.truecaller.premium.ui.interstitial;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/premium/ui/interstitial/InterstitialType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION", "VIDEO", "IMAGE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InterstitialType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.interstitial.InterstitialType[] $VALUES;
    public static final com.truecaller.premium.ui.interstitial.InterstitialType ANIMATION = new com.truecaller.premium.ui.interstitial.InterstitialType("ANIMATION", 0);
    public static final com.truecaller.premium.ui.interstitial.InterstitialType VIDEO = new com.truecaller.premium.ui.interstitial.InterstitialType("VIDEO", 1);
    public static final com.truecaller.premium.ui.interstitial.InterstitialType IMAGE = new com.truecaller.premium.ui.interstitial.InterstitialType("IMAGE", 2);

    private static final /* synthetic */ com.truecaller.premium.ui.interstitial.InterstitialType[] $values() {
        return new com.truecaller.premium.ui.interstitial.InterstitialType[]{ANIMATION, VIDEO, IMAGE};
    }

    static {
        com.truecaller.premium.ui.interstitial.InterstitialType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InterstitialType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.interstitial.InterstitialType valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.interstitial.InterstitialType) java.lang.Enum.valueOf(com.truecaller.premium.ui.interstitial.InterstitialType.class, str);
    }

    public static com.truecaller.premium.ui.interstitial.InterstitialType[] values() {
        return (com.truecaller.premium.ui.interstitial.InterstitialType[]) $VALUES.clone();
    }
}
