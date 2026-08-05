package com.truecaller.calllog.presentation.ui.screen.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$HistoryEntry$SecondaryAction$Type", "", "Lcom/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$HistoryEntry$SecondaryAction$Type;", "<init>", "(Ljava/lang/String;I)V", "VOICEMAIL", "CALL_RECORDING_READY", "CALL_RECORDING_PROCESSING", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogHistoryItem$HistoryEntry$SecondaryAction$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[] $VALUES;
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type VOICEMAIL = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type("VOICEMAIL", 0);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type CALL_RECORDING_READY = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type("CALL_RECORDING_READY", 1);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type CALL_RECORDING_PROCESSING = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type("CALL_RECORDING_PROCESSING", 2);

    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[] $values() {
        return new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[]{VOICEMAIL, CALL_RECORDING_READY, CALL_RECORDING_PROCESSING};
    }

    static {
        com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogHistoryItem$HistoryEntry$SecondaryAction$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type valueOf(java.lang.String str) {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type) java.lang.Enum.valueOf(com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type.class, str);
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[] values() {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$SecondaryAction$Type[]) $VALUES.clone();
    }
}
