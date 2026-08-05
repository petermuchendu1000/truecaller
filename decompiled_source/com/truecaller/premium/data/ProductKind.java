package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/premium/data/ProductKind;", "", "", "kind", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKind", "()Ljava/lang/String;", "Companion", "w82/t2", "SUBSCRIPTION_WEEKLY", "SUBSCRIPTION_BASIC_MONTHLY", "SUBSCRIPTION_MONTHLY", "SUBSCRIPTION_QUARTERLY", "SUBSCRIPTION_HALFYEARLY", "SUBSCRIPTION_YEARLY", "SUBSCRIPTION_WELCOME_OFFER_YEARLY", "SUBSCRIPTION_GOLD", "CONSUMABLE_YEARLY", "CONSUMABLE_GOLD_YEARLY", "CONSUMABLE_MONTHLY", "CONSUMABLE_QUARTERLY", "CONSUMABLE_HALFYEARLY", "PREPAID_WEEKLY", "PREPAID_MONTHLY", "PREPAID_QUARTERLY", "PREPAID_HALFYEARLY", "PREPAID_YEARLY", "SUBS_INSTALLMENT_MONTHLY", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProductKind {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.ProductKind[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.t2 Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String kind;
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_WEEKLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_WEEKLY", 0, "SubsWeekly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_BASIC_MONTHLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_BASIC_MONTHLY", 1, "subsbasicmonthly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_MONTHLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_MONTHLY", 2, "subsmonthly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_QUARTERLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_QUARTERLY", 3, "subsquarterly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_HALFYEARLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_HALFYEARLY", 4, "subshalfyearly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_YEARLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_YEARLY", 5, "subsyearly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_WELCOME_OFFER_YEARLY = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_WELCOME_OFFER_YEARLY", 6, "subswelcomeyearly");
    public static final com.truecaller.premium.data.ProductKind SUBSCRIPTION_GOLD = new com.truecaller.premium.data.ProductKind("SUBSCRIPTION_GOLD", 7, "goldyearly");
    public static final com.truecaller.premium.data.ProductKind CONSUMABLE_YEARLY = new com.truecaller.premium.data.ProductKind("CONSUMABLE_YEARLY", 8, "consumableyearly");
    public static final com.truecaller.premium.data.ProductKind CONSUMABLE_GOLD_YEARLY = new com.truecaller.premium.data.ProductKind("CONSUMABLE_GOLD_YEARLY", 9, "consumablegoldyearly");
    public static final com.truecaller.premium.data.ProductKind CONSUMABLE_MONTHLY = new com.truecaller.premium.data.ProductKind("CONSUMABLE_MONTHLY", 10, "consumablemonthly");
    public static final com.truecaller.premium.data.ProductKind CONSUMABLE_QUARTERLY = new com.truecaller.premium.data.ProductKind("CONSUMABLE_QUARTERLY", 11, "consumablequarterly");
    public static final com.truecaller.premium.data.ProductKind CONSUMABLE_HALFYEARLY = new com.truecaller.premium.data.ProductKind("CONSUMABLE_HALFYEARLY", 12, "consumablehalfyearly");
    public static final com.truecaller.premium.data.ProductKind PREPAID_WEEKLY = new com.truecaller.premium.data.ProductKind("PREPAID_WEEKLY", 13, "PrepaidWeekly");
    public static final com.truecaller.premium.data.ProductKind PREPAID_MONTHLY = new com.truecaller.premium.data.ProductKind("PREPAID_MONTHLY", 14, "PrepaidMonthly");
    public static final com.truecaller.premium.data.ProductKind PREPAID_QUARTERLY = new com.truecaller.premium.data.ProductKind("PREPAID_QUARTERLY", 15, "PrepaidQuarterly");
    public static final com.truecaller.premium.data.ProductKind PREPAID_HALFYEARLY = new com.truecaller.premium.data.ProductKind("PREPAID_HALFYEARLY", 16, "PrepaidHalfYearly");
    public static final com.truecaller.premium.data.ProductKind PREPAID_YEARLY = new com.truecaller.premium.data.ProductKind("PREPAID_YEARLY", 17, "PrepaidYearly");
    public static final com.truecaller.premium.data.ProductKind SUBS_INSTALLMENT_MONTHLY = new com.truecaller.premium.data.ProductKind("SUBS_INSTALLMENT_MONTHLY", 18, "SubsInstallmentMonthly");
    public static final com.truecaller.premium.data.ProductKind NONE = new com.truecaller.premium.data.ProductKind("NONE", 19, "none");

    private static final /* synthetic */ com.truecaller.premium.data.ProductKind[] $values() {
        return new com.truecaller.premium.data.ProductKind[]{SUBSCRIPTION_WEEKLY, SUBSCRIPTION_BASIC_MONTHLY, SUBSCRIPTION_MONTHLY, SUBSCRIPTION_QUARTERLY, SUBSCRIPTION_HALFYEARLY, SUBSCRIPTION_YEARLY, SUBSCRIPTION_WELCOME_OFFER_YEARLY, SUBSCRIPTION_GOLD, CONSUMABLE_YEARLY, CONSUMABLE_GOLD_YEARLY, CONSUMABLE_MONTHLY, CONSUMABLE_QUARTERLY, CONSUMABLE_HALFYEARLY, PREPAID_WEEKLY, PREPAID_MONTHLY, PREPAID_QUARTERLY, PREPAID_HALFYEARLY, PREPAID_YEARLY, SUBS_INSTALLMENT_MONTHLY, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [w82.t2, java.lang.Object] */
    static {
        com.truecaller.premium.data.ProductKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ProductKind(java.lang.String str, int i, java.lang.String str2) {
        this.kind = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.ProductKind fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.t2.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.ProductKind valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.ProductKind) java.lang.Enum.valueOf(com.truecaller.premium.data.ProductKind.class, str);
    }

    public static com.truecaller.premium.data.ProductKind[] values() {
        return (com.truecaller.premium.data.ProductKind[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKind() {
        return this.kind;
    }
}
