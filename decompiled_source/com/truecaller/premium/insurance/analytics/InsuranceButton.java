package com.truecaller.premium.insurance.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/premium/insurance/analytics/InsuranceButton;", "", "buttonDefinition", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "REGISTER", "RAISE_CLAIM", "MORE_OPTIONS", "FAQ", "NUMBER_MISMATCH", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsuranceButton {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.insurance.analytics.InsuranceButton[] $VALUES;
    public static final com.truecaller.premium.insurance.analytics.InsuranceButton REGISTER = new com.truecaller.premium.insurance.analytics.InsuranceButton("REGISTER", 0, "Register");
    public static final com.truecaller.premium.insurance.analytics.InsuranceButton RAISE_CLAIM = new com.truecaller.premium.insurance.analytics.InsuranceButton("RAISE_CLAIM", 1, "RaiseClaim");
    public static final com.truecaller.premium.insurance.analytics.InsuranceButton MORE_OPTIONS = new com.truecaller.premium.insurance.analytics.InsuranceButton("MORE_OPTIONS", 2, "MoreOptions");
    public static final com.truecaller.premium.insurance.analytics.InsuranceButton FAQ = new com.truecaller.premium.insurance.analytics.InsuranceButton("FAQ", 3, "Faq");
    public static final com.truecaller.premium.insurance.analytics.InsuranceButton NUMBER_MISMATCH = new com.truecaller.premium.insurance.analytics.InsuranceButton("NUMBER_MISMATCH", 4, "NumberMismatch");

    private static final /* synthetic */ com.truecaller.premium.insurance.analytics.InsuranceButton[] $values() {
        return new com.truecaller.premium.insurance.analytics.InsuranceButton[]{REGISTER, RAISE_CLAIM, MORE_OPTIONS, FAQ, NUMBER_MISMATCH};
    }

    static {
        com.truecaller.premium.insurance.analytics.InsuranceButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsuranceButton(java.lang.String str, int i, java.lang.String str2) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.insurance.analytics.InsuranceButton valueOf(java.lang.String str) {
        return (com.truecaller.premium.insurance.analytics.InsuranceButton) java.lang.Enum.valueOf(com.truecaller.premium.insurance.analytics.InsuranceButton.class, str);
    }

    public static com.truecaller.premium.insurance.analytics.InsuranceButton[] values() {
        return (com.truecaller.premium.insurance.analytics.InsuranceButton[]) $VALUES.clone();
    }
}
