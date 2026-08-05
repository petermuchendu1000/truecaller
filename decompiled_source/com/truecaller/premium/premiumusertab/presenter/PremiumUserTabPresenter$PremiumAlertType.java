package com.truecaller.premium.premiumusertab.presenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/premium/premiumusertab/presenter/PremiumUserTabPresenter$PremiumAlertType", "", "Lcom/truecaller/premium/premiumusertab/presenter/PremiumUserTabPresenter$PremiumAlertType;", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_FAILED", "SUBSCRIPTION_CANCELLED", "SUBSCRIPTION_PAUSED", "PENDING_PURCHASE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumUserTabPresenter$PremiumAlertType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[] $VALUES;
    public static final com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType PAYMENT_FAILED = new com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType("PAYMENT_FAILED", 0);
    public static final com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType SUBSCRIPTION_CANCELLED = new com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType("SUBSCRIPTION_CANCELLED", 1);
    public static final com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType SUBSCRIPTION_PAUSED = new com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType("SUBSCRIPTION_PAUSED", 2);
    public static final com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType PENDING_PURCHASE = new com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType("PENDING_PURCHASE", 3);

    private static final /* synthetic */ com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[] $values() {
        return new com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[]{PAYMENT_FAILED, SUBSCRIPTION_CANCELLED, SUBSCRIPTION_PAUSED, PENDING_PURCHASE};
    }

    static {
        com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PremiumUserTabPresenter$PremiumAlertType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType valueOf(java.lang.String str) {
        return (com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType.class, str);
    }

    public static com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[] values() {
        return (com.truecaller.premium.premiumusertab.presenter.PremiumUserTabPresenter$PremiumAlertType[]) $VALUES.clone();
    }
}
