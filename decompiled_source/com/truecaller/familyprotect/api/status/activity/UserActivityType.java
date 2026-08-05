package com.truecaller.familyprotect.api.status.activity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/familyprotect/api/status/activity/UserActivityType;", "", "<init>", "(Ljava/lang/String;I)V", "IN_VEHICLE", "ON_BICYCLE", "RUNNING", "WALKING", "STILL", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UserActivityType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.status.activity.UserActivityType[] $VALUES;
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType IN_VEHICLE = new com.truecaller.familyprotect.api.status.activity.UserActivityType("IN_VEHICLE", 0);
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType ON_BICYCLE = new com.truecaller.familyprotect.api.status.activity.UserActivityType("ON_BICYCLE", 1);
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType RUNNING = new com.truecaller.familyprotect.api.status.activity.UserActivityType("RUNNING", 2);
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType WALKING = new com.truecaller.familyprotect.api.status.activity.UserActivityType("WALKING", 3);
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType STILL = new com.truecaller.familyprotect.api.status.activity.UserActivityType("STILL", 4);
    public static final com.truecaller.familyprotect.api.status.activity.UserActivityType UNKNOWN = new com.truecaller.familyprotect.api.status.activity.UserActivityType("UNKNOWN", 5);

    private static final /* synthetic */ com.truecaller.familyprotect.api.status.activity.UserActivityType[] $values() {
        return new com.truecaller.familyprotect.api.status.activity.UserActivityType[]{IN_VEHICLE, ON_BICYCLE, RUNNING, WALKING, STILL, UNKNOWN};
    }

    static {
        com.truecaller.familyprotect.api.status.activity.UserActivityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UserActivityType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.status.activity.UserActivityType valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.status.activity.UserActivityType) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.status.activity.UserActivityType.class, str);
    }

    public static com.truecaller.familyprotect.api.status.activity.UserActivityType[] values() {
        return (com.truecaller.familyprotect.api.status.activity.UserActivityType[]) $VALUES.clone();
    }
}
