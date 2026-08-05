package com.truecaller.premium.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/analytics/NonPurchaseButtonVariantType;", "", "<init>", "(Ljava/lang/String;I)V", "INTERSTITIAL", "SPOTLIGHT", "BANNER", "BOTTOM_SHEET", "CATALOG", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class NonPurchaseButtonVariantType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.analytics.NonPurchaseButtonVariantType[] $VALUES;
    public static final com.truecaller.premium.analytics.NonPurchaseButtonVariantType INTERSTITIAL = new com.truecaller.premium.analytics.NonPurchaseButtonVariantType("INTERSTITIAL", 0);
    public static final com.truecaller.premium.analytics.NonPurchaseButtonVariantType SPOTLIGHT = new com.truecaller.premium.analytics.NonPurchaseButtonVariantType("SPOTLIGHT", 1);
    public static final com.truecaller.premium.analytics.NonPurchaseButtonVariantType BANNER = new com.truecaller.premium.analytics.NonPurchaseButtonVariantType("BANNER", 2);
    public static final com.truecaller.premium.analytics.NonPurchaseButtonVariantType BOTTOM_SHEET = new com.truecaller.premium.analytics.NonPurchaseButtonVariantType("BOTTOM_SHEET", 3);
    public static final com.truecaller.premium.analytics.NonPurchaseButtonVariantType CATALOG = new com.truecaller.premium.analytics.NonPurchaseButtonVariantType("CATALOG", 4);

    private static final /* synthetic */ com.truecaller.premium.analytics.NonPurchaseButtonVariantType[] $values() {
        return new com.truecaller.premium.analytics.NonPurchaseButtonVariantType[]{INTERSTITIAL, SPOTLIGHT, BANNER, BOTTOM_SHEET, CATALOG};
    }

    static {
        com.truecaller.premium.analytics.NonPurchaseButtonVariantType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NonPurchaseButtonVariantType(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.analytics.NonPurchaseButtonVariantType valueOf(java.lang.String str) {
        return (com.truecaller.premium.analytics.NonPurchaseButtonVariantType) java.lang.Enum.valueOf(com.truecaller.premium.analytics.NonPurchaseButtonVariantType.class, str);
    }

    public static com.truecaller.premium.analytics.NonPurchaseButtonVariantType[] values() {
        return (com.truecaller.premium.analytics.NonPurchaseButtonVariantType[]) $VALUES.clone();
    }
}
