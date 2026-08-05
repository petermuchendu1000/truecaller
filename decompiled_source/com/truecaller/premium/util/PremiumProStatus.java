package com.truecaller.premium.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/premium/util/PremiumProStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PREMIUM_WEEKLY", "PREMIUM_MONTHLY", "PREMIUM_BASIC_MONTHLY", "PREMIUM_QUARTERLY", "PREMIUM_HALF_YEARLY", "PREMIUM_YEARLY", "PREMIUM_UNKNOWN", "PREMIUM_CONSUMABLE", "PREMIUM_PREPAID_YEARLY", "PREMIUM_PREPAID_MONTHLY", "PREMIUM_PREPAID_WEEKLY", "PREMIUM_PREPAID_QUATERLY", "PREMIUM_PREPAID_HALF_YEARLY", "GOLD", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumProStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.util.PremiumProStatus[] $VALUES;
    public static final com.truecaller.premium.util.PremiumProStatus NONE = new com.truecaller.premium.util.PremiumProStatus("NONE", 0);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_WEEKLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_WEEKLY", 1);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_MONTHLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_MONTHLY", 2);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_BASIC_MONTHLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_BASIC_MONTHLY", 3);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_QUARTERLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_QUARTERLY", 4);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_HALF_YEARLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_HALF_YEARLY", 5);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_YEARLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_YEARLY", 6);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_UNKNOWN = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_UNKNOWN", 7);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_CONSUMABLE = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_CONSUMABLE", 8);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_PREPAID_YEARLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_PREPAID_YEARLY", 9);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_PREPAID_MONTHLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_PREPAID_MONTHLY", 10);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_PREPAID_WEEKLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_PREPAID_WEEKLY", 11);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_PREPAID_QUATERLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_PREPAID_QUATERLY", 12);
    public static final com.truecaller.premium.util.PremiumProStatus PREMIUM_PREPAID_HALF_YEARLY = new com.truecaller.premium.util.PremiumProStatus("PREMIUM_PREPAID_HALF_YEARLY", 13);
    public static final com.truecaller.premium.util.PremiumProStatus GOLD = new com.truecaller.premium.util.PremiumProStatus("GOLD", 14);

    private static final /* synthetic */ com.truecaller.premium.util.PremiumProStatus[] $values() {
        return new com.truecaller.premium.util.PremiumProStatus[]{NONE, PREMIUM_WEEKLY, PREMIUM_MONTHLY, PREMIUM_BASIC_MONTHLY, PREMIUM_QUARTERLY, PREMIUM_HALF_YEARLY, PREMIUM_YEARLY, PREMIUM_UNKNOWN, PREMIUM_CONSUMABLE, PREMIUM_PREPAID_YEARLY, PREMIUM_PREPAID_MONTHLY, PREMIUM_PREPAID_WEEKLY, PREMIUM_PREPAID_QUATERLY, PREMIUM_PREPAID_HALF_YEARLY, GOLD};
    }

    static {
        com.truecaller.premium.util.PremiumProStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PremiumProStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.util.PremiumProStatus valueOf(java.lang.String str) {
        return (com.truecaller.premium.util.PremiumProStatus) java.lang.Enum.valueOf(com.truecaller.premium.util.PremiumProStatus.class, str);
    }

    public static com.truecaller.premium.util.PremiumProStatus[] values() {
        return (com.truecaller.premium.util.PremiumProStatus[]) $VALUES.clone();
    }
}
