package com.truecaller.premium.promotion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/premium/promotion/PremiumHomeTabPromo$Type", "", "Lcom/truecaller/premium/promotion/PremiumHomeTabPromo$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "bd2/baz", "GENERIC", "CAMPAIGN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumHomeTabPromo$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final bd2.baz Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.premium.promotion.PremiumHomeTabPromo$Type GENERIC = new com.truecaller.premium.promotion.PremiumHomeTabPromo$Type("GENERIC", 0, "GenericPremiumPromo");
    public static final com.truecaller.premium.promotion.PremiumHomeTabPromo$Type CAMPAIGN = new com.truecaller.premium.promotion.PremiumHomeTabPromo$Type("CAMPAIGN", 1, "SeasonalOfferPromo");

    private static final /* synthetic */ com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[] $values() {
        return new com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[]{GENERIC, CAMPAIGN};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bd2.baz, java.lang.Object] */
    static {
        com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PremiumHomeTabPromo$Type(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.promotion.PremiumHomeTabPromo$Type valueOf(java.lang.String str) {
        return (com.truecaller.premium.promotion.PremiumHomeTabPromo$Type) java.lang.Enum.valueOf(com.truecaller.premium.promotion.PremiumHomeTabPromo$Type.class, str);
    }

    public static com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[] values() {
        return (com.truecaller.premium.promotion.PremiumHomeTabPromo$Type[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
