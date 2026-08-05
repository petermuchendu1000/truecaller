package com.truecaller.insights.feedback.message;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/insights/feedback/message/MessageTransport;", "", "<init>", "(Ljava/lang/String;I)V", "SMS", "IM", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageTransport {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageTransport[] $VALUES;
    public static final com.truecaller.insights.feedback.message.MessageTransport SMS = new com.truecaller.insights.feedback.message.MessageTransport("SMS", 0);
    public static final com.truecaller.insights.feedback.message.MessageTransport IM = new com.truecaller.insights.feedback.message.MessageTransport("IM", 1);

    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageTransport[] $values() {
        return new com.truecaller.insights.feedback.message.MessageTransport[]{SMS, IM};
    }

    static {
        com.truecaller.insights.feedback.message.MessageTransport[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageTransport(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.message.MessageTransport valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.message.MessageTransport) java.lang.Enum.valueOf(com.truecaller.insights.feedback.message.MessageTransport.class, str);
    }

    public static com.truecaller.insights.feedback.message.MessageTransport[] values() {
        return (com.truecaller.insights.feedback.message.MessageTransport[]) $VALUES.clone();
    }
}
