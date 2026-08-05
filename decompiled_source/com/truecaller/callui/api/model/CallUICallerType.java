package com.truecaller.callui.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/callui/api/model/CallUICallerType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFIED_BUSINESS_WITH_SPAM", "SMALL_BUSINESS_WITH_SPAM", "VERIFIED_BUSINESS_BLOCKED_CONTACT", "SMALL_BUSINESS_BLOCKED_CONTACT", "PRIORITY_CALL_BLOCKED_CONTACT", "BLOCKED", "SPAM", "FRAUD", "GOVERNMENT", "GOLD", "PREMIUM", "PRIORITY_CALL", "VERIFIED_BUSINESS", "SMALL_BUSINESS", "PHONEBOOK_CONTACT", "IDENTIFIED_CONTACT", "UNKNOWN_CONTACT", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUICallerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.model.CallUICallerType[] $VALUES;
    public static final com.truecaller.callui.api.model.CallUICallerType VERIFIED_BUSINESS_WITH_SPAM = new com.truecaller.callui.api.model.CallUICallerType("VERIFIED_BUSINESS_WITH_SPAM", 0);
    public static final com.truecaller.callui.api.model.CallUICallerType SMALL_BUSINESS_WITH_SPAM = new com.truecaller.callui.api.model.CallUICallerType("SMALL_BUSINESS_WITH_SPAM", 1);
    public static final com.truecaller.callui.api.model.CallUICallerType VERIFIED_BUSINESS_BLOCKED_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("VERIFIED_BUSINESS_BLOCKED_CONTACT", 2);
    public static final com.truecaller.callui.api.model.CallUICallerType SMALL_BUSINESS_BLOCKED_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("SMALL_BUSINESS_BLOCKED_CONTACT", 3);
    public static final com.truecaller.callui.api.model.CallUICallerType PRIORITY_CALL_BLOCKED_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("PRIORITY_CALL_BLOCKED_CONTACT", 4);
    public static final com.truecaller.callui.api.model.CallUICallerType BLOCKED = new com.truecaller.callui.api.model.CallUICallerType("BLOCKED", 5);
    public static final com.truecaller.callui.api.model.CallUICallerType SPAM = new com.truecaller.callui.api.model.CallUICallerType("SPAM", 6);
    public static final com.truecaller.callui.api.model.CallUICallerType FRAUD = new com.truecaller.callui.api.model.CallUICallerType("FRAUD", 7);
    public static final com.truecaller.callui.api.model.CallUICallerType GOVERNMENT = new com.truecaller.callui.api.model.CallUICallerType("GOVERNMENT", 8);
    public static final com.truecaller.callui.api.model.CallUICallerType GOLD = new com.truecaller.callui.api.model.CallUICallerType("GOLD", 9);
    public static final com.truecaller.callui.api.model.CallUICallerType PREMIUM = new com.truecaller.callui.api.model.CallUICallerType("PREMIUM", 10);
    public static final com.truecaller.callui.api.model.CallUICallerType PRIORITY_CALL = new com.truecaller.callui.api.model.CallUICallerType("PRIORITY_CALL", 11);
    public static final com.truecaller.callui.api.model.CallUICallerType VERIFIED_BUSINESS = new com.truecaller.callui.api.model.CallUICallerType("VERIFIED_BUSINESS", 12);
    public static final com.truecaller.callui.api.model.CallUICallerType SMALL_BUSINESS = new com.truecaller.callui.api.model.CallUICallerType("SMALL_BUSINESS", 13);
    public static final com.truecaller.callui.api.model.CallUICallerType PHONEBOOK_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("PHONEBOOK_CONTACT", 14);
    public static final com.truecaller.callui.api.model.CallUICallerType IDENTIFIED_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("IDENTIFIED_CONTACT", 15);
    public static final com.truecaller.callui.api.model.CallUICallerType UNKNOWN_CONTACT = new com.truecaller.callui.api.model.CallUICallerType("UNKNOWN_CONTACT", 16);

    private static final /* synthetic */ com.truecaller.callui.api.model.CallUICallerType[] $values() {
        return new com.truecaller.callui.api.model.CallUICallerType[]{VERIFIED_BUSINESS_WITH_SPAM, SMALL_BUSINESS_WITH_SPAM, VERIFIED_BUSINESS_BLOCKED_CONTACT, SMALL_BUSINESS_BLOCKED_CONTACT, PRIORITY_CALL_BLOCKED_CONTACT, BLOCKED, SPAM, FRAUD, GOVERNMENT, GOLD, PREMIUM, PRIORITY_CALL, VERIFIED_BUSINESS, SMALL_BUSINESS, PHONEBOOK_CONTACT, IDENTIFIED_CONTACT, UNKNOWN_CONTACT};
    }

    static {
        com.truecaller.callui.api.model.CallUICallerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUICallerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.model.CallUICallerType valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.model.CallUICallerType) java.lang.Enum.valueOf(com.truecaller.callui.api.model.CallUICallerType.class, str);
    }

    public static com.truecaller.callui.api.model.CallUICallerType[] values() {
        return (com.truecaller.callui.api.model.CallUICallerType[]) $VALUES.clone();
    }
}
