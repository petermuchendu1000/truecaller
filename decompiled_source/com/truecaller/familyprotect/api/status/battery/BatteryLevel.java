package com.truecaller.familyprotect.api.status.battery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/familyprotect/api/status/battery/BatteryLevel;", "", "<init>", "(Ljava/lang/String;I)V", "BATTERY_UNKNOWN", "BATTERY_LOW", "BATTERY_MEDIUM", "BATTERY_HIGH", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BatteryLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.status.battery.BatteryLevel[] $VALUES;
    public static final com.truecaller.familyprotect.api.status.battery.BatteryLevel BATTERY_UNKNOWN = new com.truecaller.familyprotect.api.status.battery.BatteryLevel("BATTERY_UNKNOWN", 0);
    public static final com.truecaller.familyprotect.api.status.battery.BatteryLevel BATTERY_LOW = new com.truecaller.familyprotect.api.status.battery.BatteryLevel("BATTERY_LOW", 1);
    public static final com.truecaller.familyprotect.api.status.battery.BatteryLevel BATTERY_MEDIUM = new com.truecaller.familyprotect.api.status.battery.BatteryLevel("BATTERY_MEDIUM", 2);
    public static final com.truecaller.familyprotect.api.status.battery.BatteryLevel BATTERY_HIGH = new com.truecaller.familyprotect.api.status.battery.BatteryLevel("BATTERY_HIGH", 3);

    private static final /* synthetic */ com.truecaller.familyprotect.api.status.battery.BatteryLevel[] $values() {
        return new com.truecaller.familyprotect.api.status.battery.BatteryLevel[]{BATTERY_UNKNOWN, BATTERY_LOW, BATTERY_MEDIUM, BATTERY_HIGH};
    }

    static {
        com.truecaller.familyprotect.api.status.battery.BatteryLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BatteryLevel(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.status.battery.BatteryLevel valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.status.battery.BatteryLevel) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.status.battery.BatteryLevel.class, str);
    }

    public static com.truecaller.familyprotect.api.status.battery.BatteryLevel[] values() {
        return (com.truecaller.familyprotect.api.status.battery.BatteryLevel[]) $VALUES.clone();
    }
}
