package com.truecaller.premium.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/truecaller/premium/util/PremiumContactFieldsHelperImpl$ContactDataType", "", "Lcom/truecaller/premium/util/PremiumContactFieldsHelperImpl$ContactDataType;", "<init>", "(Ljava/lang/String;I)V", "EMAIL", "ADDRESS", "JOB", "WEBSITE", "SOCIAL", "SOCIAL_TWITTER", "SOCIAL_FACEBOOK", "ABOUT", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumContactFieldsHelperImpl$ContactDataType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[] $VALUES;
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType EMAIL = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("EMAIL", 0);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType ADDRESS = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("ADDRESS", 1);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType JOB = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("JOB", 2);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType WEBSITE = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("WEBSITE", 3);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType SOCIAL = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("SOCIAL", 4);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType SOCIAL_TWITTER = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("SOCIAL_TWITTER", 5);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType SOCIAL_FACEBOOK = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("SOCIAL_FACEBOOK", 6);
    public static final com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType ABOUT = new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType("ABOUT", 7);

    private static final /* synthetic */ com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[] $values() {
        return new com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[]{EMAIL, ADDRESS, JOB, WEBSITE, SOCIAL, SOCIAL_TWITTER, SOCIAL_FACEBOOK, ABOUT};
    }

    static {
        com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PremiumContactFieldsHelperImpl$ContactDataType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType valueOf(java.lang.String str) {
        return (com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType) java.lang.Enum.valueOf(com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType.class, str);
    }

    public static com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[] values() {
        return (com.truecaller.premium.util.PremiumContactFieldsHelperImpl$ContactDataType[]) $VALUES.clone();
    }
}
