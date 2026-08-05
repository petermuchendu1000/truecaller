package com.truecaller.editprofile.api.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/editprofile/api/ui/AutoFocusOnField;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_NAME", "LAST_NAME", "PHONE_NUMBER", "SECONDARY_PHONE_NUMBER", "EMAIL", "BIRTH_DAY", "GENDER", "ADDRESS_STREET", "ADDRESS_ZIP_CODE", "ADDRESS_CITY", "ADDRESS_COUNTRY", "ABOUT_COMPANY", "ABOUT_JOB_TITLE", "ABOUT_WEBSITE", "ABOUT_BIO", "AVATAR", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AutoFocusOnField {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.editprofile.api.ui.AutoFocusOnField[] $VALUES;
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField FIRST_NAME = new com.truecaller.editprofile.api.ui.AutoFocusOnField("FIRST_NAME", 0);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField LAST_NAME = new com.truecaller.editprofile.api.ui.AutoFocusOnField("LAST_NAME", 1);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField PHONE_NUMBER = new com.truecaller.editprofile.api.ui.AutoFocusOnField("PHONE_NUMBER", 2);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField SECONDARY_PHONE_NUMBER = new com.truecaller.editprofile.api.ui.AutoFocusOnField("SECONDARY_PHONE_NUMBER", 3);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField EMAIL = new com.truecaller.editprofile.api.ui.AutoFocusOnField("EMAIL", 4);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField BIRTH_DAY = new com.truecaller.editprofile.api.ui.AutoFocusOnField("BIRTH_DAY", 5);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField GENDER = new com.truecaller.editprofile.api.ui.AutoFocusOnField("GENDER", 6);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ADDRESS_STREET = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ADDRESS_STREET", 7);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ADDRESS_ZIP_CODE = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ADDRESS_ZIP_CODE", 8);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ADDRESS_CITY = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ADDRESS_CITY", 9);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ADDRESS_COUNTRY = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ADDRESS_COUNTRY", 10);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ABOUT_COMPANY = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ABOUT_COMPANY", 11);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ABOUT_JOB_TITLE = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ABOUT_JOB_TITLE", 12);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ABOUT_WEBSITE = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ABOUT_WEBSITE", 13);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField ABOUT_BIO = new com.truecaller.editprofile.api.ui.AutoFocusOnField("ABOUT_BIO", 14);
    public static final com.truecaller.editprofile.api.ui.AutoFocusOnField AVATAR = new com.truecaller.editprofile.api.ui.AutoFocusOnField("AVATAR", 15);

    private static final /* synthetic */ com.truecaller.editprofile.api.ui.AutoFocusOnField[] $values() {
        return new com.truecaller.editprofile.api.ui.AutoFocusOnField[]{FIRST_NAME, LAST_NAME, PHONE_NUMBER, SECONDARY_PHONE_NUMBER, EMAIL, BIRTH_DAY, GENDER, ADDRESS_STREET, ADDRESS_ZIP_CODE, ADDRESS_CITY, ADDRESS_COUNTRY, ABOUT_COMPANY, ABOUT_JOB_TITLE, ABOUT_WEBSITE, ABOUT_BIO, AVATAR};
    }

    static {
        com.truecaller.editprofile.api.ui.AutoFocusOnField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AutoFocusOnField(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.editprofile.api.ui.AutoFocusOnField valueOf(java.lang.String str) {
        return (com.truecaller.editprofile.api.ui.AutoFocusOnField) java.lang.Enum.valueOf(com.truecaller.editprofile.api.ui.AutoFocusOnField.class, str);
    }

    public static com.truecaller.editprofile.api.ui.AutoFocusOnField[] values() {
        return (com.truecaller.editprofile.api.ui.AutoFocusOnField[]) $VALUES.clone();
    }
}
