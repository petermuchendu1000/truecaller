package com.truecaller.presence.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/presence/api/PresenceManager$AvailabilityStatus$AvailabilityType", "", "Lcom/truecaller/presence/api/PresenceManager$AvailabilityStatus$AvailabilityType;", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "ON_CALL", "SILENT", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PresenceManager$AvailabilityStatus$AvailabilityType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[] $VALUES;
    public static final com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType AVAILABLE = new com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType("AVAILABLE", 0);
    public static final com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType ON_CALL = new com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType("ON_CALL", 1);
    public static final com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType SILENT = new com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType("SILENT", 2);
    public static final com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType UNKNOWN = new com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[] $values() {
        return new com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[]{AVAILABLE, ON_CALL, SILENT, UNKNOWN};
    }

    static {
        com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PresenceManager$AvailabilityStatus$AvailabilityType(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType valueOf(java.lang.String str) {
        return (com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType) java.lang.Enum.valueOf(com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType.class, str);
    }

    public static com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[] values() {
        return (com.truecaller.presence.api.PresenceManager$AvailabilityStatus$AvailabilityType[]) $VALUES.clone();
    }
}
