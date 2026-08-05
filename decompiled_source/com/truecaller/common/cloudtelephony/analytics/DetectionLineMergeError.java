package com.truecaller.common.cloudtelephony.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common/cloudtelephony/analytics/DetectionLineMergeError;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "RECORDING_NUMBER_NOT_AVAILABLE", "CALLER_DISCONNECTS_BEFORE_MERGE", "CANNOT_MERGE", "DETECTION_LINE_DISCONNECTED_BEFORE_MERGE", "MISSING_PERMISSION_TO_CALL", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class DetectionLineMergeError {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[] $VALUES;
    private final int code;
    public static final com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError RECORDING_NUMBER_NOT_AVAILABLE = new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError("RECORDING_NUMBER_NOT_AVAILABLE", 0, 0);
    public static final com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError CALLER_DISCONNECTS_BEFORE_MERGE = new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError("CALLER_DISCONNECTS_BEFORE_MERGE", 1, 2);
    public static final com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError CANNOT_MERGE = new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError("CANNOT_MERGE", 2, 3);
    public static final com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError DETECTION_LINE_DISCONNECTED_BEFORE_MERGE = new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError("DETECTION_LINE_DISCONNECTED_BEFORE_MERGE", 3, 4);
    public static final com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError MISSING_PERMISSION_TO_CALL = new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError("MISSING_PERMISSION_TO_CALL", 4, 7);

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[] $values() {
        return new com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[]{RECORDING_NUMBER_NOT_AVAILABLE, CALLER_DISCONNECTS_BEFORE_MERGE, CANNOT_MERGE, DETECTION_LINE_DISCONNECTED_BEFORE_MERGE, MISSING_PERMISSION_TO_CALL};
    }

    static {
        com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DetectionLineMergeError(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError.class, str);
    }

    public static com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[] values() {
        return (com.truecaller.common.cloudtelephony.analytics.DetectionLineMergeError[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
