package com.truecaller.remoteconfig.truecaller;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/remoteconfig/truecaller/UpgradeStatus$UpgradePath", "", "Lcom/truecaller/remoteconfig/truecaller/UpgradeStatus$UpgradePath;", "<init>", "(Ljava/lang/String;I)V", "NO_UPGRADE", "OPTIONAL", "MANDATORY", "RETIRED_VERSION", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UpgradeStatus$UpgradePath {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[] $VALUES;
    public static final com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath NO_UPGRADE = new com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath("NO_UPGRADE", 0);
    public static final com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath OPTIONAL = new com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath("OPTIONAL", 1);
    public static final com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath MANDATORY = new com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath("MANDATORY", 2);
    public static final com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath RETIRED_VERSION = new com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath("RETIRED_VERSION", 3);

    private static final /* synthetic */ com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[] $values() {
        return new com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[]{NO_UPGRADE, OPTIONAL, MANDATORY, RETIRED_VERSION};
    }

    static {
        com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UpgradeStatus$UpgradePath(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath valueOf(java.lang.String str) {
        return (com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath) java.lang.Enum.valueOf(com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath.class, str);
    }

    public static com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[] values() {
        return (com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath[]) $VALUES.clone();
    }
}
