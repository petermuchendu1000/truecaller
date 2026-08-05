package com.truecaller.premium;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/premium/PremiumLaunchCategory;", "", "<init>", "(Ljava/lang/String;I)V", "INTERSTITIAL", "STATIC_SCREEN", "BANNER", "CATALOG", "OTHER", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PremiumLaunchCategory {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.PremiumLaunchCategory[] $VALUES;
    public static final com.truecaller.premium.PremiumLaunchCategory INTERSTITIAL = new com.truecaller.premium.PremiumLaunchCategory("INTERSTITIAL", 0);
    public static final com.truecaller.premium.PremiumLaunchCategory STATIC_SCREEN = new com.truecaller.premium.PremiumLaunchCategory("STATIC_SCREEN", 1);
    public static final com.truecaller.premium.PremiumLaunchCategory BANNER = new com.truecaller.premium.PremiumLaunchCategory("BANNER", 2);
    public static final com.truecaller.premium.PremiumLaunchCategory CATALOG = new com.truecaller.premium.PremiumLaunchCategory("CATALOG", 3);
    public static final com.truecaller.premium.PremiumLaunchCategory OTHER = new com.truecaller.premium.PremiumLaunchCategory("OTHER", 4);
    public static final com.truecaller.premium.PremiumLaunchCategory UNKNOWN = new com.truecaller.premium.PremiumLaunchCategory("UNKNOWN", 5);

    private static final /* synthetic */ com.truecaller.premium.PremiumLaunchCategory[] $values() {
        return new com.truecaller.premium.PremiumLaunchCategory[]{INTERSTITIAL, STATIC_SCREEN, BANNER, CATALOG, OTHER, UNKNOWN};
    }

    static {
        com.truecaller.premium.PremiumLaunchCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PremiumLaunchCategory(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.PremiumLaunchCategory valueOf(java.lang.String str) {
        return (com.truecaller.premium.PremiumLaunchCategory) java.lang.Enum.valueOf(com.truecaller.premium.PremiumLaunchCategory.class, str);
    }

    public static com.truecaller.premium.PremiumLaunchCategory[] values() {
        return (com.truecaller.premium.PremiumLaunchCategory[]) $VALUES.clone();
    }
}
