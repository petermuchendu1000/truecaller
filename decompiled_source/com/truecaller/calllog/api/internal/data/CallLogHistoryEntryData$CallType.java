package com.truecaller.calllog.api.internal.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/calllog/api/internal/data/CallLogHistoryEntryData$CallType", "", "Lcom/truecaller/calllog/api/internal/data/CallLogHistoryEntryData$CallType;", "<init>", "(Ljava/lang/String;I)V", "PHONE", "VIDEO", "WHATSAPP", "WHATSAPP_VIDEO", "ASSISTANT", "VOICEMAIL", "CALL_RECORDING", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogHistoryEntryData$CallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[] $VALUES;
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType PHONE = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("PHONE", 0);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType VIDEO = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("VIDEO", 1);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType WHATSAPP = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("WHATSAPP", 2);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType WHATSAPP_VIDEO = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("WHATSAPP_VIDEO", 3);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType ASSISTANT = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("ASSISTANT", 4);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType VOICEMAIL = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("VOICEMAIL", 5);
    public static final com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType CALL_RECORDING = new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType("CALL_RECORDING", 6);

    private static final /* synthetic */ com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[] $values() {
        return new com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[]{PHONE, VIDEO, WHATSAPP, WHATSAPP_VIDEO, ASSISTANT, VOICEMAIL, CALL_RECORDING};
    }

    static {
        com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogHistoryEntryData$CallType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType) java.lang.Enum.valueOf(com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType.class, str);
    }

    public static com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[] values() {
        return (com.truecaller.calllog.api.internal.data.CallLogHistoryEntryData$CallType[]) $VALUES.clone();
    }
}
