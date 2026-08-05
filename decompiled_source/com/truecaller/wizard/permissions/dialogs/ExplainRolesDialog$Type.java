package com.truecaller.wizard.permissions.dialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/wizard/permissions/dialogs/ExplainRolesDialog$Type", "", "Lcom/truecaller/wizard/permissions/dialogs/ExplainRolesDialog$Type;", "<init>", "(Ljava/lang/String;I)V", "ROLE_DIALER_CALLER_ID", "ROLE_DIALER", "ROLE_CALLER_ID", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ExplainRolesDialog$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[] $VALUES;
    public static final com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type ROLE_DIALER_CALLER_ID = new com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type("ROLE_DIALER_CALLER_ID", 0);
    public static final com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type ROLE_DIALER = new com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type("ROLE_DIALER", 1);
    public static final com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type ROLE_CALLER_ID = new com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type("ROLE_CALLER_ID", 2);

    private static final /* synthetic */ com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[] $values() {
        return new com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[]{ROLE_DIALER_CALLER_ID, ROLE_DIALER, ROLE_CALLER_ID};
    }

    static {
        com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ExplainRolesDialog$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type valueOf(java.lang.String str) {
        return (com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type) java.lang.Enum.valueOf(com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type.class, str);
    }

    public static com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[] values() {
        return (com.truecaller.wizard.permissions.dialogs.ExplainRolesDialog$Type[]) $VALUES.clone();
    }
}
