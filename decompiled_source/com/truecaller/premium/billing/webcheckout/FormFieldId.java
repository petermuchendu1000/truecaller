package com.truecaller.premium.billing.webcheckout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/billing/webcheckout/FormFieldId;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE_NUMBER", "EMAIL", "FULL_NAME", "TRUECALLER_TERMS_AND_CONDITIONS", "COUNTRY", "ADDRESS_LINE_1", "ADDRESS_LINE_2", "CITY", "ZIP_CODE", "STATE", "PAYMENT_GATEWAY_TERMS_AND_CONDITIONS", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class FormFieldId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.billing.webcheckout.FormFieldId[] $VALUES;
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId PHONE_NUMBER = new com.truecaller.premium.billing.webcheckout.FormFieldId("PHONE_NUMBER", 0);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId EMAIL = new com.truecaller.premium.billing.webcheckout.FormFieldId("EMAIL", 1);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId FULL_NAME = new com.truecaller.premium.billing.webcheckout.FormFieldId("FULL_NAME", 2);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId TRUECALLER_TERMS_AND_CONDITIONS = new com.truecaller.premium.billing.webcheckout.FormFieldId("TRUECALLER_TERMS_AND_CONDITIONS", 3);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId COUNTRY = new com.truecaller.premium.billing.webcheckout.FormFieldId("COUNTRY", 4);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId ADDRESS_LINE_1 = new com.truecaller.premium.billing.webcheckout.FormFieldId("ADDRESS_LINE_1", 5);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId ADDRESS_LINE_2 = new com.truecaller.premium.billing.webcheckout.FormFieldId("ADDRESS_LINE_2", 6);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId CITY = new com.truecaller.premium.billing.webcheckout.FormFieldId("CITY", 7);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId ZIP_CODE = new com.truecaller.premium.billing.webcheckout.FormFieldId("ZIP_CODE", 8);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId STATE = new com.truecaller.premium.billing.webcheckout.FormFieldId("STATE", 9);
    public static final com.truecaller.premium.billing.webcheckout.FormFieldId PAYMENT_GATEWAY_TERMS_AND_CONDITIONS = new com.truecaller.premium.billing.webcheckout.FormFieldId("PAYMENT_GATEWAY_TERMS_AND_CONDITIONS", 10);

    private static final /* synthetic */ com.truecaller.premium.billing.webcheckout.FormFieldId[] $values() {
        return new com.truecaller.premium.billing.webcheckout.FormFieldId[]{PHONE_NUMBER, EMAIL, FULL_NAME, TRUECALLER_TERMS_AND_CONDITIONS, COUNTRY, ADDRESS_LINE_1, ADDRESS_LINE_2, CITY, ZIP_CODE, STATE, PAYMENT_GATEWAY_TERMS_AND_CONDITIONS};
    }

    static {
        com.truecaller.premium.billing.webcheckout.FormFieldId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FormFieldId(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.billing.webcheckout.FormFieldId valueOf(java.lang.String str) {
        return (com.truecaller.premium.billing.webcheckout.FormFieldId) java.lang.Enum.valueOf(com.truecaller.premium.billing.webcheckout.FormFieldId.class, str);
    }

    public static com.truecaller.premium.billing.webcheckout.FormFieldId[] values() {
        return (com.truecaller.premium.billing.webcheckout.FormFieldId[]) $VALUES.clone();
    }
}
