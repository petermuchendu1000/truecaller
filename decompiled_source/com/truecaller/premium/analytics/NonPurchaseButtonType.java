package com.truecaller.premium.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/premium/analytics/NonPurchaseButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "ENGAGEMENT", "GIVEAWAY", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class NonPurchaseButtonType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.analytics.NonPurchaseButtonType[] $VALUES;
    public static final com.truecaller.premium.analytics.NonPurchaseButtonType ENGAGEMENT = new com.truecaller.premium.analytics.NonPurchaseButtonType("ENGAGEMENT", 0);
    public static final com.truecaller.premium.analytics.NonPurchaseButtonType GIVEAWAY = new com.truecaller.premium.analytics.NonPurchaseButtonType("GIVEAWAY", 1);

    private static final /* synthetic */ com.truecaller.premium.analytics.NonPurchaseButtonType[] $values() {
        return new com.truecaller.premium.analytics.NonPurchaseButtonType[]{ENGAGEMENT, GIVEAWAY};
    }

    static {
        com.truecaller.premium.analytics.NonPurchaseButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NonPurchaseButtonType(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.analytics.NonPurchaseButtonType valueOf(java.lang.String str) {
        return (com.truecaller.premium.analytics.NonPurchaseButtonType) java.lang.Enum.valueOf(com.truecaller.premium.analytics.NonPurchaseButtonType.class, str);
    }

    public static com.truecaller.premium.analytics.NonPurchaseButtonType[] values() {
        return (com.truecaller.premium.analytics.NonPurchaseButtonType[]) $VALUES.clone();
    }
}
