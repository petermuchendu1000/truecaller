package com.truecaller.familyprotect.api.status.availability;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/familyprotect/api/status/availability/AvailabilityType;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "ON_CALL", "BUSY", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AvailabilityType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.status.availability.AvailabilityType[] $VALUES;
    public static final com.truecaller.familyprotect.api.status.availability.AvailabilityType AVAILABLE = new com.truecaller.familyprotect.api.status.availability.AvailabilityType("AVAILABLE", 0);
    public static final com.truecaller.familyprotect.api.status.availability.AvailabilityType ON_CALL = new com.truecaller.familyprotect.api.status.availability.AvailabilityType("ON_CALL", 1);
    public static final com.truecaller.familyprotect.api.status.availability.AvailabilityType BUSY = new com.truecaller.familyprotect.api.status.availability.AvailabilityType("BUSY", 2);
    public static final com.truecaller.familyprotect.api.status.availability.AvailabilityType UNKNOWN = new com.truecaller.familyprotect.api.status.availability.AvailabilityType("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.familyprotect.api.status.availability.AvailabilityType[] $values() {
        return new com.truecaller.familyprotect.api.status.availability.AvailabilityType[]{AVAILABLE, ON_CALL, BUSY, UNKNOWN};
    }

    static {
        com.truecaller.familyprotect.api.status.availability.AvailabilityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AvailabilityType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.status.availability.AvailabilityType valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.status.availability.AvailabilityType) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.status.availability.AvailabilityType.class, str);
    }

    public static com.truecaller.familyprotect.api.status.availability.AvailabilityType[] values() {
        return (com.truecaller.familyprotect.api.status.availability.AvailabilityType[]) $VALUES.clone();
    }
}
