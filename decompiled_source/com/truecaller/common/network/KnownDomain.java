package com.truecaller.common.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/truecaller/common/network/KnownDomain;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DOMAIN_REGION_1", "DOMAIN_OTHER_REGIONS", "toString", "common-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class KnownDomain {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.network.KnownDomain[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.common.network.KnownDomain DOMAIN_REGION_1 = new com.truecaller.common.network.KnownDomain("DOMAIN_REGION_1", 0, "eu");
    public static final com.truecaller.common.network.KnownDomain DOMAIN_OTHER_REGIONS = new com.truecaller.common.network.KnownDomain("DOMAIN_OTHER_REGIONS", 1, "noneu");

    private static final /* synthetic */ com.truecaller.common.network.KnownDomain[] $values() {
        return new com.truecaller.common.network.KnownDomain[]{DOMAIN_REGION_1, DOMAIN_OTHER_REGIONS};
    }

    static {
        com.truecaller.common.network.KnownDomain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private KnownDomain(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.network.KnownDomain valueOf(java.lang.String str) {
        return (com.truecaller.common.network.KnownDomain) java.lang.Enum.valueOf(com.truecaller.common.network.KnownDomain.class, str);
    }

    public static com.truecaller.common.network.KnownDomain[] values() {
        return (com.truecaller.common.network.KnownDomain[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return this.value;
    }
}
