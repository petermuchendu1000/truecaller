package com.truecaller.messaging.conversation.fraud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/messaging/conversation/fraud/ReportSource;", "", "<init>", "(Ljava/lang/String;I)V", "MID", "NOTIFICATION", "IN_APP", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReportSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.ReportSource[] $VALUES;
    public static final com.truecaller.messaging.conversation.fraud.ReportSource MID = new com.truecaller.messaging.conversation.fraud.ReportSource("MID", 0);
    public static final com.truecaller.messaging.conversation.fraud.ReportSource NOTIFICATION = new com.truecaller.messaging.conversation.fraud.ReportSource("NOTIFICATION", 1);
    public static final com.truecaller.messaging.conversation.fraud.ReportSource IN_APP = new com.truecaller.messaging.conversation.fraud.ReportSource("IN_APP", 2);

    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.ReportSource[] $values() {
        return new com.truecaller.messaging.conversation.fraud.ReportSource[]{MID, NOTIFICATION, IN_APP};
    }

    static {
        com.truecaller.messaging.conversation.fraud.ReportSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReportSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.fraud.ReportSource valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.fraud.ReportSource) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.fraud.ReportSource.class, str);
    }

    public static com.truecaller.messaging.conversation.fraud.ReportSource[] values() {
        return (com.truecaller.messaging.conversation.fraud.ReportSource[]) $VALUES.clone();
    }
}
