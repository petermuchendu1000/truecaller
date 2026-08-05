package com.truecaller.premium.ui.subscription.buttons;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/premium/ui/subscription/buttons/SubscriptionButtonTexts;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "xe2/f0", "PLAN_DURATION_STANDARD", "PLAN_DURATION", "PRICE", "FREE_TEXT", "FREE_TRIAL", "FREE_TRIAL_STANDARD", "BLANK", "INSTALLMENTS", "INSTALLMENTS_DISCLAIMER", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionButtonTexts {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final xe2.f0 Companion;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts PLAN_DURATION_STANDARD = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("PLAN_DURATION_STANDARD", 0, "PLAN_DURATION_STANDARD");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts PLAN_DURATION = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("PLAN_DURATION", 1, "PLAN_DURATION");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts PRICE = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("PRICE", 2, "PRICE");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts FREE_TEXT = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("FREE_TEXT", 3, "FREE_TEXT");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts FREE_TRIAL = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("FREE_TRIAL", 4, "FREE_TRIAL");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts FREE_TRIAL_STANDARD = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("FREE_TRIAL_STANDARD", 5, "FREE_TRIAL_STANDARD");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts BLANK = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("BLANK", 6, "BLANK");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts INSTALLMENTS = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("INSTALLMENTS", 7, "INSTALLMENTS");
    public static final com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts INSTALLMENTS_DISCLAIMER = new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts("INSTALLMENTS_DISCLAIMER", 8, "INSTALLMENTS_DISCLAIMER");

    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[] $values() {
        return new com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[]{PLAN_DURATION_STANDARD, PLAN_DURATION, PRICE, FREE_TEXT, FREE_TRIAL, FREE_TRIAL_STANDARD, BLANK, INSTALLMENTS, INSTALLMENTS_DISCLAIMER};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, xe2.f0] */
    static {
        com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private SubscriptionButtonTexts(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts) java.lang.Enum.valueOf(com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts.class, str);
    }

    public static com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[] values() {
        return (com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonTexts[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }
}
