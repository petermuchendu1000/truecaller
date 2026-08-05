package com.truecaller.premium.spotlight;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/spotlight/SpotlightDefaultBackground;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "BrandBlue", "GoldGradient", "GoldWithConfetti", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SpotlightDefaultBackground {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.spotlight.SpotlightDefaultBackground[] $VALUES;
    public static final com.truecaller.premium.spotlight.SpotlightDefaultBackground Primary = new com.truecaller.premium.spotlight.SpotlightDefaultBackground("Primary", 0);
    public static final com.truecaller.premium.spotlight.SpotlightDefaultBackground Secondary = new com.truecaller.premium.spotlight.SpotlightDefaultBackground("Secondary", 1);
    public static final com.truecaller.premium.spotlight.SpotlightDefaultBackground BrandBlue = new com.truecaller.premium.spotlight.SpotlightDefaultBackground("BrandBlue", 2);
    public static final com.truecaller.premium.spotlight.SpotlightDefaultBackground GoldGradient = new com.truecaller.premium.spotlight.SpotlightDefaultBackground("GoldGradient", 3);
    public static final com.truecaller.premium.spotlight.SpotlightDefaultBackground GoldWithConfetti = new com.truecaller.premium.spotlight.SpotlightDefaultBackground("GoldWithConfetti", 4);

    private static final /* synthetic */ com.truecaller.premium.spotlight.SpotlightDefaultBackground[] $values() {
        return new com.truecaller.premium.spotlight.SpotlightDefaultBackground[]{Primary, Secondary, BrandBlue, GoldGradient, GoldWithConfetti};
    }

    static {
        com.truecaller.premium.spotlight.SpotlightDefaultBackground[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SpotlightDefaultBackground(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.spotlight.SpotlightDefaultBackground valueOf(java.lang.String str) {
        return (com.truecaller.premium.spotlight.SpotlightDefaultBackground) java.lang.Enum.valueOf(com.truecaller.premium.spotlight.SpotlightDefaultBackground.class, str);
    }

    public static com.truecaller.premium.spotlight.SpotlightDefaultBackground[] values() {
        return (com.truecaller.premium.spotlight.SpotlightDefaultBackground[]) $VALUES.clone();
    }
}
