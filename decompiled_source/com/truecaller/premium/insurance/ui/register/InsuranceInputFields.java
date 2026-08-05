package com.truecaller.premium.insurance.ui.register;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/insurance/ui/register/InsuranceInputFields;", "", "<init>", "(Ljava/lang/String;I)V", "MobileNumber", "Salutation", "FirstName", "LastName", "Email", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsuranceInputFields {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.insurance.ui.register.InsuranceInputFields[] $VALUES;
    public static final com.truecaller.premium.insurance.ui.register.InsuranceInputFields MobileNumber = new com.truecaller.premium.insurance.ui.register.InsuranceInputFields("MobileNumber", 0);
    public static final com.truecaller.premium.insurance.ui.register.InsuranceInputFields Salutation = new com.truecaller.premium.insurance.ui.register.InsuranceInputFields("Salutation", 1);
    public static final com.truecaller.premium.insurance.ui.register.InsuranceInputFields FirstName = new com.truecaller.premium.insurance.ui.register.InsuranceInputFields("FirstName", 2);
    public static final com.truecaller.premium.insurance.ui.register.InsuranceInputFields LastName = new com.truecaller.premium.insurance.ui.register.InsuranceInputFields("LastName", 3);
    public static final com.truecaller.premium.insurance.ui.register.InsuranceInputFields Email = new com.truecaller.premium.insurance.ui.register.InsuranceInputFields("Email", 4);

    private static final /* synthetic */ com.truecaller.premium.insurance.ui.register.InsuranceInputFields[] $values() {
        return new com.truecaller.premium.insurance.ui.register.InsuranceInputFields[]{MobileNumber, Salutation, FirstName, LastName, Email};
    }

    static {
        com.truecaller.premium.insurance.ui.register.InsuranceInputFields[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsuranceInputFields(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.insurance.ui.register.InsuranceInputFields valueOf(java.lang.String str) {
        return (com.truecaller.premium.insurance.ui.register.InsuranceInputFields) java.lang.Enum.valueOf(com.truecaller.premium.insurance.ui.register.InsuranceInputFields.class, str);
    }

    public static com.truecaller.premium.insurance.ui.register.InsuranceInputFields[] values() {
        return (com.truecaller.premium.insurance.ui.register.InsuranceInputFields[]) $VALUES.clone();
    }
}
