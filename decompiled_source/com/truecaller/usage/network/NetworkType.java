package com.truecaller.usage.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/usage/network/NetworkType;", "", "analyticsName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsName", "()Ljava/lang/String;", "WIFI", "CELLULAR", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class NetworkType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.usage.network.NetworkType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;
    public static final com.truecaller.usage.network.NetworkType WIFI = new com.truecaller.usage.network.NetworkType("WIFI", 0, "Wifi");
    public static final com.truecaller.usage.network.NetworkType CELLULAR = new com.truecaller.usage.network.NetworkType("CELLULAR", 1, "Cellular");

    private static final /* synthetic */ com.truecaller.usage.network.NetworkType[] $values() {
        return new com.truecaller.usage.network.NetworkType[]{WIFI, CELLULAR};
    }

    static {
        com.truecaller.usage.network.NetworkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NetworkType(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.usage.network.NetworkType valueOf(java.lang.String str) {
        return (com.truecaller.usage.network.NetworkType) java.lang.Enum.valueOf(com.truecaller.usage.network.NetworkType.class, str);
    }

    public static com.truecaller.usage.network.NetworkType[] values() {
        return (com.truecaller.usage.network.NetworkType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }
}
