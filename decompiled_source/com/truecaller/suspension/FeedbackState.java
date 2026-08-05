package com.truecaller.suspension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/suspension/FeedbackState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_ERROR", "NOT_SENT", "RESULT_SUCCESS", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FeedbackState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.suspension.FeedbackState[] $VALUES;
    private final int value;
    public static final com.truecaller.suspension.FeedbackState RESULT_ERROR = new com.truecaller.suspension.FeedbackState("RESULT_ERROR", 0, -1);
    public static final com.truecaller.suspension.FeedbackState NOT_SENT = new com.truecaller.suspension.FeedbackState("NOT_SENT", 1, 0);
    public static final com.truecaller.suspension.FeedbackState RESULT_SUCCESS = new com.truecaller.suspension.FeedbackState("RESULT_SUCCESS", 2, 1);

    private static final /* synthetic */ com.truecaller.suspension.FeedbackState[] $values() {
        return new com.truecaller.suspension.FeedbackState[]{RESULT_ERROR, NOT_SENT, RESULT_SUCCESS};
    }

    static {
        com.truecaller.suspension.FeedbackState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeedbackState(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.suspension.FeedbackState valueOf(java.lang.String str) {
        return (com.truecaller.suspension.FeedbackState) java.lang.Enum.valueOf(com.truecaller.suspension.FeedbackState.class, str);
    }

    public static com.truecaller.suspension.FeedbackState[] values() {
        return (com.truecaller.suspension.FeedbackState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
