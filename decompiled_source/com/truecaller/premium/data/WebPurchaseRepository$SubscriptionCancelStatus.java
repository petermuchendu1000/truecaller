package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/premium/data/WebPurchaseRepository$SubscriptionCancelStatus", "", "Lcom/truecaller/premium/data/WebPurchaseRepository$SubscriptionCancelStatus;", "<init>", "(Ljava/lang/String;I)V", "Companion", "w82/z3", "Success", "InvalidWebSubscription", "GetInvoiceFailed", "GetSubscriptionFailed", "CancelSubscriptionFailed", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class WebPurchaseRepository$SubscriptionCancelStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.z3 Companion;
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus Success = new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus("Success", 0);
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus InvalidWebSubscription = new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus("InvalidWebSubscription", 1);
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus GetInvoiceFailed = new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus("GetInvoiceFailed", 2);
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus GetSubscriptionFailed = new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus("GetSubscriptionFailed", 3);
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus CancelSubscriptionFailed = new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus("CancelSubscriptionFailed", 4);

    private static final /* synthetic */ com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[] $values() {
        return new com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[]{Success, InvalidWebSubscription, GetInvoiceFailed, GetSubscriptionFailed, CancelSubscriptionFailed};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, w82.z3] */
    static {
        com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private WebPurchaseRepository$SubscriptionCancelStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus from(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.z3.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus) java.lang.Enum.valueOf(com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus.class, str);
    }

    public static com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[] values() {
        return (com.truecaller.premium.data.WebPurchaseRepository$SubscriptionCancelStatus[]) $VALUES.clone();
    }
}
