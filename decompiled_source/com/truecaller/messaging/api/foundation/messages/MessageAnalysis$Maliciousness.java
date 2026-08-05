package com.truecaller.messaging.api.foundation.messages;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/messaging/api/foundation/messages/MessageAnalysis$Maliciousness", "", "Lcom/truecaller/messaging/api/foundation/messages/MessageAnalysis$Maliciousness;", "<init>", "(Ljava/lang/String;I)V", "NONE", "SPAM", "FRAUD", "api-foundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageAnalysis$Maliciousness {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[] $VALUES;
    public static final com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness NONE = new com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness("NONE", 0);
    public static final com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness SPAM = new com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness("SPAM", 1);
    public static final com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness FRAUD = new com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness("FRAUD", 2);

    private static final /* synthetic */ com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[] $values() {
        return new com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[]{NONE, SPAM, FRAUD};
    }

    static {
        com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageAnalysis$Maliciousness(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness valueOf(java.lang.String str) {
        return (com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness) java.lang.Enum.valueOf(com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness.class, str);
    }

    public static com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[] values() {
        return (com.truecaller.messaging.api.foundation.messages.MessageAnalysis$Maliciousness[]) $VALUES.clone();
    }
}
