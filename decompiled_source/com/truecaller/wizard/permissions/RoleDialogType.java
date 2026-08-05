package com.truecaller.wizard.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/wizard/permissions/RoleDialogType;", "", "<init>", "(Ljava/lang/String;I)V", "Disclaim", "Confirm", "Settings", "OptionalSettings", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RoleDialogType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.permissions.RoleDialogType[] $VALUES;
    public static final com.truecaller.wizard.permissions.RoleDialogType Disclaim = new com.truecaller.wizard.permissions.RoleDialogType("Disclaim", 0);
    public static final com.truecaller.wizard.permissions.RoleDialogType Confirm = new com.truecaller.wizard.permissions.RoleDialogType("Confirm", 1);
    public static final com.truecaller.wizard.permissions.RoleDialogType Settings = new com.truecaller.wizard.permissions.RoleDialogType("Settings", 2);
    public static final com.truecaller.wizard.permissions.RoleDialogType OptionalSettings = new com.truecaller.wizard.permissions.RoleDialogType("OptionalSettings", 3);

    private static final /* synthetic */ com.truecaller.wizard.permissions.RoleDialogType[] $values() {
        return new com.truecaller.wizard.permissions.RoleDialogType[]{Disclaim, Confirm, Settings, OptionalSettings};
    }

    static {
        com.truecaller.wizard.permissions.RoleDialogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RoleDialogType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.permissions.RoleDialogType valueOf(java.lang.String str) {
        return (com.truecaller.wizard.permissions.RoleDialogType) java.lang.Enum.valueOf(com.truecaller.wizard.permissions.RoleDialogType.class, str);
    }

    public static com.truecaller.wizard.permissions.RoleDialogType[] values() {
        return (com.truecaller.wizard.permissions.RoleDialogType[]) $VALUES.clone();
    }
}
