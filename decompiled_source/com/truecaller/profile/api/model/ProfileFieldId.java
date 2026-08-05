package com.truecaller.profile.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/truecaller/profile/api/model/ProfileFieldId;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "VERIFIED_NAME", "FIRST_NAME", "LAST_NAME", "EMAIL", "PRIMARY_PHONE_NUMBER", "SECONDARY_PHONE_NUMBER", "BIRTHDAY", "GENDER", "ADDRESS_ZIP_CODE", "ADDRESS_STREET", "ADDRESS_CITY", "ADDRESS_COUNTRY", "JOB_TITLE", "COMPANY_NAME", "AVATAR", "ABOUT", "WEBSITE", "GOOGLE_ID_TOKEN", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProfileFieldId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.profile.api.model.ProfileFieldId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.profile.api.model.ProfileFieldId VERIFIED_NAME = new com.truecaller.profile.api.model.ProfileFieldId("VERIFIED_NAME", 0, "verifiedName");
    public static final com.truecaller.profile.api.model.ProfileFieldId FIRST_NAME = new com.truecaller.profile.api.model.ProfileFieldId("FIRST_NAME", 1, "firstName");
    public static final com.truecaller.profile.api.model.ProfileFieldId LAST_NAME = new com.truecaller.profile.api.model.ProfileFieldId("LAST_NAME", 2, "lastName");
    public static final com.truecaller.profile.api.model.ProfileFieldId EMAIL = new com.truecaller.profile.api.model.ProfileFieldId("EMAIL", 3, "personalData.onlineIds.email");
    public static final com.truecaller.profile.api.model.ProfileFieldId PRIMARY_PHONE_NUMBER = new com.truecaller.profile.api.model.ProfileFieldId("PRIMARY_PHONE_NUMBER", 4, "primaryPhoneNumber");
    public static final com.truecaller.profile.api.model.ProfileFieldId SECONDARY_PHONE_NUMBER = new com.truecaller.profile.api.model.ProfileFieldId("SECONDARY_PHONE_NUMBER", 5, "secondaryPhoneNumber");
    public static final com.truecaller.profile.api.model.ProfileFieldId BIRTHDAY = new com.truecaller.profile.api.model.ProfileFieldId("BIRTHDAY", 6, "personalData.birthday");
    public static final com.truecaller.profile.api.model.ProfileFieldId GENDER = new com.truecaller.profile.api.model.ProfileFieldId("GENDER", 7, "personalData.gender");
    public static final com.truecaller.profile.api.model.ProfileFieldId ADDRESS_ZIP_CODE = new com.truecaller.profile.api.model.ProfileFieldId("ADDRESS_ZIP_CODE", 8, "zipCode");
    public static final com.truecaller.profile.api.model.ProfileFieldId ADDRESS_STREET = new com.truecaller.profile.api.model.ProfileFieldId("ADDRESS_STREET", 9, "street");
    public static final com.truecaller.profile.api.model.ProfileFieldId ADDRESS_CITY = new com.truecaller.profile.api.model.ProfileFieldId("ADDRESS_CITY", 10, "city");
    public static final com.truecaller.profile.api.model.ProfileFieldId ADDRESS_COUNTRY = new com.truecaller.profile.api.model.ProfileFieldId("ADDRESS_COUNTRY", 11, "country");
    public static final com.truecaller.profile.api.model.ProfileFieldId JOB_TITLE = new com.truecaller.profile.api.model.ProfileFieldId("JOB_TITLE", 12, "jobTitle");
    public static final com.truecaller.profile.api.model.ProfileFieldId COMPANY_NAME = new com.truecaller.profile.api.model.ProfileFieldId("COMPANY_NAME", 13, "companyName");
    public static final com.truecaller.profile.api.model.ProfileFieldId AVATAR = new com.truecaller.profile.api.model.ProfileFieldId("AVATAR", 14, "avatar");
    public static final com.truecaller.profile.api.model.ProfileFieldId ABOUT = new com.truecaller.profile.api.model.ProfileFieldId("ABOUT", 15, "about");
    public static final com.truecaller.profile.api.model.ProfileFieldId WEBSITE = new com.truecaller.profile.api.model.ProfileFieldId("WEBSITE", 16, "personalData.onlineIds.url");
    public static final com.truecaller.profile.api.model.ProfileFieldId GOOGLE_ID_TOKEN = new com.truecaller.profile.api.model.ProfileFieldId("GOOGLE_ID_TOKEN", 17, "GOOGLE_ID_TOKEN");

    private static final /* synthetic */ com.truecaller.profile.api.model.ProfileFieldId[] $values() {
        return new com.truecaller.profile.api.model.ProfileFieldId[]{VERIFIED_NAME, FIRST_NAME, LAST_NAME, EMAIL, PRIMARY_PHONE_NUMBER, SECONDARY_PHONE_NUMBER, BIRTHDAY, GENDER, ADDRESS_ZIP_CODE, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_COUNTRY, JOB_TITLE, COMPANY_NAME, AVATAR, ABOUT, WEBSITE, GOOGLE_ID_TOKEN};
    }

    static {
        com.truecaller.profile.api.model.ProfileFieldId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ProfileFieldId(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.profile.api.model.ProfileFieldId valueOf(java.lang.String str) {
        return (com.truecaller.profile.api.model.ProfileFieldId) java.lang.Enum.valueOf(com.truecaller.profile.api.model.ProfileFieldId.class, str);
    }

    public static com.truecaller.profile.api.model.ProfileFieldId[] values() {
        return (com.truecaller.profile.api.model.ProfileFieldId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
