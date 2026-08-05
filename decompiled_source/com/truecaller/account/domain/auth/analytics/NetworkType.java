package com.truecaller.account.domain.auth.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/account/domain/auth/analytics/NetworkType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GRPC", "REST", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NetworkType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.account.domain.auth.analytics.NetworkType[] $VALUES;
    public static final com.truecaller.account.domain.auth.analytics.NetworkType GRPC = new com.truecaller.account.domain.auth.analytics.NetworkType("GRPC", 0, "grpc");
    public static final com.truecaller.account.domain.auth.analytics.NetworkType REST = new com.truecaller.account.domain.auth.analytics.NetworkType("REST", 1, "rest");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.account.domain.auth.analytics.NetworkType[] $values() {
        return new com.truecaller.account.domain.auth.analytics.NetworkType[]{GRPC, REST};
    }

    static {
        com.truecaller.account.domain.auth.analytics.NetworkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NetworkType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.account.domain.auth.analytics.NetworkType valueOf(java.lang.String str) {
        return (com.truecaller.account.domain.auth.analytics.NetworkType) java.lang.Enum.valueOf(com.truecaller.account.domain.auth.analytics.NetworkType.class, str);
    }

    public static com.truecaller.account.domain.auth.analytics.NetworkType[] values() {
        return (com.truecaller.account.domain.auth.analytics.NetworkType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
