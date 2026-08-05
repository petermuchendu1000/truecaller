package com.truecaller.messaging.transport.im;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/messaging/transport/im/ProcessResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FORCE_UPGRADE_ENCOUNTERED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProcessResult {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.transport.im.ProcessResult[] $VALUES;
    public static final com.truecaller.messaging.transport.im.ProcessResult SUCCESS = new com.truecaller.messaging.transport.im.ProcessResult("SUCCESS", 0);
    public static final com.truecaller.messaging.transport.im.ProcessResult FORCE_UPGRADE_ENCOUNTERED = new com.truecaller.messaging.transport.im.ProcessResult("FORCE_UPGRADE_ENCOUNTERED", 1);

    private static final /* synthetic */ com.truecaller.messaging.transport.im.ProcessResult[] $values() {
        return new com.truecaller.messaging.transport.im.ProcessResult[]{SUCCESS, FORCE_UPGRADE_ENCOUNTERED};
    }

    static {
        com.truecaller.messaging.transport.im.ProcessResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ProcessResult(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.transport.im.ProcessResult valueOf(java.lang.String str) {
        return (com.truecaller.messaging.transport.im.ProcessResult) java.lang.Enum.valueOf(com.truecaller.messaging.transport.im.ProcessResult.class, str);
    }

    public static com.truecaller.messaging.transport.im.ProcessResult[] values() {
        return (com.truecaller.messaging.transport.im.ProcessResult[]) $VALUES.clone();
    }
}
