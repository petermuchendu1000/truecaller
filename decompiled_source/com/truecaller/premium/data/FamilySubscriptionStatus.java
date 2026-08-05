package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/premium/data/FamilySubscriptionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "", "showNextRenewal", "()Z", "showExpires", "Companion", "w82/u", "NONE", "SUBSCRIPTION_RECOVERED", "SUBSCRIPTION_RENEWED", "SUBSCRIPTION_CANCELED", "SUBSCRIPTION_PURCHASED", "SUBSCRIPTION_IN_GRACE_PERIOD", "SUBSCRIPTION_EXPIRED", "SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED", "SUBSCRIPTION_RESTARTED", "SUBSCRIPTION_DEFERRED", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySubscriptionStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.FamilySubscriptionStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.u Companion;
    public static final com.truecaller.premium.data.FamilySubscriptionStatus NONE = new com.truecaller.premium.data.FamilySubscriptionStatus("NONE", 0);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_RECOVERED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_RECOVERED", 1);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_RENEWED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_RENEWED", 2);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_CANCELED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_CANCELED", 3);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_PURCHASED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_PURCHASED", 4);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_IN_GRACE_PERIOD = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_IN_GRACE_PERIOD", 5);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_EXPIRED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_EXPIRED", 6);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED", 7);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_RESTARTED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_RESTARTED", 8);
    public static final com.truecaller.premium.data.FamilySubscriptionStatus SUBSCRIPTION_DEFERRED = new com.truecaller.premium.data.FamilySubscriptionStatus("SUBSCRIPTION_DEFERRED", 9);

    private static final /* synthetic */ com.truecaller.premium.data.FamilySubscriptionStatus[] $values() {
        return new com.truecaller.premium.data.FamilySubscriptionStatus[]{NONE, SUBSCRIPTION_RECOVERED, SUBSCRIPTION_RENEWED, SUBSCRIPTION_CANCELED, SUBSCRIPTION_PURCHASED, SUBSCRIPTION_IN_GRACE_PERIOD, SUBSCRIPTION_EXPIRED, SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED, SUBSCRIPTION_RESTARTED, SUBSCRIPTION_DEFERRED};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, w82.u] */
    static {
        com.truecaller.premium.data.FamilySubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilySubscriptionStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.FamilySubscriptionStatus fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.u.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.FamilySubscriptionStatus valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.FamilySubscriptionStatus) java.lang.Enum.valueOf(com.truecaller.premium.data.FamilySubscriptionStatus.class, str);
    }

    public static com.truecaller.premium.data.FamilySubscriptionStatus[] values() {
        return (com.truecaller.premium.data.FamilySubscriptionStatus[]) $VALUES.clone();
    }

    public final boolean showExpires() {
        com.truecaller.premium.data.FamilySubscriptionStatus[] familySubscriptionStatusArr = {SUBSCRIPTION_CANCELED, SUBSCRIPTION_IN_GRACE_PERIOD, SUBSCRIPTION_EXPIRED, NONE};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(familySubscriptionStatusArr, "elements");
        return kotlin.collections.v.l0(familySubscriptionStatusArr).contains(this);
    }

    public final boolean showNextRenewal() {
        com.truecaller.premium.data.FamilySubscriptionStatus[] familySubscriptionStatusArr = {SUBSCRIPTION_PURCHASED, SUBSCRIPTION_RENEWED, SUBSCRIPTION_RECOVERED, SUBSCRIPTION_PAUSE_SCHEDULE_CHANGED, SUBSCRIPTION_RESTARTED, SUBSCRIPTION_DEFERRED};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(familySubscriptionStatusArr, "elements");
        return kotlin.collections.v.l0(familySubscriptionStatusArr).contains(this);
    }
}
