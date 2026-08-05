package com.truecaller.premium.data.tier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/premium/data/tier/TierFreeTextFeatureType;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "TICK", "PLUS", "FREE", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TierFreeTextFeatureType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.tier.TierFreeTextFeatureType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.tier.TierFreeTextFeatureType TICK = new com.truecaller.premium.data.tier.TierFreeTextFeatureType("TICK", 0, "tick");
    public static final com.truecaller.premium.data.tier.TierFreeTextFeatureType PLUS = new com.truecaller.premium.data.tier.TierFreeTextFeatureType("PLUS", 1, "plus");
    public static final com.truecaller.premium.data.tier.TierFreeTextFeatureType FREE = new com.truecaller.premium.data.tier.TierFreeTextFeatureType("FREE", 2, "free");
    public static final com.truecaller.premium.data.tier.TierFreeTextFeatureType UNKNOWN = new com.truecaller.premium.data.tier.TierFreeTextFeatureType("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ com.truecaller.premium.data.tier.TierFreeTextFeatureType[] $values() {
        return new com.truecaller.premium.data.tier.TierFreeTextFeatureType[]{TICK, PLUS, FREE, UNKNOWN};
    }

    static {
        com.truecaller.premium.data.tier.TierFreeTextFeatureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TierFreeTextFeatureType(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.tier.TierFreeTextFeatureType valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.tier.TierFreeTextFeatureType) java.lang.Enum.valueOf(com.truecaller.premium.data.tier.TierFreeTextFeatureType.class, str);
    }

    public static com.truecaller.premium.data.tier.TierFreeTextFeatureType[] values() {
        return (com.truecaller.premium.data.tier.TierFreeTextFeatureType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
