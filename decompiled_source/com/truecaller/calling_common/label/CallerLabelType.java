package com.truecaller.calling_common.label;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/calling_common/label/CallerLabelType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFIED_BUSINESS_WITH_SPAM", "SMALL_BUSINESS_WITH_SPAM", "VERIFIED_BUSINESS_BLOCKED_CONTACT", "SMALL_BUSINESS_BLOCKED_CONTACT", "BLOCKED", "SPAM", "GOVERNMENT_SERVICES", "GOLD", "PREMIUM", "PRIORITY_CALL", "VERIFIED_BUSINESS", "SMALL_BUSINESS", "PHONEBOOK_CONTACT", "IDENTIFIED_CONTACT", "UNKNOWN_CONTACT", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallerLabelType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.label.CallerLabelType[] $VALUES;
    public static final com.truecaller.calling_common.label.CallerLabelType VERIFIED_BUSINESS_WITH_SPAM = new com.truecaller.calling_common.label.CallerLabelType("VERIFIED_BUSINESS_WITH_SPAM", 0);
    public static final com.truecaller.calling_common.label.CallerLabelType SMALL_BUSINESS_WITH_SPAM = new com.truecaller.calling_common.label.CallerLabelType("SMALL_BUSINESS_WITH_SPAM", 1);
    public static final com.truecaller.calling_common.label.CallerLabelType VERIFIED_BUSINESS_BLOCKED_CONTACT = new com.truecaller.calling_common.label.CallerLabelType("VERIFIED_BUSINESS_BLOCKED_CONTACT", 2);
    public static final com.truecaller.calling_common.label.CallerLabelType SMALL_BUSINESS_BLOCKED_CONTACT = new com.truecaller.calling_common.label.CallerLabelType("SMALL_BUSINESS_BLOCKED_CONTACT", 3);
    public static final com.truecaller.calling_common.label.CallerLabelType BLOCKED = new com.truecaller.calling_common.label.CallerLabelType("BLOCKED", 4);
    public static final com.truecaller.calling_common.label.CallerLabelType SPAM = new com.truecaller.calling_common.label.CallerLabelType("SPAM", 5);
    public static final com.truecaller.calling_common.label.CallerLabelType GOVERNMENT_SERVICES = new com.truecaller.calling_common.label.CallerLabelType("GOVERNMENT_SERVICES", 6);
    public static final com.truecaller.calling_common.label.CallerLabelType GOLD = new com.truecaller.calling_common.label.CallerLabelType("GOLD", 7);
    public static final com.truecaller.calling_common.label.CallerLabelType PREMIUM = new com.truecaller.calling_common.label.CallerLabelType("PREMIUM", 8);
    public static final com.truecaller.calling_common.label.CallerLabelType PRIORITY_CALL = new com.truecaller.calling_common.label.CallerLabelType("PRIORITY_CALL", 9);
    public static final com.truecaller.calling_common.label.CallerLabelType VERIFIED_BUSINESS = new com.truecaller.calling_common.label.CallerLabelType("VERIFIED_BUSINESS", 10);
    public static final com.truecaller.calling_common.label.CallerLabelType SMALL_BUSINESS = new com.truecaller.calling_common.label.CallerLabelType("SMALL_BUSINESS", 11);
    public static final com.truecaller.calling_common.label.CallerLabelType PHONEBOOK_CONTACT = new com.truecaller.calling_common.label.CallerLabelType("PHONEBOOK_CONTACT", 12);
    public static final com.truecaller.calling_common.label.CallerLabelType IDENTIFIED_CONTACT = new com.truecaller.calling_common.label.CallerLabelType("IDENTIFIED_CONTACT", 13);
    public static final com.truecaller.calling_common.label.CallerLabelType UNKNOWN_CONTACT = new com.truecaller.calling_common.label.CallerLabelType("UNKNOWN_CONTACT", 14);

    private static final /* synthetic */ com.truecaller.calling_common.label.CallerLabelType[] $values() {
        return new com.truecaller.calling_common.label.CallerLabelType[]{VERIFIED_BUSINESS_WITH_SPAM, SMALL_BUSINESS_WITH_SPAM, VERIFIED_BUSINESS_BLOCKED_CONTACT, SMALL_BUSINESS_BLOCKED_CONTACT, BLOCKED, SPAM, GOVERNMENT_SERVICES, GOLD, PREMIUM, PRIORITY_CALL, VERIFIED_BUSINESS, SMALL_BUSINESS, PHONEBOOK_CONTACT, IDENTIFIED_CONTACT, UNKNOWN_CONTACT};
    }

    static {
        com.truecaller.calling_common.label.CallerLabelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallerLabelType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.label.CallerLabelType valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.label.CallerLabelType) java.lang.Enum.valueOf(com.truecaller.calling_common.label.CallerLabelType.class, str);
    }

    public static com.truecaller.calling_common.label.CallerLabelType[] values() {
        return (com.truecaller.calling_common.label.CallerLabelType[]) $VALUES.clone();
    }
}
