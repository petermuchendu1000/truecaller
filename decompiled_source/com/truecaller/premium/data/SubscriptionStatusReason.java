package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/truecaller/premium/data/SubscriptionStatusReason;", "", "<init>", "(Ljava/lang/String;I)V", "", "isPaymentFailed", "()Z", "isInGracePeriod", "isOnHoldOrPaused", "Companion", "w82/o3", "NONE", "SUBSCRIPTION_RECOVERED", "SUBSCRIPTION_RENEWED", "SUBSCRIPTION_CANCELED", "SUBSCRIPTION_WEB_CANCELLED", "SUBSCRIPTION_PURCHASED", "SUBSCRIPTION_ON_HOLD", "SUBSCRIPTION_IN_GRACE_PERIOD", "SUBSCRIPTION_RESTARTED", "SUBSCRIPTION_PRICE_CHANGE_CONFIRMED", "SUBSCRIPTION_DEFERRED", "SUBSCRIPTION_PAUSED", "SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED", "SUBSCRIPTION_REVOKED", "SUBSCRIPTION_EXPIRED", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionStatusReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.SubscriptionStatusReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.o3 Companion;
    public static final com.truecaller.premium.data.SubscriptionStatusReason NONE = new com.truecaller.premium.data.SubscriptionStatusReason("NONE", 0);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_RECOVERED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_RECOVERED", 1);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_RENEWED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_RENEWED", 2);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_CANCELED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_CANCELED", 3);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_WEB_CANCELLED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_WEB_CANCELLED", 4);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_PURCHASED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_PURCHASED", 5);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_ON_HOLD = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_ON_HOLD", 6);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_IN_GRACE_PERIOD = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_IN_GRACE_PERIOD", 7);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_RESTARTED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_RESTARTED", 8);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_PRICE_CHANGE_CONFIRMED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_PRICE_CHANGE_CONFIRMED", 9);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_DEFERRED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_DEFERRED", 10);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_PAUSED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_PAUSED", 11);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED", 12);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_REVOKED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_REVOKED", 13);
    public static final com.truecaller.premium.data.SubscriptionStatusReason SUBSCRIPTION_EXPIRED = new com.truecaller.premium.data.SubscriptionStatusReason("SUBSCRIPTION_EXPIRED", 14);

    private static final /* synthetic */ com.truecaller.premium.data.SubscriptionStatusReason[] $values() {
        return new com.truecaller.premium.data.SubscriptionStatusReason[]{NONE, SUBSCRIPTION_RECOVERED, SUBSCRIPTION_RENEWED, SUBSCRIPTION_CANCELED, SUBSCRIPTION_WEB_CANCELLED, SUBSCRIPTION_PURCHASED, SUBSCRIPTION_ON_HOLD, SUBSCRIPTION_IN_GRACE_PERIOD, SUBSCRIPTION_RESTARTED, SUBSCRIPTION_PRICE_CHANGE_CONFIRMED, SUBSCRIPTION_DEFERRED, SUBSCRIPTION_PAUSED, SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED, SUBSCRIPTION_REVOKED, SUBSCRIPTION_EXPIRED};
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, w82.o3] */
    static {
        com.truecaller.premium.data.SubscriptionStatusReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private SubscriptionStatusReason(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.SubscriptionStatusReason fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.o3.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.SubscriptionStatusReason valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.SubscriptionStatusReason) java.lang.Enum.valueOf(com.truecaller.premium.data.SubscriptionStatusReason.class, str);
    }

    public static com.truecaller.premium.data.SubscriptionStatusReason[] values() {
        return (com.truecaller.premium.data.SubscriptionStatusReason[]) $VALUES.clone();
    }

    public final boolean isInGracePeriod() {
        if (this == SUBSCRIPTION_IN_GRACE_PERIOD) {
            return true;
        }
        return false;
    }

    public final boolean isOnHoldOrPaused() {
        com.truecaller.premium.data.SubscriptionStatusReason[] subscriptionStatusReasonArr = {SUBSCRIPTION_ON_HOLD, SUBSCRIPTION_PAUSED};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionStatusReasonArr, "elements");
        return kotlin.collections.v.l0(subscriptionStatusReasonArr).contains(this);
    }

    public final boolean isPaymentFailed() {
        com.truecaller.premium.data.SubscriptionStatusReason[] subscriptionStatusReasonArr = {SUBSCRIPTION_IN_GRACE_PERIOD, SUBSCRIPTION_ON_HOLD};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionStatusReasonArr, "elements");
        return kotlin.collections.v.l0(subscriptionStatusReasonArr).contains(this);
    }
}
