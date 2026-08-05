package com.truecaller.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/CallType;", "", "callType", "", "<init>", "(Ljava/lang/String;II)V", "getCallType", "()I", "BLOCKED", "SPAM", "GOVERNMENT_SERVICES", "SMALL_BUSINESS", "PHONEBOOK_CONTACT", "IDENTIFIED_CONTACT", "UNKNOWN_CONTACT", "UNRECOGNIZED", "VERIFIED_BUSINESS", "PRIORITY_CALL", "GOLD", "PREMIUM", "VERIFIED_BUSINESS_WITH_SPAM", "SMALL_BUSINESS_WITH_SPAM", "VERIFIED_BUSINESS_BLOCKED_CONTACT", "SMALL_BUSINESS_BLOCKED_CONTACT", "PRIORITY_CALL_BLOCKED_CONTACT", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.CallType[] $VALUES;
    private final int callType;
    public static final com.truecaller.ads.CallType BLOCKED = new com.truecaller.ads.CallType("BLOCKED", 0, 0);
    public static final com.truecaller.ads.CallType SPAM = new com.truecaller.ads.CallType("SPAM", 1, 1);
    public static final com.truecaller.ads.CallType GOVERNMENT_SERVICES = new com.truecaller.ads.CallType("GOVERNMENT_SERVICES", 2, 3);
    public static final com.truecaller.ads.CallType SMALL_BUSINESS = new com.truecaller.ads.CallType("SMALL_BUSINESS", 3, 4);
    public static final com.truecaller.ads.CallType PHONEBOOK_CONTACT = new com.truecaller.ads.CallType("PHONEBOOK_CONTACT", 4, 5);
    public static final com.truecaller.ads.CallType IDENTIFIED_CONTACT = new com.truecaller.ads.CallType("IDENTIFIED_CONTACT", 5, 6);
    public static final com.truecaller.ads.CallType UNKNOWN_CONTACT = new com.truecaller.ads.CallType("UNKNOWN_CONTACT", 6, 7);
    public static final com.truecaller.ads.CallType UNRECOGNIZED = new com.truecaller.ads.CallType("UNRECOGNIZED", 7, -1);
    public static final com.truecaller.ads.CallType VERIFIED_BUSINESS = new com.truecaller.ads.CallType("VERIFIED_BUSINESS", 8, 8);
    public static final com.truecaller.ads.CallType PRIORITY_CALL = new com.truecaller.ads.CallType("PRIORITY_CALL", 9, 9);
    public static final com.truecaller.ads.CallType GOLD = new com.truecaller.ads.CallType("GOLD", 10, 10);
    public static final com.truecaller.ads.CallType PREMIUM = new com.truecaller.ads.CallType("PREMIUM", 11, 11);
    public static final com.truecaller.ads.CallType VERIFIED_BUSINESS_WITH_SPAM = new com.truecaller.ads.CallType("VERIFIED_BUSINESS_WITH_SPAM", 12, 12);
    public static final com.truecaller.ads.CallType SMALL_BUSINESS_WITH_SPAM = new com.truecaller.ads.CallType("SMALL_BUSINESS_WITH_SPAM", 13, 13);
    public static final com.truecaller.ads.CallType VERIFIED_BUSINESS_BLOCKED_CONTACT = new com.truecaller.ads.CallType("VERIFIED_BUSINESS_BLOCKED_CONTACT", 14, 14);
    public static final com.truecaller.ads.CallType SMALL_BUSINESS_BLOCKED_CONTACT = new com.truecaller.ads.CallType("SMALL_BUSINESS_BLOCKED_CONTACT", 15, 15);
    public static final com.truecaller.ads.CallType PRIORITY_CALL_BLOCKED_CONTACT = new com.truecaller.ads.CallType("PRIORITY_CALL_BLOCKED_CONTACT", 16, 16);

    private static final /* synthetic */ com.truecaller.ads.CallType[] $values() {
        return new com.truecaller.ads.CallType[]{BLOCKED, SPAM, GOVERNMENT_SERVICES, SMALL_BUSINESS, PHONEBOOK_CONTACT, IDENTIFIED_CONTACT, UNKNOWN_CONTACT, UNRECOGNIZED, VERIFIED_BUSINESS, PRIORITY_CALL, GOLD, PREMIUM, VERIFIED_BUSINESS_WITH_SPAM, SMALL_BUSINESS_WITH_SPAM, VERIFIED_BUSINESS_BLOCKED_CONTACT, SMALL_BUSINESS_BLOCKED_CONTACT, PRIORITY_CALL_BLOCKED_CONTACT};
    }

    static {
        com.truecaller.ads.CallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallType(java.lang.String str, int i, int i2) {
        this.callType = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.CallType valueOf(java.lang.String str) {
        return (com.truecaller.ads.CallType) java.lang.Enum.valueOf(com.truecaller.ads.CallType.class, str);
    }

    public static com.truecaller.ads.CallType[] values() {
        return (com.truecaller.ads.CallType[]) $VALUES.clone();
    }

    public final int getCallType() {
        return this.callType;
    }
}
