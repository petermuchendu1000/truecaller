package com.truecaller.premium.data.tier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/premium/data/tier/PromotionType;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "k92/q", "WINBACK", "WELCOME", "CAMPAIGN", "NON_INTRO_OFFER", "UNKNOWN", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PromotionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.tier.PromotionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final k92.q Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.tier.PromotionType WINBACK = new com.truecaller.premium.data.tier.PromotionType("WINBACK", 0, "winback");
    public static final com.truecaller.premium.data.tier.PromotionType WELCOME = new com.truecaller.premium.data.tier.PromotionType("WELCOME", 1, "welcome");
    public static final com.truecaller.premium.data.tier.PromotionType CAMPAIGN = new com.truecaller.premium.data.tier.PromotionType("CAMPAIGN", 2, "campaign");
    public static final com.truecaller.premium.data.tier.PromotionType NON_INTRO_OFFER = new com.truecaller.premium.data.tier.PromotionType("NON_INTRO_OFFER", 3, "nonintrooffer");
    public static final com.truecaller.premium.data.tier.PromotionType UNKNOWN = new com.truecaller.premium.data.tier.PromotionType("UNKNOWN", 4, "unknown");
    public static final com.truecaller.premium.data.tier.PromotionType NONE = new com.truecaller.premium.data.tier.PromotionType("NONE", 5, "none");

    private static final /* synthetic */ com.truecaller.premium.data.tier.PromotionType[] $values() {
        return new com.truecaller.premium.data.tier.PromotionType[]{WINBACK, WELCOME, CAMPAIGN, NON_INTRO_OFFER, UNKNOWN, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [k92.q, java.lang.Object] */
    static {
        com.truecaller.premium.data.tier.PromotionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PromotionType(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.tier.PromotionType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return k92.q.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.tier.PromotionType valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.tier.PromotionType) java.lang.Enum.valueOf(com.truecaller.premium.data.tier.PromotionType.class, str);
    }

    public static com.truecaller.premium.data.tier.PromotionType[] values() {
        return (com.truecaller.premium.data.tier.PromotionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
