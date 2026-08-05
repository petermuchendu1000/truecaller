package com.truecaller.premium.data.tier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/truecaller/premium/data/tier/PremiumTierType;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "k92/m", "PREMIUM", "AD_FREE", "VERIFIED", "GOLD", "GOLD_FAMILY", "ASSISTANT", "NETWORK", "PROFILE_VIEWS", "PROTECT", "FAMILY", "ASSISTANT_FAMILY", "TRUECALLER_AI", "SINGLE_PLAN_PREMIUM", "SINGLE_PLAN_FAMILY", "FREE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumTierType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.tier.PremiumTierType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final k92.m Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.tier.PremiumTierType PREMIUM = new com.truecaller.premium.data.tier.PremiumTierType("PREMIUM", 0, "premium");
    public static final com.truecaller.premium.data.tier.PremiumTierType AD_FREE = new com.truecaller.premium.data.tier.PremiumTierType("AD_FREE", 1, "adfree");
    public static final com.truecaller.premium.data.tier.PremiumTierType VERIFIED = new com.truecaller.premium.data.tier.PremiumTierType("VERIFIED", 2, "verified");
    public static final com.truecaller.premium.data.tier.PremiumTierType GOLD = new com.truecaller.premium.data.tier.PremiumTierType("GOLD", 3, "gold");
    public static final com.truecaller.premium.data.tier.PremiumTierType GOLD_FAMILY = new com.truecaller.premium.data.tier.PremiumTierType("GOLD_FAMILY", 4, "goldfamily");
    public static final com.truecaller.premium.data.tier.PremiumTierType ASSISTANT = new com.truecaller.premium.data.tier.PremiumTierType("ASSISTANT", 5, "assistant");
    public static final com.truecaller.premium.data.tier.PremiumTierType NETWORK = new com.truecaller.premium.data.tier.PremiumTierType("NETWORK", 6, "network");
    public static final com.truecaller.premium.data.tier.PremiumTierType PROFILE_VIEWS = new com.truecaller.premium.data.tier.PremiumTierType("PROFILE_VIEWS", 7, "profileviews");
    public static final com.truecaller.premium.data.tier.PremiumTierType PROTECT = new com.truecaller.premium.data.tier.PremiumTierType("PROTECT", 8, "protect");
    public static final com.truecaller.premium.data.tier.PremiumTierType FAMILY = new com.truecaller.premium.data.tier.PremiumTierType("FAMILY", 9, "family");
    public static final com.truecaller.premium.data.tier.PremiumTierType ASSISTANT_FAMILY = new com.truecaller.premium.data.tier.PremiumTierType("ASSISTANT_FAMILY", 10, "assistantfamily");
    public static final com.truecaller.premium.data.tier.PremiumTierType TRUECALLER_AI = new com.truecaller.premium.data.tier.PremiumTierType("TRUECALLER_AI", 11, "assistantai");
    public static final com.truecaller.premium.data.tier.PremiumTierType SINGLE_PLAN_PREMIUM = new com.truecaller.premium.data.tier.PremiumTierType("SINGLE_PLAN_PREMIUM", 12, "singlepremium");
    public static final com.truecaller.premium.data.tier.PremiumTierType SINGLE_PLAN_FAMILY = new com.truecaller.premium.data.tier.PremiumTierType("SINGLE_PLAN_FAMILY", 13, "familypremium");
    public static final com.truecaller.premium.data.tier.PremiumTierType FREE = new com.truecaller.premium.data.tier.PremiumTierType("FREE", 14, "free");

    private static final /* synthetic */ com.truecaller.premium.data.tier.PremiumTierType[] $values() {
        return new com.truecaller.premium.data.tier.PremiumTierType[]{PREMIUM, AD_FREE, VERIFIED, GOLD, GOLD_FAMILY, ASSISTANT, NETWORK, PROFILE_VIEWS, PROTECT, FAMILY, ASSISTANT_FAMILY, TRUECALLER_AI, SINGLE_PLAN_PREMIUM, SINGLE_PLAN_FAMILY, FREE};
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, k92.m] */
    static {
        com.truecaller.premium.data.tier.PremiumTierType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PremiumTierType(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.tier.PremiumTierType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return k92.m.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.tier.PremiumTierType valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.tier.PremiumTierType) java.lang.Enum.valueOf(com.truecaller.premium.data.tier.PremiumTierType.class, str);
    }

    public static com.truecaller.premium.data.tier.PremiumTierType[] values() {
        return (com.truecaller.premium.data.tier.PremiumTierType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
