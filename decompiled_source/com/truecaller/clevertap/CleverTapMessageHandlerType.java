package com.truecaller.clevertap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/clevertap/CleverTapMessageHandlerType;", "", "<init>", "(Ljava/lang/String;I)V", "FCM", com.truecaller.account.network.DeviceDto.MOBILE_SERVICE_HMS, "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CleverTapMessageHandlerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.clevertap.CleverTapMessageHandlerType[] $VALUES;
    public static final com.truecaller.clevertap.CleverTapMessageHandlerType FCM = new com.truecaller.clevertap.CleverTapMessageHandlerType("FCM", 0);
    public static final com.truecaller.clevertap.CleverTapMessageHandlerType HMS = new com.truecaller.clevertap.CleverTapMessageHandlerType(com.truecaller.account.network.DeviceDto.MOBILE_SERVICE_HMS, 1);

    private static final /* synthetic */ com.truecaller.clevertap.CleverTapMessageHandlerType[] $values() {
        return new com.truecaller.clevertap.CleverTapMessageHandlerType[]{FCM, HMS};
    }

    static {
        com.truecaller.clevertap.CleverTapMessageHandlerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CleverTapMessageHandlerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.clevertap.CleverTapMessageHandlerType valueOf(java.lang.String str) {
        return (com.truecaller.clevertap.CleverTapMessageHandlerType) java.lang.Enum.valueOf(com.truecaller.clevertap.CleverTapMessageHandlerType.class, str);
    }

    public static com.truecaller.clevertap.CleverTapMessageHandlerType[] values() {
        return (com.truecaller.clevertap.CleverTapMessageHandlerType[]) $VALUES.clone();
    }
}
