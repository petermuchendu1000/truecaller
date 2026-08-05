package com.truecaller.premium;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/PurchaseButtonContext;", "", "<init>", "(Ljava/lang/String;I)V", "TIER_BOTTOM_SHEET", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PurchaseButtonContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.PurchaseButtonContext[] $VALUES;
    public static final com.truecaller.premium.PurchaseButtonContext TIER_BOTTOM_SHEET = new com.truecaller.premium.PurchaseButtonContext("TIER_BOTTOM_SHEET", 0);

    private static final /* synthetic */ com.truecaller.premium.PurchaseButtonContext[] $values() {
        return new com.truecaller.premium.PurchaseButtonContext[]{TIER_BOTTOM_SHEET};
    }

    static {
        com.truecaller.premium.PurchaseButtonContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PurchaseButtonContext(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.PurchaseButtonContext valueOf(java.lang.String str) {
        return (com.truecaller.premium.PurchaseButtonContext) java.lang.Enum.valueOf(com.truecaller.premium.PurchaseButtonContext.class, str);
    }

    public static com.truecaller.premium.PurchaseButtonContext[] values() {
        return (com.truecaller.premium.PurchaseButtonContext[]) $VALUES.clone();
    }
}
