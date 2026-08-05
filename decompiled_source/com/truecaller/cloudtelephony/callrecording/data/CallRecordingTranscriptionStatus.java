package com.truecaller.cloudtelephony.callrecording.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingTranscriptionStatus;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "rz0/c0", "IN_PROGRESS", "FAILED", "SUCCESS", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingTranscriptionStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final rz0.c0 Companion;
    private final int value;
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus IN_PROGRESS = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus("IN_PROGRESS", 0, 0);
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus FAILED = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus("FAILED", 1, 1);
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus SUCCESS = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus("SUCCESS", 2, 2);

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[]{IN_PROGRESS, FAILED, SUCCESS};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [rz0.c0, java.lang.Object] */
    static {
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CallRecordingTranscriptionStatus(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[] values() {
        return (com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
