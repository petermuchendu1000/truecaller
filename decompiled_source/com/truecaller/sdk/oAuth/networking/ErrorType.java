package com.truecaller.sdk.oAuth.networking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_API_INTERNAL", "TYPE_API_OAUTH", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ErrorType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.sdk.oAuth.networking.ErrorType[] $VALUES;
    public static final com.truecaller.sdk.oAuth.networking.ErrorType TYPE_API_INTERNAL = new com.truecaller.sdk.oAuth.networking.ErrorType("TYPE_API_INTERNAL", 0);
    public static final com.truecaller.sdk.oAuth.networking.ErrorType TYPE_API_OAUTH = new com.truecaller.sdk.oAuth.networking.ErrorType("TYPE_API_OAUTH", 1);

    private static final /* synthetic */ com.truecaller.sdk.oAuth.networking.ErrorType[] $values() {
        return new com.truecaller.sdk.oAuth.networking.ErrorType[]{TYPE_API_INTERNAL, TYPE_API_OAUTH};
    }

    static {
        com.truecaller.sdk.oAuth.networking.ErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ErrorType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.sdk.oAuth.networking.ErrorType valueOf(java.lang.String str) {
        return (com.truecaller.sdk.oAuth.networking.ErrorType) java.lang.Enum.valueOf(com.truecaller.sdk.oAuth.networking.ErrorType.class, str);
    }

    public static com.truecaller.sdk.oAuth.networking.ErrorType[] values() {
        return (com.truecaller.sdk.oAuth.networking.ErrorType[]) $VALUES.clone();
    }
}
