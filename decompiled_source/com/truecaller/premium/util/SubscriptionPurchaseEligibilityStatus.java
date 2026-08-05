package com.truecaller.premium.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/premium/util/SubscriptionPurchaseEligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ELIGIBLE", "ASSISTANT_CARRIER_NOT_SUPPORTED", "MEMBERS_WILL_LOSE_FAMILY_SHARING", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionPurchaseEligibilityStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[] $VALUES;
    public static final com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus ELIGIBLE = new com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus("ELIGIBLE", 0);
    public static final com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus ASSISTANT_CARRIER_NOT_SUPPORTED = new com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus("ASSISTANT_CARRIER_NOT_SUPPORTED", 1);
    public static final com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus MEMBERS_WILL_LOSE_FAMILY_SHARING = new com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus("MEMBERS_WILL_LOSE_FAMILY_SHARING", 2);

    private static final /* synthetic */ com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[] $values() {
        return new com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[]{ELIGIBLE, ASSISTANT_CARRIER_NOT_SUPPORTED, MEMBERS_WILL_LOSE_FAMILY_SHARING};
    }

    static {
        com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubscriptionPurchaseEligibilityStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus valueOf(java.lang.String str) {
        return (com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus) java.lang.Enum.valueOf(com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus.class, str);
    }

    public static com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[] values() {
        return (com.truecaller.premium.util.SubscriptionPurchaseEligibilityStatus[]) $VALUES.clone();
    }
}
