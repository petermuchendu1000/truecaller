package com.truecaller.messaging.transport.im;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/messaging/transport/im/SendResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE_TRANSIENT", "FAILURE_PERMANENT", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SendResult {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.transport.im.SendResult[] $VALUES;
    public static final com.truecaller.messaging.transport.im.SendResult SUCCESS = new com.truecaller.messaging.transport.im.SendResult("SUCCESS", 0);
    public static final com.truecaller.messaging.transport.im.SendResult FAILURE_TRANSIENT = new com.truecaller.messaging.transport.im.SendResult("FAILURE_TRANSIENT", 1);
    public static final com.truecaller.messaging.transport.im.SendResult FAILURE_PERMANENT = new com.truecaller.messaging.transport.im.SendResult("FAILURE_PERMANENT", 2);

    private static final /* synthetic */ com.truecaller.messaging.transport.im.SendResult[] $values() {
        return new com.truecaller.messaging.transport.im.SendResult[]{SUCCESS, FAILURE_TRANSIENT, FAILURE_PERMANENT};
    }

    static {
        com.truecaller.messaging.transport.im.SendResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SendResult(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.transport.im.SendResult valueOf(java.lang.String str) {
        return (com.truecaller.messaging.transport.im.SendResult) java.lang.Enum.valueOf(com.truecaller.messaging.transport.im.SendResult.class, str);
    }

    public static com.truecaller.messaging.transport.im.SendResult[] values() {
        return (com.truecaller.messaging.transport.im.SendResult[]) $VALUES.clone();
    }
}
