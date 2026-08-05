package com.truecaller.cloudtelephony.callrecording.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingSubjectStatus;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "rz0/z", "IN_PROGRESS", "FAILED", "SUCCESS", "TOO_SHORT", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingSubjectStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final rz0.z Companion;
    private final int value;
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus IN_PROGRESS = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus("IN_PROGRESS", 0, 0);
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus FAILED = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus("FAILED", 1, 1);
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus SUCCESS = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus("SUCCESS", 2, 2);
    public static final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus TOO_SHORT = new com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus("TOO_SHORT", 3, 3);

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[]{IN_PROGRESS, FAILED, SUCCESS, TOO_SHORT};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, rz0.z] */
    static {
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CallRecordingSubjectStatus(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[] values() {
        return (com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
