package com.truecaller.perfmon.metric;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/truecaller/perfmon/metric/NetworkTrace$NetworkClient", "", "Lcom/truecaller/perfmon/metric/NetworkTrace$NetworkClient;", "", "client", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getClient", "()Ljava/lang/String;", "OKHTTP", "CRONET", "GRPC", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NetworkTrace$NetworkClient {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String client;
    public static final com.truecaller.perfmon.metric.NetworkTrace$NetworkClient OKHTTP = new com.truecaller.perfmon.metric.NetworkTrace$NetworkClient("OKHTTP", 0, "okhttp");
    public static final com.truecaller.perfmon.metric.NetworkTrace$NetworkClient CRONET = new com.truecaller.perfmon.metric.NetworkTrace$NetworkClient("CRONET", 1, "cronet");
    public static final com.truecaller.perfmon.metric.NetworkTrace$NetworkClient GRPC = new com.truecaller.perfmon.metric.NetworkTrace$NetworkClient("GRPC", 2, "grpc");

    private static final /* synthetic */ com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[] $values() {
        return new com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[]{OKHTTP, CRONET, GRPC};
    }

    static {
        com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NetworkTrace$NetworkClient(java.lang.String str, int i, java.lang.String str2) {
        this.client = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.perfmon.metric.NetworkTrace$NetworkClient valueOf(java.lang.String str) {
        return (com.truecaller.perfmon.metric.NetworkTrace$NetworkClient) java.lang.Enum.valueOf(com.truecaller.perfmon.metric.NetworkTrace$NetworkClient.class, str);
    }

    public static com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[] values() {
        return (com.truecaller.perfmon.metric.NetworkTrace$NetworkClient[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClient() {
        return this.client;
    }
}
