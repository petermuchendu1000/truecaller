package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/premium/data/GiveawayResult;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "w82/y", "Success", "AlreadyConsumed", "InvalidProduct", "Unauthorized", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GiveawayResult {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.GiveawayResult[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.y Companion;
    public static final com.truecaller.premium.data.GiveawayResult Success = new com.truecaller.premium.data.GiveawayResult("Success", 0);
    public static final com.truecaller.premium.data.GiveawayResult AlreadyConsumed = new com.truecaller.premium.data.GiveawayResult("AlreadyConsumed", 1);
    public static final com.truecaller.premium.data.GiveawayResult InvalidProduct = new com.truecaller.premium.data.GiveawayResult("InvalidProduct", 2);
    public static final com.truecaller.premium.data.GiveawayResult Unauthorized = new com.truecaller.premium.data.GiveawayResult("Unauthorized", 3);

    private static final /* synthetic */ com.truecaller.premium.data.GiveawayResult[] $values() {
        return new com.truecaller.premium.data.GiveawayResult[]{Success, AlreadyConsumed, InvalidProduct, Unauthorized};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, w82.y] */
    static {
        com.truecaller.premium.data.GiveawayResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private GiveawayResult(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.GiveawayResult valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.GiveawayResult) java.lang.Enum.valueOf(com.truecaller.premium.data.GiveawayResult.class, str);
    }

    public static com.truecaller.premium.data.GiveawayResult[] values() {
        return (com.truecaller.premium.data.GiveawayResult[]) $VALUES.clone();
    }
}
