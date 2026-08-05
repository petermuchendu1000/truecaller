package com.truecaller.tcpermissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/tcpermissions/Role;", "", "<init>", "(Ljava/lang/String;I)V", "ROLE_DEFAULT_DIALER", "ROLE_CALL_SCREENING", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class Role {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.tcpermissions.Role[] $VALUES;
    public static final com.truecaller.tcpermissions.Role ROLE_DEFAULT_DIALER = new com.truecaller.tcpermissions.Role("ROLE_DEFAULT_DIALER", 0);
    public static final com.truecaller.tcpermissions.Role ROLE_CALL_SCREENING = new com.truecaller.tcpermissions.Role("ROLE_CALL_SCREENING", 1);

    private static final /* synthetic */ com.truecaller.tcpermissions.Role[] $values() {
        return new com.truecaller.tcpermissions.Role[]{ROLE_DEFAULT_DIALER, ROLE_CALL_SCREENING};
    }

    static {
        com.truecaller.tcpermissions.Role[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Role(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.tcpermissions.Role valueOf(java.lang.String str) {
        return (com.truecaller.tcpermissions.Role) java.lang.Enum.valueOf(com.truecaller.tcpermissions.Role.class, str);
    }

    public static com.truecaller.tcpermissions.Role[] values() {
        return (com.truecaller.tcpermissions.Role[]) $VALUES.clone();
    }
}
