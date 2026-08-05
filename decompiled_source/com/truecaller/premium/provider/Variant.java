package com.truecaller.premium.provider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/premium/provider/Variant;", "", "<init>", "(Ljava/lang/String;I)V", "PRICING", "SHOP_ID", "STATIC_SCREEN", "INTERSTITIAL", "SPOTLIGHT", "BANNER", "BOTTOM_SHEET", "CATALOG", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Variant {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.provider.Variant[] $VALUES;
    public static final com.truecaller.premium.provider.Variant PRICING = new com.truecaller.premium.provider.Variant("PRICING", 0);
    public static final com.truecaller.premium.provider.Variant SHOP_ID = new com.truecaller.premium.provider.Variant("SHOP_ID", 1);
    public static final com.truecaller.premium.provider.Variant STATIC_SCREEN = new com.truecaller.premium.provider.Variant("STATIC_SCREEN", 2);
    public static final com.truecaller.premium.provider.Variant INTERSTITIAL = new com.truecaller.premium.provider.Variant("INTERSTITIAL", 3);
    public static final com.truecaller.premium.provider.Variant SPOTLIGHT = new com.truecaller.premium.provider.Variant("SPOTLIGHT", 4);
    public static final com.truecaller.premium.provider.Variant BANNER = new com.truecaller.premium.provider.Variant("BANNER", 5);
    public static final com.truecaller.premium.provider.Variant BOTTOM_SHEET = new com.truecaller.premium.provider.Variant("BOTTOM_SHEET", 6);
    public static final com.truecaller.premium.provider.Variant CATALOG = new com.truecaller.premium.provider.Variant("CATALOG", 7);

    private static final /* synthetic */ com.truecaller.premium.provider.Variant[] $values() {
        return new com.truecaller.premium.provider.Variant[]{PRICING, SHOP_ID, STATIC_SCREEN, INTERSTITIAL, SPOTLIGHT, BANNER, BOTTOM_SHEET, CATALOG};
    }

    static {
        com.truecaller.premium.provider.Variant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Variant(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.provider.Variant valueOf(java.lang.String str) {
        return (com.truecaller.premium.provider.Variant) java.lang.Enum.valueOf(com.truecaller.premium.provider.Variant.class, str);
    }

    public static com.truecaller.premium.provider.Variant[] values() {
        return (com.truecaller.premium.provider.Variant[]) $VALUES.clone();
    }
}
