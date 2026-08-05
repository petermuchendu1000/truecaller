package com.truecaller.calllog.presentation.ui.screen.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$HistoryEntry$PrimaryAction$Type", "", "Lcom/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$HistoryEntry$PrimaryAction$Type;", "<init>", "(Ljava/lang/String;I)V", "CALL", "VIDEO_CALL", "WHATSAPP_CALL", "WHATSAPP_VIDEO_CALL", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogHistoryItem$HistoryEntry$PrimaryAction$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[] $VALUES;
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type CALL = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type("CALL", 0);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type VIDEO_CALL = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type("VIDEO_CALL", 1);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type WHATSAPP_CALL = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type("WHATSAPP_CALL", 2);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type WHATSAPP_VIDEO_CALL = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type("WHATSAPP_VIDEO_CALL", 3);

    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[] $values() {
        return new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[]{CALL, VIDEO_CALL, WHATSAPP_CALL, WHATSAPP_VIDEO_CALL};
    }

    static {
        com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogHistoryItem$HistoryEntry$PrimaryAction$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type valueOf(java.lang.String str) {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type) java.lang.Enum.valueOf(com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type.class, str);
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[] values() {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$HistoryEntry$PrimaryAction$Type[]) $VALUES.clone();
    }
}
