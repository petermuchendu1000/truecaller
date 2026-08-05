package com.truecaller.premium.insurance.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/premium/insurance/data/InsuranceComponent;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "PARTNER_DETAILS", "INSURANCE_STATUS", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsuranceComponent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.insurance.data.InsuranceComponent[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.insurance.data.InsuranceComponent PARTNER_DETAILS = new com.truecaller.premium.insurance.data.InsuranceComponent("PARTNER_DETAILS", 0, "coverage_details");
    public static final com.truecaller.premium.insurance.data.InsuranceComponent INSURANCE_STATUS = new com.truecaller.premium.insurance.data.InsuranceComponent("INSURANCE_STATUS", 1, "insurance_status");

    private static final /* synthetic */ com.truecaller.premium.insurance.data.InsuranceComponent[] $values() {
        return new com.truecaller.premium.insurance.data.InsuranceComponent[]{PARTNER_DETAILS, INSURANCE_STATUS};
    }

    static {
        com.truecaller.premium.insurance.data.InsuranceComponent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsuranceComponent(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.insurance.data.InsuranceComponent valueOf(java.lang.String str) {
        return (com.truecaller.premium.insurance.data.InsuranceComponent) java.lang.Enum.valueOf(com.truecaller.premium.insurance.data.InsuranceComponent.class, str);
    }

    public static com.truecaller.premium.insurance.data.InsuranceComponent[] values() {
        return (com.truecaller.premium.insurance.data.InsuranceComponent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
