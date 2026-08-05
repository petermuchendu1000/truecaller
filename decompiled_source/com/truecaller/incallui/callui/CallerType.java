package com.truecaller.incallui.callui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/incallui/callui/CallerType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFIED_BUSINESS_WITH_SPAM", "SMALL_BUSINESS_WITH_SPAM", "VERIFIED_BUSINESS_BLOCKED_CONTACT", "SMALL_BUSINESS_BLOCKED_CONTACT", "PRIORITY_CALL_BLOCKED_CONTACT", "BLOCKED", "SPAM", "FRAUD", "GOVERNMENT_SERVICES", "GOLD", "PREMIUM", "PRIORITY_CALL", "VERIFIED_BUSINESS", "SMALL_BUSINESS", "PHONEBOOK_CONTACT", "IDENTIFIED_CONTACT", "UNKNOWN_CONTACT", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.callui.CallerType[] $VALUES;
    public static final com.truecaller.incallui.callui.CallerType VERIFIED_BUSINESS_WITH_SPAM = new com.truecaller.incallui.callui.CallerType("VERIFIED_BUSINESS_WITH_SPAM", 0);
    public static final com.truecaller.incallui.callui.CallerType SMALL_BUSINESS_WITH_SPAM = new com.truecaller.incallui.callui.CallerType("SMALL_BUSINESS_WITH_SPAM", 1);
    public static final com.truecaller.incallui.callui.CallerType VERIFIED_BUSINESS_BLOCKED_CONTACT = new com.truecaller.incallui.callui.CallerType("VERIFIED_BUSINESS_BLOCKED_CONTACT", 2);
    public static final com.truecaller.incallui.callui.CallerType SMALL_BUSINESS_BLOCKED_CONTACT = new com.truecaller.incallui.callui.CallerType("SMALL_BUSINESS_BLOCKED_CONTACT", 3);
    public static final com.truecaller.incallui.callui.CallerType PRIORITY_CALL_BLOCKED_CONTACT = new com.truecaller.incallui.callui.CallerType("PRIORITY_CALL_BLOCKED_CONTACT", 4);
    public static final com.truecaller.incallui.callui.CallerType BLOCKED = new com.truecaller.incallui.callui.CallerType("BLOCKED", 5);
    public static final com.truecaller.incallui.callui.CallerType SPAM = new com.truecaller.incallui.callui.CallerType("SPAM", 6);
    public static final com.truecaller.incallui.callui.CallerType FRAUD = new com.truecaller.incallui.callui.CallerType("FRAUD", 7);
    public static final com.truecaller.incallui.callui.CallerType GOVERNMENT_SERVICES = new com.truecaller.incallui.callui.CallerType("GOVERNMENT_SERVICES", 8);
    public static final com.truecaller.incallui.callui.CallerType GOLD = new com.truecaller.incallui.callui.CallerType("GOLD", 9);
    public static final com.truecaller.incallui.callui.CallerType PREMIUM = new com.truecaller.incallui.callui.CallerType("PREMIUM", 10);
    public static final com.truecaller.incallui.callui.CallerType PRIORITY_CALL = new com.truecaller.incallui.callui.CallerType("PRIORITY_CALL", 11);
    public static final com.truecaller.incallui.callui.CallerType VERIFIED_BUSINESS = new com.truecaller.incallui.callui.CallerType("VERIFIED_BUSINESS", 12);
    public static final com.truecaller.incallui.callui.CallerType SMALL_BUSINESS = new com.truecaller.incallui.callui.CallerType("SMALL_BUSINESS", 13);
    public static final com.truecaller.incallui.callui.CallerType PHONEBOOK_CONTACT = new com.truecaller.incallui.callui.CallerType("PHONEBOOK_CONTACT", 14);
    public static final com.truecaller.incallui.callui.CallerType IDENTIFIED_CONTACT = new com.truecaller.incallui.callui.CallerType("IDENTIFIED_CONTACT", 15);
    public static final com.truecaller.incallui.callui.CallerType UNKNOWN_CONTACT = new com.truecaller.incallui.callui.CallerType("UNKNOWN_CONTACT", 16);

    private static final /* synthetic */ com.truecaller.incallui.callui.CallerType[] $values() {
        return new com.truecaller.incallui.callui.CallerType[]{VERIFIED_BUSINESS_WITH_SPAM, SMALL_BUSINESS_WITH_SPAM, VERIFIED_BUSINESS_BLOCKED_CONTACT, SMALL_BUSINESS_BLOCKED_CONTACT, PRIORITY_CALL_BLOCKED_CONTACT, BLOCKED, SPAM, FRAUD, GOVERNMENT_SERVICES, GOLD, PREMIUM, PRIORITY_CALL, VERIFIED_BUSINESS, SMALL_BUSINESS, PHONEBOOK_CONTACT, IDENTIFIED_CONTACT, UNKNOWN_CONTACT};
    }

    static {
        com.truecaller.incallui.callui.CallerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.callui.CallerType valueOf(java.lang.String str) {
        return (com.truecaller.incallui.callui.CallerType) java.lang.Enum.valueOf(com.truecaller.incallui.callui.CallerType.class, str);
    }

    public static com.truecaller.incallui.callui.CallerType[] values() {
        return (com.truecaller.incallui.callui.CallerType[]) $VALUES.clone();
    }
}
