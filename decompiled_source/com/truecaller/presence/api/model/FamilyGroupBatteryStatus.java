package com.truecaller.presence.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/presence/api/model/FamilyGroupBatteryStatus;", "", "<init>", "(Ljava/lang/String;I)V", "BATTERY_UNKNOWN", "BATTERY_LOW", "BATTERY_MEDIUM", "BATTERY_HIGH", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class FamilyGroupBatteryStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.presence.api.model.FamilyGroupBatteryStatus[] $VALUES;
    public static final com.truecaller.presence.api.model.FamilyGroupBatteryStatus BATTERY_UNKNOWN = new com.truecaller.presence.api.model.FamilyGroupBatteryStatus("BATTERY_UNKNOWN", 0);
    public static final com.truecaller.presence.api.model.FamilyGroupBatteryStatus BATTERY_LOW = new com.truecaller.presence.api.model.FamilyGroupBatteryStatus("BATTERY_LOW", 1);
    public static final com.truecaller.presence.api.model.FamilyGroupBatteryStatus BATTERY_MEDIUM = new com.truecaller.presence.api.model.FamilyGroupBatteryStatus("BATTERY_MEDIUM", 2);
    public static final com.truecaller.presence.api.model.FamilyGroupBatteryStatus BATTERY_HIGH = new com.truecaller.presence.api.model.FamilyGroupBatteryStatus("BATTERY_HIGH", 3);

    private static final /* synthetic */ com.truecaller.presence.api.model.FamilyGroupBatteryStatus[] $values() {
        return new com.truecaller.presence.api.model.FamilyGroupBatteryStatus[]{BATTERY_UNKNOWN, BATTERY_LOW, BATTERY_MEDIUM, BATTERY_HIGH};
    }

    static {
        com.truecaller.presence.api.model.FamilyGroupBatteryStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupBatteryStatus(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.presence.api.model.FamilyGroupBatteryStatus valueOf(java.lang.String str) {
        return (com.truecaller.presence.api.model.FamilyGroupBatteryStatus) java.lang.Enum.valueOf(com.truecaller.presence.api.model.FamilyGroupBatteryStatus.class, str);
    }

    public static com.truecaller.presence.api.model.FamilyGroupBatteryStatus[] values() {
        return (com.truecaller.presence.api.model.FamilyGroupBatteryStatus[]) $VALUES.clone();
    }
}
