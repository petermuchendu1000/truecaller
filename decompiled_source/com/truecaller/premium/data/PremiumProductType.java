package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/premium/data/PremiumProductType;", "", "", "productType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getProductType", "()Ljava/lang/String;", "Companion", "w82/d1", "IN_APP", "SUBSCRIPTION", "PREPAID", "premium-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumProductType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.PremiumProductType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.d1 Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String productType;
    public static final com.truecaller.premium.data.PremiumProductType IN_APP = new com.truecaller.premium.data.PremiumProductType("IN_APP", 0, "consumable");
    public static final com.truecaller.premium.data.PremiumProductType SUBSCRIPTION = new com.truecaller.premium.data.PremiumProductType("SUBSCRIPTION", 1, "subscription");
    public static final com.truecaller.premium.data.PremiumProductType PREPAID = new com.truecaller.premium.data.PremiumProductType("PREPAID", 2, "prepaid");

    private static final /* synthetic */ com.truecaller.premium.data.PremiumProductType[] $values() {
        return new com.truecaller.premium.data.PremiumProductType[]{IN_APP, SUBSCRIPTION, PREPAID};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [w82.d1, java.lang.Object] */
    static {
        com.truecaller.premium.data.PremiumProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PremiumProductType(java.lang.String str, int i, java.lang.String str2) {
        this.productType = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.PremiumProductType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.d1.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.PremiumProductType valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.PremiumProductType) java.lang.Enum.valueOf(com.truecaller.premium.data.PremiumProductType.class, str);
    }

    public static com.truecaller.premium.data.PremiumProductType[] values() {
        return (com.truecaller.premium.data.PremiumProductType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductType() {
        return this.productType;
    }
}
