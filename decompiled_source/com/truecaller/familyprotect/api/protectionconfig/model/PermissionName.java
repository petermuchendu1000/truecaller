package com.truecaller.familyprotect.api.protectionconfig.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/model/PermissionName;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVITY", "AVAILABILITY", "BATTERY_OPTIMIZATION", "CALLER_ID_ROLE", "DRAW_OVER_OTHER_APPS", "NOTIFICATIONS_ENABLED", "UNRECOGNIZED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PermissionName {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[] $VALUES;
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName ACTIVITY = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("ACTIVITY", 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName AVAILABILITY = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("AVAILABILITY", 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName BATTERY_OPTIMIZATION = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("BATTERY_OPTIMIZATION", 2);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName CALLER_ID_ROLE = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("CALLER_ID_ROLE", 3);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName DRAW_OVER_OTHER_APPS = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("DRAW_OVER_OTHER_APPS", 4);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName NOTIFICATIONS_ENABLED = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("NOTIFICATIONS_ENABLED", 5);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.PermissionName UNRECOGNIZED = new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName("UNRECOGNIZED", 6);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[]{ACTIVITY, AVAILABILITY, BATTERY_OPTIMIZATION, CALLER_ID_ROLE, DRAW_OVER_OTHER_APPS, NOTIFICATIONS_ENABLED, UNRECOGNIZED};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PermissionName(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.PermissionName valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.model.PermissionName) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.model.PermissionName.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.model.PermissionName[]) $VALUES.clone();
    }
}
