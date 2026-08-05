package com.truecaller.premium.billing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/billing/SubscriptionRecurrence;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "r82/x", "RECURRING", "PREPAID", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class SubscriptionRecurrence {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.billing.SubscriptionRecurrence[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final r82.x Companion;
    public static final com.truecaller.premium.billing.SubscriptionRecurrence RECURRING = new com.truecaller.premium.billing.SubscriptionRecurrence("RECURRING", 0);
    public static final com.truecaller.premium.billing.SubscriptionRecurrence PREPAID = new com.truecaller.premium.billing.SubscriptionRecurrence("PREPAID", 1);
    public static final com.truecaller.premium.billing.SubscriptionRecurrence NONE = new com.truecaller.premium.billing.SubscriptionRecurrence("NONE", 2);

    private static final /* synthetic */ com.truecaller.premium.billing.SubscriptionRecurrence[] $values() {
        return new com.truecaller.premium.billing.SubscriptionRecurrence[]{RECURRING, PREPAID, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [r82.x, java.lang.Object] */
    static {
        com.truecaller.premium.billing.SubscriptionRecurrence[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private SubscriptionRecurrence(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.billing.SubscriptionRecurrence fromString(@org.jetbrains.annotations.NotNull java.lang.String str) {
        com.truecaller.premium.billing.SubscriptionRecurrence subscriptionRecurrence;
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.ironsource.C0889d4.h.X);
        com.truecaller.premium.billing.SubscriptionRecurrence[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                subscriptionRecurrence = values[i];
                if (kotlin.jvm.internal.Intrinsics.b(subscriptionRecurrence.name(), str)) {
                    break;
                }
                i++;
            } else {
                subscriptionRecurrence = null;
                break;
            }
        }
        if (subscriptionRecurrence == null) {
            return NONE;
        }
        return subscriptionRecurrence;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.billing.SubscriptionRecurrence valueOf(java.lang.String str) {
        return (com.truecaller.premium.billing.SubscriptionRecurrence) java.lang.Enum.valueOf(com.truecaller.premium.billing.SubscriptionRecurrence.class, str);
    }

    public static com.truecaller.premium.billing.SubscriptionRecurrence[] values() {
        return (com.truecaller.premium.billing.SubscriptionRecurrence[]) $VALUES.clone();
    }
}
