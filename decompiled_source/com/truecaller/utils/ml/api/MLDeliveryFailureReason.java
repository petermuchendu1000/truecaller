package com.truecaller.utils.ml.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/utils/ml/api/MLDeliveryFailureReason;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "UNKNOWN_ERROR", "DOWNLOAD_FAILED", "DOWNLOAD_CANCELED", "FILE_NOT_AVAILABLE", "MODEL_HASH_MISMATCH", "NAME_OR_CONFJSON_NOT_AVAILABLE", "TARGETING_NOT_MATCHED", "ml_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MLDeliveryFailureReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.utils.ml.api.MLDeliveryFailureReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason UNKNOWN_ERROR = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("UNKNOWN_ERROR", 0, "unknown_error");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason DOWNLOAD_FAILED = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("DOWNLOAD_FAILED", 1, "download_failed");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason DOWNLOAD_CANCELED = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("DOWNLOAD_CANCELED", 2, "download_canceled");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason FILE_NOT_AVAILABLE = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("FILE_NOT_AVAILABLE", 3, "file_not_available");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason MODEL_HASH_MISMATCH = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("MODEL_HASH_MISMATCH", 4, "checksum_failed");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason NAME_OR_CONFJSON_NOT_AVAILABLE = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("NAME_OR_CONFJSON_NOT_AVAILABLE", 5, "model_name_not_available");
    public static final com.truecaller.utils.ml.api.MLDeliveryFailureReason TARGETING_NOT_MATCHED = new com.truecaller.utils.ml.api.MLDeliveryFailureReason("TARGETING_NOT_MATCHED", 6, "targeting_criteria_mismatch");

    private static final /* synthetic */ com.truecaller.utils.ml.api.MLDeliveryFailureReason[] $values() {
        return new com.truecaller.utils.ml.api.MLDeliveryFailureReason[]{UNKNOWN_ERROR, DOWNLOAD_FAILED, DOWNLOAD_CANCELED, FILE_NOT_AVAILABLE, MODEL_HASH_MISMATCH, NAME_OR_CONFJSON_NOT_AVAILABLE, TARGETING_NOT_MATCHED};
    }

    static {
        com.truecaller.utils.ml.api.MLDeliveryFailureReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MLDeliveryFailureReason(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.utils.ml.api.MLDeliveryFailureReason valueOf(java.lang.String str) {
        return (com.truecaller.utils.ml.api.MLDeliveryFailureReason) java.lang.Enum.valueOf(com.truecaller.utils.ml.api.MLDeliveryFailureReason.class, str);
    }

    public static com.truecaller.utils.ml.api.MLDeliveryFailureReason[] values() {
        return (com.truecaller.utils.ml.api.MLDeliveryFailureReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
