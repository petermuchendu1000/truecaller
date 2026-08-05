package com.truecaller.premium.ui.subscription.buttons.subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/premium/ui/subscription/buttons/subscription/OfferType;", "", "<init>", "(Ljava/lang/String;I)V", "DISCOUNT_AND_FREE_TRIAL", "DISCOUNT", "FREE_TRIAL", "NON_DISCOUNT_AND_FREE_TRIAL", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OfferType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[] $VALUES;
    public static final com.truecaller.premium.ui.subscription.buttons.subscription.OfferType DISCOUNT_AND_FREE_TRIAL = new com.truecaller.premium.ui.subscription.buttons.subscription.OfferType("DISCOUNT_AND_FREE_TRIAL", 0);
    public static final com.truecaller.premium.ui.subscription.buttons.subscription.OfferType DISCOUNT = new com.truecaller.premium.ui.subscription.buttons.subscription.OfferType("DISCOUNT", 1);
    public static final com.truecaller.premium.ui.subscription.buttons.subscription.OfferType FREE_TRIAL = new com.truecaller.premium.ui.subscription.buttons.subscription.OfferType("FREE_TRIAL", 2);
    public static final com.truecaller.premium.ui.subscription.buttons.subscription.OfferType NON_DISCOUNT_AND_FREE_TRIAL = new com.truecaller.premium.ui.subscription.buttons.subscription.OfferType("NON_DISCOUNT_AND_FREE_TRIAL", 3);

    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[] $values() {
        return new com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[]{DISCOUNT_AND_FREE_TRIAL, DISCOUNT, FREE_TRIAL, NON_DISCOUNT_AND_FREE_TRIAL};
    }

    static {
        com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OfferType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.subscription.buttons.subscription.OfferType valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.subscription.buttons.subscription.OfferType) java.lang.Enum.valueOf(com.truecaller.premium.ui.subscription.buttons.subscription.OfferType.class, str);
    }

    public static com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[] values() {
        return (com.truecaller.premium.ui.subscription.buttons.subscription.OfferType[]) $VALUES.clone();
    }
}
