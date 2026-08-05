package com.truecaller.common.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/common/network/NetworkClient;", "", "", "client", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getClient", "Companion", "h31/bar", "OKHTTP", "CRONET", "common-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class NetworkClient {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.network.NetworkClient[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final h31.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String client;
    public static final com.truecaller.common.network.NetworkClient OKHTTP = new com.truecaller.common.network.NetworkClient("OKHTTP", 0, "okhttp");
    public static final com.truecaller.common.network.NetworkClient CRONET = new com.truecaller.common.network.NetworkClient("CRONET", 1, "cronet");

    private static final /* synthetic */ com.truecaller.common.network.NetworkClient[] $values() {
        return new com.truecaller.common.network.NetworkClient[]{OKHTTP, CRONET};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h31.bar, java.lang.Object] */
    static {
        com.truecaller.common.network.NetworkClient[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private NetworkClient(java.lang.String str, int i, java.lang.String str2) {
        this.client = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.network.NetworkClient valueOf(java.lang.String str) {
        return (com.truecaller.common.network.NetworkClient) java.lang.Enum.valueOf(com.truecaller.common.network.NetworkClient.class, str);
    }

    public static com.truecaller.common.network.NetworkClient[] values() {
        return (com.truecaller.common.network.NetworkClient[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClient() {
        return this.client;
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return this.client;
    }
}
