package com.truecaller.sdk.oAuth.networking.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/RejectionReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REJECTED", "DISMISSED", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RejectionReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.sdk.oAuth.networking.data.RejectionReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.sdk.oAuth.networking.data.RejectionReason REJECTED = new com.truecaller.sdk.oAuth.networking.data.RejectionReason("REJECTED", 0, "rejected");
    public static final com.truecaller.sdk.oAuth.networking.data.RejectionReason DISMISSED = new com.truecaller.sdk.oAuth.networking.data.RejectionReason("DISMISSED", 1, "dismissed");

    private static final /* synthetic */ com.truecaller.sdk.oAuth.networking.data.RejectionReason[] $values() {
        return new com.truecaller.sdk.oAuth.networking.data.RejectionReason[]{REJECTED, DISMISSED};
    }

    static {
        com.truecaller.sdk.oAuth.networking.data.RejectionReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RejectionReason(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.sdk.oAuth.networking.data.RejectionReason valueOf(java.lang.String str) {
        return (com.truecaller.sdk.oAuth.networking.data.RejectionReason) java.lang.Enum.valueOf(com.truecaller.sdk.oAuth.networking.data.RejectionReason.class, str);
    }

    public static com.truecaller.sdk.oAuth.networking.data.RejectionReason[] values() {
        return (com.truecaller.sdk.oAuth.networking.data.RejectionReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
