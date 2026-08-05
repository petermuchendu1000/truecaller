package com.truecaller.wearable.support.helper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/wearable/support/helper/WearableCallerType;", "", "<init>", "(Ljava/lang/String;I)V", "NotIdentified", "Unknown", "Phonebook", "Premium", "Gold", "SmallBusiness", "VerifiedBusiness", "GovernmentServices", "Priority", "support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WearableCallerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wearable.support.helper.WearableCallerType[] $VALUES;
    public static final com.truecaller.wearable.support.helper.WearableCallerType NotIdentified = new com.truecaller.wearable.support.helper.WearableCallerType("NotIdentified", 0);
    public static final com.truecaller.wearable.support.helper.WearableCallerType Unknown = new com.truecaller.wearable.support.helper.WearableCallerType("Unknown", 1);
    public static final com.truecaller.wearable.support.helper.WearableCallerType Phonebook = new com.truecaller.wearable.support.helper.WearableCallerType("Phonebook", 2);
    public static final com.truecaller.wearable.support.helper.WearableCallerType Premium = new com.truecaller.wearable.support.helper.WearableCallerType("Premium", 3);
    public static final com.truecaller.wearable.support.helper.WearableCallerType Gold = new com.truecaller.wearable.support.helper.WearableCallerType("Gold", 4);
    public static final com.truecaller.wearable.support.helper.WearableCallerType SmallBusiness = new com.truecaller.wearable.support.helper.WearableCallerType("SmallBusiness", 5);
    public static final com.truecaller.wearable.support.helper.WearableCallerType VerifiedBusiness = new com.truecaller.wearable.support.helper.WearableCallerType("VerifiedBusiness", 6);
    public static final com.truecaller.wearable.support.helper.WearableCallerType GovernmentServices = new com.truecaller.wearable.support.helper.WearableCallerType("GovernmentServices", 7);
    public static final com.truecaller.wearable.support.helper.WearableCallerType Priority = new com.truecaller.wearable.support.helper.WearableCallerType("Priority", 8);

    private static final /* synthetic */ com.truecaller.wearable.support.helper.WearableCallerType[] $values() {
        return new com.truecaller.wearable.support.helper.WearableCallerType[]{NotIdentified, Unknown, Phonebook, Premium, Gold, SmallBusiness, VerifiedBusiness, GovernmentServices, Priority};
    }

    static {
        com.truecaller.wearable.support.helper.WearableCallerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WearableCallerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wearable.support.helper.WearableCallerType valueOf(java.lang.String str) {
        return (com.truecaller.wearable.support.helper.WearableCallerType) java.lang.Enum.valueOf(com.truecaller.wearable.support.helper.WearableCallerType.class, str);
    }

    public static com.truecaller.wearable.support.helper.WearableCallerType[] values() {
        return (com.truecaller.wearable.support.helper.WearableCallerType[]) $VALUES.clone();
    }
}
