package com.truecaller.referrals.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/truecaller/referrals/api/ReferralManager$RedeemCodeContext", "", "Lcom/truecaller/referrals/api/ReferralManager$RedeemCodeContext;", "<init>", "(Ljava/lang/String;I)V", "GO_PRO", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralManager$RedeemCodeContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[] $VALUES;
    public static final com.truecaller.referrals.api.ReferralManager$RedeemCodeContext GO_PRO = new com.truecaller.referrals.api.ReferralManager$RedeemCodeContext("GO_PRO", 0);

    private static final /* synthetic */ com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[] $values() {
        return new com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[]{GO_PRO};
    }

    static {
        com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReferralManager$RedeemCodeContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referrals.api.ReferralManager$RedeemCodeContext valueOf(java.lang.String str) {
        return (com.truecaller.referrals.api.ReferralManager$RedeemCodeContext) java.lang.Enum.valueOf(com.truecaller.referrals.api.ReferralManager$RedeemCodeContext.class, str);
    }

    public static com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[] values() {
        return (com.truecaller.referrals.api.ReferralManager$RedeemCodeContext[]) $VALUES.clone();
    }
}
