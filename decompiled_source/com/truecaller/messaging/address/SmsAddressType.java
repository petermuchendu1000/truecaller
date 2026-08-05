package com.truecaller.messaging.address;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/messaging/address/SmsAddressType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTIONAL", "PROMOTIONAL", "SERVICE", "GOVERNMENT", "UNDEFINED", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmsAddressType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.address.SmsAddressType[] $VALUES;
    public static final com.truecaller.messaging.address.SmsAddressType TRANSACTIONAL = new com.truecaller.messaging.address.SmsAddressType("TRANSACTIONAL", 0);
    public static final com.truecaller.messaging.address.SmsAddressType PROMOTIONAL = new com.truecaller.messaging.address.SmsAddressType("PROMOTIONAL", 1);
    public static final com.truecaller.messaging.address.SmsAddressType SERVICE = new com.truecaller.messaging.address.SmsAddressType("SERVICE", 2);
    public static final com.truecaller.messaging.address.SmsAddressType GOVERNMENT = new com.truecaller.messaging.address.SmsAddressType("GOVERNMENT", 3);
    public static final com.truecaller.messaging.address.SmsAddressType UNDEFINED = new com.truecaller.messaging.address.SmsAddressType("UNDEFINED", 4);

    private static final /* synthetic */ com.truecaller.messaging.address.SmsAddressType[] $values() {
        return new com.truecaller.messaging.address.SmsAddressType[]{TRANSACTIONAL, PROMOTIONAL, SERVICE, GOVERNMENT, UNDEFINED};
    }

    static {
        com.truecaller.messaging.address.SmsAddressType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SmsAddressType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.address.SmsAddressType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.address.SmsAddressType) java.lang.Enum.valueOf(com.truecaller.messaging.address.SmsAddressType.class, str);
    }

    public static com.truecaller.messaging.address.SmsAddressType[] values() {
        return (com.truecaller.messaging.address.SmsAddressType[]) $VALUES.clone();
    }
}
