package com.truecaller.presence.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/presence/api/model/FamilyGroupActivityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IN_VEHICLE", "ON_BICYCLE", "RUNNING", "WALKING", "STILL", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class FamilyGroupActivityStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.presence.api.model.FamilyGroupActivityStatus[] $VALUES;
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus IN_VEHICLE = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("IN_VEHICLE", 0);
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus ON_BICYCLE = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("ON_BICYCLE", 1);
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus RUNNING = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("RUNNING", 2);
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus WALKING = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("WALKING", 3);
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus STILL = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("STILL", 4);
    public static final com.truecaller.presence.api.model.FamilyGroupActivityStatus UNKNOWN = new com.truecaller.presence.api.model.FamilyGroupActivityStatus("UNKNOWN", 5);

    private static final /* synthetic */ com.truecaller.presence.api.model.FamilyGroupActivityStatus[] $values() {
        return new com.truecaller.presence.api.model.FamilyGroupActivityStatus[]{IN_VEHICLE, ON_BICYCLE, RUNNING, WALKING, STILL, UNKNOWN};
    }

    static {
        com.truecaller.presence.api.model.FamilyGroupActivityStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupActivityStatus(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.presence.api.model.FamilyGroupActivityStatus valueOf(java.lang.String str) {
        return (com.truecaller.presence.api.model.FamilyGroupActivityStatus) java.lang.Enum.valueOf(com.truecaller.presence.api.model.FamilyGroupActivityStatus.class, str);
    }

    public static com.truecaller.presence.api.model.FamilyGroupActivityStatus[] values() {
        return (com.truecaller.presence.api.model.FamilyGroupActivityStatus[]) $VALUES.clone();
    }
}
