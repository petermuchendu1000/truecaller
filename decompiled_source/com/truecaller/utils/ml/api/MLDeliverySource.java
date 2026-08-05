package com.truecaller.utils.ml.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/utils/ml/api/MLDeliverySource;", "", "<init>", "(Ljava/lang/String;I)V", "FIREBASE", "LOCAL", "ml_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MLDeliverySource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.utils.ml.api.MLDeliverySource[] $VALUES;
    public static final com.truecaller.utils.ml.api.MLDeliverySource FIREBASE = new com.truecaller.utils.ml.api.MLDeliverySource("FIREBASE", 0);
    public static final com.truecaller.utils.ml.api.MLDeliverySource LOCAL = new com.truecaller.utils.ml.api.MLDeliverySource("LOCAL", 1);

    private static final /* synthetic */ com.truecaller.utils.ml.api.MLDeliverySource[] $values() {
        return new com.truecaller.utils.ml.api.MLDeliverySource[]{FIREBASE, LOCAL};
    }

    static {
        com.truecaller.utils.ml.api.MLDeliverySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MLDeliverySource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.utils.ml.api.MLDeliverySource valueOf(java.lang.String str) {
        return (com.truecaller.utils.ml.api.MLDeliverySource) java.lang.Enum.valueOf(com.truecaller.utils.ml.api.MLDeliverySource.class, str);
    }

    public static com.truecaller.utils.ml.api.MLDeliverySource[] values() {
        return (com.truecaller.utils.ml.api.MLDeliverySource[]) $VALUES.clone();
    }
}
